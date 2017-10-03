package com.blogbasbas.hari03.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import com.blogbasbas.hari03.R;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SpinnerActivity extends AppCompatActivity {


    String[] name = {"Pantai Olele", "Pantai Botutonuo", "Pantai Boliyohutuo", "Pulau Cinta",
            "Benteng Otanaha", "Air Terjun Taludaa", "Pulau Bugisa", "Pulau Saronde "};
    int thumb[] = {R.drawable.olele, R.drawable.botutonuo, R.drawable.boliyohutuo, R.drawable.pulau_cinta,
            R.drawable.otanaha, R.drawable.airterjun_taludaa, R.drawable.bugisa, R.drawable.pulau_saronde};
    @BindView(R.id.spinnerLokasi)
    Spinner spinnerLokasi;
    @BindView(R.id.imgLokasi)
    ImageView imgLokasi;
    @BindView(R.id.txtLokasi)
    TextView txtLokasi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spinner);
        ButterKnife.bind(this);

        ArrayAdapter adapter = new ArrayAdapter(SpinnerActivity.this,android.R.layout.simple_spinner_item,name);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinnerLokasi.setAdapter(adapter);
        //set method ketika buah dipilih akan ditampilkan gambar sesuai nama

        spinnerLokasi.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                //ambil array nama buah
                txtLokasi.setText(name[i]);
                //ambil gambar
                imgLokasi.setImageResource(thumb[i]);

            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });
    }
}
