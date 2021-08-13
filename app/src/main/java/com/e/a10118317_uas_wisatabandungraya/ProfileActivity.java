package com.e.a10118317_uas_wisatabandungraya;
// Jumat, 13 Agustus 2021, 10118317, Muhammad Fikri Juan R, IF8
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class ProfileActivity extends AppCompatActivity {
    Button github, youtube, instagram;
    ImageView fotoprofile;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        github = findViewById(R.id.btn_github);
        github.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent igit= new Intent();
                igit.setAction(Intent.ACTION_VIEW);
                igit.addCategory(Intent.CATEGORY_BROWSABLE);
                igit.setData(Uri.parse("https://github.com/fikrijuanr"));
                startActivity(igit);
            }
        });
        youtube = findViewById(R.id.btn_youtube);
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iyt= new Intent();
                iyt.setAction(Intent.ACTION_VIEW);
                iyt.addCategory(Intent.CATEGORY_BROWSABLE);
                iyt.setData(Uri.parse("https://www.youtube.com/channel/UCrOWFONsxPuEA70om0v1BmA"));
                startActivity(iyt);
            }
        });
        instagram = findViewById(R.id.btn_instagram);
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent iig= new Intent();
                iig.setAction(Intent.ACTION_VIEW);
                iig.addCategory(Intent.CATEGORY_BROWSABLE);
                iig.setData(Uri.parse("https://www.instagram.com/fikryjuan_/"));
                startActivity(iig);
            }
        });

    }
}