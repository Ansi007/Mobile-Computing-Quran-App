package haqnawaz.org.navigationdrawer;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.CompoundButton;
import android.widget.RadioButton;

public class Settings extends AppCompatActivity {

    RadioButton eng1,eng2;
    RadioButton urdu1,urdu2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);
        eng1 = findViewById(R.id.radioEng1);
        eng2 = findViewById(R.id.radioEng2);
        urdu1 = findViewById(R.id.radioUrdu1);
        urdu2 = findViewById(R.id.radioUrdu2);
        if(SettingsValue.URDU_TRANSLATION == 0) {
            urdu1.setChecked(true);
        }
        else {
            urdu2.setChecked(true);
        }

        if(SettingsValue.ENGLISH_TRANSLATION == 0) {
            eng1.setChecked(true);
        }
        else {
            eng2.setChecked(true);
        }

        eng1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b == true) {
                    SettingsValue.ENGLISH_TRANSLATION = 0;
                }
            }
        });
        eng2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b == true) {
                    SettingsValue.ENGLISH_TRANSLATION = 1;
                }
            }
        });
        urdu1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b == true) {
                    SettingsValue.URDU_TRANSLATION = 0;
                }
            }
        });
        urdu2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                if(b == true) {
                    SettingsValue.URDU_TRANSLATION = 1;
                }
            }
        });
    }
}