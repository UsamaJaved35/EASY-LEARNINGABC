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
    ImageView imageView;
    TextView textView;
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
                String alpha=arr[counter];
                if(btnTxt.equals(alpha))
               {
                   drawImageSetBtns(btnTxt);
                   counter++;
               }
               break;
            case R.id.button2:
                Button b1= (Button)v;
                String btnTxt1=b1.getText().toString();
                String alpha1=arr[counter];
                if(btnTxt1.equals(alpha1))
                {
                   // imageView.setImageResource(R.drawable.c1);
                    drawImageSetBtns(btnTxt1);
                    counter++;
                }
                break;
            case  R.id.button3:
                Button b2= (Button)v;
                String btnTxt2=b2.getText().toString();
                String alpha2=arr[counter];
                if(btnTxt2.equals(alpha2))
                {
                    drawImageSetBtns(btnTxt2);
                    counter++;
                }
                break;
            case R.id.button4:
                Button b3= (Button)v;
                String btnTxt3=b3.getText().toString();
                String alpha3=arr[counter];
                if(btnTxt3.equals(alpha3))
                {
                    drawImageSetBtns(btnTxt3);
                    counter++;
                }
                break;
        }
    }
    public void drawImageSetBtns(String btnText)
    {
        if(btnText.equals("A")){
        imageView.setImageResource(R.drawable.b1);
            btn3.setText("Q");
            btn1.setText("R");
            btn2.setText("C");
            btn4.setText("B");
        }
        else if(btnText.equals("B"))
        {
            imageView.setImageResource(R.drawable.c1);
            btn3.setText("A");
            btn1.setText("Z");
            btn2.setText("C");
            btn4.setText("B");
        }
        else if(btnText.equals("C"))
        {
            imageView.setImageResource(R.drawable.d1);
            btn3.setText("D");
            btn1.setText("A");
            btn2.setText("L");
            btn4.setText("X");
        }
        else if(btnText.equals("D"))
        {
            imageView.setImageResource(R.drawable.e1);
            btn3.setText("F");
            btn1.setText("G");
            btn2.setText("E");
            btn4.setText("C");
        }
        else if(btnText.equals("E"))
        {
            imageView.setImageResource(R.drawable.f1);
            btn3.setText("I");
            btn1.setText("S");
            btn2.setText("W");
            btn4.setText("F");
        }
        else if(btnText.equals("F"))
        {
            imageView.setImageResource(R.drawable.g1);
            btn3.setText("Q");
            btn1.setText("G");
            btn2.setText("C");
            btn4.setText("K");
        }
        else if(btnText.equals("G"))
        {
            imageView.setImageResource(R.drawable.h1);
            btn3.setText("Q");
            btn1.setText("R");
            btn2.setText("H");
            btn4.setText("B");
        }
        else if(btnText.equals("H"))
        {
            imageView.setImageResource(R.drawable.i1);
            btn3.setText("M");
            btn1.setText("I");
            btn2.setText("J");
            btn4.setText("B");
        }
        else if(btnText.equals("I"))
        {
            imageView.setImageResource(R.drawable.j1);
            btn3.setText("I");
            btn1.setText("J");
            btn2.setText("O");
            btn4.setText("R");
        }
        else if(btnText.equals("J"))
        {
            imageView.setImageResource(R.drawable.k1);
            btn3.setText("A");
            btn1.setText("J");
            btn2.setText("K");
            btn4.setText("X");
        }
        else if(btnText.equals("K"))
        {
            imageView.setImageResource(R.drawable.l1);
            btn3.setText("Q");
            btn1.setText("L");
            btn2.setText("K");
            btn4.setText("B");
        }
        else if(btnText.equals("L"))
        {
            imageView.setImageResource(R.drawable.m1);
            btn3.setText("C");
            btn1.setText("R");
            btn2.setText("L");
            btn4.setText("M");
        }
        else if(btnText.equals("M"))
        {
            imageView.setImageResource(R.drawable.n1);
            btn3.setText("M");
            btn1.setText("R");
            btn2.setText("N");
            btn4.setText("S");
        }
        else if(btnText.equals("N"))
        {
            imageView.setImageResource(R.drawable.o1);
            btn3.setText("O");
            btn1.setText("R");
            btn2.setText("E");
            btn4.setText("C");
        }
        else if(btnText.equals("O"))
        {
            imageView.setImageResource(R.drawable.p1);
            btn3.setText("P");
            btn1.setText("R");
            btn2.setText("C");
            btn4.setText("O");
        }
        else if(btnText.equals("P"))
        {
            imageView.setImageResource(R.drawable.q1);
            btn3.setText("K");
            btn1.setText("L");
            btn2.setText("P");
            btn4.setText("Q");
        }
        else if(btnText.equals("Q"))
        {
            imageView.setImageResource(R.drawable.r1);
            btn3.setText("I");
            btn1.setText("R");
            btn2.setText("Z");
            btn4.setText("B");
        }
        else if(btnText.equals("R"))
        {
            imageView.setImageResource(R.drawable.s1);
            btn3.setText("A");
            btn1.setText("R");
            btn2.setText("S");
            btn4.setText("B");
        }
        else if(btnText.equals("S"))
        {
            imageView.setImageResource(R.drawable.t1);
            btn3.setText("B");
            btn1.setText("S");
            btn2.setText("A");
            btn4.setText("T");
        }
        else if(btnText.equals("T"))
        {
            imageView.setImageResource(R.drawable.u1);
            btn3.setText("U");
            btn1.setText("R");
            btn2.setText("C");
            btn4.setText("B");
        }
        else if(btnText.equals("U"))
        {
            imageView.setImageResource(R.drawable.v1);
            btn3.setText("D");
            btn1.setText("S");
            btn2.setText("V");
            btn4.setText("Q");
        }
        else if(btnText.equals("V"))
        {
            imageView.setImageResource(R.drawable.w1);
            btn3.setText("W");
            btn1.setText("R");
            btn2.setText("C");
            btn4.setText("B");
        }
        else if(btnText.equals("W"))
        {
            imageView.setImageResource(R.drawable.x1);
            btn3.setText("Q");
            btn1.setText("R");
            btn2.setText("X");
            btn4.setText("V");
        }
        else if(btnText.equals("X"))
        {
            imageView.setImageResource(R.drawable.y1);
            btn3.setText("Y");
            btn1.setText("Z");
            btn2.setText("C");
            btn4.setText("A");
        }
        else if(btnText.equals("Y"))
        {
            imageView.setImageResource(R.drawable.z1);
            btn3.setText("Z");
            btn1.setText("A");
            btn2.setText("C");
            btn4.setText("B");
        }
        else if(btnText.equals("Z"))
        {
            imageView.setImageResource(R.drawable.good);
            btn1.setVisibility(View.INVISIBLE);
            btn2.setVisibility(View.INVISIBLE);
            btn3.setVisibility(View.INVISIBLE);
            btn4.setVisibility(View.INVISIBLE);
            textView.setVisibility(View.INVISIBLE);
        }
    }
}