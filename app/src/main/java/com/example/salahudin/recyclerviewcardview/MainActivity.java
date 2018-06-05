package com.example.salahudin.recyclerviewcardview;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.LinearLayoutManager;

public class MainActivity extends AppCompatActivity {

    //Deklarasi variabel recyclerview
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //menampilkan recyclerView yang ada pada file layout dengan id recycler_view
        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        //membuat adapter baru untuk recycler view
        RecyclerAdapter adapter =new RecyclerAdapter(this);
        //menset nilai dari adapter
        recyclerView.setAdapter(adapter);
        //menset set ukuran
        recyclerView.setHasFixedSize(true);
        //menset layout manager dan menampilkan daftar/list
        //dalam bentuk linearlayoutmanager pada class saat ini
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
    }
}
