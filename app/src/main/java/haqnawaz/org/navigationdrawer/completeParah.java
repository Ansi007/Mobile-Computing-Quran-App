package haqnawaz.org.navigationdrawer;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class completeParah extends AppCompatActivity {
    RecyclerView recyclerView;
    RecyclerView.Adapter adapter;
    RecyclerView.LayoutManager layoutManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_parah);
        recyclerView = findViewById(R.id.completeParahRecyclerList);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(completeParah.this);
        recyclerView.setLayoutManager(layoutManager);
        Intent intent = getIntent();
        DbHelper db = new DbHelper(this);
        int id = (intent.getIntExtra("ParahId", 0));
        ArrayList<tayah> ay = db.SearchByParaNo(Integer.toString(id));
        adapter = new RecyclerAdapter(ay);
        recyclerView.setAdapter(adapter);
    }
}