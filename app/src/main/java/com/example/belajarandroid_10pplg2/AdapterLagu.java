package com.example.belajarandroid_10pplg2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterLagu extends RecyclerView.Adapter<AdapterLagu.ViewHolder> {

    private List<LaguModel> listLagu;
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onClick(LaguModel lagu);
    }

    // constructor
    public AdapterLagu(List<LaguModel> listLagu, OnItemClickListener listener) {
        this.listLagu = listLagu;
        this.listener = listener;
    }

    // ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvJudul;
        TextView tvPenyanyi;
        TextView tvDurasi;
        ImageView imgLagu;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvJudul = itemView.findViewById(R.id.tvJudulLagu);
            tvPenyanyi = itemView.findViewById(R.id.tvNamaPenyanyi);
            tvDurasi = itemView.findViewById(R.id.tvDurasiLagu);
            imgLagu = itemView.findViewById(R.id.ImageLagu);
        }
    }

    @NonNull
    @Override
    public AdapterLagu.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_lagu, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterLagu.ViewHolder holder, int position) {
        LaguModel lagu = listLagu.get(position);

        holder.tvJudul.setText(lagu.getJudulLagu());
        holder.tvPenyanyi.setText(lagu.getNamaPenyanyi());
        holder.imgLagu.setImageResource(lagu.getImageLagu());
        holder.tvDurasi.setText(lagu.getDurasiLagu());

        holder.itemView.setOnClickListener(v -> {
            listener.onClick(lagu);
        });
    }

    @Override
    public int getItemCount() {
        return listLagu.size();
    }
}