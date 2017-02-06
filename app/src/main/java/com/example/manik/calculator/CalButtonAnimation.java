package com.example.manik.calculator;

import android.animation.Animator;
import android.view.View;
import android.view.ViewAnimationUtils;
import android.view.animation.LinearInterpolator;
import android.widget.Button;

/**
 * Created by Manik on 05-02-2017.
 */

public class CalButtonAnimation{

    private Animator aa;
    int cx;
    int cy;


    public void Button_Animator(final Button b){

        cx = b.getBottom();
        cy = b.getHeight();

        final float finalRadius = (float) Math.hypot(cx, cy);
        aa = ViewAnimationUtils.createCircularReveal(b, cx-100, cy-100, finalRadius, 20);
        b.setVisibility(View.VISIBLE);
        aa.setDuration(200);
        aa.setInterpolator(new LinearInterpolator());
        aa.start();

        aa.addListener(new Animator.AnimatorListener() {
            @Override
            public void onAnimationStart(Animator animation) {

            }

            @Override
            public void onAnimationEnd(Animator animation) {

                animation=ViewAnimationUtils.createCircularReveal(b,cx-100,cy-100,20,finalRadius);
                animation.setInterpolator(new LinearInterpolator());
                b.setVisibility(View.VISIBLE);
                animation.setDuration(200);
                animation.start();
            }

            @Override
            public void onAnimationCancel(Animator animation) {

            }

            @Override
            public void onAnimationRepeat(Animator animation) {

            }
        });


    }
}
