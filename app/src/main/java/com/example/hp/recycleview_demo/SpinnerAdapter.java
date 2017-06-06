package com.example.hp.recycleview_demo;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.List;

import de.hdodenhof.circleimageview.CircleImageView;

/**
 * Created by hp on 25/05/2017.
 */

public class SpinnerAdapter extends ArrayAdapter<Person> {

    Activity activity;
    int resource;
    List<Person> objects;

    public SpinnerAdapter(Activity activity, int resource, List<Person> objects) {
        super(activity, resource, objects);
        this.activity = activity;
        this.resource = resource;
        this.objects = objects;
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    @Override
    public View getDropDownView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        return getCustomView(position, convertView, parent);
    }

    private View getCustomView(final int position, View convertView, ViewGroup parent) {
        LayoutInflater layoutInflater = this.activity.getLayoutInflater();
        View view = layoutInflater.inflate(this.resource, null);

        CircleImageView imageView = (CircleImageView) view.findViewById(R.id.imgSpinner);
        TextView textView = (TextView) view.findViewById(R.id.txtSpinner);
        CheckBox checkBox = (CheckBox) view.findViewById(R.id.chkSpinner);

        Person person = this.objects.get(position);
        imageView.setImageResource(person.getHinh());
        textView.setText(person.getTen());
        checkBox.setChecked(person.isCheck());
        return view;
    }


}
