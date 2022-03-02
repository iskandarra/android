package com.example.android;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        EditText beratt = findViewById(R.id.beratt);
        EditText tiggi = findViewById(R.id.tinggi);
        Button btn_hitung = findViewById(R.id.btn_hitung);
        TextView hasil = findViewById(R.id.hasil);
        btn_hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Float nama = Float.parseFloat(beratt.getText().toString()) ;
                Float tggi =Float.parseFloat(tiggi.getText().toString());
                Float HASIL  = nama / ((tggi*tggi));


                if(HASIL >= 30){
                    hasil.setText("kegemukan (Obesitas)");
                }else if(HASIL >= 25 &&HASIL <=29.9){
                    hasil.setText("Kelebihan Berat Badan");
                }else if(HASIL >= 18.5 && HASIL <=22.9){
                    hasil.setText("normal (ideal)");
                }else if(HASIL < 18.5) {
                    hasil.setText("kekurangan berat badan");
                }
            }
        });

    }
}