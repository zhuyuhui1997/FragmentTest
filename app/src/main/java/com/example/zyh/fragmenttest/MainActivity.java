package com.example.zyh.fragmenttest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    public static String Tag="MainActivcty.this";
   // public TextView textView;
   // public Button button;
    public Button act2_button1;
    public Button act2_button2;
   // public ImageView imageView ;
    public  MyLayout myLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_main);
        setContentView(R.layout.new_activity2);
        //  setContentView(R.layout.new_activity);
    /*    button=(Button)findViewById(R.id.new_activitybutton);
       button.setOnClickListener(new View.OnClickListener() {
           @Override
            public void onClick(View view) {
               Log.d(Tag,"button on Click");
          }
       });
       button.setOnTouchListener(new View.OnTouchListener() {
           @Override
           public boolean onTouch(View view, MotionEvent motionEvent) {
               Log.d(Tag,"button on TOuch");
                //return false;
               return  true;
           }
      });
*/
     /*   Fragment fragment1=new Fragment1();
        getFragmentManager().beginTransaction().replace(R.id.LinearLayout,fragment1).commit();
        Display display=getWindowManager().getDefaultDisplay();
        int widthy=display.getWidth();

       textView=(TextView)findViewById(R.id.new_activity_text);
       textView.setText(widthy+"");*/

     /*  imageView=(ImageView)findViewById(R.id.new_activityimage);
        imageView.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Log.d(Tag,"imageview on touch");
                return false;
            }
        }); */
        myLayout=(MyLayout)findViewById(R.id.my_layout);
        act2_button1=(Button)findViewById(R.id.new_activity2button);
        act2_button2=(Button)findViewById(R.id.new_activity2button2);
        myLayout.setOnTouchListener(new View.OnTouchListener() {
            @Override
            public boolean onTouch(View view, MotionEvent motionEvent) {
                Log.d(Tag,"mylayout on touch");

                return false;
            }
        });
        act2_button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(Tag,"act2_button on click");
            }
        });
        act2_button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d(Tag,"act2_button2 on click");
            }
        });
    }
}
