package com.frank.supportdesigndemo.appbarlayout;

import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.design.widget.CollapsingToolbarLayout;
import android.support.v4.view.ViewCompat;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.widget.ImageView;
import android.widget.Toast;

import com.frank.supportdesigndemo.R;

public class AppbarLayoutActivity extends AppCompatActivity {
    private static final String TAG = "AppbarLayoutActivity";

    AppBarLayout appBarLayout;
    CollapsingToolbarLayout collapsingToolbarLayout;
    ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        int layout = getIntent().getIntExtra("layout",R.layout.activity_appbar_layout);
        setContentView(layout);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        appBarLayout = (AppBarLayout) findViewById(R.id.appbar_layout);
        collapsingToolbarLayout = (CollapsingToolbarLayout) findViewById(R.id.collapsingtoolbar);
        imageView = (ImageView) findViewById(R.id.test_move);
        Toast.makeText(AppbarLayoutActivity.this," "+appBarLayout.getTotalScrollRange()
                +" appbar origin height:"+appBarLayout.getHeight(),Toast.LENGTH_LONG).show();
        appBarLayout.addOnOffsetChangedListener(new AppBarLayout.OnOffsetChangedListener() {
            @Override
            public void onOffsetChanged(AppBarLayout appBarLayout, int verticalOffset) {
                Log.d(TAG, "onOffsetChanged: "+verticalOffset
                    +" total range:"+appBarLayout.getTotalScrollRange());
            }
        });


    }

}
