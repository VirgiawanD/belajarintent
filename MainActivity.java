package com.example.belajarintent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

        public void panggil(View view){
            String nomor = "081572213601";
            Intent panggil = new Intent(Intent.ACTION_DIAL);
            panggil.setData(Uri.fromParts("tel", nomor, null));
            startActivity(panggil);
        }

        public void buka(View view){
            String url = "https:komiku.co.id";
            Intent bukaBrowser = new Intent(Intent.ACTION_VIEW);
            bukaBrowser.setData(Uri.parse(url));
            startActivity(bukaBrowser);
        }

        public void tentang(View view){
            Intent tentang = new Intent(MainActivity.this,TentangActivity.class);
            startActivity(tentang);
        }
}
