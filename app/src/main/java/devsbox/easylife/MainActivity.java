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
    TextView second;
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
