package com.woodnaonly.constraintlayout.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.woodnaonly.constraintlayout.R;

/**
 * 水平布局
 */
public class Fragment5 extends Fragment {



	public Fragment5() {

	}


	public static Fragment5 newInstance() {
		Fragment5 fragment = new Fragment5();
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
		return inflater.inflate(R.layout.fragment_fragment5, container, false);
	}



}
