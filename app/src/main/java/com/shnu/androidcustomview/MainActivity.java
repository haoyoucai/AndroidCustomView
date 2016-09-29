package com.shnu.androidcustomview;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.shnu.androidcustomview.viewgroup.activity.FillStyleActivity;
import com.shnu.androidcustomview.viewgroup.activity.GridStyleActivity;
import com.shnu.androidcustomview.viewgroup2.HongyangViewGroupActivity;

public class MainActivity extends AppCompatActivity {
    private Button btn01, btn02, btn03;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn01 = (Button) findViewById(R.id.btn_001);
        btn02 = (Button) findViewById(R.id.btn_002);
        btn03 = (Button) findViewById(R.id.btn_003);
        btn01.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, FillStyleActivity.class));
            }
        });
        btn02.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, GridStyleActivity.class));
            }
        });
        btn03.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, HongyangViewGroupActivity.class));
            }
        });
    }
}
