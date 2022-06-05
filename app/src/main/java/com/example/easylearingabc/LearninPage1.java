package com.example.easylearingabc;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;
public class LearninPage1 extends AppCompatActivity {
    int[]imgId={R.drawable.a2,R.drawable.b2,R.drawable.c2,R.drawable.d2,R.drawable.e2,R.drawable.f2,
            R.drawable.g2,R.drawable.h2,R.drawable.i2,R.drawable.j2,R.drawable.k2,R.drawable.l2,
            R.drawable.m2,R.drawable.n2,R.drawable.o2,R.drawable.p2,R.drawable.q2,R.drawable.r2,
            R.drawable.s2,R.drawable.t2,R.drawable.u2,R.drawable.v2,R.drawable.w2,R.drawable.x2,
            R.drawable.y2,R.drawable.z2};
    int []imgLearn={R.drawable.a,R.drawable.b,R.drawable.c,R.drawable.d,R.drawable.e,R.drawable.f,
            R.drawable.g,R.drawable.h,R.drawable.i,R.drawable.j,R.drawable.k,R.drawable.l,
            R.drawable.m,R.drawable.n,R.drawable.o,R.drawable.p,R.drawable.q,R.drawable.r,
            R.drawable.s,R.drawable.t,R.drawable.u,R.drawable.v,R.drawable.w,R.drawable.x,
            R.drawable.y,R.drawable.z};
    String[] letters=new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learnin_page1);
        ArrayList<Letter> list=new ArrayList<Letter>();
        for(int i=0;i<imgId.length;i++)
        {
            list.add(new Letter(imgId[i],letters[i]));
        }

        MyViewAdapter adapter = new MyViewAdapter(this, list);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l)
            {
              //  view.setBackgroundColor(getResources().getColor(com.google.android.material.R.color.material_deep_teal_200));
                Intent sendImage = new Intent(LearninPage1.this, LearningPage2.class);
                sendImage.putExtra("image",imgLearn[i]);
                startActivity(sendImage);
            }
        });
    }
}