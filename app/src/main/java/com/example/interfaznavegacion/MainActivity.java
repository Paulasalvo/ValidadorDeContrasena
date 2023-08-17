package com.example.interfaznavegacion;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.os.Bundle;
import android.view.View;

import com.example.interfaznavegacion.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {

    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        setSupportActionBar(binding.toolBar);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        binding.toolBar.getNavigationIcon().setColorFilter(getColor(R.color.white), PorterDuff.Mode.SRC_ATOP);
        binding.toolBar.setNavigationOnClickListener(view -> onBackPressed());
    }

    void showButtonArrow() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }

    void hideButtonArrow() {
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
    }

}