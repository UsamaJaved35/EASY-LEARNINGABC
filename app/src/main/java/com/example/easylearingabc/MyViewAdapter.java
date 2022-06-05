package com.example.easylearingabc;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import java.util.ArrayList;

public class MyViewAdapter extends ArrayAdapter<Letter> {

    public MyViewAdapter(@NonNull Context context, ArrayList<Letter>letters) {
        super(context, 0, letters);
    }
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Letter letter = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.alphabet, parent, false);
        ImageView imageView = convertView.findViewById(R.id.imageView2);
        imageView.setImageResource(letter.getImgId());
        return convertView;
    }
}