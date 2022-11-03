package com.example.kuis_20018099;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;

public class Biodata extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_biodata);

        final EditText nama = (EditText)findViewById(R.id.input_nama);
        final EditText nohp = (EditText)findViewById(R.id.input_nohp);
        final EditText alamat = (EditText)findViewById(R.id.input_alamat);
        final TextView nama_t = (TextView)findViewById(R.id.output_nama);
        final TextView nohp_t = (TextView)findViewById(R.id.output_nohp);
        final TextView alamat_t = (TextView)findViewById(R.id.output_alamat);
        final Button tampil = (Button)findViewById(R.id.btn_tampil);

        UserData usr = new ViewModelProvider(this).get(UserData.class);
        nama_t.setText(usr.getNama());
        nohp_t.setText(usr.getNo_hp());
        alamat_t.setText(usr.getAlamat());

        tampil.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                usr.setNama(nama.getText().toString());
                usr.setNo_hp(nohp.getText().toString());
                usr.setAlamat(alamat.getText().toString());
                nama_t.setText(usr.getNama());
                nohp_t.setText(usr.getNo_hp());
                alamat_t.setText(usr.getAlamat());
            }
        });

    }


}