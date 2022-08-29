package haqnawaz.org.navigationdrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.TextView;

public class Searching extends AppCompatActivity {
EditText Input;
Button Search;
TextView tv;
TextView tv2;
TextView tv3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_searching);
        Intent intent3= new Intent(Searching.this,SearchResult.class);
        Intent i = getIntent();
        String values=i.getStringExtra("Search");
        Input = findViewById(R.id.Input);
        Search = findViewById(R.id.Search);
        tv = findViewById(R.id.textView);
        tv2 = findViewById(R.id.textView2);
        tv3 = findViewById(R.id.textView3);

        switch (values){
            case "Search":
                break;
            case "ByParaNo":
                tv.setText("Enter Parah Number (1 - 30): ");
                tv2.setText("پارہ نمبر (1 - 30) درج کریں:");
                tv3.setText("أدخل رقم باراه (1 - 30):");
                break;
            case "BySurahNo":
                tv.setText("Enter Surah Number (1 - 114): ");
                tv2.setText("سورہ نمبر (1 - 114) درج کریں:");
                tv3.setText("أدخل رقم السورة (1-114):");
                break;
        }
        Search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String input=Input.getText().toString();
                intent3.putExtra("Input",input);
                intent3.putExtra("Search",values);
                startActivity(intent3);
            }
        });
    }
}