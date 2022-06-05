package com.example.easylearingabc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LearninPage1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learnin_page1);
    }
    public void onClick(View v)
    {
        Intent sendimage = new Intent(LearninPage1.this, LearningPage2.class);
        switch (v.getId()){
            case R.id.A:
                sendimage.putExtra("image", R.drawable.a);
                break;
            case R.id.B:
                sendimage.putExtra("image", R.drawable.b);
                break;
            case R.id.C:
                sendimage.putExtra("image", R.drawable.c);
                break;
            case R.id.D:
                sendimage.putExtra("image", R.drawable.d);
                break;
            case R.id.E:
                sendimage.putExtra("image", R.drawable.e);
                break;
            case R.id.F:
                sendimage.putExtra("image", R.drawable.f);
                break;
            case R.id.G:
                sendimage.putExtra("image", R.drawable.g);
                break;
            case R.id.H:
                sendimage.putExtra("image", R.drawable.h);
                break;
            case R.id.I:
                sendimage.putExtra("image", R.drawable.i);
                break;
            case R.id.J:
                sendimage.putExtra("image", R.drawable.j);
                break;
            case R.id.K:
                sendimage.putExtra("image", R.drawable.k);
                break;
            case R.id.L:
                sendimage.putExtra("image", R.drawable.l);
                break;
            case R.id.M:
                sendimage.putExtra("image", R.drawable.m);
                break;
            case R.id.N:
                sendimage.putExtra("image", R.drawable.n);
                break;
            case R.id.O:
                sendimage.putExtra("image", R.drawable.o);
                break;
            case R.id.P:
                sendimage.putExtra("image", R.drawable.p);
                break;
            case R.id.Q:
                sendimage.putExtra("image", R.drawable.q);
                break;
            case R.id.R:
                sendimage.putExtra("image", R.drawable.r);
                break;
            case R.id.S:
                sendimage.putExtra("image", R.drawable.s);
                break;
            case R.id.T:
                sendimage.putExtra("image", R.drawable.t);
                break;
            case R.id.U:
                sendimage.putExtra("image", R.drawable.u);
                break;
            case R.id.V:
                sendimage.putExtra("image", R.drawable.v);
                break;
            case R.id.W:
                sendimage.putExtra("image", R.drawable.w);
                break;
            case R.id.X:
                sendimage.putExtra("image", R.drawable.x);
                break;
            case R.id.Y:
                sendimage.putExtra("image", R.drawable.y);
                break;
            case R.id.Z:
                sendimage.putExtra("image", R.drawable.z);
                break;
        }
        startActivity(sendimage);
    }
}