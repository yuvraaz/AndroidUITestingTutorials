package com.allodel.recyclerviewespresso;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;

public class ViewHolder extends RecyclerView.ViewHolder {

     TextView name;
     TextView phone;

    public ViewHolder(View v) {
        super(v);

        name = v.findViewById(R.id.tv_name);
        phone =v.findViewById(R.id.tv_phone);

    }
}
