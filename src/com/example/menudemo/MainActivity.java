package com.example.menudemo;

import android.os.Bundle;
import android.app.Activity;
import android.graphics.Path.FillType;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {
	private TextView hw ;
    @Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		super.onOptionsItemSelected(item);
		switch(item.getItemId()){
		case R.id.item1:
			item.setIcon(R.drawable.ic_launcher);
			break;
		case R.id.item2:  
			hw.setText("123");
			break;
		case R.id.item3:    
			item.setTitle("动态设置菜单标题");
			break;
		}
		return true;
	}


	@Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        hw = (TextView) findViewById(R.id.hw);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
}
