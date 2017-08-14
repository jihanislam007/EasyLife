package devsbox.easylife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class SixActivity extends AppCompatActivity {
    CheckBox check_one, check_two, check_three, check_four, check_five;
    EditText ed ,edzero, edone , edtwo , edthree , edfour, edfive , edsix , edseven , edeight;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_six);

        check_one = (CheckBox) findViewById(R.id.ActionCheckBoxOne);
        check_two = (CheckBox) findViewById(R.id.ActionCheckBoxTwo);
        check_three = (CheckBox) findViewById(R.id.ActionCheckBoxThree);
        check_four = (CheckBox) findViewById(R.id.ActionCheckBoxFour);
        check_five = (CheckBox) findViewById(R.id.ActionCheckBoxFive);

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

                //////////////////////for CheckBox///////////////////////

                StringBuilder output = new StringBuilder();

                if (check_one.isChecked()) {
                    output.append("নববর্ষের শুভেচ্ছা ।");
                }
                else if (check_two.isChecked()) {
                    output.append("ঈদ মোবারক ।");
                }
                else if (check_three.isChecked()) {
                    output.append("শারদীয় শুভেচ্ছা ।");
                }
                else if (check_four.isChecked()) {
                    output.append("শুভ জন্মদিন ।");
                }
                else if (check_five.isChecked()) {
                    output.append("শুভ বিবাহ বার্ষিকী ।");
                }


                if(one.equals("")){
                    Toast.makeText(SixActivity.this, "Please file-up first field", Toast.LENGTH_SHORT).show();
                }else{
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", one+";"+two+";"+three+";"+four+";"+five+";"+six+";"+seven+";"+eight+";"+nine+";"+ten);
                    smsIntent.putExtra("sms_body","শুভ হোক আপনার প্রতিটি দিন। আনন্দ ঝলমল হোক প্রতিটি মুহূর্ত। এই শুভ কামনায় RAPID PR এর পক্ষ থেকে "+output.toString()  +
                            "\nখন্দকার শহীদুল ইসলাম শেখর,01730012300,info.rapidpr@gmail.com");
                    startActivity(smsIntent);

                    Toast.makeText(SixActivity.this, "Your Message is ready to send", Toast.LENGTH_LONG).show();
                    finish();
                }

            }
        });
    }
}
