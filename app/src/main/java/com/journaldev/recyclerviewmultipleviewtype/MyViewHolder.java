package com.journaldev.recyclerviewmultipleviewtype;

import android.support.v7.widget.RecyclerView;
import android.view.View;

public abstract class MyViewHolder extends RecyclerView.ViewHolder {
    public MyViewHolder(View itemView) {
        super(itemView);
    }
    abstract void bind(Model model, OnLickListeners onLickListeners);
}
