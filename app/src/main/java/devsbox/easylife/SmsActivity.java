package devsbox.easylife;

import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CalendarView;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class SmsActivity extends AppCompatActivity {
    EditText sub, company, place, action_edittext;
    CalendarView calender;
    Spinner hour, minute, am;
    Button sendsms;

    CheckBox check_one, check_two, check_three, check_four, check_five, check_six, check_seven, check_eight, check_nine, check_ten,
            check_elaven, check_twelve, check_therteen, check_fourteen;

    int dayy;
    int monthh;
    int yearr;

    List<String> hour_list = new ArrayList<String>();
    List<String> minute_list = new ArrayList<String>();
    List<String> am_list = new ArrayList<String>();
    List<String> action_list = new ArrayList<String>();

    int hour_data = 0;
    int minute_data = 0;
    String am_data = "";
    String action_data = "";

    SharedPreferences shared;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sms);

        sub = (EditText) findViewById(R.id.NameEditText);
        company = (EditText) findViewById(R.id.CompanyEditText);
        place = (EditText) findViewById(R.id.PlaceEditText);
        action_edittext = (EditText) findViewById(R.id.OtherActionEditText);

        calender = (CalendarView) findViewById(R.id.calenderView);

        hour = (Spinner) findViewById(R.id.hourSpinner);
        minute = (Spinner) findViewById(R.id.MinuteSpinner);
        am = (Spinner) findViewById(R.id.AmPmSpinner);
        //    action = (Spinner) findViewById(R.id.ActionSpinner);

        check_one = (CheckBox) findViewById(R.id.ActionCheckBoxOne);
        check_two = (CheckBox) findViewById(R.id.ActionCheckBoxTwo);
        check_three = (CheckBox) findViewById(R.id.ActionCheckBoxThree);
        check_four = (CheckBox) findViewById(R.id.ActionCheckBoxFour);
        check_five = (CheckBox) findViewById(R.id.ActionCheckBoxFive);
        check_six = (CheckBox) findViewById(R.id.ActionCheckBoxSix);
        check_seven = (CheckBox) findViewById(R.id.ActionCheckBoxSeven);
        check_eight = (CheckBox) findViewById(R.id.ActionCheckBoxEight);
        check_nine = (CheckBox) findViewById(R.id.ActionCheckBoxNine);
        check_ten = (CheckBox) findViewById(R.id.ActionCheckBoxTen);

        check_elaven = (CheckBox) findViewById(R.id.ActionCheckBoxElaben);
        check_twelve = (CheckBox) findViewById(R.id.ActionCheckBoxTewelv);
        check_therteen = (CheckBox) findViewById(R.id.ActionCheckBoxTherteen);
        check_fourteen = (CheckBox) findViewById(R.id.ActionCheckBoxFourteen);

        sendsms = (Button) findViewById(R.id.sendButton);


        //////////////for spinner data/////////////////////////////
        hour_list.add("Hour");
        hour_list.add("1");
        hour_list.add("2");
        hour_list.add("3");
        hour_list.add("4");
        hour_list.add("5");
        hour_list.add("6");
        hour_list.add("7");
        hour_list.add("8");
        hour_list.add("9");
        hour_list.add("10");
        hour_list.add("11");
        hour_list.add("12");

        minute_list.add("Minute");
        minute_list.add("00");
        minute_list.add("10");
        minute_list.add("20");
        minute_list.add("30");
        minute_list.add("40");
        minute_list.add("50");

        am_list.add("AM");
        am_list.add("PM");


        /////////////////////////for Hour spinner///////////////////
        ArrayAdapter<String> HourAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, hour_list);

        HourAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        hour.setAdapter(HourAdapter);

        // Spinner item selection Listener
        hour.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View v, int position, long id) {

                switch (position) {
                    case 0:
                        //  hour_data = 0;
                        break;

                    case 1:
                        hour_data = 1;
                        break;

                    case 2:
                        hour_data = 2;
                        break;
                    case 3:
                        hour_data = 3;
                        break;
                    case 4:
                        hour_data = 4;
                        break;
                    case 5:
                        hour_data = 5;
                        break;
                    case 6:
                        hour_data = 6;
                        break;
                    case 7:
                        hour_data = 7;
                        break;
                    case 8:
                        hour_data = 8;
                        break;
                    case 9:
                        hour_data = 9;
                        break;
                    case 10:
                        hour_data = 10;
                        break;
                    case 11:
                        hour_data = 11;
                        break;

                    case 12:
                        hour_data = 12;
                        break;

                    default:
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                Toast.makeText(SmsActivity.this, "You did not select Hour", Toast.LENGTH_LONG).show();
            }
        });


        /////////////////////////for Minute spinner///////////////////
        ArrayAdapter<String> MinuteAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, minute_list);

        MinuteAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        minute.setAdapter(MinuteAdapter);

        // Spinner item selection Listener
        minute.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View v, int position, long id) {

                switch (position) {
                    case 0:
                        //  minute_data = 00;
                        break;

                    case 1:
                        minute_data = 00;
                        break;

                    case 2:
                        minute_data = 10;
                        break;
                    case 3:
                        minute_data = 20;
                        break;
                    case 4:
                        minute_data = 30;
                        break;
                    case 5:
                        minute_data = 40;
                        break;
                    case 6:
                        minute_data = 50;
                        break;


                    default:
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                Toast.makeText(SmsActivity.this, "You did not select Minute", Toast.LENGTH_LONG).show();
            }
        });

        /////////////////////////for AM/PM spinner///////////////////
        ArrayAdapter<String> AmAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, am_list);

        AmAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        am.setAdapter(AmAdapter);

        // Spinner item selection Listener
        am.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View v, int position, long id) {

                switch (position) {
                    case 0:
                        am_data = "AM";
                        break;

                    case 1:
                        am_data = "PM";
                        break;

                    default:
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                Toast.makeText(SmsActivity.this, "You did not select AM / PM", Toast.LENGTH_LONG).show();
            }
        });

   /*     /////////////////////////for Action spinner///////////////////
        ArrayAdapter<String> ActionAdapter = new ArrayAdapter<String>
                (this, android.R.layout.simple_spinner_item, action_list);

        ActionAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        action.setAdapter(ActionAdapter);

        // Spinner item selection Listener
        action.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> parentView, View v, int position, long id) {

                switch (position) {
                    case 0:
                        //
                        break;
                    case 1:
                        action_data = "Master Proposal";
                        break;
                    case 2:
                        action_data = "Media question";
                        break;
                    case 3:
                        action_data = "Event QT";
                        break;
                    case 4:
                        action_data = "PR Offer";
                        break;
                    case 5:
                        action_data = "Power Point Send";
                        break;
                    case 6:
                        action_data = "Radio Offer";
                        break;
                    case 7:
                        action_edittext.setVisibility(View.VISIBLE);
                        action_data = "";
                        break;

                    default:
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                Toast.makeText(SmsActivity.this, "You did not select Action", Toast.LENGTH_LONG).show();
            }
        });*/


