package com.meburbstudios.rosegridviewexample;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class GridAdapter extends BaseAdapter {

    Context context;
    ArrayList<String> roseDescription = new ArrayList<>();
    ArrayList<Integer>roseImage = new ArrayList<>();

    public GridAdapter(Context context, ArrayList<String> roseDescription, ArrayList<Integer> roseImage) {
        this.context = context;
        this.roseDescription = roseDescription;
        this.roseImage = roseImage;
    }

    @Override
    public int getCount() {
        return roseDescription.size();
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.gridviewlayout,
                parent, false);

        ImageView image = view.findViewById(R.id.imageViewRose);
        TextView textView = view.findViewById(R.id.textViewDesc);

        textView.setText(roseDescription.get(position));
        image.setImageResource(roseImage.get(position));


        return view;
    }
}
