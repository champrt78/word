package com.example.awordaday;



 
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
 
public class MyReceiver extends BroadcastReceiver
{
      
    @Override
    public void onReceive(Context context, Intent intent)
    {
    	//if (intent.getAction().equals("android.intent.action.BOOT_COMPLETED")){
       Intent service1 = new Intent(context, MyAlarmService.class);
       context.startService(service1);
    //	}
        
    }  
}
