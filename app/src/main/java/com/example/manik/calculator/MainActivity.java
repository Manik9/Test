package com.example.manik.calculator;


import android.content.Context;
import android.content.Intent;
import android.support.design.widget.FloatingActionButton;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private static Button button_0;
    private static Button button_1;
    private static Button button_2;
    private static Button button_3;
    private static Button button_4;
    private static Button button_5;
    private static Button button_6;
    private static Button button_7;
    private static Button button_8;
    private static Button button_9;
    private static Button button_equal;
    private TextView calTextView;
    private int num;
    Intent i;


    CalButtonAnimation buttonAnimation = new CalButtonAnimation();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        button_0=(Button)findViewById(R.id.button0);
        button_1=(Button)findViewById(R.id.button1);
        button_2=(Button)findViewById(R.id.button2);
        button_3=(Button)findViewById(R.id.button3);
        button_4=(Button)findViewById(R.id.button4);
        button_5=(Button)findViewById(R.id.button5);
        button_6=(Button)findViewById(R.id.button6);
        button_7=(Button)findViewById(R.id.button7);
        button_8=(Button)findViewById(R.id.button8);
        button_9=(Button)findViewById(R.id.button9);
        button_equal=(Button)findViewById(R.id.button_equal);
        calTextView= (TextView) findViewById(R.id.calTextView);
        button_0.setOnClickListener(this);
        button_1.setOnClickListener(this);
        button_2.setOnClickListener(this);
        button_3.setOnClickListener(this);
        button_4.setOnClickListener(this);
        button_5.setOnClickListener(this);
        button_6.setOnClickListener(this);
        button_7.setOnClickListener(this);
        button_8.setOnClickListener(this);
        button_9.setOnClickListener(this);
        button_equal.setOnClickListener(this);

        calTextView.setOnClickListener(this);


    }


    @Override
    public void onClick(View v) {
         String text =calTextView.getText().toString();


//    if(TextUtils.isEmpty(text)){
//
//        Toast.makeText(getApplicationContext(),"Empty",Toast.LENGTH_SHORT).show();
//
//        }
    //else{
switch (v.getId()){
    case R.id.button0 :
                        calTextView.setText(text+"0");
                       buttonAnimation.Button_Animator(button_0);
                       break;
    case R.id.button1 :calTextView.setText(text+"1");
                         buttonAnimation.Button_Animator(button_1);
                          break;
    case R.id.button2 :calTextView.setText(text+"2");
                         buttonAnimation.Button_Animator(button_2);
                         break;
    case R.id.button3 :calTextView.setText((text+"3"));
                        buttonAnimation.Button_Animator(button_3);
                        break;
    case R.id.button4 :calTextView.setText((text+"4"));
                       buttonAnimation.Button_Animator(button_4);
                        break;
    case R.id.button5 :calTextView.setText(text+"5");
                       buttonAnimation.Button_Animator(button_5);
                          break;
    case R.id.button6 :calTextView.setText((text+"6"));
                          buttonAnimation.Button_Animator(button_6);
                          break;
    case R.id.button7 :calTextView.setText(text+"7");
                         buttonAnimation.Button_Animator(button_7);
                         break;
    case R.id.button8 :calTextView.setText(text+"8");
                        buttonAnimation.Button_Animator(button_8);
        break;
    case R.id.button9 :calTextView.setText(text+"9");
                          buttonAnimation.Button_Animator(button_9);
                          break;
    case R.id.button_equal:i=new Intent(this,FragmentContainerViewClass.class);
        startActivity(i);


                    break;
    case R.id.calTextView:calTextView.setText("");
    default: break;


}




  //  }
   }
}





