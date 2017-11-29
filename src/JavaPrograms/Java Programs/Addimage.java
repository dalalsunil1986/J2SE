package com.starsignage.legends;


import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.content.res.Resources;
import android.database.Cursor;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.Toast;

public class Addimage extends TabActivity {

	EditText path,time;
	Button saveBtn,cancelbtn,brwsebtn;

	TabHost th;
	TabHost.TabSpec tsp;


	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.addimage);
		
		 th=getTabHost();
		
	        Resources res=getResources();
	        Intent ii=new Intent(Addimage.this,Browseimage.class);
	        tsp=th.newTabSpec("A").setIndicator("Image").setContent(ii);
	        th.addTab(tsp);
	        
	        Intent ii2=new Intent(Addimage.this,BrowseAudio.class);
	        tsp=th.newTabSpec("B").setIndicator("Audio").setContent(ii2);
	        th.addTab(tsp);
		
		
	        Intent ii3=new Intent(Addimage.this,BrowseVideo.class);
	        tsp=th.newTabSpec("C").setIndicator("Vedio").setContent(ii3);
	        th.addTab(tsp);
		
		
		
	}
	public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
                // your code here
        	
        	Intent in=new Intent(Addimage.this,LibrariesActivity.class);
    		
    		startActivity(in);
    		Addimage.this.finish();
                return true;
        }
    return super.onKeyDown(keyCode, event);
}
}
