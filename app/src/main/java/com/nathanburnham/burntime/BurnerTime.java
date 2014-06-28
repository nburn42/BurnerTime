package com.nathanburnham.burntime;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.Calendar;

public class BurnerTime extends ActionBarActivity {

    android.os.Handler customHandler;

    private void updateTime()
    {
        Calendar c = Calendar.getInstance();
        int hour = c.get(Calendar.HOUR_OF_DAY);

        ImageView imgView;
        imgView = (ImageView) findViewById(R.id.imageView);
        switch (hour)
        {
            case 0:
                imgView.setImageResource(R.drawable.reddonut);
                break;
            case 1:
                imgView.setImageResource(R.drawable.redcircle);
                break;
            case 2:
                imgView.setImageResource(R.drawable.redcross);
                break;
            case 3:
                imgView.setImageResource(R.drawable.redtriangle);
                break;
            case 4:
                imgView.setImageResource(R.drawable.redsquare);
                break;
            case 5:
                imgView.setImageResource(R.drawable.redpentagon);
                break;
            case 6:
                imgView.setImageResource(R.drawable.yellowdonut);
                break;
            case 7:
                imgView.setImageResource(R.drawable.yellowcircle);
                break;
            case 8:
                imgView.setImageResource(R.drawable.yellowcross);
                break;
            case 9:
                imgView.setImageResource(R.drawable.yellowtriangle);
                break;
            case 10:
                imgView.setImageResource(R.drawable.yellowsquare);
                break;
            case 11:
                imgView.setImageResource(R.drawable.yellowpentagon);
                break;
            case 12:
                imgView.setImageResource(R.drawable.greendonut);
                break;
            case 13:
                imgView.setImageResource(R.drawable.greencircle);
                break;
            case 14:
                imgView.setImageResource(R.drawable.greencross);
                break;
            case 15:
                imgView.setImageResource(R.drawable.greentriangle);
                break;
            case 16:
                imgView.setImageResource(R.drawable.greensquare);
                break;
            case 17:
                imgView.setImageResource(R.drawable.greenpentagon);
                break;
            case 18:
                imgView.setImageResource(R.drawable.bluedonut);
                break;
            case 19:
                imgView.setImageResource(R.drawable.bluecircle);
                break;
            case 20:
                imgView.setImageResource(R.drawable.bluecross);
                break;
            case 21:
                imgView.setImageResource(R.drawable.bluetriangle);
                break;
            case 22:
                imgView.setImageResource(R.drawable.bluesquare);
                break;
            case 23:
                imgView.setImageResource(R.drawable.bluepentagon);
                break;
        }
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_burner_time);

        ImageView imgView;
        imgView = (ImageView) findViewById(R.id.imageView);
        imgView.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v) {
                updateTime();
            }
        });

        customHandler = new android.os.Handler();
        customHandler.postDelayed(updateTimerThread, 0);
    }

    private Runnable updateTimerThread = new Runnable()
    {
        public void run()
        {
            updateTime();
            customHandler.postDelayed(this, 30000);
        }
    };

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.burner_time, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

}