package com.example.easylearingabc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ImageView;

public class LearningPage2 extends AppCompatActivity {
    ImageView imageView;
    int imageValue;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learning_page2);
        imageView = findViewById(R.id.images);

        // check if any value sent from previous activity
        Bundle bundle = getIntent().getExtras();

        // if bundle is not null then get the image value
        if (bundle != null) {
            imageValue = bundle.getInt("image");
        }
        imageView.setImageResource(imageValue);
    }
}