package com.example.srima.gridview;

import android.content.Context;
import android.support.annotation.IdRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

   static final Integer imgid[]={R.drawable.cupcake,R.drawable.donut,R.drawable.eclair,
           R.drawable.jellybean,R.drawable.honeycomb};



    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        GridView gridview=(GridView)findViewById(R.id.grid);
        ImageAdapter adapt=new ImageAdapter(this,imgid);
        gridview.setAdapter(adapt);

    }

            }


