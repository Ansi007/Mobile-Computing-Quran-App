package haqnawaz.org.navigationdrawer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.text.method.ScrollingMovementMethod;
import android.widget.ListView;
import android.widget.TextView;

import java.util.ArrayList;

public class DisplayPara extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_para);
        recyclerView = findViewById(R.id.ParaConsoleRecycler);
        Intent intent = getIntent();
        String EnglishSurahName = (intent.getStringExtra("SurahUrduName"));
        DbHelper db = new DbHelper(this);
        int id = db.getSurahIdBySurahName(EnglishSurahName);
        ArrayList<tayah> ay = db.getSurah(id);
        layoutManager = new LinearLayoutManager(DisplayPara.this);
        recyclerView.setLayoutManager(layoutManager);
        adapter = new RecyclerAdapter(ay);
        recyclerView.setAdapter(adapter);
    }
}