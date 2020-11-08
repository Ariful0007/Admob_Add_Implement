package com.example.admob_add_implement;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;

public class MainActivity extends AppCompatActivity {
    Button click;
    AdView adView1,adView2;
    InterstitialAd  ad;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        click=findViewById(R.id.click);
        adView1=findViewById(R.id.ads);
        adView2=findViewById(R.id.ads2);
        MobileAds.initialize(this,"ca-app-pub-5660191563712882~3035468122");
        AdRequest adRequest=new AdRequest.Builder().build();
        adView1.loadAd(adRequest);
        adView2.loadAd(adRequest);
        ad=new InterstitialAd(this);
        ad.setAdUnitId("ca-app-pub-5660191563712882/9656716791");
        ad.loadAd(new AdRequest.Builder().build());
        
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ad.show();
            }
        });


    }
}