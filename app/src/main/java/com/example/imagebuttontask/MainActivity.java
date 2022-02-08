package com.example.imagebuttontask;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView iv;
    ImageButton ib;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv = findViewById(R.id.ivResult);
        ib = findViewById(R.id.imageButton);

        ib.setImageResource(R.drawable.click);
    }

    public void clicked(View view) {
        int rand = (int) (3 * Math.random() + 1);

        if(rand == 1){
            iv.setImageResource(R.drawable.stickman1);
            ib.setImageResource(R.drawable.one1);
        }
        else if(rand == 2){
            iv.setImageResource(R.drawable.two);
            ib.setImageResource(R.drawable.two1);
        }
        else if(rand == 3){
            iv.setImageResource(R.drawable.three);
            ib.setImageResource(R.drawable.three1);
        }
    }
}