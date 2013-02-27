package com.android.vxphotos;

import android.content.Context;
import android.graphics.Point;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import android.widget.BaseAdapter;
import android.widget.GridView;
import android.widget.ImageView;
 
public class ImageAdapter extends BaseAdapter {
    private Context mContext;

   
    // Keep all Images in array
    // THIS IS WHERE WE FUNNEL THE IMAGES
    Integer[] pics = { R.drawable.classroom1, R.drawable.classroom1, R.drawable.classroom1, R.drawable.classroom1, 
    		R.drawable.classroom1, R.drawable.classroom1, R.drawable.classroom1, R.drawable.classroom1, 
    		R.drawable.classroom1, R.drawable.classroom1, R.drawable.classroom1, R.drawable.classroom1, 
    		R.drawable.classroom1, R.drawable.classroom1, R.drawable.classroom1, R.drawable.classroom1, 
    		R.drawable.classroom1, R.drawable.classroom1 }; 

 
    // Constructor
    public ImageAdapter(Context c){
        mContext = c;
    }
 
    @Override
    public int getCount() {
        return pics.length;
    }
 
    @Override
    public Object getItem(int position) {
        return pics[position];
    }
 
    @Override
    public long getItemId(int position) {
        return 0;
    }
 
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ImageView imageView = new ImageView(mContext);
        imageView.setImageResource(pics[position]);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setLayoutParams(new GridView.LayoutParams(150, 150));
        return imageView;
    }
 
}