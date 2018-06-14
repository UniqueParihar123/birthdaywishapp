package com.example.anupamparihar.birthday;

import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView iv1;
    ImageView iv2;
    ImageView iv3;
    ImageView iv4;
    Animation animation;
    Animation animation2;
    MediaPlayer mediaplayer;
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button1=(Button)findViewById(R.id.btn);
        iv1=(ImageView)findViewById(R.id.fl);
        iv2=(ImageView)findViewById(R.id.ck);
        iv3=(ImageView)findViewById(R.id.cl);
        iv4=(ImageView)findViewById(R.id.hb);
        iv2.setVisibility(View.VISIBLE);
        iv3.setVisibility(View.VISIBLE);
        mediaplayer=MediaPlayer.create(getApplicationContext(),R.raw.hbd2);
        animation= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animation);
        animation2= AnimationUtils.loadAnimation(getApplicationContext(),R.anim.animation2);
iv1.setVisibility(View.INVISIBLE);
        button1.setOnClickListener(new View.OnClickListener()
        {

            @Override
            public void onClick(View view)
            {
                iv1.startAnimation(animation);
                iv4.startAnimation(animation2);
                animation.setAnimationListener(new Animation.AnimationListener() {
                    @Override
                    public void onAnimationStart(Animation animation) {

                        mediaplayer.start();
                    }

                    @Override
                    public void onAnimationEnd(Animation animation) {
                        mediaplayer.stop();

                    }

                    @Override
                    public void onAnimationRepeat(Animation animation) {

                    }
                });
            }

        });


    }
}
