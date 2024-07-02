package com.example.hotalbooking;

import android.os.Bundle;
import android.view.Window;
import android.widget.ImageView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MyBizActivity extends AppCompatActivity {

  ImageView cancel_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_my_biz);
        Window w= getWindow();
        w.setBackgroundDrawableResource(R.color.white);
        cancel_button = findViewById(R.id.cancel_button);
        cancel_button.setOnClickListener(v -> onBackPressed());

    }
}