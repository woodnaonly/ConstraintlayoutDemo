package com.woodnaonly.constraintlayout.activity;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.transition.TransitionManager;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.woodnaonly.constraintlayout.R;

public class JavaActivity extends AppCompatActivity {

	private ConstraintLayout constraintLayout;
	private ConstraintSet applyConstraintSet = new ConstraintSet();
	private ConstraintSet resetConstraintSet = new ConstraintSet();

	@Override protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_java);
		constraintLayout = (ConstraintLayout) findViewById(R.id.main);
		resetConstraintSet.clone(constraintLayout);
		applyConstraintSet.clone(constraintLayout);
	}

	public void onApplyClick(View view) {
		TransitionManager.beginDelayedTransition(constraintLayout);
		applyConstraintSet.setMargin(R.id.button1, ConstraintSet.START, 8);
		applyConstraintSet.applyTo(constraintLayout);
	}

	public void onResetClick(View view) {
		applyConstraintSet.setMargin(R.id.button1, ConstraintSet.END, 100);
		resetConstraintSet.applyTo(constraintLayout);
	}

	public void changeWidth(View view) {
		TransitionManager.beginDelayedTransition(constraintLayout);

		applyConstraintSet.constrainWidth(R.id.button1, 600);
		applyConstraintSet.constrainWidth(R.id.button2, 600);
		applyConstraintSet.constrainWidth(R.id.button3, 600);



		applyConstraintSet.applyTo(constraintLayout);
	}

	public void changeheight(View view) {
		TransitionManager.beginDelayedTransition(constraintLayout);
		applyConstraintSet.constrainHeight(R.id.button2, 600);
		applyConstraintSet.applyTo(constraintLayout);
	}

	public void fangda(View view) {
		TransitionManager.beginDelayedTransition(constraintLayout);

		applyConstraintSet.setVisibility(R.id.button2, ConstraintSet.GONE);
		applyConstraintSet.setVisibility(R.id.button3, ConstraintSet.GONE);
		applyConstraintSet.clear(R.id.button1);
		applyConstraintSet
			.connect(R.id.button1, ConstraintSet.LEFT, R.id.main, ConstraintSet.LEFT, 0);
		applyConstraintSet
			.connect(R.id.button1, ConstraintSet.RIGHT, R.id.main, ConstraintSet.RIGHT, 0);
		applyConstraintSet
			.connect(R.id.button1, ConstraintSet.TOP, R.id.main, ConstraintSet.TOP, 0);
		applyConstraintSet
			.connect(R.id.button1, ConstraintSet.BOTTOM, R.id.main, ConstraintSet.BOTTOM, 0);
		applyConstraintSet.applyTo(constraintLayout);
	}
}
