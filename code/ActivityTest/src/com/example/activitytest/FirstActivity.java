package com.example.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.Toast;


public class FirstActivity extends Activity {
	@Override
	protected void onCreate (Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		//requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.first_layout);
	
		Button button1 = (Button) findViewById(R.id.button1);
		button1.setOnClickListener(new View.OnClickListener(){
/*		public void onClick(View arg0){
			Toast.makeText(
					FirstActivity.this,
					"You just click Button 1", 
					Toast.LENGTH_SHORT).show();
			}*/
			
/*		public void onClick(View arg0){
			Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
			startActivity(intent);
		}*/
			
		//向下一个活动传递数据：putExtra()
		//FirstActivity中传递
			public void onClick(View arg0){
/*				String data = "Hi , Second.I'm coming.0.0";
				Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
				intent.putExtra("extra_data", data);
				startActivity(intent);*/
				
				Intent intent = new Intent(FirstActivity.this,SecondActivity.class);
				startActivityForResult(intent,1);
				
			}
		});	
	}
	@Override
    protected void onActivityResult(int requestCode,int resultCode, Intent data) { 
       	switch (requestCode) {
       	case 1:  
       		if (resultCode == RESULT_OK) { 
       			String returnedData = data.getStringExtra("return_data");   
       			Log.d("FirstActivity", returnedData);  
       		} 
       		break; 
       	default: 
       	}
       }
}
