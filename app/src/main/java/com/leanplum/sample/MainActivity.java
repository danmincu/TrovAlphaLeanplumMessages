package com.leanplum.sample;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.os.Bundle;
import android.provider.Settings;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.leanplum.annotations.Variable;

public class MainActivity extends AppCompatActivity {

    @Variable
    public static String mainactivityAtring = "aaa";
    private String androidId;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        androidId = Settings.Secure.getString(getContentResolver(),Settings.Secure.ANDROID_ID);
        Log.i("### ", "DeviceID " + androidId);

        Button subscribeButton = (Button) findViewById(R.id.copy_button);
        subscribeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "DeviceID has been copied into the clipboard. Email it to yourself and use it server side!", Toast.LENGTH_LONG).show();
                ClipboardManager clipboard = (ClipboardManager) getSystemService(CLIPBOARD_SERVICE);
                ClipData clip = ClipData.newPlainText("Token", androidId);
                clipboard.setPrimaryClip(clip);

            }
        });

        TextView tv = (TextView) findViewById(R.id.text_label);
        tv.setText(tv.getText() + " Id:" + androidId);
    }

}
