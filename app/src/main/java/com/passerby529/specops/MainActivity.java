package com.passerby529.specops;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        TextView tv = new TextView(this);
        tv.setText("SpecOps Engine Alive");
        tv.setTextSize(24f);
        tv.setGravity(Gravity.CENTER);

        setContentView(tv);
    }
}
