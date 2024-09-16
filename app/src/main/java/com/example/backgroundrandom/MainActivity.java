package com.example.backgroundrandom;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Switch;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {
    FrameLayout frameLayout;
    ImageView imageView;
    ArrayList<Integer> arrImgBg;
    ArrayList<Integer> arrImgIcon;

    Switch aSwitch;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        frameLayout= findViewById(R.id.main);
        imageView= findViewById(R.id.imageView);

        arrImgBg= new ArrayList<>();
        arrImgBg.add(R.drawable.img01);
        arrImgBg.add(R.drawable.img02);
        arrImgBg.add(R.drawable.img03);

        arrImgIcon=new ArrayList<>();
        arrImgIcon.add(R.drawable.cat);
        arrImgIcon.add(R.drawable.dog);
        arrImgIcon.add(R.drawable.turtle);
        arrImgIcon.add(R.drawable.hamster);
        arrImgIcon.add(R.drawable.penguin);

        Random randomBg= new Random();
        int placeBg=randomBg.nextInt(arrImgBg.size());
        frameLayout.setBackgroundResource(arrImgBg.get(placeBg));

        Random randomIcon= new Random();
        int placeIcon=randomIcon.nextInt(arrImgIcon.size());
        imageView.setImageResource(arrImgIcon.get(placeIcon));




    }
}