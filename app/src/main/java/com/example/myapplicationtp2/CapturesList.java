package com.example.myapplicationtp2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CapturesList  extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.capture_list);

        Intent intent = getIntent();

        TextView receiver_list = findViewById(R.id.capturesList);
        String capturesList = intent.getStringExtra("capturesList");
        receiver_list.setText(capturesList);
    }

    public void ret(View view) {
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}
