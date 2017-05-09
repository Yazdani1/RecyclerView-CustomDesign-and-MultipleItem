package com.yazdaniscodelab.recyclerviewlast;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView;

    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    String[] T_title,D_description,A_author,P_price;

    int[] image=new int[]{

            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.a,
            R.drawable.b,
            R.drawable.c,
            R.drawable.d,
            R.drawable.e,
            R.drawable.f,
            R.drawable.g,
            R.drawable.g,

    };

    private ArrayList<Data>arrayList=new ArrayList<Data>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView=(RecyclerView)findViewById(R.id.recycler_xml);

        T_title=getResources().getStringArray(R.array.title);
        D_description=getResources().getStringArray(R.array.description);
        A_author=getResources().getStringArray(R.array.author);
        P_price=getResources().getStringArray(R.array.price);

        int i=0;
        for (String title:T_title){

            Data data=new Data(image[i],title,D_description[i],A_author[i],P_price[i]);
            arrayList.add(data);
            i++;
        }




        adapter=new RecyclerViewAdapter(arrayList);
        recyclerView.setHasFixedSize(true);
        layoutManager=new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);
    }
}
