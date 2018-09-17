package com.helloworld;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class ReceiveIntentMesActivity extends Activity {


    private String mes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_receive_intent_mes);

    }


    @Override
    protected void onResume() {
        super.onResume();
        Intent intent = getIntent();
        mes = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
    }

    //为什么需要是public才能被布局文件调用？
    public void showMessage(View view){
        Toast.makeText(this, mes, Toast.LENGTH_SHORT).show();
    }
}
