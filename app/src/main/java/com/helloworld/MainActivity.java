package com.helloworld;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    //为什么是static才能被其他的class使用？
    public static final String EXTRA_MESSAGE = "com.helloworld.ToAnotherActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public String sendMessage(View view){
        EditText editText = (EditText) findViewById(R.id.edit_text);
        String mes = editText.getText().toString();
        Intent intent = new Intent(MainActivity.this, ReceiveIntentMesActivity.class);
        intent.putExtra(EXTRA_MESSAGE, mes);
        startActivity(intent);
        return "hello";
    }
}
