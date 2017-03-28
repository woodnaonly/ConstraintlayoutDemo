package com.woodnaonly.constraintlayout;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.woodnaonly.constraintlayout.fragment.Fragment1;
import com.woodnaonly.constraintlayout.fragment.Fragment2;
import com.woodnaonly.constraintlayout.fragment.Fragment3;
import com.woodnaonly.constraintlayout.fragment.Fragment4;
import com.woodnaonly.constraintlayout.fragment.Fragment5;
import com.woodnaonly.constraintlayout.fragment.Fragment6;

import java.util.ArrayList;
import java.util.List;

/**
 * 作者：woodnaonly on 2017/3/24 15:06
 * 邮箱：497917264@qq.com
 * 内容：
 * 备注：
 */
public class SectionsPagerAdapter extends FragmentPagerAdapter {
	List<Fragment> fragments;
	List<String> titles;


	public SectionsPagerAdapter(FragmentManager fm) {
		super(fm);

		initFragment();
		initTitle();
	}

	private void initTitle() {
		titles = new ArrayList<>();
		titles.add("相对布局");
		titles.add("宽高比");
		titles.add("表格布局");
		titles.add("分割线");
		titles.add("水平布局");
		titles.add("Gone");

	}

	private void initFragment() {
		fragments = new ArrayList<>();
		fragments.add(Fragment1.newInstance());
		fragments.add(Fragment2.newInstance());
		fragments.add(Fragment3.newInstance());
		fragments.add(Fragment4.newInstance());
		fragments.add(Fragment5.newInstance());
		fragments.add(Fragment6.newInstance());

	}

	@Override public Fragment getItem(int position) {
		return fragments.get(position);
	}

	@Override public int getCount() {
		return fragments.size();
	}

	@Override public CharSequence getPageTitle(int position) {
		return titles.get(position);
	}
}
