package com.example.hotalbooking;

import java.util.ArrayList;

public class Constant {

    public static ArrayList<RecyclerData> getData() {

        ArrayList<RecyclerData> list = new ArrayList<>();

        RecyclerData data = new RecyclerData(R.drawable.flight,"Flights");
        list.add(data);
        RecyclerData data1 = new RecyclerData(R.drawable.hotels,"Hotels");
        list.add(data1);
        RecyclerData data2 = new RecyclerData(R.drawable.holiday,"Holiday Packages");
        list.add(data2);
        RecyclerData data3 = new RecyclerData(R.drawable.bus,"Trains/Bus");
        list.add(data3);

        return list;
    }
}
