package devsbox.easylife;

import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    ImageView MyAppoinment;
    TextView second , third , four ,five ,six,seven,eight , nine , ten;
    ImageView mail, sms;
    Dialog mDialog;

    public int psivalue=0;
    SharedPreferences shared;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        MyAppoinment = (ImageView) findViewById(R.id.MyAppoinmentTextView);
        second = (TextView) findViewById(R.id.SecondTextView);
        third = (TextView) findViewById(R.id.ThirdTextView);
        four = (TextView) findViewById(R.id.FourTextView);
        five = (TextView) findViewById(R.id.FiveTextView);
        six = (TextView) findViewById(R.id.SixTextView);
        seven = (TextView) findViewById(R.id.SevenTextView);
        eight = (TextView) findViewById(R.id.EightTextView);
        nine = (TextView) findViewById(R.id.NineTextView);
        ten = (TextView) findViewById(R.id.TenTextView);


        MyAppoinment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                pop();
                mDialog.show();
            }
        });


        second.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,SecondActivity.class);
                startActivity(in);
            }
        });

        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,ThirdActivity.class);
                startActivity(in);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,FourthActivity.class);
                startActivity(in);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,FiveActivity.class);
                startActivity(in);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,SixActivity.class);
                startActivity(in);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,SevenActivity.class);
                startActivity(in);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,EightActivity.class);
                startActivity(in);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,NineActivity.class);
                startActivity(in);
            }
        });

        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this,TenActivity.class);
                startActivity(in);
            }
        });
    }

    public void pop() {

        mDialog = new Dialog(MainActivity.this);
        mDialog.requestWindowFeature(Window.FEATURE_NO_TITLE);
        mDialog.setContentView(R.layout.popuap_new);

        mail = (ImageView) mDialog.findViewById(R.id.imageViewCall);
        sms = (ImageView) mDialog.findViewById(R.id.imageViewSms);


        shared = getSharedPreferences("A", Context.MODE_PRIVATE); // get the set of Preferences labeled "A"
        final SharedPreferences.Editor editor = shared.edit();


        mail.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ////////////SharedPreferences///////////////
                psivalue = psivalue+1;
                editor.putInt("psi", psivalue);
                editor.commit(); // commit it when you are done.

                Intent in = new Intent(MainActivity.this , SmsActivity.class);
              //  int int_value = 1;
                in.putExtra("mail_or_sms",1);
                startActivity(in);
            }
        });

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ////////////SharedPreferences///////////////
                psivalue = psivalue+1;
                editor.putInt("psi", psivalue);
                editor.commit(); // commit it when you are done.

                Intent in = new Intent(MainActivity.this , SmsActivity.class);
                in.putExtra("mail_or_sms",2);
                startActivity(in);
            }
        });

    }

}
