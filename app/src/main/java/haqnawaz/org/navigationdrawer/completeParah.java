package haqnawaz.org.navigationdrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class completeParah extends AppCompatActivity {
    ListView lv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_complete_parah);
        lv = findViewById(R.id.completeParahlist);
        Intent intent = getIntent();
        DbHelper db = new DbHelper(this);
        int id = (intent.getIntExtra("ParahId", 0));
        ArrayList<tayah> ay = db.SearchByParaNo(Integer.toString(id));
        CustomizedAdapter cA = new CustomizedAdapter(this,ay);
        lv.setAdapter(cA);
    }
}