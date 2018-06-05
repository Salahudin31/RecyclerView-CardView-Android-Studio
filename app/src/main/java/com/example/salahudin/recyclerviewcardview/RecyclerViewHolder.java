package com.example.salahudin.recyclerviewcardview;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by SALAHUDIN on 26/05/2018.
 */
public class RecyclerViewHolder extends RecyclerView.ViewHolder {
    //viewholder akan mendeskripsisanitem view yang ditempatkan didalam recycler view

    TextView tv1,tv2;//Deklarasi textView
    ImageView imageView;//Deklarasi imageView

    public RecyclerViewHolder(View itemView){
        super(itemView);

        //menampilkan text dari widget cardView pada id daftar-judul
        tv1= (TextView) itemView.findViewById(R.id.daftar_judul);
        //menampilkan text dari widget cardView pada id daftar-desk
        tv2= (TextView) itemView.findViewById(R.id.daftar_des);
        //menampilkan gambar/icon dari widget cardView pada id daftar-icon
        imageView= (ImageView)itemView.findViewById(R.id.daftar_icon);
    }
}
