package com.android.vxphotos;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.GridView;
 
public class Intra_Gallery extends Activity {
 
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intra__gallery);
 
        GridView gridView = (GridView) findViewById(R.id.gridview);
 
        // Instance of ImageAdapter Class
        gridView.setAdapter(new ImageAdapter(this));
    }
}
