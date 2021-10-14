package com.example.codewars;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    TextView hasilNim, hasilNama;
    String key_name = "My Name : ";
    String key_nim = "My Nim : ";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        hasilNama = findViewById(R.id.hasil_nama);
        hasilNim = findViewById(R.id.hasil_nim);
        //dapatkan data dari inputan inten main activity
        Bundle extra = getIntent().getExtras();
       //menyimpan data yang di dapat dalam variabel tertentu
        String nim = extra.getString(key_nim);
        String nama = extra.getString(key_name);

        hasilNim.setText(" NIM : " + nim);
        hasilNama.setText(" Nama : " + nama);
    }
}