package com.frank.supportdesigndemo.appbarlayout;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.frank.supportdesigndemo.R;

public class EntryActivity extends AppCompatActivity implements View.OnClickListener {

    Button mBtnScroll,mBtnExit,mBtnSnap,mBtnEnter,mBtnEnterCollapsed,mBtnCollapsing,
            mBtnOffset;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entry);

        mBtnScroll = (Button) findViewById(R.id.btn_scroll);
        mBtnScroll.setOnClickListener(this);
        mBtnExit = (Button) findViewById(R.id.btn_exit);
        mBtnExit.setOnClickListener(this);
        mBtnEnter = (Button) findViewById(R.id.btn_enter_always);
        mBtnEnter.setOnClickListener(this);
        mBtnEnterCollapsed = (Button) findViewById(R.id.btn_enter_collapsed);
        mBtnEnterCollapsed.setOnClickListener(this);
        mBtnSnap = (Button) findViewById(R.id.btn_snap);
        mBtnSnap.setOnClickListener(this);

        mBtnCollapsing = (Button) findViewById(R.id.btn_collapseing);
        mBtnCollapsing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EntryActivity.this, CollapsingActivity.class);
                startActivity(intent);
            }
        });
        mBtnOffset = (Button) findViewById(R.id.btn_offset);
        mBtnOffset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(EntryActivity.this, ScrollingActivity.class);
                startActivity(intent);
            }
        });
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(EntryActivity.this, AppbarLayoutActivity.class);

        switch (v.getId())
        {
            case R.id.btn_scroll:
                intent.putExtra("layout",R.layout.activity_appbar_layout_scroll);
                break;
            case R.id.btn_exit:
                intent.putExtra("layout",R.layout.activity_appbar_layout_exit);
                break;
            case R.id.btn_enter_always:
                intent.putExtra("layout",R.layout.activity_appbar_layout_scroll_enter);
                break;
            case R.id.btn_enter_collapsed:
                intent.putExtra("layout",R.layout.activity_appbar_layout_enter_collapsed);
                break;
            case R.id.btn_snap:
                intent.putExtra("layout",R.layout.activity_appbar_layout_snap);
                break;

            default:
                break;
        }
        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);

        startActivity(intent);
    }
}
