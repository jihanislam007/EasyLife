package devsbox.easylife;

import android.Manifest;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class TenActivity extends AppCompatActivity {

    CalendarView calender;
    CheckBox check_one, check_two;
    EditText ed ,edzero, edone , edtwo , edthree , edfour, edfive , edsix , edseven , edeight;
    Button sendsms;

    int dayy;
    int monthh;
    int yearr;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ten);
        takePermission();

        ed = (EditText) findViewById(R.id.ThirdPhonEditText);
        edzero = (EditText) findViewById(R.id.ThirdPhonEditTextzero);
        edone = (EditText) findViewById(R.id.ThirdPhonEditTextOne);
        edtwo = (EditText) findViewById(R.id.ThirdPhonEditTextTwo);
        edthree = (EditText) findViewById(R.id.ThirdPhonEditTextThree);
        edfour = (EditText) findViewById(R.id.ThirdPhonEditTextFour);
        edfive = (EditText) findViewById(R.id.ThirdPhonEditTextFive);
        edsix = (EditText) findViewById(R.id.ThirdPhonEditTextsix);
        edseven = (EditText) findViewById(R.id.ThirdPhonEditTextseven);
        edeight = (EditText) findViewById(R.id.ThirdPhonEditTextEight);

        calender = (CalendarView) findViewById(R.id.calenderView);

        check_one = (CheckBox) findViewById(R.id.ActionCheckBoxOne);
        check_two = (CheckBox) findViewById(R.id.ActionCheckBoxTwo);

        sendsms = (Button) findViewById(R.id.ThirdSendButton);

        ///////////////////////////working for calender view/////////////////
        calender.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                dayy = dayOfMonth;
                monthh = month + 1;//add 1 because month count from zero
                yearr = year;
            }
        });



        sendsms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String one = ed.getText().toString();
                String two = edzero.getText().toString();
                String three = edone.getText().toString();
                String four = edtwo.getText().toString();
                String five = edthree.getText().toString();
                String six = edfour.getText().toString();
                String seven = edfive.getText().toString();
                String eight = edsix.getText().toString();
                String nine = edseven.getText().toString();
                String ten = edeight.getText().toString();

                //////////////////////for CheckBox///////////////////////

                StringBuilder output = new StringBuilder();

                if (check_one.isChecked()) {
                    output.append(", সকাল ৯ টায় ");
                }
                if (check_two.isChecked()) {
                    output.append(", বিকেল ৩ টায় ");
                }


                if(one.equals("")){
                    Toast.makeText(TenActivity.this, "Please file-up first field", Toast.LENGTH_SHORT).show();
                }else{
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", one+";"+two+";"+three+";"+four+";"+five+";"+six+";"+seven+";"+eight+";"+nine+";"+ten);
                    smsIntent.putExtra("sms_body","আগামী "+ dayy + "-" + monthh + "-" + yearr +"ইং তারিখে"+output.toString()+" র\u200C্যাপিড পিআর এ আপনার জব ইন্টারভিউ ।" +
                            "সম্পূর্ণ সিভি , ছবি ও সার্টিফিকেট সাথে নিয়ে আসবেন । বিস্তারিত : 01730012307");
                    startActivity(smsIntent);

                    Toast.makeText(TenActivity.this, "Your Message is ready to send", Toast.LENGTH_LONG).show();
                    finish();
                }

            }
        });
    }

    private void takePermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(new String[]{
                    /*Manifest.permission.READ_EXTERNAL_STORAGE,
                    Manifest.permission.WRITE_EXTERNAL_STORAGE,*/
                    Manifest.permission.CALL_PHONE,
                    Manifest.permission.SEND_SMS
            }, 1);
        }
    }
}
