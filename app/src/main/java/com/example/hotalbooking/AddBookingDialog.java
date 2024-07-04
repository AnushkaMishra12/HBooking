package com.example.hotalbooking;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.google.android.material.bottomsheet.BottomSheetDialogFragment;

public class AddBookingDialog extends BottomSheetDialogFragment {

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable
    ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.add_booking_dailog,
                container, true);

        ImageView course_button = v.findViewById(R.id.idBtnDismiss);
        course_button.setOnClickListener(v1 -> {
            dismiss();
        });
        return v;
    }
}
