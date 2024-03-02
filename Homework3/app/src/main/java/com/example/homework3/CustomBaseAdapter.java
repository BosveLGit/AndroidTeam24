package com.example.homework3;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class CustomBaseAdapter extends BaseAdapter {

    Context context;
    String[] arrayCountries;
    int[] arrayFlags;
    LayoutInflater inflater;

    public CustomBaseAdapter(Context context, String[] arrayCountries, int[] arrayFlags) {
        this.context = context;
        this.arrayCountries = arrayCountries;
        this.arrayFlags = arrayFlags;
        inflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return arrayCountries.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {

        convertView = inflater.inflate(R.layout.country_item_list, null);
        TextView textView = (TextView) convertView.findViewById(R.id.textView);
        ImageView imageView = (ImageView) convertView.findViewById(R.id.flagIcon);
        textView.setText(arrayCountries[position]);
        imageView.setImageResource(arrayFlags[position]);

        return convertView;
    }
}
