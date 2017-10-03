package com.blogbasbas.hari03.adapater;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.blogbasbas.hari03.R;

/**
 * Created by Server on 03/10/2017.
 */

public class AdapterListview extends BaseAdapter {
    Context context;
    String []namaWisata;
    int[]gambarWisata;

    public AdapterListview (Context context, String[] namaWisata, int[] gambarWisata) {
        this.context = context;
        this.namaWisata = namaWisata;
        this.gambarWisata = gambarWisata;
    }

    @Override
    public int getCount() {
        return gambarWisata.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int posisi, View view, ViewGroup viewGroup) {
        LayoutInflater inflater= (LayoutInflater)context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        view = inflater.inflate(R.layout.tampilancustomlist , null);
        ImageView imageView = (ImageView)view.findViewById(R.id.imgWisata);
        TextView textView= (TextView)view.findViewById(R.id.txtnamaWisata);

        textView.setText(namaWisata[posisi]);
        imageView.setImageResource(gambarWisata[posisi]);

        return view;
    }
}
