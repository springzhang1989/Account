package com.springzhang.account.ui;

import com.springzhang.account.R;
import com.springzhang.account.R.layout;
import com.springzhang.account.R.menu;

import android.os.Bundle;
import android.R.integer;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }
    
    
    
}
