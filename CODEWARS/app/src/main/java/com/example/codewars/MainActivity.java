package com.example.codewars;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    //deklarasikan
    EditText editVisit, editNim, editNama;
    String key_name = "My Name : ";
    String key_nim = "My Nim : ";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //simpan nilai id tertentu pada variabel tertentu
        editVisit = findViewById(R.id.edit_visit);
        editNama = findViewById(R.id.edit_nama);
        editNim = findViewById(R.id.edit_nim);

    }

    //intent explicit
    public void action_save(View view) {
        String nim = editNim.getText().toString();
        String nama = editNama.getText().toString();
        Intent intent = new Intent(this, SecondActivity.class);
        intent.putExtra(key_name,nama);
        intent.putExtra(key_nim,nim);
        startActivity(intent);
    }
    
    //intent implicit
    public void action_visit(View view) {
        String myUrl = editVisit.getText().toString();
        Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(myUrl));
        startActivity(intent);
    }
}