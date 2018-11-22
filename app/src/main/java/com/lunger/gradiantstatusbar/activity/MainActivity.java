package com.lunger.gradiantstatusbar.activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.lunger.gradiantstatusbar.R;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void solution1(View view) {
        startActivity(new Intent(this, Solution1Activity.class));
    }

    public void solution2(View view) {
        startActivity(new Intent(this, Solution2Activity.class));
    }
}
