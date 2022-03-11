package com.example.music;



import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.MediaController;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;
import android.net.Uri;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity  {
    public static final String TAG ="MyMessage : ";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Print Log

        Log.i(TAG,"onCreate");
    }


    @Override
    protected void onStop() {
        super.onStop();
        // Print Log
        Log.i(TAG,"onStop");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        // Print Log
        Log.i(TAG,"onDestroy");
    }

    @Override
    protected void onPause() {
        super.onPause();
        // Print Log
        Log.i(TAG,"onPause");
    }

    @Override
    protected void onResume() {
        super.onResume();
        // Print Log
        Log.i(TAG,"onResume");      }

    @Override
    protected void onStart() {
        super.onStart();
        // Print Log
        Log.i(TAG,"onStart");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        // Print Log
        Log.i(TAG,"onRestart");
    }

    public void onClickHandler(View view)  {
        //Toast.makeText(this, "You click on 'Info' button!", Toast.LENGTH_SHORT).show();
       Log.i(TAG,"OnClickInfo");
        TextView t = (TextView) findViewById(R.id.test);
        VideoView v = (VideoView) findViewById(R.id.video1);
        TextView t1 = (TextView) findViewById(R.id.textView3);
        t.setText("Information : This one is an application ! for display music\n develop by\n luidjy aubel");
        v.setVisibility(View.INVISIBLE);
        t1.setVisibility(View.INVISIBLE);
        t.setVisibility(View.VISIBLE);
    }
    public void OnClickHome(View view)  {
        //Toast.makeText(this, "You click on 'Info' button!", Toast.LENGTH_SHORT).show();
        Log.i(TAG,"OnClickHome");
        TextView t = (TextView) findViewById(R.id.test);


        t.setVisibility(View.INVISIBLE);
    }
    public void onClickHandler2(View view)  {
        //Toast.makeText(this, "You click on 'Info' button!", Toast.LENGTH_SHORT).show();
        Log.i(TAG,"OnClickVid");
        VideoView v = (VideoView) findViewById(R.id.video1); // initiate a video view
        String videoPath = "android.resource://" + getPackageName() + "/" + R.raw.videoplayback;
        Uri uri = Uri.parse(videoPath);
        v.setVideoURI(uri);

        MediaController mediaController = new MediaController(this);
        v.setMediaController(mediaController);
        mediaController.setAnchorView(v);
        v.setVisibility(View.VISIBLE);
        v.start();
    }
}