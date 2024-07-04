package com.example.hotalbooking;

import android.content.Intent;
import android.os.Bundle;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import java.util.ArrayList;

public class HomeFragment extends Fragment {
    ImageView myCash, myBiz;
    CardView card,card_h,holiday;
    RelativeLayout flight_bt;

    public HomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        myCash = view.findViewById(R.id.myCash);
        flight_bt = view.findViewById(R.id.flight_bt);
        card_h = view.findViewById(R.id.card_h);
        holiday=view.findViewById(R.id.holiday);
        card_h.setOnClickListener(v -> {
            Intent i = new Intent(requireActivity(), HotelBooking.class);
            requireActivity().startActivity(i);
        });
        myCash.setOnClickListener(v -> {
            Intent i = new Intent(requireActivity(), MyCashActivity.class);
            requireActivity().startActivity(i);
        });
        card = view.findViewById(R.id.card);
        card.setOnClickListener(v -> {
            Intent i = new Intent(requireActivity(), MakeMyTripActivity.class);
            requireActivity().startActivity(i);
        });

        myBiz = view.findViewById(R.id.myBiz);
        myBiz.setOnClickListener(v -> {
            Intent i = new Intent(requireActivity(), MyBizActivity.class);
            requireActivity().startActivity(i);
        });
        flight_bt.setOnClickListener(v -> {
            Intent i = new Intent(requireActivity(), FlightBooking.class);
            requireActivity().startActivity(i);
        });
        holiday.setOnClickListener(v -> {
            Intent i = new Intent(requireActivity(), HolidayPackages.class);
            requireActivity().startActivity(i);
        });
        return view;
    }
//Anushka@#23
}