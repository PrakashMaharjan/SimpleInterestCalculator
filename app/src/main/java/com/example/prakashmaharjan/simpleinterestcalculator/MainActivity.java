package com.example.prakashmaharjan.simpleinterestcalculator;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });
    }

    //button on click action
public void  onButtonClick(View v){
    EditText principal = (EditText)findViewById(R.id.principaltxtID);
    EditText time = (EditText)findViewById(R.id.timetxtID);
    EditText rate = (EditText)findViewById(R.id.ratetxtID);
    TextView display = (TextView)findViewById(R.id.resultTxtViewID);

    //if any of value from textfield is empty then show toast
    if (principal.getText().toString().matches("") || (time.getText().toString().matches("")) || (rate.getText().toString().matches(""))){

        Toast.makeText(this, "Please fill all values.", Toast.LENGTH_SHORT).show();
        return;
    }
    else {

        float p = Float.valueOf(principal.getText().toString());
        float t = Float.valueOf(time.getText().toString());
        float r = Float.valueOf(rate.getText().toString());
        //SI Formula
        float si = (p*t*r)/100;
        display.setText(Float.toString(si));

    }

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
