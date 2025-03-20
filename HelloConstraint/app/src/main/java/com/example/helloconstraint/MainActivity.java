package com.example.helloconstraint;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

public class MainActivity extends AppCompatActivity {
    private int mCount = 0;
    private TextView mShowCount;
    private Button Zezo;
    private Button count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mShowCount = (TextView) findViewById(R.id.show_count);
        Zezo = (Button) findViewById(R.id.button_zezo);
        count = (Button) findViewById(R.id.button_count);
        Zezo.setBackgroundColor(Color.DKGRAY);
    }

    public void showToast(View view) {
        Toast toast = Toast.makeText(this,R.string.toast_message, Toast.LENGTH_SHORT);
        toast.show();
    }

    public void countUp(View view) {
        mCount++;
        mShowCount.setText(String.valueOf(mCount));
        if(mCount % 2 == 0) {
            Zezo.setBackgroundColor(ContextCompat.getColor(this, R.color.pink));
            count.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
        }else{
            Zezo.setBackgroundColor(ContextCompat.getColor(this, R.color.gray));
            count.setBackgroundColor(ContextCompat.getColor(this, R.color.green));
        }
    }
    public void resetCount(View view){
        mCount = 0;
        mShowCount.setText(String.valueOf(mCount));
        Zezo.setBackgroundColor(Color.DKGRAY);
        count.setBackgroundColor(getResources().getColor(com.google.android.material.R.color.design_default_color_on_primary));
    }
}