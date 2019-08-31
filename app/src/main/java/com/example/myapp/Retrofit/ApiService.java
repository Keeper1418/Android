package com.example.myapp.Retrofit;

import com.example.myapp.Model.Preset;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiService {
    @GET("/android/files/dpm/presets_configs/presets_config_v12.json")
    Call<Preset> getMyJSON();
}
