package com.example.hotalbooking;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import me.relex.circleindicator.CircleIndicator;

public class HostFragment extends Fragment {

    ViewPager mViewPager;
    int[] images = {R.drawable.img_5, R.drawable.img_4, R.drawable.img_3, R.drawable.img_8,};

    ViewPagerAdapter adapter;
    CircleIndicator indicator;

    public HostFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_host, container, false);

        mViewPager = view.findViewById(R.id.viewpager);
        indicator = view.findViewById(R.id.indicator);
        adapter = new ViewPagerAdapter(requireActivity(), images);

        mViewPager.setAdapter(adapter);
        indicator.setViewPager(mViewPager);
        return view;
    }
}