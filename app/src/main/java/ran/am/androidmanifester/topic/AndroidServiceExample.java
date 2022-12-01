package ran.am.androidmanifester.topic;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import ran.am.androidmanifester.R;

public class AndroidServiceExample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_service_example);
    }

    public void startservce(View view) {

        Intent intent = new Intent(AndroidServiceExample.this,MyService.class);
        startService(intent);
    }

    public void stoptservce(View view) {

        Intent intent = new Intent(AndroidServiceExample.this,MyService.class);
        stopService(intent);
    }
}
