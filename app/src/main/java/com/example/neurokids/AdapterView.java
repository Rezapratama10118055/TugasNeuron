package com.example.neurokids;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;

import java.util.ArrayList;

public class AdapterView extends RecyclerView.Adapter<AdapterView.ViewHolder> {
    private static final String TAG = "AdapterView";
    private ArrayList<model> dataItem;
    private Context mContext;


    AdapterView(ArrayList<model> dataItem, Context context){
        this.dataItem = dataItem;
        mContext = context;

    }




    @NonNull
    @Override
    public AdapterView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_card,parent,false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterView.ViewHolder holder, int position) {
        holder.judul.setText(dataItem.get(position).getJudul());
        holder.images.setImageResource(dataItem.get(position).getImage());
        holder.penjelasan.setText(dataItem.get(position).getPenjelasan());


        holder.linearLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                Toast.makeText(mContext, dataItem.get(position).getJudul(), Toast.LENGTH_SHORT).show();

                Intent intent = new Intent(mContext, PenjelasanDetail.class);
                intent.putExtra("penjelasanLengkap", dataItem.get(position).getPenjelasanLengkap());
                intent.putExtra("image_name", dataItem.get(position).getJudul());
                intent.putExtra("image_url",dataItem.get(position).getImage());

                mContext.startActivity(intent);

            }
        });



        Glide.with(mContext)
                .asBitmap()
                .override(1200, 800)
                .centerCrop()
                .load(dataItem.get(position).getImage())
                .into(holder.images);
    }

    @Override
    public int getItemCount() {
        return dataItem.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder{
        private TextView judul,penjelasan;
        private ImageView images;
        private Button detail;
        private LinearLayout linearLayout;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            judul = itemView.findViewById(R.id.judul);
            images = itemView.findViewById(R.id.Pantai);
            detail = itemView.findViewById(R.id.detail);
            linearLayout = itemView.findViewById(R.id.linearoyy);
            penjelasan = itemView.findViewById(R.id.txtpenjelasan);




        }
    }


}
