package com.journaldev.recyclerviewmultipleviewtype;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class ImageTypeViewHolder extends MyViewHolder {

    private TextView txtType;
    private ImageView image;

    public ImageTypeViewHolder(View itemView) {
        super(itemView);

        this.txtType = (TextView) itemView.findViewById(R.id.type);
        this.image = (ImageView) itemView.findViewById(R.id.background);
    }

    @Override
    void bind(Model object, final OnLickListeners onLickListeners) {
        txtType.setText(object.text + "Huynh Ngoc Chau");
        txtType.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                onLickListeners.onListener();
            }
        });
        image.setImageResource(object.data);
    }

}
