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


    TextView MyAppoinment, second, third, four, five, six, seven, eight, nine, ten,
            elaven, twelve, thirteen,fourteen, fifteen, sixteen, seventeen,
            eighteen, nineteen, twenty, twentyOne, twentytwo, twentythree,
            twentyfour, twentyfive, twentysix;

    ImageView mail, sms;
    Dialog mDialog;

    public int psivalue = 0;
    SharedPreferences shared;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyAppoinment = (TextView) findViewById(R.id.MyAppoinmentTextView);
        second = (TextView) findViewById(R.id.SecondTextView);
        third = (TextView) findViewById(R.id.ThirdTextView);
        four = (TextView) findViewById(R.id.FourTextView);
        five = (TextView) findViewById(R.id.FiveTextView);
        six = (TextView) findViewById(R.id.SixTextView);
        seven = (TextView) findViewById(R.id.SevenTextView);
        eight = (TextView) findViewById(R.id.EightTextView);
        nine = (TextView) findViewById(R.id.NineTextView);
        ten = (TextView) findViewById(R.id.TenTextView);
        elaven = (TextView) findViewById(R.id.ElavenTextView);
        twelve = (TextView) findViewById(R.id.twelveTextView);
        thirteen = (TextView) findViewById(R.id.ThirteenTextView);
        fourteen = (TextView) findViewById(R.id.FourteenTextView);
        fifteen = (TextView) findViewById(R.id.FifteenTextView);

        sixteen = (TextView) findViewById(R.id.SixteenTextView);
        seventeen = (TextView) findViewById(R.id.SeventeenTextView);
        eighteen = (TextView) findViewById(R.id.EighteenTextView);
        nineteen = (TextView) findViewById(R.id.NineteenTextView);
        twenty = (TextView) findViewById(R.id.TwentyTextView);
        twentyOne = (TextView) findViewById(R.id.TwentyOneTextView);
        twentytwo = (TextView) findViewById(R.id.twentyTwoTextView);
        twentythree = (TextView) findViewById(R.id.TwentyThreeTextView);
        twentyfour = (TextView) findViewById(R.id.TwentyFourTextView);
        twentyfive = (TextView) findViewById(R.id.TwentyFiveTextView);
        twentysix = (TextView) findViewById(R.id.TwentySixTextView);


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
                Intent in = new Intent(MainActivity.this, SecondActivity.class);
                startActivity(in);
            }
        });

        third.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, ThirdActivity.class);
                startActivity(in);
            }
        });

        four.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, FourthActivity.class);
                startActivity(in);
            }
        });

        five.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, FiveActivity.class);
                startActivity(in);
            }
        });

        six.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, SixActivity.class);
                startActivity(in);
            }
        });

        seven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, SevenActivity.class);
                startActivity(in);
            }
        });

        eight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, EightActivity.class);
                startActivity(in);
            }
        });

        nine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, NineActivity.class);
                startActivity(in);
            }
        });

        ten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, TenActivity.class);
                startActivity(in);
            }
        });

        elaven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, ElavenActavity.class);
                startActivity(in);
            }
        });

        twelve.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, ThirteenTo26Activity.class);
                int identity = 12;
                in.putExtra("identity", identity);
                startActivity(in);
            }
        });

        thirteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent in = new Intent(MainActivity.this, ThirteenTo26Activity.class);
                int identity = 13;
                in.putExtra("identity", identity);
                startActivity(in);
            }
        });

        fourteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, ThirteenTo26Activity.class);
                int identity = 14;
                in.putExtra("identity", identity);
                startActivity(in);
            }
        });

        fifteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, ThirteenTo26Activity.class);
                int identity = 15;
                in.putExtra("identity", identity);
                startActivity(in);
            }
        });

        sixteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, ThirteenTo26Activity.class);
                int identity = 16;
                in.putExtra("identity", identity);
                startActivity(in);
            }
        });

        seventeen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, ThirteenTo26Activity.class);
                int identity = 17;
                in.putExtra("identity", identity);
                startActivity(in);
            }
        });

        eighteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, ThirteenTo26Activity.class);
                int identity = 18;
                in.putExtra("identity", identity);
                startActivity(in);
            }
        });

        nineteen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, ThirteenTo26Activity.class);
                int identity = 19;
                in.putExtra("identity", identity);
                startActivity(in);
            }
        });

        twenty.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, ThirteenTo26Activity.class);
                int identity = 20;
                in.putExtra("identity", identity);
                startActivity(in);
            }
        });

        twentyOne.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, ThirteenTo26Activity.class);
                int identity = 21;
                in.putExtra("identity", identity);
                startActivity(in);
            }
        });

        twentytwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, ThirteenTo26Activity.class);
                int identity = 22;
                in.putExtra("identity", identity);
                startActivity(in);
            }
        });

        twentythree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, ThirteenTo26Activity.class);
                int identity = 23;
                in.putExtra("identity", identity);
                startActivity(in);
            }
        });

        twentyfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, ThirteenTo26Activity.class);
                int identity = 24;
                in.putExtra("identity", identity);
                startActivity(in);
            }
        });

        twentyfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, ThirteenTo26Activity.class);
                int identity = 25;
                in.putExtra("identity", identity);
                startActivity(in);
            }
        });

        twentysix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(MainActivity.this, ThirteenTo26Activity.class);
                int identity = 26;
                in.putExtra("identity", identity);
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
                psivalue = psivalue + 1;
                editor.putInt("psi", psivalue);
                editor.commit(); // commit it when you are done.

                Intent in = new Intent(MainActivity.this, SmsActivity.class);
                //  int int_value = 1;
                in.putExtra("mail_or_sms", 1);
                startActivity(in);
            }
        });

        sms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                ////////////SharedPreferences///////////////
                psivalue = psivalue + 1;
                editor.putInt("psi", psivalue);
                editor.commit(); // commit it when you are done.

                Intent in = new Intent(MainActivity.this, SmsActivity.class);
                in.putExtra("mail_or_sms", 2);
                startActivity(in);
            }
        });

    }

}
