package com.example.seano;

import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        CardView login_btn = findViewById(R.id.login_btn);
        CardView create_btn = findViewById(R.id.create_btn);

        anim();

        login_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               onboarding4();
            }
        });
        create_btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onboarding2();
            }
        });
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
    }
    public void onboarding2(){
        Intent intent = new Intent(this, onboarding2.class);
        startActivity(intent);
    }
    public void onboarding4(){
        Intent intent = new Intent(this, onboarding4.class);
        startActivity(intent);
    }
    public void anim(){
        ImageView logo = findViewById(R.id.seano_logo);
        TextView text1 = findViewById(R.id.text1);
        TextView text2 = findViewById(R.id.text2);
        TextView text3 = findViewById(R.id.text3);
        TextView text4 = findViewById(R.id.text4);
        CardView login_btn = findViewById(R.id.login_btn);
        CardView create_btn = findViewById(R.id.create_btn);

        logo.post(() -> {
            logo.setVisibility(View.VISIBLE);
            text1.setVisibility(View.VISIBLE);
            text2.setVisibility(View.VISIBLE);
            text3.setVisibility(View.VISIBLE);
            text4.setVisibility(View.VISIBLE);
            login_btn.setVisibility(View.VISIBLE);
            create_btn.setVisibility(View.VISIBLE);

            ObjectAnimator animator = ObjectAnimator.ofFloat(logo, "translationY", -logo.getHeight(), 0f);
            ObjectAnimator animator1 = ObjectAnimator.ofFloat(text1, "translationY", -text1.getHeight(), 0f);
            ObjectAnimator animator2 = ObjectAnimator.ofFloat(text2, "translationY", -text2.getHeight(), 0f);
            ObjectAnimator animator3 = ObjectAnimator.ofFloat(text3, "translationY", -text3.getHeight(), 0f);
            ObjectAnimator animator4 = ObjectAnimator.ofFloat(text4, "translationY", -text4.getHeight(), 0f);
            ObjectAnimator animator5 = ObjectAnimator.ofFloat(login_btn, "translationY", -login_btn.getHeight(), 0f);
            ObjectAnimator animator6 = ObjectAnimator.ofFloat(create_btn, "translationY", -create_btn.getHeight(), 0f);
            animator.setDuration(1000);
            animator.start();
            animator1.setDuration(1000);
            animator1.start();
            animator2.setDuration(1000);
            animator2.start();
            animator3.setDuration(1000);
            animator3.start();
            animator4.setDuration(1000);
            animator4.start();
            animator5.setDuration(1000);
            animator5.start();
            animator6.setDuration(1000);
            animator6.start();
        });

    }
}