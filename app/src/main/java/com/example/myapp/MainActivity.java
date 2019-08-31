package com.example.myapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.app.ProgressDialog;
import android.os.Bundle;

import android.view.View;

import android.widget.ListView;

import com.example.myapp.Adapter.PresetAdapter;
import com.example.myapp.Model.Preset;
import com.example.myapp.Retrofit.ApiService;
import com.example.myapp.Retrofit.RetrofitClient;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

import java.util.ArrayList;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class MainActivity extends AppCompatActivity {
    private ListView listView;
    private View parentView;

    private ArrayList<Preset> presetList;
    private PresetAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        presetList = new ArrayList<>();

        parentView = findViewById(R.id.parentLayout);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        assert fab != null;
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(@NonNull final View view) {
                if (InternetConnection.checkConnection(getApplicationContext())) {
                    final ProgressDialog dialog;

                    dialog = new ProgressDialog(MainActivity.this);
                    dialog.setTitle(getString(R.string.string_getting_json_title));
                    dialog.setMessage(getString(R.string.string_getting_json_message));
                    dialog.show();

                    ApiService api = RetrofitClient.getApiService();

                    Call<Preset> call = api.getMyJSON();

                    call.enqueue(new Callback<Preset>() {
                        @Override
                        public void onResponse(Call<Preset> call, Response<Preset> response) {
                            dialog.dismiss();

                            if (response.isSuccessful()) {

                                presetList = response.body().getPresets().values();

                                adapter = new PresetAdapter(MainActivity.this, presetList);
                                listView.setAdapter(adapter);

                            } else {
                                Snackbar.make(parentView, R.string.string_some_thing_wrong, Snackbar.LENGTH_LONG).show();
                            }
                        }

                        @Override
                        public void onFailure(Call<Preset> call, Throwable t) {
                            dialog.dismiss();
                        }
                    });

                } else {
                    Snackbar.make(parentView, R.string.string_internet_connection_not_available, Snackbar.LENGTH_LONG).show();
                }
            }
        });
    }
}
