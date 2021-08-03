package com.example.cardview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.List;

public class AppAdapter extends
        RecyclerView.Adapter<AppAdapter.MyViewHolder> {
    public AppAdapter(Context context, List<AppModel> appList) {
        this.context = context;
        this.appList = appList;
    }

    private Context context;
    private List<AppModel> appList;


    public class MyViewHolder extends RecyclerView.ViewHolder{
        public TextView title,appDownload;
        public ImageView thumbnail;

        public MyViewHolder(@NonNull View itemView) {
            super(itemView);
            title=itemView.findViewById(R.id.title);
            appDownload=itemView.findViewById(R.id.count);
            thumbnail=itemView.findViewById(R.id.thumbnail);
        }

        public MyViewHolder(@NonNull View itemView, TextView title, TextView appDownload, ImageView thumbnail) {
            super(itemView);
            this.title = title;
            this.appDownload = appDownload;
            this.thumbnail = thumbnail;
        }


    }


    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
          View itemView= LayoutInflater.from(parent.getContext())
                  .inflate(R.layout.card_app,parent,false);
        return new MyViewHolder(itemView);

    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

       final AppModel appModel=appList.get(position);
        holder.title.setText(appModel.getName());
        holder.appDownload.setText((appModel.getNumOfDownloads()+" Users"));


        Glide.with(context)
                .load(appModel.getThumbnails())
                .into(holder.thumbnail);

holder.itemView.setOnClickListener(new View.OnClickListener() {
    @Override
    public void onClick(View v) {
        Toast.makeText(context,"You clicked :"+appModel.getName(),Toast.LENGTH_SHORT).show();
    }
});

    }

    @Override
    public int getItemCount() {
        return appList.size();
    }




}
