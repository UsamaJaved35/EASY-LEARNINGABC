package com.example.easylearingabc;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class ExamPage extends AppCompatActivity implements View.OnClickListener {
    Button btn1,btn2,btn3,btn4;
    String btn1Text,btn2Text,btn3Text,btn4Text;
    TextView textView;
    ImageView imageView;
//    int resIDa,resIDb,resIDc,resIDd,resIDe,resIDf,resIDg,resIDh,resIDi,resIDj,resIDk
//            ,resIDl,resIDm,resIDn,resIDo,resIDp,resIDq,resIDr,resIDs,resIDt,resIDu,resIDv,resIDw
//            ,resIDx,resIDy,resIDz;
    int counter=0;
    String[] arr=new String[]{"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_exam_page);
         btn1=findViewById(R.id.button);
         btn2=findViewById(R.id.button2);
         btn3=findViewById(R.id.button3);
         btn4=findViewById(R.id.button4);
         textView=findViewById(R.id.textView4);
         imageView=findViewById(R.id.image);
//         btn1Text= (String) btn1.getText();
//        btn2Text= (String) btn1.getText();
//        btn3Text= (String) btn1.getText();
//        btn4Text= (String) btn1.getText();
         btn1.setOnClickListener(this);
         btn2.setOnClickListener(this);
         btn3.setOnClickListener(this);
         btn4.setOnClickListener(this);
    }
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.button:
                Button b= (Button)v;
                String btnTxt=b.getText().toString();
               if(btnTxt.equals(arr[counter]))
               {
                  drawImages(btnTxt);
                   counter++;
                 //  textView.setText("CORRECT ANSWER!!!!");
               }
               break;
            case R.id.button2:
                Button b1= (Button)v;
                String btnTxt1=b1.getText().toString();
                if(btnTxt1.equals(arr[counter]))
                {
                    drawImages(btnTxt1);
                    counter++;
                    //  textView.setText("CORRECT ANSWER!!!!");
                }
                break;


        }
    }
    public void drawImages(String btnText)
    {
        if(btnText=="A"){
        imageView.setImageResource(R.drawable.b1);
        }
        else if(btnText=="B")
        {
            imageView.setImageResource(R.drawable.c1);
        }
        else if(btnText=="C")
        {
            imageView.setImageResource(R.drawable.d1);
        }
        else if(btnText=="D")
        {
            imageView.setImageResource(R.drawable.e1);
        }
        else if(btnText=="E")
        {
            imageView.setImageResource(R.drawable.f1);
        }
        else if(btnText=="F")
        {
            imageView.setImageResource(R.drawable.g1);
        }
        else if(btnText=="G")
        {
            imageView.setImageResource(R.drawable.h1);
        }
        else if(btnText=="H")
        {
            imageView.setImageResource(R.drawable.i1);
        }
        else if(btnText=="I")
        {
            imageView.setImageResource(R.drawable.j1);
        }
        else if(btnText=="J")
        {
            imageView.setImageResource(R.drawable.k1);
        }
        else if(btnText=="K")
        {
            imageView.setImageResource(R.drawable.l1);
        }
        else if(btnText=="L")
        {
            imageView.setImageResource(R.drawable.m1);
        }
        else if(btnText=="M")
        {
            imageView.setImageResource(R.drawable.n1);
        }
        else if(btnText=="N")
        {
            imageView.setImageResource(R.drawable.o1);
        }
        else if(btnText=="O")
        {
            imageView.setImageResource(R.drawable.p1);
        }
        else if(btnText=="P")
        {
            imageView.setImageResource(R.drawable.q1);
        }
        else if(btnText=="Q")
        {
            imageView.setImageResource(R.drawable.r1);
        }
        else if(btnText=="R")
        {
            imageView.setImageResource(R.drawable.s1);
        }
        else if(btnText=="S")
        {
            imageView.setImageResource(R.drawable.t1);
        }
        else if(btnText=="T")
        {
            imageView.setImageResource(R.drawable.u1);
        }
        else if(btnText=="U")
        {
            imageView.setImageResource(R.drawable.v1);
        }
        else if(btnText=="V")
        {
            imageView.setImageResource(R.drawable.w1);
        }
        else if(btnText=="W")
        {
            imageView.setImageResource(R.drawable.x1);
        }
        else if(btnText=="X")
        {
            imageView.setImageResource(R.drawable.y1);
        }
        else if(btnText=="Y")
        {
            imageView.setImageResource(R.drawable.z1);
        }
        else if(btnText=="Z")
        {
           // imageView.setImageResource(R.drawable.c1);
        }

    }
}