package com.android.vxphotos;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;
import android.view.View;

import android.content.Intent;






public class Gallery_Activity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_gallery);

		// Sends user to "New Gallery" pane
		
        findViewById(R.id.button1).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            	Intent intent = new Intent(Gallery_Activity.this, NewGallery.class);
                startActivity(intent);
            }
        });
                
                findViewById(R.id.button2).setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                    	Intent intent = new Intent(Gallery_Activity.this, Intra_Gallery.class);
                        startActivity(intent);
                        

            }
        });
		
	}

}
