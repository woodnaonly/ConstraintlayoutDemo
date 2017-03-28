package com.woodnaonly.constraintlayout.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.woodnaonly.constraintlayout.R;

public class Fragment1 extends Fragment {



	public Fragment1() {

	}


	public static Fragment1 newInstance() {
		Fragment1 fragment = new Fragment1();
		Bundle args = new Bundle();
		fragment.setArguments(args);
		return fragment;
	}

	@Override public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		if (getArguments() != null) {
		}
	}

	@Override public View onCreateView(LayoutInflater inflater, ViewGroup container,
		Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_fragment1, container, false);
	}



}
