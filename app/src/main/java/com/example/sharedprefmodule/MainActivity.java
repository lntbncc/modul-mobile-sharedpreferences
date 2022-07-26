package com.example.sharedprefmodule;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    SharedPreferences sharedPreferences = getSharedPreferences("account",MODE_PRIVATE);

    SharedPreferences.Editor editor = sharedPreferences.edit();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editor.putString("name", "User");
        // "name" adalah key dan "User" adalah Value
        editor.commit();

        sharedPreferences.getString("name","");
        // "name" adalah key dan "" adalah DefValue
    }
}