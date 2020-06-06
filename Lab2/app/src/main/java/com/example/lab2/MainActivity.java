package com.example.lab2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) { //kiedy odpalamy po raz pierwszy
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Toast.makeText(this, "Metoda OnCreate", Toast.LENGTH_SHORT).show();
        Log.d("Lab2", "metoda OnCreate");
    }
    @Override
    protected void onStart(){ // zawsze przy starcie lub wzonwieniu
        super.onStart();
        Toast.makeText(this, "Metoda OnStart", Toast.LENGTH_SHORT).show();
        Log.d("Lab2", "metoda OnStart");
    }
    @Override
    protected void onResume(){ //Activity zostanie przywrócone po wstrzymaniu
        super.onResume();

        Log.d("Lab2", "metoda OnResume");
        //lub
        Toast.makeText(this, "Metoda OnResume", Toast.LENGTH_SHORT).show();
    }
    @Override
    protected void onPause(){ //Activity zostanie wstrzymane
        super.onPause();
        Toast.makeText(this, "Metoda OnPause", Toast.LENGTH_SHORT).show();
        Log.d("Lab2", "metoda OnPause");
    }
    @Override
    protected void onStop(){ //Activity zostanie przykryte
        super.onStop();
        Toast.makeText(this, "Metoda OnStop", Toast.LENGTH_SHORT).show();
        Log.d("Lab2", "metoda OnStop");
    }
    @Override
    protected void onRestart(){
        super.onRestart();
        Toast.makeText(this, "Metoda OnRestart", Toast.LENGTH_SHORT).show();
        Log.d("Lab2", "metoda OnRestart");
    }
    @Override
    protected void onDestroy(){ //Activity zostanie zamknięte
        super.onDestroy();
        Log.d("Lab2", "metoda OnDestroy");Log.d("Lab2", "metoda OnDestroy");Log.d("Lab2", "metoda OnDestroy");
        Toast.makeText(this, "Metoda OnDestroy", Toast.LENGTH_SHORT).show();
    }

}
