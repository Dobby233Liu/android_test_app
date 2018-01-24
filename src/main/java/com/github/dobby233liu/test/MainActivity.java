package com.github.dobby233liu.test;

import android.app.*;
import android.os.*;
import android.*;
import android.view.*;
import android.widget.*;

public class MainActivity extends Activity 
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
		System.out.print(R.string.app_name);
		System.out.print(R.string.note);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
	// String strone = R.string.hello_world;
	Toast.makeText(this, R.string.hello_world, Toast.LENGTH_LONG).show();
    }
}
