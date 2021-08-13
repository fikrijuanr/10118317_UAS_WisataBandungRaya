package com.e.a10118317_uas_wisatabandungraya;
// Kamis, 12 Agustus 2021, 10118317, Muhammad Fikri Juan R, IF8
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class TambahActivity extends AppCompatActivity {
    EditText edNama, edDeskripsi;
    Button btn_simpan;
    DatabaseReference database = FirebaseDatabase.getInstance().getReference();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tambah);

        edNama = findViewById(R.id.edNama);
        edDeskripsi = findViewById(R.id.edDeskripsi);
        btn_simpan = findViewById(R.id.btn_simpan);
        btn_simpan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String getNama = edNama.getText().toString();
                String getDeskripsi = edDeskripsi.getText().toString();

                if (getNama.isEmpty()){
                    edNama.setError("Nama tempat wisata harus di isi !");
                }else if (getDeskripsi.isEmpty()){
                    edDeskripsi.setError("Deskripsi tempat wisata harus di isi!");
                }else{
                    database.child("Wisata").push().setValue(new ModelWisata(getNama, getDeskripsi)).addOnSuccessListener(new OnSuccessListener<Void>() {
                        @Override
                        public void onSuccess(Void unused) {
                            Toast.makeText(TambahActivity.this, "Data berhasil di simpan !", Toast.LENGTH_SHORT).show();
                            startActivity(new Intent(TambahActivity.this, MainActivity.class));
                            finish();
                        }
                    }).addOnFailureListener(new OnFailureListener() {
                        @Override
                        public void onFailure(@NonNull Exception e) {
                            Toast.makeText(TambahActivity.this, "Gagal menyimpan data !", Toast.LENGTH_SHORT).show();

                        }
                    });
                }
            }
        });

    }
}