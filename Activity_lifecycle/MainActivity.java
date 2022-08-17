package com.example.act;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("Message","Activity was created");
    }
    @Override
    protected void onStart() {

        super.onStart();
        Toast.makeText(this,"onstart",Toast.LENGTH_SHORT).show();
        Log.d("Message","Activity was Started");
    }
    @Override
    protected void onRestart() {

        super.onRestart();
        Log.d("Message","Activity was Restarted");
    }
    @Override
    protected void onResume(){
        super.onResume();
        Toast.makeText(this,"resumed",Toast.LENGTH_SHORT).show();
        Log.d("Message","Activity was Resumed");
    }
    @Override
    protected void onPause()
    {
        super.onPause();
        Toast.makeText(this,"paused",Toast.LENGTH_SHORT).show();
        Log.d("Message","Activity was Paused");
    }
    @Override
    protected void onStop()
    {
        super.onStop();
        Toast.makeText(this,"stopped",Toast.LENGTH_SHORT).show();
        Log.d("Message","Activity was Stopped");
    }
    @Override
    protected void onDestroy()
    {
        super.onDestroy();
        Toast.makeText(this,"destroyed",Toast.LENGTH_SHORT).show();
        Log.d("Message","Activity was Destroyed");
    }
}