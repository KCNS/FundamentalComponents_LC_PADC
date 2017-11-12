package com.padcmm.sfc.activities;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.padcmm.sfc.R;
import com.padcmm.sfc.adapters.NewsImagesPagerAdapter;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by KCNS on 11/11/2017.
 */

public class NewsDetailsActivity extends AppCompatActivity {

    @BindView(R.id.vp_news_details_images)
    ViewPager vpNewsDetailsImages;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_detail);
        ButterKnife.bind(this, this);

        NewsImagesPagerAdapter newsImagesPagerAdapter = new NewsImagesPagerAdapter(getApplicationContext());
        vpNewsDetailsImages.setAdapter(newsImagesPagerAdapter);

    }

    public static Intent newIntent(Context context){
        Intent intent = new Intent(context, NewsDetailsActivity.class);
        return intent;
    }
}
