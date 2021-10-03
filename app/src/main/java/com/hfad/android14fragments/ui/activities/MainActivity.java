package com.hfad.android14fragments.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.hfad.android14fragments.R;
import com.hfad.android14fragments.ui.fragments.FirstFragment.FirstFragment;
import com.hfad.android14fragments.ui.fragments.ThirdFragment.ThirdFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initFragments();
        initView();
        initListeners();
    }

    private void initListeners() {

    }

    private void initView() {

    }

    private void initFragments() {

        getSupportFragmentManager().beginTransaction().add(R.id.container_second, new ThirdFragment()).commit();
        getSupportFragmentManager().beginTransaction().add(R.id.container_first, new FirstFragment()).commit();
        //getSupportFragmentManager().beginTransaction().add(R.id.container_first,new FirstFragment()).commit();
        //getSupportFragmentManager().beginTransaction().add(R.id.container_second,new SecondFragment()).commit();

    }
}