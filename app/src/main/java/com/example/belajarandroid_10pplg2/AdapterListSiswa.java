package com.example.belajarandroid_10pplg2;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class AdapterListSiswa extends RecyclerView.Adapter<AdapterListSiswa.ViewHolder> {

    private List<SiswaModel> listSiswa;
    private OnItemClickListener listener;

    public interface OnItemClickListener {
        void onClick(SiswaModel siswa);
    }

    // constructor
    public AdapterListSiswa(List<SiswaModel> listSiswa, OnItemClickListener listener) {
        this.listSiswa = listSiswa;
        this.listener = listener;
    }


    // ViewHolder
    public static class ViewHolder extends RecyclerView.ViewHolder {
        TextView tvNama;
        TextView tvAbsen;
        TextView tvAlamat;
        ImageView imageUser;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNama = itemView.findViewById(R.id.tvNamaSiswa);
            tvAbsen = itemView.findViewById(R.id.tvAbsenSiswa);
            tvAlamat = itemView.findViewById(R.id.tvAlamatSiswa);
            imageUser = itemView.findViewById(R.id.imgSiswa);
        }
    }

    @NonNull
    @Override
    public AdapterListSiswa.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_siswa_layout, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterListSiswa.ViewHolder holder, int position) {
        String nama = listSiswa.get(position).getNama();
        holder.tvNama.setText(nama);
        String absen = listSiswa.get(position).getAbsen();
        holder.tvAbsen.setText(absen);
        String alamat = listSiswa.get(position).getAlamat();
        holder.tvAlamat.setText(alamat);
        int imageUser = listSiswa.get(position).getImageUser();
        holder.imageUser.setImageResource(imageUser);
        holder.itemView.setOnClickListener(v -> {
            listener.onClick(listSiswa.get(position));
        });
    }

    @Override
    public int getItemCount() {
        return listSiswa.size();
    }



}
