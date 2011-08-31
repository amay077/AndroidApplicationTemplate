package com.amay077.android.myapp;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;

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
}