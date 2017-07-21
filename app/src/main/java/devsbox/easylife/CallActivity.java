package devsbox.easylife;

import android.content.Context;
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
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CallActivity extends AppCompatActivity {

    EditText sub, company, place, action_edittext;
    CalendarView calender;
    Spinner hour, minute, am, action;
    Button sendsms;

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
        setContentView(R.layout.activity_call);

        sub = (EditText) findViewById(R.id.NameEditText);
        company = (EditText) findViewById(R.id.CompanyEditText);
        place = (EditText) findViewById(R.id.PlaceEditText);
        action_edittext = (EditText) findViewById(R.id.OtherActionEditText);

        calender = (CalendarView) findViewById(R.id.calenderView);

        hour = (Spinner) findViewById(R.id.hourSpinner);
        minute = (Spinner) findViewById(R.id.MinuteSpinner);
        am = (Spinner) findViewById(R.id.AmPmSpinner);
        action = (Spinner) findViewById(R.id.ActionSpinner);

        sendsms = (Button) findViewById(R.id.sendButton);


        //////////////for spinner data/////////////////////////////
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

        minute_list.add("00");
        minute_list.add("10");
        minute_list.add("20");
        minute_list.add("30");
        minute_list.add("40");
        minute_list.add("50");

        am_list.add("AM");
        am_list.add("PM");

        action_list.add("Master Proposal");
        action_list.add("Media question");
        action_list.add("Event QT");
        action_list.add("PR Offer");
        action_list.add("Power Point Send");
        action_list.add("Radio Offer");
        action_list.add("Other");

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
                        hour_data = 1;
                        break;

                    case 1:
                        hour_data = 2;
                        break;

                    case 2:
                        hour_data = 3;
                        break;
                    case 3:
                        hour_data = 4;
                        break;
                    case 4:
                        hour_data = 5;
                        break;
                    case 5:
                        hour_data = 6;
                        break;
                    case 6:
                        hour_data = 7;
                        break;
                    case 7:
                        hour_data = 8;
                        break;
                    case 8:
                        hour_data = 9;
                        break;
                    case 9:
                        hour_data = 10;
                        break;
                    case 10:
                        hour_data = 11;
                        break;
                    case 11:
                        hour_data = 12;
                        break;

                    default:
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                Toast.makeText(CallActivity.this, "You did not select Hour", Toast.LENGTH_LONG).show();
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
                        minute_data = 00;
                        break;

                    case 1:
                        minute_data = 10;
                        break;

                    case 2:
                        minute_data = 20;
                        break;
                    case 3:
                        minute_data = 30;
                        break;
                    case 4:
                        minute_data = 40;
                        break;
                    case 5:
                        minute_data = 50;
                        break;


                    default:
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                Toast.makeText(CallActivity.this, "You did not select Minute", Toast.LENGTH_LONG).show();
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
                Toast.makeText(CallActivity.this, "You did not select AM / PM", Toast.LENGTH_LONG).show();
            }
        });

        /////////////////////////for Action spinner///////////////////
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
                        action_data = "Master Proposal";
                        break;
                    case 1:
                        action_data = "Media question";
                        break;
                    case 2:
                        action_data = "Event QT";
                        break;
                    case 3:
                        action_data = "PR Offer";
                        break;
                    case 4:
                        action_data = "Power Point Send";
                        break;
                    case 5:
                        action_data = "Radio Offer";
                        break;
                    case 6:
                        action_edittext.setVisibility(View.VISIBLE);
                        break;

                    default:
                        break;

                }
            }

            @Override
            public void onNothingSelected(AdapterView<?> parentView) {
                Toast.makeText(CallActivity.this, "You did not select Action", Toast.LENGTH_LONG).show();
            }
        });


///////////////////////////working for calender view/////////////////
        calender.setOnDateChangeListener(new CalendarView.OnDateChangeListener() {
            @Override
            public void onSelectedDayChange(@NonNull CalendarView view, int year, int month, int dayOfMonth) {
                dayy = dayOfMonth;
                monthh = month + 1;//add 1 because month count from zero
                yearr = year;
            }
        });


        /////////////////////date and time picker////////////////////////////
        String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
        //tv.setText(currentDateTimeString);
        final String date = currentDateTimeString;
        //   Toast.makeText(SendTvfotejMessageActivity.this, date , Toast.LENGTH_LONG).show();

        sendsms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                String subdata = sub.getText().toString();
                String companydata = company.getText().toString();
                String placedata = place.getText().toString();

                String actiondata = action_edittext.getText().toString();

                shared = getSharedPreferences("A", Context.MODE_PRIVATE);   // get the sharedpreference set named "A"
                float psi = shared.getInt("psi", 0);  // get value from key but return 0 if nothing is set

                Log.i("Send email", "");
                String[] TO = {"Info.rapidpr@gmail.com , ostitto.papa@gmail.com , sishakhor@gmail.com"};
                String[] CC = {""};
                Intent emailIntent = new Intent(Intent.ACTION_SEND);

                emailIntent.setData(Uri.parse("mailto:"));
                emailIntent.setType("text/plain");
                emailIntent.putExtra(Intent.EXTRA_EMAIL, TO);
                emailIntent.putExtra(Intent.EXTRA_CC, CC);
                emailIntent.putExtra(Intent.EXTRA_SUBJECT, subdata+" এর সাথে মিটিং ");
                emailIntent.putExtra(Intent.EXTRA_TEXT, (
                        "RSN :"+psi+"\n\n"+
                                "Company :"+companydata+"\n\n"+
                                "Place :"+placedata+"\n\n"+
                                "Meeting Date :" + dayy + "-" + monthh + "-" + yearr+"\n\n"+
                                "Meeting Time :" + hour_data +"-"+minute_data+"-"+am_data+"\n\n"+
                                "Action :"+action_data+ " " +actiondata+"\n\n"+
                                "Sending Date :"+date));

                try {
                    startActivity(Intent.createChooser(emailIntent, "Send mail..."));
                    //    finish();
                    Log.i("sending Finished ...", "");
                } catch (android.content.ActivityNotFoundException ex) {
                    Toast.makeText(CallActivity.this, "There is no email client installed.", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }
}
