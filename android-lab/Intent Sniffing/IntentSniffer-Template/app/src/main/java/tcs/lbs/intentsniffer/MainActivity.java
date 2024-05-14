package tcs.lbs.intentsniffer;

import androidx.appcompat.app.AppCompatActivity;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.location.Location;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity
{
    TextView LatitudeTextView, LongitudeTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LatitudeTextView = findViewById(R.id.LatitudeTextView);
        LongitudeTextView = findViewById(R.id.LongitudeTextView);

        // TODO Define a broadcast receiver class
        // TODO Register to receive broadcast messages from ForegroundLocationService of the LocationApp
        // TODO Extract Location coordinates from the broadcast massage and show them in LatitudeTextView and LongitudeTextView
    }

    // BroadcastReceiver class, this class enables MainActivity to receive broadcasts from ForegroundLocationService
    public class MainActivityReceiver extends BroadcastReceiver
    {
        @Override
        public void onReceive(Context context, Intent intent) {
            Toast.makeText(context, "Received broadcast", Toast.LENGTH_SHORT).show();
        }

        // If a broadcast intent is received, this method will be invoked.

    }

}


