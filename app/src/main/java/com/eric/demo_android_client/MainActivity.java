package com.eric.demo_android_client;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity implements View.OnClickListener {

    Button btn ;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btn = (Button)findViewById(R.id.btn);
        btn.setOnClickListener(this);
    }

    public void onClick(View v){
        Log.e("eric","onclick");
    }
}
