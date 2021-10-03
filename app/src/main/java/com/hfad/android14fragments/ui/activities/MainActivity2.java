package com.hfad.android14fragments.ui.activities;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.hfad.android14fragments.R;

public class MainActivity2 extends AppCompatActivity {

    private TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        textView = findViewById(R.id.data_tv);
        if(getIntent() != null){
            String data = getIntent().getStringExtra("key");
            textView.setText(data);
        }
    }
    }
