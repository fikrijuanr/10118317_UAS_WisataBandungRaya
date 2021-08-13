package com.e.a10118317_uas_wisatabandungraya;
// Rabu, 11 Agustus 2021, 10118317, Muhammad Fikri Juan R, IF8
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DefaultItemAnimator;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    FloatingActionButton tambah, maps, profile;
   // private Button update, hapus;
    AdapterWisata adapterWisata;
    DatabaseReference database = FirebaseDatabase.getInstance().getReference();
    ArrayList<ModelWisata> listWisata;
    RecyclerView tv_tampil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tambah = findViewById(R.id.btn_tambah);
        tambah.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, TambahActivity.class));
            }
        });
        maps = findViewById(R.id.btn_maps);
        maps.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, MapsActivity.class));
            }
        });
        profile = findViewById(R.id.btn_profile);
        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ProfileActivity.class));
            }
        });

        tv_tampil = findViewById(R.id.tv_tampil);
        RecyclerView.LayoutManager mLayout = new LinearLayoutManager(this);
        tv_tampil.setLayoutManager(mLayout);
        tv_tampil.setItemAnimator(new DefaultItemAnimator());
        
        
        tampilData();
    }

    private void tampilData() {
        database.child("Wisata").addValueEventListener(new ValueEventListener() {
            @Override
            public void onDataChange(@NonNull DataSnapshot snapshot) {
                listWisata = new ArrayList<>();
                for (DataSnapshot item : snapshot.getChildren()) {
                    ModelWisata wst = item.getValue(ModelWisata.class);
                    wst.setKey(item.getKey());
                    listWisata.add(wst);
                }
                adapterWisata = new AdapterWisata(listWisata, MainActivity.this);
                tv_tampil.setAdapter(adapterWisata);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError error) {

            }
        });
    }
}