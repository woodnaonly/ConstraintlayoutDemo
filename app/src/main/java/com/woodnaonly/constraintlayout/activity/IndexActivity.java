package com.woodnaonly.constraintlayout.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.woodnaonly.constraintlayout.R;

public class IndexActivity extends AppCompatActivity {

	@Override protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_index);
	}

	public void gotoXml(View view) {
		startActivity(new Intent(this, XmlActivity.class));
	}

	public void gotoJava(View view) {
		startActivity(new Intent(this, JavaActivity.class));
	}
}
