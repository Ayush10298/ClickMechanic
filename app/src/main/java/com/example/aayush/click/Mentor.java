package com.example.aayush.click;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class Mentor extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mentor);
        // Assuming you are using xml layout
        ImageButton button = (ImageButton)findViewById(R.id.mentor_pic);

        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent viewIntent =
                        new Intent("android.intent.action.VIEW",
                                Uri.parse("https://www.facebook.com/tripti.misra?ref=br_rs"));
                startActivity(viewIntent);
            }
        });
    }
}

