package ru.job4j.daggerexample;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.List;

import javax.inject.Inject;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {

    private RecyclerView recycler;
    public StringAdapter adapter;
    private List<String> strings;


    @Inject
    Store store;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        App.getStore().injectTo(this);
        setContentView(R.layout.activity_main);
        strings = store.getAll();
        recycler = findViewById(R.id.recycler);
        this.recycler.setLayoutManager(new LinearLayoutManager(getApplicationContext()));
        adapter = new StringAdapter(getApplicationContext(), strings);
        recycler.setAdapter(adapter);
    }

    public void alert(View view) {
        Toast.makeText(this, store.getAll().toString(), Toast.LENGTH_SHORT).show();
    }

    public void add(View view) {
        EditText edit = findViewById(R.id.note);
        store.add(edit.getText().toString());
        edit.setText("");
        adapter.notifyDataSetChanged();
    }
}