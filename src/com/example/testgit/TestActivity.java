package com.example.testgit;

import android.app.Activity;
import android.os.Bundle;

public class TestActivity extends Activity {

	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		System.out.println("OnCreate Added a Logs");
		setContentView(R.layout.activity_main);
	}
}
