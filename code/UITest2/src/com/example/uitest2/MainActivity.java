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
        			textView1.setText("����Ա��� ����");
        		else if(radiobutton2.isChecked())
        			textView1.setText("����Ա��� Ů��");
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
					buttonView.setText(" ��ѡ���˰����Ķ�");
				}
				else{
					buttonView.setText("�Ķ�");
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
					buttonView.setText(" ��ѡ���˰�����Ӿ");
				}
				else{
					buttonView.setText("��Ӿ");
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
					buttonView.setText(" ��ѡ���˰�����Ϸ");
				}
				else{
					buttonView.setText("��Ϸ");
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
				textview2.setText("����������䣺"+x[position]);
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
