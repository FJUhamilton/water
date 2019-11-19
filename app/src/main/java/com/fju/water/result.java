package com.fju.water;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class result extends AppCompatActivity {
    TextView remoney;
    TextView monthnext;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent = getIntent();
        float coco = intent.getFloatExtra("coco",-1);
        Log.d("Result",coco+"");
        remoney =findViewById(R.id.remoney);
        monthnext = findViewById(R.id.monthnext);
        int recoco = (int)(coco+0.5f);
        remoney.setText(recoco+"");
        monthnext.setText("抄表");
    }
}
