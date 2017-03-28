package com.woodnaonly.constraintlayout.activity;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;

import com.woodnaonly.constraintlayout.R;
import com.woodnaonly.constraintlayout.SectionsPagerAdapter;

public class XmlActivity extends AppCompatActivity {


    private SectionsPagerAdapter mSectionsPagerAdapter;
    private ViewPager mViewPager;
    private TabLayout mTablayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        mSectionsPagerAdapter = new SectionsPagerAdapter(getSupportFragmentManager());
        mViewPager = (ViewPager) findViewById(R.id.container);
        mTablayout = (TabLayout) findViewById(R.id.tablayout);
        mViewPager.setAdapter(mSectionsPagerAdapter);
        mTablayout.setupWithViewPager(mViewPager);

    }


}
