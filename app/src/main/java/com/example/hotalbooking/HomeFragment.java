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
import java.util.ArrayList;

public class HomeFragment extends Fragment {
    ImageView myCash, myBiz;
    CardView card;


    public HomeFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_home, container, false);

        myCash = view.findViewById(R.id.myCash);
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
        RecyclerView recyclerView = view.findViewById(R.id.recyclerView);
        ArrayList<RecyclerData> list = Constant.getData();
        RecyclerAdapter recyclerAdapter = new RecyclerAdapter(list);
        recyclerView.setAdapter(recyclerAdapter);
        StaggeredGridLayoutManager staggeredGridLayoutManager = new StaggeredGridLayoutManager(4, LinearLayoutManager.VERTICAL);
        recyclerView.setLayoutManager(staggeredGridLayoutManager);
        return view;
    }
//Anushka@#23
}