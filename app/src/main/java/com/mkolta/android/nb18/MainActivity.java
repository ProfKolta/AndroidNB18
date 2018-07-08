package com.mkolta.android.nb18;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;  // any kind of widget
import android.view.MotionEvent;
import android.view.GestureDetector;
import android.support.v4.view.GestureDetectorCompat;
import android.widget.TextView;
import android.widget.Button;


public class MainActivity extends AppCompatActivity
        implements GestureDetector.OnGestureListener, GestureDetector.OnDoubleTapListener {

    private TextView mTextView;
    private Button mButton;
    private GestureDetectorCompat mGestureDetector;

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        mTextView.setText("Single Tap");
        return true;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        mTextView.setText("Double Tap");
        return true;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        mTextView.setText("Double Tap Event");
        return true;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        mTextView.setText("Down");
        return true;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        mTextView.setText("Show Press");

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        mTextView.setText("Single Tap Up");
        return true;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        mTextView.setText("Scroll");
        return true;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        mTextView.setText("Long press");

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        mTextView.setText("fling");
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.mGestureDetector.onTouchEvent(event);
        //mTextView.setText("Touch Event");
        return super.onTouchEvent(event);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mTextView= findViewById(R.id.mTextView1);
        mButton = findViewById(R.id.mButton1);

        this.mGestureDetector = new GestureDetectorCompat(this,this);
        mGestureDetector.setOnDoubleTapListener(this);

       mButton.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v) {

                mTextView.setText("It works");
            }
        });



        mButton.setOnLongClickListener(new Button.OnLongClickListener(){
            @Override
            public boolean onLongClick(View v){
                TextView mTextView = findViewById(R.id.mTextView1);
                mTextView.setText("Longg clickckck");
                return true;
            }

        });
    }


}
