package com.example.lab2c_fitrah;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;

public class imageAdapter extends BaseAdapter {
    private Context mContext;

    //add all images to arraylist
    public Integer[] thumbImages={
            R.drawable.pic_1, R.drawable.pic_2, R.drawable.pic_3, R.drawable.pic_4, R.drawable.pic_5, R.drawable.pic_6
    };

    public imageAdapter(Context c){mContext = c;}
    public int getCount(){return thumbImages.length;}
    public Object getItem(int position){return null;}
    public long getItemId(int position){
        return 0;
    }
    public View getView(int position, View convertView, ViewGroup parent){
        ImageView imageView = new ImageView(mContext);
        imageView.setLayoutParams(new GridView.LayoutParams(250,250));
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setPadding(8,8,8,8);
        imageView.setImageResource(thumbImages[position]);
        return imageView;
    }
}
