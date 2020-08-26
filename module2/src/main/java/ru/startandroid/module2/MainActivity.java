package ru.startandroid.module2;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    Button btnAct2;
    Button btnAct3;
    Button btnAct4;
    Button btnAct5;
    String x;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnAct2 = findViewById(R.id.btnAct2);
        btnAct2.setOnClickListener(this);

        btnAct3 = findViewById(R.id.btnAct3);
        btnAct3.setOnClickListener(this);

        btnAct4 = findViewById(R.id.btnAct4);
        btnAct4.setOnClickListener(this);

        btnAct5 = findViewById(R.id.btnAct5);
        btnAct5.setOnClickListener(this);
    }

    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnAct2:
                Intent intent2 = new Intent(this, MainActivity2.class);
                startActivity(intent2);
                break;
            case R.id.btnAct3:
                Intent intent3 = new Intent(this, MainActivity3.class);
                startActivity(intent3);
                break;
            case R.id.btnAct4:
                Intent intent4 = new Intent(this, MainActivity4.class);
                startActivity(intent4);
                break;
            case R.id.btnAct5:
                Intent intent5 = new Intent(this, MainActivity5.class);
                startActivity(intent5);
                break;
            default:
                break;
        }
    }
}

