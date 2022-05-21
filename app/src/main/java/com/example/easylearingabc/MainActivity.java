package com.example.easylearingabc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button Learning,Exam,Repo;
        Learning=findViewById(R.id.learning);
        Exam=findViewById(R.id.exam);
        Repo=findViewById(R.id.repo);
        Learning.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,LearninPage1.class);
                startActivity(intent);
            }
        });
        Exam.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(MainActivity.this,ExamPage.class);
                startActivity(intent);
            }
        });
        Repo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Uri repoLink= Uri.parse("https://github.com/UsamaJavedMughal/EASY-LEARNINGABC");
                Intent intent =new Intent(Intent.ACTION_VIEW,repoLink);
                startActivity(intent);
            }
        });
    }
}