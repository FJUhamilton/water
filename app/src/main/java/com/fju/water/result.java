package com.fju.water;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class result extends AppCompatActivity {
    TextView remoney;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);
        Intent intent = getIntent();
        float coco = intent.getFloatExtra("coco",-1);
        Log.d("Result",coco+"");
        remoney =findViewById(R.id.remoney);
        remoney.setText(coco+"");
    }
}
