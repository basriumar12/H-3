package com.blogbasbas.hari03.activity;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.blogbasbas.hari03.R;
import com.blogbasbas.hari03.adapater.AdapterListview;

public class ListviewActivity extends AppCompatActivity {

    String[] name = {"Pantai Olele", "Pantai Botutonuo", "Pantai Boliyohutuo", "Pulau Cinta",
            "Benteng Otanaha", "Air Terjun Taludaa", "Pulau Bugisa", "Pulau Saronde "};
    int thumb[] = {R.drawable.olele, R.drawable.botutonuo, R.drawable.boliyohutuo, R.drawable.pulau_cinta,
            R.drawable.otanaha, R.drawable.airterjun_taludaa, R.drawable.bugisa, R.drawable.pulau_saronde};

    ListView listWisata;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_listview);

        listWisata = (ListView) findViewById(R.id.listWisata);
        AdapterListview adapterList = new AdapterListview(this,name, thumb);
        listWisata.setAdapter(adapterList);
    }
}
