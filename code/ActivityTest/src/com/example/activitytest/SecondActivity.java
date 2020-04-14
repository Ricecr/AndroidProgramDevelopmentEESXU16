package com.example.activitytest;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class SecondActivity extends Activity {
	protected void onCreate (Bundle savedInstanceState){
		super.onCreate(savedInstanceState);
		
		//requestWindowFeature(Window.FEATURE_NO_TITLE);
		
		setContentView(R.layout.second_layout);
	
/*		//SecondActivity中接收

		Intent intent = getIntent();
		String data = intent.getStringExtra("extra_data");
		Log.d("SecondActivity",data);*/
		
		//Button2中添加onClick()传递数据
		Button button2 = (Button) findViewById(R.id.button2);
		button2.setOnClickListener(new View.OnClickListener(){
			@Override
			public void onClick(View arg0){
				Intent intent = new Intent();
				intent.putExtra("return_data","Hi First,I'm coming soon");
				setResult(RESULT_OK,intent);
				finish();
			}
			public void onBackPressed(){
				Intent intent = new Intent();
				intent.putExtra("return_data", "Hi, first0.0");
				setResult(RESULT_OK,intent);
				finish();
			}
		});
		
	}

}
