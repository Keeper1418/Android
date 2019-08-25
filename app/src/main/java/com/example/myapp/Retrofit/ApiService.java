package com.example.myapp.Retrofit;

import com.example.myapp.Model.Model;
import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("/android/files/dpm/presets_configs/presets_config_v12.json")
    Call<Model> getMyJSON();
}
