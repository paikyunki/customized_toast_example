package com.example.paik1.customized_toast_example;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openToast(View view) {
        Toast toast = new Toast(this);
        toast.setDuration(Toast.LENGTH_SHORT);
        toast.setGravity(Gravity.BOTTOM, 0, 0);
        LayoutInflater inflater = getLayoutInflater();
        View appearance;
        appearance = inflater.inflate(R.layout.toast_layout, (ViewGroup) findViewById(R.id.root));
        toast.setView(appearance);
        toast.show();

    }
}
