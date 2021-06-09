package com.meburbstudios.rosegridviewexample;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {



    android.widget.GridView gridView;

    //create arrays to hold the images and the description
    ArrayList<String> roseDescription = new ArrayList<>();
    ArrayList<Integer>roseImage = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gridView = findViewById(R.id.gridView);

        //load the Imagelist
        loadRoseDescriptionList();

        //load the description list
        loadRoseImageList();


        //set the grid adapter
        GridAdapter adapter = new GridAdapter(this, roseDescription, roseImage);
        gridView.setAdapter(adapter);

        //create a toast message for clicking the item.
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Toast.makeText(getApplicationContext(), "A rose is a rose", Toast.LENGTH_LONG).show();
            }
        });
    }


    //load description list function
    public void loadRoseDescriptionList(){
        roseDescription.add("Red means passion, respect, and love. ");
        roseDescription.add("Light pink means admiration, grace, and sweetness. ");
        roseDescription.add("Yellow means friendship and delight.");
        roseDescription.add("Purple means love at first sight");
        roseDescription.add("White means secrecy and innocence.");
        roseDescription.add("A white rosebud represents girlhood");
        roseDescription.add("Orange represents fascination and desire");
        roseDescription.add("Blue represents the unattainable.");

    }


    //load imagelist function
    public void loadRoseImageList(){
        roseImage.add(R.drawable.red);
        roseImage.add(R.drawable.pink);
        roseImage.add(R.drawable.yellow);
        roseImage.add(R.drawable.purple);
        roseImage.add(R.drawable.white);
        roseImage.add(R.drawable.whiterosebud);
        roseImage.add(R.drawable.orange);
        roseImage.add(R.drawable.blue);

    }
}