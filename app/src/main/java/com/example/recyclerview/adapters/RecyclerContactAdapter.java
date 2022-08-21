package com.example.recyclerview.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.recyclerview.models.ContactModel;
import com.example.recyclerview.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.Viewholder> {
    Context context;
    ArrayList<ContactModel> arrContacts;

    public RecyclerContactAdapter(Context context, ArrayList<ContactModel> arrContacts) {
        this.context = context;
        this.arrContacts = arrContacts;

    }

    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.contact_row, parent, false);
        Viewholder viewholder = new Viewholder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
        //Fixme: crash expected if the image id is empty or null
        // Todo: add check for null or empty image id
        holder.imageContact.setImageResource(arrContacts.get(position).getImage());
        holder.textName.setText(arrContacts.get(position).getName());
        holder.textNumber.setText(arrContacts.get(position).getNumber());
    }

    @Override
    public int getItemCount() {
        return arrContacts.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder {
        TextView textName, textNumber;
        ImageView imageContact;

        public Viewholder(View itemView) {
            super(itemView);

            textName = itemView.findViewById(R.id.textName);
            textNumber = itemView.findViewById(R.id.textNumber);
            imageContact = itemView.findViewById(R.id.imageContact);

        }


    }
}
