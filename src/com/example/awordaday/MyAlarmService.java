package com.example.awordaday;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.support.v4.app.NotificationCompat;
                            
 
public class MyAlarmService extends Service
{
      
   //private NotificationManager mManager;
 
    @Override
    public IBinder onBind(Intent arg0)
    {
       // TODO Auto-generated method stub
        return null;
    }
 
    @Override
    public void onCreate()
    {
       // TODO Auto-generated method stub 
       super.onCreate();
    }
 
   @SuppressWarnings({ "static-access", "deprecation" })
   @Override
   public void onStart(Intent intent, int startId)
   {
       super.onStart(intent, startId);
      
     //  mManager = (NotificationManager) this.getApplicationContext().getSystemService(this.getApplicationContext().NOTIFICATION_SERVICE);
       Intent intent1 = new Intent(this.getApplicationContext(),Word.class);// this is what starts
     
       PendingIntent showWord = PendingIntent.getActivity(this, 0, intent1, 0);
       
       /*Notification notification = new Notification(R.drawable.ic_launcher,"Daily Word", System.currentTimeMillis());
       intent1.addFlags(Intent.FLAG_ACTIVITY_SINGLE_TOP| Intent.FLAG_ACTIVITY_CLEAR_TOP);*/
       
       Notification notification = new NotificationCompat.Builder(this).setTicker("Daily Word")
    		   .setSmallIcon(R.drawable.ic_launcher).setContentTitle("Daily Word").setContentText("Your Word is ready").setContentIntent(showWord).setAutoCancel(true)
    		   .build();
 
      /* PendingIntent pendingNotificationIntent = PendingIntent.getActivity( this.getApplicationContext(),0, intent1,PendingIntent.FLAG_UPDATE_CURRENT);
       notification.flags |= Notification.FLAG_AUTO_CANCEL;
       notification.setLatestEventInfo(this.getApplicationContext(), "Daily Word" , "Your Word is ready", pendingNotificationIntent);*/
       
       NotificationManager notificationManager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
       
       notificationManager.notify(0,notification);
       
      // mManager.notify(0, notification);
       
       
       
    }
 
    @Override
    public void onDestroy()
    {
        // TODO Auto-generated method stub
        super.onDestroy();
    }
 
}
