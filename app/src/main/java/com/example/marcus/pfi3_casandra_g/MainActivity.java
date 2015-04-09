package com.example.marcus.pfi3_casandra_g;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends ActionBarActivity {

    //To randomize quotes from String array
    Random rand = new Random();
    int n = 0;

    public void clickedButton (View v){
        TextView t1;

        t1 = (TextView) findViewById(R.id.quoteArea);
        TextView t2 = (TextView) findViewById(R.id.textView);

        n = rand.nextInt(3);

        String[] randomQuotes = getResources().getStringArray(R.array.randomQuotes);

        t1.setText(randomQuotes[n]);

        Log.i("MyAPP" ,"Button pressed");
    }




    @Override
    protected void onStart() {
        super.onStart();
        Log.i("MyAPP" ,"Started");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.i("MyAPP" ,"Resumed");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.i("MyAPP" ,"Paused");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.i("MyAPP" ,"Destroyed");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.i("MyAPP" ,"Stopped");
    }

    //@Override
    //protected void onCreate(Bundle savedInstanceState) {
    //  super.onCreate(savedInstanceState);
    //setContentView(R.layout.activity_main);
    //Log.i("MyAPP" ,"Created");
    //}
    //Added

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
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


}