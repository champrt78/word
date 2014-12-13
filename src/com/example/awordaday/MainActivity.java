package com.example.awordaday;

import java.util.Calendar;

import android.app.Activity;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.os.Bundle;
import android.text.format.Time;
 
public class MainActivity extends Activity
{
 
    private PendingIntent pendingIntent;
     
    @Override
    public void onCreate(Bundle savedInstanceState)
     {
       
      super.onCreate(savedInstanceState);
     // setContentView(R.layout.activity_main);
     
      Calendar calendar = Calendar.getInstance();
     
      /* time to set alarm 
      calendar.set(Calendar.MONTH, 6);
      calendar.set(Calendar.YEAR, 2013);
      calendar.set(Calendar.DAY_OF_MONTH, 13);*/
      
      calendar.setTimeInMillis(System.currentTimeMillis());
      calendar.set(Calendar.HOUR_OF_DAY,18);
      calendar.set(Calendar.MINUTE, 53);
     // calendar.set(Calendar.SECOND, 00);
     // calendar.set(Calendar.AM_PM,Calendar.PM);
     
      Intent myIntent = new Intent(MainActivity.this, MyReceiver.class);
      pendingIntent = PendingIntent.getBroadcast(MainActivity.this, 0, myIntent,0);
     // year day
      // added this 
      AlarmManager alarmManager = (AlarmManager)this.getSystemService(ALARM_SERVICE);
     // alarmManager.set(AlarmManager.RTC, calendar.getTimeInMillis(), pendingIntent);
      alarmManager.setInexactRepeating(1, calendar.getTimeInMillis(), AlarmManager.INTERVAL_DAY, pendingIntent);
      
      
    } //end onCreate
}