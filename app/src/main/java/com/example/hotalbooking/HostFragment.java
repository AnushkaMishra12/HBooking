package com.example.hotalbooking;

import android.os.Bundle;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.viewpager.widget.ViewPager;

import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.Timer;
import java.util.TimerTask;

import me.relex.circleindicator.CircleIndicator;

public class HostFragment extends Fragment {

    ViewPager mViewPager;
    int[] images = {R.drawable.img_5, R.drawable.img_4, R.drawable.img_3, R.drawable.img_8,};

    ViewPagerAdapter adapter;
    CircleIndicator indicator;
    private Handler handler;
    private Runnable runnable;
    private Timer timer;
    private int currentPage = 0;
    private final long DELAY_MS = 500; // Delay in milliseconds before task is to be executed
    private final long PERIOD_MS = 3000; // Time in milliseconds between successive task executions

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
        handler = new Handler();
        runnable = () -> {
            if (adapter.getCount() > 0) {
                currentPage = (currentPage + 1) % adapter.getCount();
                mViewPager.setCurrentItem(currentPage, true);
            }
        };

        timer = new Timer();
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                handler.post(runnable);
            }
        }, DELAY_MS, PERIOD_MS);
        return view;
    }
    @Override
    public void onDestroyView() {
        super.onDestroyView();
        if (timer != null) {
            timer.cancel(); // Cancel the timer when the view is destroyed
            timer = null;
        }
    }
}