package com.example.salahudin.recyclerviewcardview;

import android.support.v7.widget.RecyclerView;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

/**
 * Created by SALAHUDIN on 26/05/2018.
 */
public class RecyclerAdapter extends RecyclerView.Adapter<RecyclerViewHolder> {


    //deklarasi variabel context
    private final Context context;

    //menampilkan list item dalam bentuk text dengan tipe data string dengan variabel name
    String [] name = {"Apple","Facebook","Twitter","Google","Microsoft","Wikipedia","yahoo","Youtube"};

    LayoutInflater inflater;
    public RecyclerAdapter(Context context){
        this.context=context;
        inflater=LayoutInflater.from(context);
    }

    @Override
    public RecyclerViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View v = inflater.inflate(R.layout.item_list, parent, false);

        RecyclerViewHolder viewHolder=new RecyclerViewHolder(v);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(RecyclerViewHolder holder,int position){
        holder.tv1.setText(name[position]);
        holder.tv1.setOnClickListener(clickListener);
        holder.imageView.setOnClickListener(clickListener);
        holder.tv1.setTag(holder);
        holder.imageView.setTag(holder);
    }

    View.OnClickListener clickListener=new View.OnClickListener(){

        //memberi aksi pada saat  cardview diclick berdasarkan posisi tertentu
        @Override
        public void onClick(View v){
            RecyclerViewHolder vholder=(RecyclerViewHolder) v.getTag();

            int position = vholder.getPosition();

            Toast.makeText(context,"Menu ini berada diposisi " +position,Toast.LENGTH_LONG).show();

                /**
             * jika ingin menerapkan Intent untk mengubungkan antar Activity pada RecyclerAdapter.java
             * kalian replace codeberikut
             * Toast.makeText(context,"Menu ini berada diposisi " +position,Toast.LENGTH_LONG).show();
             * menjadi
             * if (position == 0 && position < getItemCount()){
             * Intent intent = new Intent(context , MainActivity2.class);
             * context.startActivity(intent);
             * }
             */
        }
    };

    @Override
    public int getItemCount(){
        return name.length;
    }
}
