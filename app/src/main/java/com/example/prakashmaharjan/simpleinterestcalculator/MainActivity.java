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
public void  onButtonClick(View v){
    EditText principal = (EditText)findViewById(R.id.principaltxtID);
    EditText time = (EditText)findViewById(R.id.timetxtID);
    EditText rate = (EditText)findViewById(R.id.ratetxtID);
    TextView display = (TextView)findViewById(R.id.resultTxtViewID);
    //int p = Integer.parseInt(principal.getText().toString());
    //int t = Integer.parseInt(time.getText().toString());
    //int r = Integer.parseInt(rate.getText().toString());
    //int si= (p*t*r)/100;

    if (principal.getText().toString().matches("") || (time.getText().toString().matches("")) || (rate.getText().toString().matches(""))){

        Toast.makeText(this, "Please fill all values.", Toast.LENGTH_SHORT).show();
        return;
    }
    else {

        float p = Float.valueOf(principal.getText().toString());
        float t = Float.valueOf(time.getText().toString());
        float r = Float.valueOf(rate.getText().toString());
        float si = (p*t*r)/100;
        display.setText(Float.toString(si));

    }


    //display.setText(Integer.toString(si));

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
