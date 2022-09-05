package haqnawaz.org.navigationdrawer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class BookActivity extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_book);
        DbHelper db= new DbHelper(BookActivity.this);
        recyclerView = findViewById(R.id.recyclerView);
        ArrayList<SurahDetails> surahNames =  db.getSurahDetails();
        layoutManager = new LinearLayoutManager(BookActivity.this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new SurahNameAdapter(surahNames, this);
        recyclerView.setAdapter(adapter);
    }
}