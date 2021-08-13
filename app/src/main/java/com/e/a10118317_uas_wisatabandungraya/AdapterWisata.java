package com.e.a10118317_uas_wisatabandungraya;
// Rabu, 11 Agustus 2021, 10118317, Muhammad Fikri Juan R, IF8
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.recyclerview.widget.RecyclerView;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

import java.util.List;

public class AdapterWisata extends RecyclerView.Adapter<AdapterWisata.MyViewholder> {
    private List<ModelWisata> mList;
    private Activity activity;
    private Button update;
    DatabaseReference database = FirebaseDatabase.getInstance().getReference();



    public AdapterWisata(List<ModelWisata>mList, Activity activity){
        this.mList = mList;
        this.activity = activity;
    }

    @NonNull
    @Override
    public MyViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View viewItem = inflater.inflate(R.layout.layout_item, parent, false);
        return new MyViewholder(viewItem);
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewholder holder, int position) {
        final  ModelWisata data = mList.get(position);
        holder.tv_nama.setText("Nama Wisata : " + data.getNama());
        holder.tv_deskripsi.setText("Deskripsi Wisata : " + data.getDeskripsi());

    }


    @Override
    public int getItemCount() {
        return mList.size();
    }

    public class MyViewholder extends RecyclerView.ViewHolder {
        TextView tv_nama, tv_deskripsi;
        CardView card_hasil;
        ImageView ImageView;
        public MyViewholder(@NonNull View itemView) {
            super(itemView);
            tv_nama = itemView.findViewById(R.id.tv_Nama);
            tv_deskripsi = itemView.findViewById(R.id.tv_deskripsi);
            card_hasil = itemView.findViewById(R.id.card_hasil);
            ImageView = itemView.findViewById(R.id.iv_info);
        }
    }
}
