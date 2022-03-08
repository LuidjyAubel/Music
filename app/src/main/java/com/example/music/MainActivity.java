package com.example.music;



import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.nfc.Tag;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
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
        t.setText("Information : develop by\n luidjy aubel");
        v.setVisibility(View.INVISIBLE);
        t1.setVisibility(View.INVISIBLE);
        t.setVisibility(View.VISIBLE);
    }
    public void OnClickHome(View view)  {
        //Toast.makeText(this, "You click on 'Info' button!", Toast.LENGTH_SHORT).show();
        Log.i(TAG,"OnClickHome");
        TextView t = (TextView) findViewById(R.id.test);
        TextView t1 = (TextView) findViewById(R.id.textView3);
        VideoView v = (VideoView) findViewById(R.id.video1);
        t1.setText("This one is an application !\n for display music");
        v.setVisibility(View.INVISIBLE);
        t.setVisibility(View.INVISIBLE);
        t1.setVisibility(View.VISIBLE);
    }
    public void onClickHandler2(View view)  {
        //Toast.makeText(this, "You click on 'Info' button!", Toast.LENGTH_SHORT).show();
        Log.i(TAG,"OnClickVid");

        Uri uri = Uri.parse("\"https://drive.google.com/file/d/1ztPpF9QL8P8tKDrEacJFMA9-kq6iVD66/view?usp=sharing");
        VideoView v = (VideoView) findViewById(R.id.video1); // initiate a video view
        TextView t1 = (TextView) findViewById(R.id.textView3);
        v.setVisibility(View.VISIBLE);
        t1.setVisibility(View.INVISIBLE);

        v.setVideoURI(uri);
        v.start();
    }
}