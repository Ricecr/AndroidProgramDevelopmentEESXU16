package com.example.uitest;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends Activity implements OnClickListener{

    private Button button;
    private EditText editText;
	private ImageView imageView;
	private ProgressBar progressBar;

	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = (Button) findViewById(R.id.button1);
        editText = (EditText) findViewById(R.id.editText1);
        imageView = (ImageView) findViewById(R.id.imageView1);
        progressBar = (ProgressBar) findViewById(R.id.progressBar1);
        button.setOnClickListener(this); 
	}
        
/*        ProgressDialog progressDialog = new ProgressDialog(MainActivity.this);
        progressDialog.setTitle("This is a ProgressDialog");
        progressDialog.setMessage("Loading...");
        progressDialog.setCancelable(true);
        progressDialog.show();
        
        AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
        dialog.setTitle("This is a Dialog");
        dialog.setMessage("Something is Important");
        dialog.setCancelable(false);
        dialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
     	
        	public void onClick(DialogInterface arg0,int arg1) {
        		
        	}
        });
        dialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener(){
        	public void onClick(DialogInterface arg0,int arg1){
        		
        	}
        });
        dialog.show();*/
        
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				switch (arg0.getId()){
				case R.id.button1:
					String inputText = editText.getText().toString();
					Toast.makeText(MainActivity.this, inputText, 
							Toast.LENGTH_SHORT).show();
/*				case R.id.button1:
					imageView.setImageResource(R.drawable.duck);
					String inputText = editText.getText().toString();
					Toast.makeText(MainActivity.this, inputText, 
							Toast.LENGTH_SHORT).show();
				case R.id.button1:
					imageView.setImageResource(R.drawable.duck);
					String inputText = editText.getText().toString();
					Toast.makeText(MainActivity.this, inputText, 
							Toast.LENGTH_SHORT).show();*/
					if(progressBar.getVisibility()==View.GONE){
						progressBar.setVisibility(View.VISIBLE);
					}else{
						progressBar.setVisibility(View.GONE);
					}
				
				int progress = progressBar.getProgress();
				progress = progress+10;
				progressBar.setProgress(progress);
				
					break;
				default:
					break;
				}
			}
	

/*    @Override
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

*/

	}

