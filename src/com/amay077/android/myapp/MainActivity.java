package com.amay077.android.myapp;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.Toast;

public class MainActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main_activity);
    }
    
    @Override  
    public boolean onCreateOptionsMenu(Menu menu) {  
      super.onCreateOptionsMenu(menu);  
      MenuInflater menuInflater = getMenuInflater();  
      menuInflater.inflate(R.menu.main_activity_menu, menu);  
      return true;  
    }  
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        boolean ret = true;
        switch (item.getItemId()) {
        case R.id.menu_preference:
        	startActivity(new Intent(this, MyPreferenceActivity.class));
            ret = true;
            break;
        default:
        	Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();        	
        	ret = super.onOptionsItemSelected(item);
        	break;
        }
        return ret;
    }    
}