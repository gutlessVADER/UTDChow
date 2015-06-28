package com.matthewecker.utdchow;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.global_actions, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            // openSettings();
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void viewOnCampus(View view) {
        Intent intent = new Intent(this, OnCampusActivity.class);
        startActivity(intent);
    }

    public void viewOffCampus(View view) {
        Intent intent = new Intent(this, OffCampusActivity.class);
        startActivity(intent);
    }

    public void viewMonster(View view) {
        Intent intent = new Intent(this, MonsterActivity.class);
        startActivity(intent);
    }
}
