package com.aplication.projectuas;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;

import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class ServiceActivity extends AppCompatActivity {

    public static final int NOTIFICATION_ID=1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);

        getSupportActionBar().hide();
    }

    public void shownotification(View view) {

        Intent intent=new Intent(ServiceActivity.this,MainActivity.class);

        PendingIntent pendingIntent=PendingIntent.getActivity(this,0,intent,0);

        NotificationCompat.Builder builder=new NotificationCompat.Builder(this)
                .setSmallIcon(R.drawable.pirus)
                .setContentTitle("TOPVID")
                .setAutoCancel(true)
                .setContentIntent(pendingIntent)
                .setContentText("Info CoVid-19");

        NotificationManager notificationManager= (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        notificationManager.notify(NOTIFICATION_ID,builder.build());

    }
}
