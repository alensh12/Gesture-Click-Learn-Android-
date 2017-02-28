# Gesture-Click-Learn-Android-
Android app for gesture detecting and onclickListener



import android.content.res.Resources;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.util.TypedValue;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.view.View;


    public class MainActivity extends AppCompatActivity implements GestureDetector.OnDoubleTapListener,GestureDetector.OnGestureListener{
    public TextView alenstext;
    private GestureDetectorCompat gesture;

     @Override
        protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RelativeLayout alensLayout = (RelativeLayout)findViewById(R.id.activity_main);
        alensLayout.setBackgroundColor(Color.GREEN);

        Resources r = getResources();
        int px = (int) TypedValue.applyDimension(TypedValue.COMPLEX_UNIT_DIP,200,r.getDisplayMetrics());


         Button alensButton = (Button)findViewById(R.id.alensButton);
          alensButton.setWidth(px);
          alensButton.setOnClickListener(
                  new Button.OnClickListener(){
                      public void onClick(View v){
                         // TextView alenstext = (TextView)findViewById(R.id.alensText);
                          alenstext.setText("ShortCLick");
                      }
                  }
          );
              alenstext = (TextView)findViewById(R.id.alensText);
                gesture = new GestureDetectorCompat(this,this);
                gesture.setOnDoubleTapListener(this);


    }

    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        alenstext.setText("SingleTapConfirmed");
        return false;
    }

    @Override
    public boolean onDoubleTap(MotionEvent e) {
        alenstext.setText("DoubleTap");
        return false;
    }

    @Override
    public boolean onDoubleTapEvent(MotionEvent e) {
        alenstext.setText("DoubleTApEvent");
        return false;
    }

    @Override
    public boolean onDown(MotionEvent e) {
        alenstext.setText("Down");
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {
        alenstext.setText("ShowPress");
    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        alenstext.setText("SingleTapUp");
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        alenstext.setText("scroll");
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {
        alenstext.setText("LongPress");

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        alenstext.setText("Fling");
        return false;
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        gesture.onTouchEvent(event);
        return super.onTouchEvent(event);
    }
}
