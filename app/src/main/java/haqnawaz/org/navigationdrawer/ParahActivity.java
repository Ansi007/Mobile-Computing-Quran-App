package haqnawaz.org.navigationdrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.List;

public class ParahActivity extends AppCompatActivity {
    ListView lv;

    public String[] ParahName = {"الم ",
            "سیقول ",
            "تلک الرسل ",
            "لن تنالوالبر",
            "والمحصنت",
            "لایحب اللہ ",
            "واذاسمعوا",
            "ولواننا",
            "قال الملاء",
            "واعلموا",
            "یعتذرون ",
            "ومامن دآبۃ",
            "وماابرئ",
            "ربما",
            "سبحن الذی ",
            "قال الم ",
            "اقترب للناس",
            "قد افلح",
            "وقال الذین ",
            "امن خلق",
            "اتل مااوحی",
            "ومن یقنت ",
            "ومالی ",
            "فمن اظلم ",
            "الیہ یرد",
            "حم ",
            "قال فماخطبکم ",
            "قدسمع اللہ ",
            "تبارک الذی ",
            "عم یتسآءلون ",
    };

    public int [] PSP = {
            1,
            150,
            261,
            387,
            520,
            644,
            756,
            905,
            1048,
            1208,
            1336,
            1488,
            1659,
            1817,
            2044,
            2231,
            2502,
            2694,
            2899,
            3244,
            3412,
            3595,
            3761,
            4127,
            4304,
            4554,
            4755,
            5160,
            5306,
            5748,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parah);
        lv = findViewById(R.id.parahNamesList);
        ArrayAdapter<String> AA = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1,ParahName);
        lv.setAdapter(AA);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                Intent intent = new Intent(ParahActivity.this, completeParah.class);
                intent.putExtra("ParahId", i + 1);
                startActivity(intent);
            }
        });
    }
}