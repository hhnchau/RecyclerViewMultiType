package com.journaldev.recyclerviewmultipleviewtype;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.TextView;

public class TextTypeViewHolder extends RecyclerView.ViewHolder {
    TextView txtType;
    CardView cardView;
    public TextTypeViewHolder(View itemView) {
        super(itemView);
        this.txtType = (TextView) itemView.findViewById(R.id.type);
        this.cardView = (CardView) itemView.findViewById(R.id.card_view);
    }
}
