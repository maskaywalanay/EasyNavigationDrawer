package com.sec.app.review.romantic;

import android.app.*;
import android.os.*;
import android.widget.*;
import android.view.View.*;
import android.view.*;
import android.content.*;

public class MainActivity extends Activity 

{
	ImageView imageView;
	
	
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
		
		imageView = (ImageView)findViewById(R.id.d_exit);
		imageView.setOnClickListener(new OnClickListener(){

				@Override
				public void onClick(View p1)
				{
					Intent inten = new Intent();
					inten.setClassName("eu.chainfire.supersu","eu.chainfire.supersu.MainActivity");
					startActivity(inten);
					Toast.makeText(getApplicationContext(),R.string.toast_clicked_a,Toast.LENGTH_SHORT).show();
				}
				
			
		});
		
    }
}
