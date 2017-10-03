package com.blogbasbas.hari03;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.blogbasbas.hari03.activity.ListviewActivity;
import com.blogbasbas.hari03.activity.SpinnerActivity;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
  //untuk memberikan event kita bisa pakai android Onclik pada button

    }

    public void onListview(View view) {

        //buat intent menuju ke actiivty listview

        startActivity(new Intent(MainActivity.this, ListviewActivity.class));
        Toast.makeText(this, "go to listactivity", Toast.LENGTH_SHORT).show();
    }

    public void onSpinner(View view) {
        //buat intent menuju ke actiivty listview

        startActivity(new Intent(MainActivity.this, SpinnerActivity.class));
        Toast.makeText(this, "go to spinneractivity", Toast.LENGTH_SHORT).show();
    }
}
