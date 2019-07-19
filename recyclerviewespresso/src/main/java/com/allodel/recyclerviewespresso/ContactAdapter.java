package com.allodel.recyclerviewespresso;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

class ContactAdapter extends RecyclerView.Adapter<ViewHolder> {

    List<ContactPozo> contactList;
    Context context;

    public ContactAdapter(List<ContactPozo> contactList) {
         this.contactList = contactList;

    }


    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        this.context = parent.getContext();
        View v = LayoutInflater.from(parent.getContext()).inflate(R.layout.layout_single_item_contact,parent,false);
        return new ViewHolder(v);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        final ContactPozo contactItem = contactList.get(position);

        holder.name.setText(contactItem.getName());
        holder.phone.setText(contactItem.getPhone());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(context,contactItem.getName(), Toast.LENGTH_LONG).show();
            }
        });

    }

    @Override
    public int getItemCount() {
        return contactList.size();
    }
}
