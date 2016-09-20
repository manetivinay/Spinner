package com.example.vinaymaneti.spinner.ViewHolder;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.vinaymaneti.spinner.R;

import org.w3c.dom.Text;

/**
 * Created by vinaymaneti on 6/14/16.
 */
public class SpinnerViewHolder {

    public ImageView imageViewCountryFlag;
    public TextView textViewCountryName;

    public SpinnerViewHolder(View view) {
        imageViewCountryFlag = (ImageView) view.findViewById(R.id.imageView);
        textViewCountryName = (TextView) view.findViewById(R.id.textViewCountryName);
    }
}