///////////////////////////working for calender view/////////////////
        calender.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                dayy = dayOfMonth;
                monthh = month + 1;//add 1 because month count from zero
                yearr = year;
            }
        });


        /*/////////////////////date picker////////////////////////////
        String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
        //tv.setText(currentDateTimeString);
        final String date = currentDateTimeString;
        //   Toast.makeText(SendTvfotejMessageActivity.this, date , Toast.LENGTH_LONG).show();*/





        Intent check = getIntent();
        int check_value = check.getIntExtra("mail_or_sms",0);

        if(check_value==1){

            sendsms.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                    String subdata = sub.getText().toString();
                    String companydata = company.getText().toString();
                    String placedata = place.getText().toString();

                    String actiondata = action_edittext.getText().toString();


                    //////////////////////for CheckBox///////////////////////

                   StringBuilder output = new StringBuilder();

                    if (check_one.isChecked()) {
                        output.append(", MASTER PROPOSAL");
                    }
                    if (check_two.isChecked()) {
                        output.append(", PORTAL PROPOSAL");
                    }
                    if (check_three.isChecked()) {
                        output.append(", ONLINE TV PROPOSAL");
                    }
                    if (check_four.isChecked()) {
                        output.append(", EVENT PROPOSAL");
                    }
                    if (check_five.isChecked()) {
                        output.append(", NEWS COVERAGE");
                    }
                    if (check_six.isChecked()) {
                        output.append(", DOCUMENTARY PRO");
                    }

                    if (check_seven.isChecked()) {
                        output.append(", VDO STILL PROPOSAL");
                    }

                    if (check_eight.isChecked()) {
                        output.append(", PR OFFER SEND");
                    }

                    if (check_nine.isChecked()) {
                        output.append(", POWER POINT SEND");
                    }

                    if (check_ten.isChecked()) {
                        output.append(", MEDIA QT");
                    }

                    if (check_elaven.isChecked()) {
                        output.append(", EVENT QT");
                    }

                    if (check_twelve.isChecked()) {
                        output.append(", BILL TO BE SEND");
                    }

                    if (check_therteen.isChecked()) {
                        output.append(", MEETING @ RAPID PR");
                    }

                    if (check_fourteen.isChecked()) {
                        output.append(", METTING @ CLIENT");
                    }

                    if (subdata.equals("") || companydata.equals("") || placedata.equals("")) {
                        Toast.makeText(getApplicationContext()," Please file up your data",Toast.LENGTH_LONG).show();
                    } else {

                        /*shared = getSharedPreferences("A", Context.MODE_PRIVATE);   // get the sharedpreference set named "A"
                        int psi = shared.getInt("psi", 0);  // get value from key but return 0 if nothing is set*/

                        Log.i("Send email", "");
                        String[] TO = {"Info.rapidpr@gmail.com , ostitto.papa@gmail.com , sishakhor@gmail.com , easylife.rapidpr@gmail.com"};
                        String[] CC = {""};
                        Intent emailIntent = new Intent(Intent.ACTION_SEND);

                        emailIntent.setData(Uri.parse("mailto:"));
                        emailIntent.setType("text/plain");
                        emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
                        emailIntent.putExtra(Intent.EXTRA_CC, CC);
                        emailIntent.putExtra(Intent.EXTRA_SUBJECT, subdata);
                        emailIntent.putExtra(Intent.EXTRA_TEXT, (
                                        companydata + "," +
                                        placedata + "," +
                                        dayy + "-" + monthh + "-" + yearr + "," +
                                        hour_data + "-" + minute_data + " " + am_data + "," +
                                        actiondata + " " + output.toString()));

                        try {
                            startActivity(Intent.createChooser(emailIntent, "Send mail..."));
                            //    finish();
                            Log.i("sending Finished ...", "");
                        } catch (android.content.ActivityNotFoundException ex) {
                            Toast.makeText(SmsActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
                        }
                    }
                }
            });
        }
        else if(check_value==2){

        sendsms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                String subdata = sub.getText().toString();
                String companydata = company.getText().toString();
                String placedata = place.getText().toString();

                String actiondata = action_edittext.getText().toString();


                //////////////////////for CheckBox///////////////////////

                StringBuilder output = new StringBuilder();

                if (check_one.isChecked()) {
                    output.append(", MASTER PROPOSAL");
                }
                if (check_two.isChecked()) {
                    output.append(", PORTAL PROPOSAL");
                }
                if (check_three.isChecked()) {
                    output.append(", ONLINE TV PROPOSAL");
                }
                if (check_four.isChecked()) {
                    output.append(", EVENT PROPOSAL");
                }
                if (check_five.isChecked()) {
                    output.append(", NEWS COVERAGE");
                }
                if (check_six.isChecked()) {
                    output.append(", DOCUMENTARY PRO");
                }

                if (check_seven.isChecked()) {
                    output.append(", VDO STILL PROPOSAL");
                }

                if (check_eight.isChecked()) {
                    output.append(", PR OFFER SEND");
                }

                if (check_nine.isChecked()) {
                    output.append(", POWER POINT SEND");
                }

                if (check_ten.isChecked()) {
                    output.append(", MEDIA QT");
                }

                if (check_elaven.isChecked()) {
                    output.append(", EVENT QT");
                }

                if (check_twelve.isChecked()) {
                    output.append(", BILL TO BE SEND");
                }

                if (check_therteen.isChecked()) {
                    output.append(", MEETING @ RAPID PR");
                }

                if (check_fourteen.isChecked()) {
                    output.append(", METTING @ CLIENT");
                }

                //     Toast.makeText(getApplicationContext(),output.toString(),Toast.LENGTH_LONG).show();

                if (subdata.equals("") || companydata.equals("") || placedata.equals("")) {
                    Toast.makeText(getApplicationContext(), " Please file up your data", Toast.LENGTH_LONG).show();
                } else {

                   /* shared = getSharedPreferences("A", Context.MODE_PRIVATE);   // get the sharedpreference set named "A"
                    int psi = shared.getInt("psi", 0);  // get value from key but return 0 if nothing is set*/


                    String one = "01711425005";
                    String two = "01709955694";
                    String three = "01730012303";
                    String four = "01709955692";
                    Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                    smsIntent.setType("vnd.android-dir/mms-sms");
                    smsIntent.putExtra("address", one+";"+two+";"+three+";"+four );
                    smsIntent.putExtra("sms_body", (
                                    subdata + "," +
                                    companydata + "," +
                                    placedata + "," +
                                    dayy + "-" + monthh + "-" + yearr + "," +
                                    hour_data + "-" + minute_data + " " + am_data + "," +
                                    actiondata + " " + output.toString()));
                    startActivity(smsIntent);


                  Toast.makeText(SmsActivity.this, "Your Message is ready to send", Toast.LENGTH_LONG).show();
                    finish();
                }
            }
        });
        }

    }
}
