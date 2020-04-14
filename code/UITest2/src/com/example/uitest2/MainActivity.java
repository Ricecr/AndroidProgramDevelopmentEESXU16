package com.example.uitest2;

import com.example.uitest2.R.id;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.*;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.RadioGroup.OnCheckedChangeListener;



public class MainActivity extends Activity {
	
	private String[] x = {"1-9","10-19","20-29","30-39","40-49","50--"};
	private ArrayAdapter<String> adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        RadioGroup radiogroup = (RadioGroup) findViewById(R.id.radiogroup);
        final RadioButton radiobutton1 = (RadioButton) findViewById(R.id.radiobutton1);
        final RadioButton radiobutton2 = (RadioButton) findViewById(R.id.radiobutton2);
        final TextView textView1 = (TextView) findViewById(R.id.textView1);
        
        radiogroup.setOnCheckedChangeListener(new OnCheckedChangeListener(){

			@Override
			public void onCheckedChanged(RadioGroup group, int checkedId) {
				// TODO Auto-generated method stub
				if(radiobutton1.isChecked())
        			textView1.setText("你的性别是 男性");
        		else if(radiobutton2.isChecked())
        			textView1.setText("你的性别是 女性");
			}
    });
        final CheckBox checkbox1 = (CheckBox) findViewById(R.id.checkbox1);
        final CheckBox checkbox2 = (CheckBox) findViewById(R.id.checkbox2);
        final CheckBox checkbox3 = (CheckBox) findViewById(R.id.checkbox3);
        checkbox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, 
					boolean isChecked) {
				// TODO Auto-generated method stub
				// String str1;
				
				if(isChecked){
					buttonView.setText(" 你选择了爱好阅读");
				}
				else{
					buttonView.setText("阅读");
				}
			}
		});
        
        checkbox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, 
					boolean isChecked) {
				// TODO Auto-generated method stub
				// String str1;
				
				if(isChecked){
					buttonView.setText(" 你选择了爱好游泳");
				}
				else{
					buttonView.setText("游泳");
				}
			}
		});
        
        checkbox3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
			
			@Override
			public void onCheckedChanged(CompoundButton buttonView, 
					boolean isChecked) {
				// TODO Auto-generated method stub
				// String str1;
				
				if(isChecked){
					buttonView.setText(" 你选择了爱好游戏");
				}
				else{
					buttonView.setText("游戏");
				}
			}
		});
        
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
        adapter = new ArrayAdapter<String> (this,android.R.layout.simple_spinner_item,x);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_item);
        spinner.setAdapter(adapter);
        spinner.setOnItemSelectedListener(new OnItemSelectedListener(){
        	TextView textview2 = (TextView) findViewById(R.id.textView4);
        	
        	public void onNothingSelected(AdapterView<?> arg0){
        	}
			@Override
			public void onItemSelected(AdapterView<?> parent, View view,
					int position, long id) {
				// TODO Auto-generated method stub
				textview2.setText("你的年龄区间："+x[position]);
			}
        });
        spinner.setVisibility(View.VISIBLE);
    }
    
    
        

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
