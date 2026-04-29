package com.myapp;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends android.app.Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        android.widget.TextView tv = new android.widget.TextView(this);
        tv.setText("I built this from scratch on a tablet!");
        setContentView(tv);
    }
}