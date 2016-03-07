package com.example.priyankatotakanuma.activitylifecycle;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

/**
 * Created by priyankatotakanuma on 01/02/16.
 */
public class SecondActivity extends Activity{
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        button=(Button) findViewById(R.id.button);
        Log.e("lifecycleInSecond", "onCreate invoked");
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SecondActivity.this, MainActivity.class);
                startActivity(intent);

            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e("lifecycleInSecond", "onStart invoked");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("lifecycleInSecond", "onResume invoked");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("lifecycleInSecond", "onPause invoked");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("lifecycleInSecond", "onStop invoked");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("lifecycleInSecond", "onRestart invoked");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("lifecycleInSecond", "onDestroy invoked");
    }
}
