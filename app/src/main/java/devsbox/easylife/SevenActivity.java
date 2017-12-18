package devsbox.easylife;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class SevenActivity extends AppCompatActivity {

    EditText ed ,edzero, edone , edtwo , edthree , edfour, edfive , edsix , edseven , edeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seven);
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

        Button send = (Button) findViewById(R.id.ThirdSendButton);


        send.setOnClickListener(new View.OnClickListener() {
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


                if(one.equals("")){
                    Toast.makeText(SevenActivity.this, "Please file-up first field", Toast.LENGTH_SHORT).show();
                }else{
                    /*Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", one+";"+two+";"+three+";"+four+";"+five+";"+six+";"+seven+";"+eight+";"+nine+";"+ten);
                    smsIntent.putExtra("sms_body","দেশের যে কোন ভেন্যুতে যে কোন ধরনের ইভেন্ট সফলভাবে আয়োজনের জন্য র\u200C্যাপিড পিআর ।\n01730012307\n01709955694\n01709955692 \n info.rapidpr@gmail.com");
                    startActivity(smsIntent);*/

                    Intent smsIntent = new Intent(Intent.ACTION_SENDTO);
                    smsIntent.setData(Uri.parse("smsto:" + Uri.encode(one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven + ";" + eight + ";" + nine + ";" + ten)));
                    smsIntent.putExtra("sms_body","দেশের যে কোন ভেন্যুতে যে কোন ধরনের ইভেন্ট সফলভাবে আয়োজনের জন্য র\u200C্যাপিড পিআর ।\n01730012307\n01709955694\n01709955692 \n info.rapidpr@gmail.com");
                    startActivity(smsIntent);

                    Toast.makeText(SevenActivity.this, "Your Message is ready to send", Toast.LENGTH_LONG).show();
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
