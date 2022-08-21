package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.example.recyclerview.adapters.RecyclerContactAdapter;
import com.example.recyclerview.models.ContactModel;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ContactModel> arrContacts= new ArrayList<>();
    RecyclerContactAdapter adapter;
    RecyclerView recyclerView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // add contacts to contacts array list
        prepareContacts();

        recyclerView = findViewById(R.id.recyclerContact);
        View buttonOpenDialog = findViewById(R.id.btnOpenDialog);


        buttonOpenDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                addNewContact();
            }
        });


        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        adapter = new RecyclerContactAdapter(this, arrContacts);
        recyclerView.setAdapter(adapter);

    }

    private void prepareContacts()
    {
        arrContacts.add(new ContactModel(R.drawable.a, "Ali","03465629858"));
        arrContacts.add(new ContactModel(R.drawable.b, "Zohaib","03465629858"));
        arrContacts.add(new ContactModel(R.drawable.c, "Ali","03465629858"));
        arrContacts.add(new ContactModel(R.drawable.d, "Zohaib","03465629858"));
        arrContacts.add(new ContactModel(R.drawable.f, "Ali","03465629858"));
        arrContacts.add(new ContactModel(R.drawable.g, "Zohaib","03465629858"));
        arrContacts.add(new ContactModel(R.drawable.h, "Ali","03465629858"));
        arrContacts.add(new ContactModel(R.drawable.i, "Zohaib","03465629858"));
        arrContacts.add(new ContactModel(R.drawable.j, "Ali","03465629858"));
        arrContacts.add(new ContactModel(R.drawable.k, "Zohaib","03465629858"));
        arrContacts.add(new ContactModel(R.drawable.l, "Ali","03465629858"));
        arrContacts.add(new ContactModel(R.drawable.m, "Zohaib","03465629858"));
        arrContacts.add(new ContactModel(R.drawable.n, "Zohaib","03465629858"));
    }

    private void addNewContact()
    {
        Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.add_update_layout);

        EditText editName = dialog.findViewById(R.id.editName);
        EditText editNumber = dialog.findViewById(R.id.editNumber);
        Button btnAction = dialog.findViewById(R.id.btnAddAction);

        btnAction.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String name = "", number = "";

                if (!editName.getText().toString().equals("")) {
                    name = editName.getText().toString();
                } else {
                    Toast.makeText(MainActivity.this, "Please enter Contact name!", Toast.LENGTH_SHORT).show();
                }
                if (!editNumber.getText().toString().equals("")) {
                    number = editNumber.getText().toString();
                } else {
                    Toast.makeText(MainActivity.this, "Please enter Contact number!", Toast.LENGTH_SHORT).show();
                }
                arrContacts.add(new ContactModel(name, number));

                adapter.notifyItemInserted(arrContacts.size() - 1);
                recyclerView.scrollToPosition(arrContacts.size() - 1);

                dialog.dismiss();
            }
        });
        dialog.show();
    }
}