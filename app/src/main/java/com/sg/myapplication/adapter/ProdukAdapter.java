package com.sg.myapplication.adapter;

import android.support.v7.widget.RecyclerView;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.sg.myapplication.ProdukModel;
import com.sg.myapplication.R;

/**
 * Created by Ratri on 5/26/2018.
 */

public class ProdukAdapter extends  ListAdapter<ProdukModel, ProdukAdapter.ProdukHolder>{

    /**
     * Created by Ratri on 5/26/2018.
     */

    public ProdukAdapter(){
    }

    @Override
    public ProdukHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        System.out.println("on create holder");
        return new ProdukHolder(parent);
    }

    @Override
    public void onBindViewHolder(ProdukHolder holder, final int position) {
        System.out.println("on bind holder");
        ProdukModel model = get(position);
        holder.tvNama.setText(model.getNama());
        Log.d("produk", model.getNama());
    }

    public class ProdukHolder extends  RecyclerView.ViewHolder {
       public TextView tvNama;
        public ProdukHolder(View itemView) {
            super(itemView);
            tvNama = (TextView) itemView.findViewById(R.id.tv_nama_produk);
        }

        public ProdukHolder (ViewGroup parrent) {
            this(LayoutInflater.from(parrent.getContext()).inflate(R.layout.item_produk, parrent, false));
        }
    }
}

