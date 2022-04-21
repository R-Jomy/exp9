package com.example.exp9;



/**
 * Created by ASUS on 2018/5/24.
 */

import java.util.List;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

@SuppressLint("InflateParams")
public class ListViewAdapter extends BaseAdapter {
    List<String> names, phones;
    LayoutInflater inflater;

    @SuppressWarnings("static-access")
    public ListViewAdapter(Context context, List<String> names,
                           List<String> phones) {
        inflater = inflater.from(context);
        this.names = names;
        this.phones = phones;
    }

    @Override
    public int getCount() {
        return names.size();
    }

    @Override
    public Object getItem(int position) {
        return position;
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        if (convertView == null) {
            view = inflater.inflate(R.layout.item, null);
            TextView tv_name = (TextView) view.findViewById(R.id.tv_name);
            TextView tv_phone = (TextView) view.findViewById(R.id.tv_number);
            tv_name.setText(names.get(position));
            tv_phone.setText(phones.get(position));
        } else {
            view = convertView;
        }
        return view;
    }

}
