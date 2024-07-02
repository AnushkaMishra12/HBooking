package com.example.hotalbooking;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class RecyclerAutoAdapter extends RecyclerView.Adapter<RecyclerAutoAdapter.Holder> {

    private final ArrayList<AutoData> list;

    public RecyclerAutoAdapter(ArrayList<AutoData> list) {
        this.list = list;
    }

    @NonNull
    @Override
    public Holder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.auto_layout, parent, false);
        return new Holder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull Holder holder, int position) {
        AutoData autoData = list.get(position);
        holder.img.setImageResource(autoData.getImg());
        holder.text.setText(autoData.getText());

        if (autoData.isToggleable()) {
            holder.img.setVisibility(autoData.isVisible() ? View.VISIBLE : View.GONE);
            holder.text.setVisibility(autoData.isVisible() ? View.VISIBLE : View.GONE);
        } else {
            holder.img.setVisibility(View.VISIBLE);
            holder.text.setVisibility(View.VISIBLE);
        }
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public void toggleVisibility() {
        for (AutoData autoData : list) {
            if (autoData.isToggleable()) {
                autoData.setVisible(!autoData.isVisible());
            }
        }
        notifyDataSetChanged();
    }

    public static class Holder extends RecyclerView.ViewHolder {

        private final ImageView img;
        private final TextView text;

        public Holder(@NonNull View itemView) {
            super(itemView);
            img = itemView.findViewById(R.id.img);
            text = itemView.findViewById(R.id.text);
        }
    }
}
