import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

import com.example.easylearingabc.R;

import java.util.ArrayList;

public class MyViewAdapter extends ArrayAdapter<Letter> {

    public MyViewAdapter(@NonNull Context context, ArrayList<Letter> letters) {
        super(context,0,letters);
    }
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        Letter letter = getItem(position);
        convertView = LayoutInflater.from(getContext()).inflate(R.layout.student_activity, parent, false);
        TextView textViewName =  convertView.findViewById(R.id.name);
        ImageView imageView = convertView.findViewById(R.id.imageView);
        textViewName.setText(student.name);
        return convertView;
    }
}
