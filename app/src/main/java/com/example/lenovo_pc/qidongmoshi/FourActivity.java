package com.example.lenovo_pc.qidongmoshi;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class FourActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_four);
        Log.i("A------","oncreat");
        TextView four= (TextView) findViewById(R.id.four);

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(FourActivity.this,FiveActivity.class));
            }
        });
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.i("A------","onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("A------","onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("A------","onPause");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("A------","onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("A------","onDestroy");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.i("A------","onRestart");
    }

}
