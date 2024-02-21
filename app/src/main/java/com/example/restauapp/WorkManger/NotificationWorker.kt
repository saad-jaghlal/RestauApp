package com.example.restauapp.WorkManger

import android.Manifest
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.content.pm.PackageManager
import androidx.core.app.ActivityCompat
import androidx.core.app.NotificationCompat
import androidx.core.app.NotificationManagerCompat
import androidx.work.Worker
import androidx.work.WorkerParameters
import com.example.restauapp.Activities.MainActivity
import com.example.restauapp.R

class NotificationWorker(context: Context, params: WorkerParameters) : Worker(context, params) {

    override fun doWork(): Result {
        val intent = Intent(applicationContext, MainActivity::class.java)
        val pendingIntent = PendingIntent.getActivity(applicationContext, 0, intent, PendingIntent.FLAG_IMMUTABLE)

//        val notification = NotificationCompat.Builder(applicationContext, "default")
//            .setSmallIcon(androidx.loader.R.drawable.notification_bg)
//            .setContentTitle("Hi dare client there is a nice food withing for you")
//            .setContentText("we have a new plat checkout")
//            .addAction(R.drawable.notification, "Action Text", pendingIntent)
//            .setSmallIcon(R.drawable.notification)
//            .build()
        intent.flags = Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK
        val contentIntent = PendingIntent.getActivity(
            applicationContext,
            0,
            intent,
            PendingIntent.FLAG_UPDATE_CURRENT
        )
        val notification = NotificationCompat.Builder(applicationContext, "default")
            .setSmallIcon(R.drawable.notification) // Use your custom notification icon
            .setContentTitle("Hi there, client! There's a nice food waiting for you.")
            .setContentText("We have a new dish, check it out.")
            .setContentIntent(contentIntent) // Set the PendingIntent for the notification content
            .addAction(R.drawable.notification, "Action Text", pendingIntent) // Use your custom action icon
            .build()

        // Perform the background task here,
        // such as displaying a notification
        if (ActivityCompat.checkSelfPermission(applicationContext, Manifest.permission.POST_NOTIFICATIONS) != PackageManager.PERMISSION_GRANTED) {
            // TODO: Consider calling
            //    ActivityCompat#requestPermissions
            // here to request the missing permissions, and then overriding
            //   public void onRequestPermissionsResult(int requestCode, String[] permissions,
            //                                          int[] grantResults)
            // to handle the case where the user grants the permission. See the documentation
            // for ActivityCompat#requestPermissions for more details.
//            return
        }
        NotificationManagerCompat.from(applicationContext).notify(1, notification)
        return Result.success()
    }
}