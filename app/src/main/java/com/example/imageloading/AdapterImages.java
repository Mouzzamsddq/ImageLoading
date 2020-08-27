package com.example.imageloading;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.squareup.picasso.Picasso;

import java.util.List;

public class AdapterImages extends RecyclerView.Adapter<AdapterImages.MyHolder>  {

    List<String> imageUriList;
    Context context;

    public AdapterImages(List<String> imageUriList, Context context) {
        this.imageUriList = imageUriList;
        this.context = context;
    }

    @NonNull
    @Override
    public MyHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.list_item,parent,false);
        return new MyHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull MyHolder holder, int position) {

        Picasso.get().load(imageUriList.get(position%imageUriList.size())).into(holder.imageView);



    }

    @Override
    public int getItemCount() {
        return imageUriList == null ? 0 : imageUriList.size()*100000000;
    }


    class  MyHolder extends RecyclerView.ViewHolder
    {
        ImageView imageView;


        public MyHolder(@NonNull View itemView) {
            super(itemView);

            imageView =itemView.findViewById(R.id.imageView);
        }
    }
}
