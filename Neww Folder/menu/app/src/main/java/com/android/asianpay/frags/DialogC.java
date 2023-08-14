package com.android.asianpay.frags;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.DialogFragment;

public class DialogC extends DialogFragment {
    public static final String TAG = "DialogC";
    @NonNull
    @Override
    public Dialog onCreateDialog(@Nullable Bundle savedInstanceState) {
        return new AlertDialog.Builder(requireContext()).setMessage("Hello from the other side").setPositiveButton("Ok", ((dialog, which) -> {
        })).create();
    }
}
