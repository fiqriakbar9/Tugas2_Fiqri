package com.example.tugas2_fiqri;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
/**
 * Tanggal Pengerjaan : 28 April 2021
 * Nim : 10118020
 * Nama : Fiqri Akbar Pratama
 * Kelas : IF-1 / S1 / VI
 *
 * **/

public class Register extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }

    public void PindahToAlmost(View view) {
        Intent intent1 = new Intent(Register.this, Almost.class);
        startActivity(intent1);
    }
}