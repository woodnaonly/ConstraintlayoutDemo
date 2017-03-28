package com.woodnaonly.constraintlayout.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.woodnaonly.constraintlayout.R;

public class Fragment4 extends Fragment {



	public Fragment4() {

	}


	public static Fragment4 newInstance() {
		Fragment4 fragment = new Fragment4();
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
		return inflater.inflate(R.layout.fragment_fragment4, container, false);
	}



}
