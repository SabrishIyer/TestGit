package com.example.testgit;

import android.app.Activity;
import android.os.Bundle;

public class TestActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		System.out.println("OnCreate Added a Logs");
		System.out.println("Trying Update");
		System.out.println("Adding logs for various commit - 2");
		setContentView(R.layout.activity_main);
	}
}
