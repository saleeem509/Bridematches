package com.vvvinfotech.saleem.bridematches;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.List;

public class BridesAdapter extends RecyclerView.Adapter<BridesAdapter.BridesViewholder > {

    private Context mCtx;
    private List<Bride> bridesList;

    public BridesAdapter(Context mCtx, List<Bride> bridesList) {
        this.mCtx = mCtx;
        this.bridesList = bridesList;
    }

    @NonNull
    @Override
    public BridesViewholder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        LayoutInflater inflater=LayoutInflater.from(mCtx);
        View view=inflater.inflate(R.layout.activity_cardview,null);
        return new BridesViewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BridesViewholder bridesViewholder, int i) {

        Bride bride=bridesList.get(i);
        bridesViewholder.textViewtitle.setText(bride.getTitle());
        bridesViewholder.textViewage.setText(bride.getAge());
        bridesViewholder.textViewcaste.setText(bride.getCaste());
        bridesViewholder.textViewlocation.setText(bride.getLocation());
        bridesViewholder.imageView.setImageDrawable(mCtx.getResources().getDrawable(bride.getImage()));


    }

    @Override
    public int getItemCount() {
        return bridesList.size();
    }

    class BridesViewholder extends RecyclerView.ViewHolder {

        ImageView imageView;
        TextView textViewtitle,textViewage,textViewcaste,textViewlocation;
        public BridesViewholder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.brides);
            textViewtitle=itemView.findViewById(R.id.showTitle);
            textViewage=itemView.findViewById(R.id.age);
            textViewcaste=itemView.findViewById(R.id.caste);
            textViewlocation=itemView.findViewById(R.id.location);
        }
    }
}
