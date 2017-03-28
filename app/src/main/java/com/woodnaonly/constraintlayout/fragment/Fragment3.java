package com.woodnaonly.constraintlayout.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.woodnaonly.constraintlayout.R;

public class Fragment3 extends Fragment {



	public Fragment3() {

	}


	public static Fragment3 newInstance() {
		Fragment3 fragment = new Fragment3();
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
		return inflater.inflate(R.layout.fragment_fragment3, container, false);
	}



}
