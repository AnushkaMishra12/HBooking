package com.example.hotalbooking;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Html;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class MyBizActivity extends AppCompatActivity {

     ImageView cancel_button;
     TextView textView,preffered;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_my_biz);
        Window w= getWindow();

        w.setBackgroundDrawableResource(R.color.darkGrey);
        cancel_button = findViewById(R.id.cancel_button);
        cancel_button.setOnClickListener(v -> onBackPressed());

        preffered=findViewById(R.id.preffered);
        String text = "<font color=" + Color.BLACK + ">Preferred by </font>" +
                "<font color=" + Color.RED + ">Netflix,Godrej, Vedanta,Bajaj & 49,000+</font>" +
                "<font color=" + Color.BLACK+ ">business,Join the big league!</font>";
        preffered.setText(Html.fromHtml(text));

        textView = findViewById(R.id.privacy);
        String html = "<font color=" + Color.BLACK + ">By Proceeding you agree to MakeMyTrip's </font>" +
                "<font color=" + Color.RED+ ">Privacy Policy,User Agreement, T&Cs</font>";
        textView.setText(Html.fromHtml(html));
    }
}