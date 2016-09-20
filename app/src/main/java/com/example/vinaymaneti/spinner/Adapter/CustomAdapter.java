package com.example.vinaymaneti.spinner.Adapter;

import android.content.Context;
import android.content.res.Resources;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import com.example.vinaymaneti.spinner.Helper.SingleRow;
import com.example.vinaymaneti.spinner.R;
import com.example.vinaymaneti.spinner.ViewHolder.SpinnerViewHolder;

import java.util.ArrayList;

/**
 * Created by vinaymaneti on 6/14/16.
 */
public class CustomAdapter extends BaseAdapter {

    Context context;
    ArrayList<SingleRow> arrayList;

    public CustomAdapter(Context context) {
        this.context = context;
        arrayList = new ArrayList<>();
        Resources resources = context.getResources();
        String[] countryNameArray = resources.getStringArray(R.array.countryName);
        int[] countryImagesArray = {
                R.drawable.icon_india_1,
                R.drawable.icon_germany_2,
                R.drawable.icon_vietnam_3,
                R.drawable.icon_china_4,
                R.drawable.icon_australia_5,
                R.drawable.icon_bangladesh_6,
                R.drawable.icon_pakistan_7,
                R.drawable.icon_srilanka_8,
                R.drawable.icon_usa_9,
                R.drawable.icon_south_africa_10,
        };

        for (int i = 0; i < countryNameArray.length; i++) {
            SingleRow singleRow = new SingleRow();
            singleRow.setCountryName(countryNameArray[i]);
            singleRow.setCountryImages(countryImagesArray[i]);
            arrayList.add(singleRow);
        }
    }

    @Override
    public int getCount() {
        return arrayList.size();
    }

    @Override
    public Object getItem(int position) {
        return arrayList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View row = convertView;
        SpinnerViewHolder spinnerViewHolder = null;
        if (row == null) {
            LayoutInflater layoutInflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
            row = layoutInflater.inflate(R.layout.single_row_spinner, parent, false);
            spinnerViewHolder = new SpinnerViewHolder(row);
            row.setTag(spinnerViewHolder);
            if (position == 0) {
                spinnerViewHolder.imageViewCountryFlag.setImageResource(0);
                spinnerViewHolder.textViewCountryName.setText("Please select your country flag");
            }
        } else {
            spinnerViewHolder = (SpinnerViewHolder) row.getTag();
        }
        SingleRow singleRow = arrayList.get(position);
        spinnerViewHolder.imageViewCountryFlag.setImageResource(singleRow.countryImages);
        spinnerViewHolder.textViewCountryName.setText(singleRow.countryName);
        spinnerViewHolder.imageViewCountryFlag.setTag(singleRow);
        return row;
    }
}
