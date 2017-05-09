package com.yazdaniscodelab.recyclerviewlast;

import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Yazdani on 5/9/2017.
 */

public class RecyclerViewAdapter extends RecyclerView.Adapter<RecyclerViewAdapter.MyRecyclerView> {

    private ArrayList<Data> arrayList=new ArrayList<Data>();

    public RecyclerViewAdapter(ArrayList<Data> arrayList){
        this.arrayList=arrayList;
    }


    @Override
    public MyRecyclerView onCreateViewHolder(ViewGroup parent, int viewType) {

        View myview= LayoutInflater.from(parent.getContext()).inflate(R.layout.item,parent,false);

        MyRecyclerView myRecyclerView=new MyRecyclerView(myview);
        return myRecyclerView;
    }

    @Override
    public void onBindViewHolder(MyRecyclerView holder, int position) {

        Data data=arrayList.get(position);

        holder.imageView.setImageResource(data.getImg_res());
        holder.title.setText(data.getTitle());
        holder.description.setText(data.getDescription());
        holder.author.setText(data.getAuthor());
        holder.price.setText(data.getPrice());

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }



    public static class MyRecyclerView extends RecyclerView.ViewHolder{

        ImageView imageView;
        TextView title;
        TextView description;
        TextView author;
        TextView price;

        public MyRecyclerView(View view){

            super(view);

            imageView=(ImageView)view.findViewById(R.id.image_xml);
            title=(TextView)view.findViewById(R.id.title_xml);
            description=(TextView)view.findViewById(R.id.description_xml);
            author=(TextView)view.findViewById(R.id.author_xml);
            price=(TextView)view.findViewById(R.id.price_xml);

        }


    }

}
