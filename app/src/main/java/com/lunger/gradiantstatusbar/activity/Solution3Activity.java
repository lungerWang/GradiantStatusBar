package com.lunger.gradiantstatusbar.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RelativeLayout;

import com.jaeger.library.StatusBarUtil;
import com.lunger.gradiantstatusbar.R;

public class Solution3Activity extends AppCompatActivity {

    private RelativeLayout mRl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_solution3_activty);
        mRl = findViewById(R.id.rl);
        StatusBarUtil.setTranslucentForImageView(this, 0, mRl);
    }
}
