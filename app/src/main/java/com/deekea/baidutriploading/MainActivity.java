package com.deekea.baidutriploading;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setupLoadingAnimation();
    }

    private void setupLoadingAnimation() {
        ImageView bear = (ImageView) findViewById(R.id.common_loading_content_image_bear);
        ImageView cloudBack = (ImageView) findViewById(R.id.common_loading_content_image_cloud_back);
        ImageView cloudFront = (ImageView) findViewById(R.id.common_loading_content_image_cloud_front);

        Animation bearAnim = AnimationUtils.loadAnimation(this, R.anim.anim_loading_translate_bear);
        bear.setAnimation(bearAnim);

        Animation cloudBackAnim = AnimationUtils.loadAnimation(this, R.anim.anim_loading_translate_cloud_back);
        cloudBack.setAnimation(cloudBackAnim);

        Animation cloudFrontAnim = AnimationUtils.loadAnimation(this, R.anim.anim_loading_translate_cloud_front);
        cloudFront.setAnimation(cloudFrontAnim);
    }

}
