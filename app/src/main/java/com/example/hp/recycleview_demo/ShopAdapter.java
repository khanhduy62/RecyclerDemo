package com.example.hp.recycleview_demo;

import android.content.Context;
import android.provider.ContactsContract;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by hp on 25/05/2017.
 */

public class ShopAdapter extends RecyclerView.Adapter<ShopAdapter.ViewHolder>{

    List<DataShop> dataShops;
    Context context;

    public ShopAdapter(List<DataShop> dataShops, Context context) {
        this.dataShops = dataShops;
        this.context = context;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View view = layoutInflater.inflate(R.layout.item_row, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(ViewHolder holder, int position) {
        holder.imgHinhAnh.setImageResource(dataShops.get(position).getHinhAnh());
        holder.txtTen.setText(dataShops.get(position).getTen());
    }

    @Override
    public int getItemCount() {
        return dataShops.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder{

        TextView txtTen;
        ImageView imgHinhAnh;
        public ViewHolder(View itemView) {
            super(itemView);

            txtTen = (TextView) itemView.findViewById(R.id.txtName);
            imgHinhAnh = (ImageView) itemView.findViewById(R.id.imgHinh);
        }
    }
}
