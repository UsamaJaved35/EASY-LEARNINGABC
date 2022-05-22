package com.example.easylearingabc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LearninPage1 extends AppCompatActivity implements View.OnClickListener {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_learnin_page1);
        Button A,B,C,D,E,F,G,H,I,J,K,L,M,N,O,P,Q,r,S,T,U,V,W,X,Y,Z;
        A=findViewById(R.id.A);
        B=findViewById(R.id.B);
        C=findViewById(R.id.C);
        D=findViewById(R.id.D);
        E=findViewById(R.id.E);
        F=findViewById(R.id.F);
        G=findViewById(R.id.G);
        H=findViewById(R.id.H);
        I=findViewById(R.id.I);
        J=findViewById(R.id.J);
        K=findViewById(R.id.K);
        L=findViewById(R.id.L);
        M=findViewById(R.id.M);
        N=findViewById(R.id.N);
        O=findViewById(R.id.O);
        P=findViewById(R.id.P);
        Q=findViewById(R.id.Q);
        r=findViewById(R.id.R);
        S=findViewById(R.id.S);
        T=findViewById(R.id.T);
        U=findViewById(R.id.U);
        V=findViewById(R.id.V);
        W=findViewById(R.id.W);
        X=findViewById(R.id.X);
        Y=findViewById(R.id.Y);
        Z=findViewById(R.id.Z);
        A.setOnClickListener(this);
        B.setOnClickListener(this);
        C.setOnClickListener(this);
        D.setOnClickListener(this);
        E.setOnClickListener(this);
        F.setOnClickListener(this);
        G.setOnClickListener(this);
        H.setOnClickListener(this);
        I.setOnClickListener(this);
        J.setOnClickListener(this);
        K.setOnClickListener(this);
        L.setOnClickListener(this);
        M.setOnClickListener(this);
        N.setOnClickListener(this);
        O.setOnClickListener(this);
        P.setOnClickListener(this);
        Q.setOnClickListener(this);
        r.setOnClickListener(this);
        S.setOnClickListener(this);
        T.setOnClickListener(this);
        U.setOnClickListener(this);
        V.setOnClickListener(this);
        W.setOnClickListener(this);
        X.setOnClickListener(this);
        Y.setOnClickListener(this);
        Z.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        Intent sendimage = new Intent(LearninPage1.this, LearningPage2.class);
        switch (v.getId()){
            case R.id.A:
                sendimage.putExtra("image", R.drawable.A);
                break;
            case R.id.B:
                sendimage.putExtra("image", R.drawable.B);
                break;
            case R.id.C:
                sendimage.putExtra("image", R.drawable.C);
                break;
            case R.id.D:
                sendimage.putExtra("image", R.drawable.D);
                break;
            case R.id.E:
                sendimage.putExtra("image", R.drawable.E);
                break;
            case R.id.F:
                sendimage.putExtra("image", R.drawable.F);
                break;
            case R.id.G:
                sendimage.putExtra("image", R.drawable.G);
                break;
            case R.id.H:
                sendimage.putExtra("image", R.drawable.H);
                break;
            case R.id.I:
                sendimage.putExtra("image", R.drawable.I);
                break;
            case R.id.J:
                sendimage.putExtra("image", R.drawable.J);
                break;
            case R.id.K:
                sendimage.putExtra("image", R.drawable.K);
                break;
            case R.id.L:
                sendimage.putExtra("image", R.drawable.L);
                break;
            case R.id.M:
                sendimage.putExtra("image", R.drawable.M);
                break;
            case R.id.N:
                sendimage.putExtra("image", R.drawable.N);
                break;
            case R.id.O:
                sendimage.putExtra("image", R.drawable.O);
                break;
            case R.id.P:
                sendimage.putExtra("image", R.drawable.P);
                break;
            case R.id.Q:
                sendimage.putExtra("image", R.drawable.Q);
                break;
            case R.id.R:
                sendimage.putExtra("image", R.drawable.R);
                break;
            case R.id.S:
                sendimage.putExtra("image", R.drawable.S);
                break;
            case R.id.T:
                sendimage.putExtra("image", R.drawable.T);
                break;
            case R.id.U:
                sendimage.putExtra("image", R.drawable.U);
                break;
            case R.id.V:
                sendimage.putExtra("image", R.drawable.V);
                break;
            case R.id.W:
                sendimage.putExtra("image", R.drawable.W);
                break;
            case R.id.X:
                sendimage.putExtra("image", R.drawable.X);
                break;
            case R.id.Y:
                sendimage.putExtra("image", R.drawable.Y);
                break;
            case R.id.Z:
                sendimage.putExtra("image", R.drawable.Z);
                break;
        }
        startActivity(sendimage);
    }
}