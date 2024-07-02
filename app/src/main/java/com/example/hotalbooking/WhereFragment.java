package com.example.hotalbooking;

import android.content.Intent;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

public class WhereFragment extends Fragment {

    ImageView back;

    public WhereFragment() {
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_where, container, false);

        back = view.findViewById(R.id.back);
        back.setOnClickListener(v -> {

            Intent i = new Intent(getActivity(), MainActivity.class);
            getActivity().startActivity(i);

        });
        return view;
    }
}