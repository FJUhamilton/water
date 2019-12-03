package com.fju.water;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.EditText;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity {

    private static final String TAG = MainActivity.class.getSimpleName();
    EditText edmonth;
    EditText ednext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edmonth = findViewById(R.id.month);
        ednext = findViewById(R.id.next);

    }

    ;


    public void acc(View view) {
        float money = 0;


        if (!TextUtils.isEmpty(edmonth.getText().toString())) {
            float month = Float.parseFloat(edmonth.getText().toString());
            if (month >= 1 && 10 >= month) {
                money = (month * 7.35f);
            } else if (month >= 11 && 30 >= month) {
                money = (month * 9.45f) - 21;
            } else if (month >= 31 && 50 >= month) {
                money = (month * 11.55f) - 84;
            } else {
                money = (month * 12.075f) - 110.25f;
            }
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("每月抄表費用")
                    .setMessage("費用:" + money)
                    .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                        @Override
                        public void onClick(DialogInterface dialog, int which) {
                            edmonth.setText("");
                            ednext.setText("");
                        }
                    })
                    .show();
        }
        if (!TextUtils.isEmpty(ednext.getText().toString())) {
            float next = Float.parseFloat(ednext.getText().toString());
            if (next >= 1 && 20 >= next) {
                money = (next * 7.35f);
            } else if (next >= 21 && 60 >= next) {
                money = (next * 9.45f) - 42;
            } else if (next >= 61 && 100 >= next) {
                money = (next * 11.55f) - 168;
            } else {
                money = (next * 12.075f) - 220.5f;
            }
            new AlertDialog.Builder(MainActivity.this)
                    .setTitle("隔月抄表費用")
                    .setMessage("費用:" + money)
                    .setPositiveButton("ok", new DialogInterface.OnClickListener() {
                                @Override
                                public void onClick(DialogInterface dialog, int which) {
                                    edmonth.setText("");
                                    ednext.setText("");
                                }
                            }
                    )
                    .show();
        }
        float coco = money;
        Intent intent = new Intent(this, result.class);
        intent.putExtra("coco", coco);
        startActivity(intent);
    };
}