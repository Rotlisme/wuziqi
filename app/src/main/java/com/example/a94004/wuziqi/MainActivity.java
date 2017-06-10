package com.example.a94004.wuziqi;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private wuziqi mWuziqi;
    private Button wuziqiBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWuziqi = (wuziqi) findViewById(R.id.id_wuziqi);
        wuziqiBtn = (Button) findViewById(R.id.restart);
        wuziqiBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mWuziqi.start();
            }
        });
    }
}
