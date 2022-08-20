package com.example.recyclerview;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ArrayList<ContactModel> arrContacts= new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView recyclerView = findViewById(R.id.recyclerContact);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

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

        RecyclerContactAdapter adapter = new RecyclerContactAdapter(this, arrContacts);
        recyclerView.setAdapter(adapter);

    }
}