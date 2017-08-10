package com.frank.supportdesigndemo;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

import com.frank.supportdesigndemo.appbarlayout.AppbarLayoutActivity;
import com.frank.supportdesigndemo.appbarlayout.EntryActivity;
import com.frank.supportdesigndemo.bottombehavior.BottomActivity;
import com.frank.supportdesigndemo.coordinatorlayout.CoordinatorActivity;
import com.frank.supportdesigndemo.floatingbutton.FabActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    Button mBtnCoord;
    Button mBtnFab;
    Button mBtnBottom;
    Button mBtnAppbarlayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mBtnCoord = (Button) findViewById(R.id.btn_coord);
        mBtnCoord.setOnClickListener(this);
        mBtnFab = (Button) findViewById(R.id.btn_fab);
        mBtnFab.setOnClickListener(this);
        mBtnBottom = (Button) findViewById(R.id.btn_bottom);
        mBtnBottom.setOnClickListener(this);
        mBtnAppbarlayout = (Button) findViewById(R.id.btn_appbar);
        mBtnAppbarlayout.setOnClickListener(this);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId())
        {
            case R.id.btn_coord:
                Intent intent = new Intent(MainActivity.this,CoordinatorActivity.class);
                startActivity(intent);
                break;
            case R.id.btn_fab:
                Intent intent1 = new Intent(MainActivity.this,FabActivity.class);
                startActivity(intent1);
                break;
            case R.id.btn_bottom:
                Intent intent2 = new Intent(MainActivity.this,BottomActivity.class);
                startActivity(intent2);
                break;
            case R.id.btn_appbar:
                Intent intent3 = new Intent(MainActivity.this,EntryActivity.class);
                startActivity(intent3);
                break;

            default:
                break;
        }
    }
}
