package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class SecondActivity extends AppCompatActivity {

    int[] newArray;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        newArray = new int[]{
                R.id.dumbbell, R.id.lungetouch, R.id.anklecircle, R.id.anklehops, R.id.crosssidelunge,
                R.id.bearsquat, R.id.boxersquat, R.id.bulgarian, R.id.cossak, R.id.frogjump
        };
    }

    public void Imagebuttonclicked(View view) {

        for (int i=0; i< newArray.length; i++){
            if(view.getId() == newArray[i]){
                int value = i+1;
                Log.i("FIRST", String.valueOf(value));

                Intent intent = new Intent(SecondActivity.this, ThirdActivity.class);
                intent.putExtra("value", String.valueOf(value));
                startActivity(intent);
            }
        }
    }
}