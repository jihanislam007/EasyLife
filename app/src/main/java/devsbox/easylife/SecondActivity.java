package devsbox.easylife;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class SecondActivity extends AppCompatActivity {

    CheckBox mr , mrs;
    EditText name , phone , ph_two , ph_three ,ph_four , ph_five ;
    Button send;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        mr = (CheckBox) findViewById(R.id.ActionCheckBoxMR);
        mrs = (CheckBox) findViewById(R.id.ActionCheckBoxMRS);

        name = (EditText) findViewById(R.id.SecondNameEditText);
        phone = (EditText) findViewById(R.id.SecondPhonEditTextOne);
/*
        ph_two = (EditText) findViewById(R.id.SecondPhonEditTextTwo);
        ph_three = (EditText) findViewById(R.id.SecondPhonEditTextThree);
        ph_four = (EditText) findViewById(R.id.SecondPhonEditTextFour);
        ph_five = (EditText) findViewById(R.id.SecondPhonEditTextFive);*/

        send = (Button) findViewById(R.id.SecondSendButton);




        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String namedata = name.getText().toString();
                String phonedata = phone.getText().toString();

               /* String ph_twodata = ph_two.getText().toString();
                String ph_threedata = ph_three.getText().toString();
                String ph_fourdata = ph_four.getText().toString();
                String ph_fivedata = ph_five.getText().toString();*/

               /* String phNotwo = ";"+ph_twodata;
                String phNothree = ";"+ph_threedata;
                String phNofour = ";"+ph_fourdata;
                String phNofive = ";"+ph_fivedata;
                Toast.makeText(SecondActivity.this, phonedata+";"+ph_twodata+";"+ph_threedata+";"+ph_fourdata+";"+ph_fivedata, Toast.LENGTH_LONG).show();
                Toast.makeText(SecondActivity.this,phonedata+phNotwo+phNothree+phNofour+phNofive , Toast.LENGTH_LONG).show();
               */ //////////////////////for CheckBox///////////////////////

              StringBuilder output = new StringBuilder();

                if (mr.isChecked()) {
                    output.append("Mr. ");
                }
                else if (mrs.isChecked()) {
                    output.append("Mrs. ");
                }

                if (namedata.equals("") || phonedata.equals("") || (output.toString()).isEmpty()) {
                    Toast.makeText(getApplicationContext(), " Please file up your data", Toast.LENGTH_LONG).show();
                } else {
                    //
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", phonedata);
                    smsIntent.putExtra("sms_body",output.toString()+ namedata + "," + " Rapid PR is first Digital Media archive & Event Management firm in Bangladesh. To increase your business promotion, any event or any media support please feel free to contact with us. " +
                            "\nRegards. Shahidul Islam Shakhor. \n01730012300, \ninfo.rapidpr@gmail.com, \nwww.rapidpr-bd.com");
                    startActivity(smsIntent);

                               Toast.makeText(SecondActivity.this, "Your Message is ready to send", Toast.LENGTH_LONG).show();
                    finish();
                }
            }
        });
    }
}
