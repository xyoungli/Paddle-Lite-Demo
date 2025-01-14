package com.baidu.paddle.lite.demo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.v_img_classify:
                Intent intent = new Intent(MainActivity.this, ImgClassifyActivity.class);
                startActivity(intent);
                break;
            case R.id.v_obj_detect:
                Toast.makeText(MainActivity.this, "Still under construction...", Toast.LENGTH_SHORT).show();
                break;
        }
    }
}
