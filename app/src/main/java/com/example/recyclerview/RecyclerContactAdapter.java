package com.example.recyclerview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class RecyclerContactAdapter extends RecyclerView.Adapter<RecyclerContactAdapter.Viewholder>{
    Context context;
    ArrayList<ContactModel> arrContacts;

    RecyclerContactAdapter(Context context, ArrayList<ContactModel> arrContacts){
        this.context = context;
        this.arrContacts = arrContacts;

    }
    @NonNull
    @Override
    public Viewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(context).inflate(R.layout.contact_row, parent, false);
        Viewholder viewholder = new Viewholder(view);
        return viewholder;
    }

    @Override
    public void onBindViewHolder(@NonNull Viewholder holder, int position) {
    holder.imageContact.setImageResource(arrContacts.get(position).image);
    holder.textName.setText(arrContacts.get(position).name);
    holder.textNumber.setText(arrContacts.get(position).number);
    }

    @Override
    public int getItemCount() {
        return arrContacts.size();
    }

    public class Viewholder extends RecyclerView.ViewHolder{
        TextView textName, textNumber;
        ImageView imageContact;
        public Viewholder(View itemView){
            super(itemView);

            textName = itemView.findViewById(R.id.textName);
            textNumber=itemView.findViewById(R.id.textNumber);
            imageContact=itemView.findViewById(R.id.imageContact);

        }


    }
}
