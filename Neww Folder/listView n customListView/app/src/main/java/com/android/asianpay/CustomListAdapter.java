package com.android.asianpay;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;

public class CustomListAdapter extends ArrayAdapter<String> {

    public CustomListAdapter(Context context, String[] dataToShow){
        super(context,0,dataToShow);

    }





    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View singleListViewItem = convertView;

        if(singleListViewItem==null){
            singleListViewItem = LayoutInflater.from(parent.getContext())
                    .inflate(R.layout.custom_list_item, parent, false);
        }

        String currentDataToShow = getItem(position);

        TextView valueText = singleListViewItem.findViewById(R.id.value);
        TextView numberText = singleListViewItem.findViewById(R.id.number);

        valueText.setText(currentDataToShow);
//        numberText.setText(position+1);
        numberText.setText(Integer.toString(position+1));

        return singleListViewItem;

    }
}
