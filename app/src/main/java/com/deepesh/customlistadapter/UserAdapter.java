package com.deepesh.customlistadapter;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.deepesh.customlistadapter.R;

import java.util.ArrayList;

public class UserAdapter extends ArrayAdapter<User> {

    ImageView image_icon;
    TextView text_name;
    Context context;
    int resource;
    ArrayList<User> userArrayList;

    public UserAdapter(@NonNull Context context, int resource, @NonNull ArrayList<User> objects) {
        super(context, resource, objects);
        this.context=context;
        this.resource=resource;
        userArrayList=objects;


    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView=LayoutInflater.from(getContext()).inflate(resource,parent,false);
        image_icon=convertView.findViewById(R.id.image_icon);
        text_name=convertView.findViewById(R.id.text_name);

        User user=userArrayList.get(position);

        image_icon.setBackgroundResource(user.getIcon());
        text_name.setText(user.getName());


        return convertView;

    }
}
