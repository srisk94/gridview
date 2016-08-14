package com.example.srima.gridview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

/**
 * Created by srima on 21-06-2016.
 */


import android.app.Activity;
import android.os.Bundle;
import android.widget.GridView;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;


    public class ImageAdapter extends BaseAdapter {
        private Context mContext;
        public Integer[] imgid;

        public int getCount() {
            return imgid.length;
        }

        public Object getItem(int position) {
            return imgid[position];
        }

        public long getItemId(int position) {
            return 0;
        }

        public ImageAdapter(Context c,Integer[] imgid) {
            mContext = c;
            this.imgid=imgid;
        }

        public View getView(int position, View convertView, ViewGroup parent) {
            ImageView imageView;
            if (convertView == null) {
                imageView = new ImageView(mContext);
                imageView.setLayoutParams(new GridView.LayoutParams(95, 95));
                imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);

            } else {
                imageView = (ImageView) convertView;
            }
            imageView.setImageResource(imgid[position]);
            return imageView;
        }
    }