package com.woodnaonly.constraintlayout.fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.woodnaonly.constraintlayout.R;

/**
 * 水平布局
 */
public class Fragment6 extends Fragment {
	View root;
	View button1;
	View button2;


	public Fragment6() {

	}


	public static Fragment6 newInstance() {
		Fragment6 fragment = new Fragment6();
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
		root = inflater.inflate(R.layout.fragment_fragment6, container, false);
		return root;
	}

	@Override public void onActivityCreated(@Nullable Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		button1 = root.findViewById(R.id.button1);
		button2 = root.findViewById(R.id.button2);
		button2.setOnClickListener(new View.OnClickListener() {
			@Override public void onClick(View v) {
				button1.setVisibility(View.GONE);
			}
		});


	}
}
