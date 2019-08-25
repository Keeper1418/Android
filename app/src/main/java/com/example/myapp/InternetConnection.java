package com.example.myapp;

import android.content.Context;
import android.net.ConnectivityManager;
import androidx.annotation.NonNull;

class InternetConnection {
    public static boolean checkConnection(@NonNull Context context) {
        return ((ConnectivityManager) context.getSystemService
                (Context.CONNECTIVITY_SERVICE)).getActiveNetworkInfo() != null;
    }
}
