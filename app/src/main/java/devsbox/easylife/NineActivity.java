package devsbox.easylife;

import android.Manifest;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NineActivity extends AppCompatActivity {


    EditText ed, edzero, edone, edtwo, edthree, edfour, edfive, edsix, edseven, edeight;
    public final int PICK_CONTACT = 1;
    public final int PICK_CONTACTTwo = 2;
    public final int PICK_CONTACTThree = 3;
    public final int PICK_CONTACTFour = 4;
    public final int PICK_CONTACTFive = 5;
    public final int PICK_CONTACTSix = 6;
    public final int PICK_CONTACTSeven = 7;
    public final int PICK_CONTACTEight = 8;
    public final int PICK_CONTACTNine = 9;
    public final int PICK_CONTACTTen = 10;

    Button BTone, Bttwo, btthree, btfour, btfive, btsix, btseven, bteight, btnine, btten;
    Button send;
    TextView tvone;
    String data_phone = "";
    String data_phoneTwo = "";
    String data_phonethree = "";
    String data_phonefour = "";
    String data_phonefive = "";
    String data_phonesix = "";
    String data_phoneseven = "";
    String data_phoneeight = "";
    String data_phonenine = "";
    String data_phoneten = "";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nine);
        takePermission();

        ed = (EditText) findViewById(R.id.ThirdPhonEditText);
        //  ed = (EditText) findViewById(R.id.ThirdPhonEditTextzero);
        edzero = (EditText) findViewById(R.id.ThirdPhonEditTextzero);
        edone = (EditText) findViewById(R.id.ThirdPhonEditTextOne);
        edtwo = (EditText) findViewById(R.id.ThirdPhonEditTextTwo);
        edthree = (EditText) findViewById(R.id.ThirdPhonEditTextThree);
        edfour = (EditText) findViewById(R.id.ThirdPhonEditTextFour);
        edfive = (EditText) findViewById(R.id.ThirdPhonEditTextFive);
        edsix = (EditText) findViewById(R.id.ThirdPhonEditTextsix);
        edseven = (EditText) findViewById(R.id.ThirdPhonEditTextseven);
        edeight = (EditText) findViewById(R.id.ThirdPhonEditTextEight);

        send = (Button) findViewById(R.id.ThirdSendButton);
        BTone = (Button) findViewById(R.id.ButtonOne);
        Bttwo = (Button) findViewById(R.id.NumberButtonTwo);
        btthree = (Button) findViewById(R.id.NumberButtonThree);
        btfour = (Button) findViewById(R.id.NumberButtonFour);
        btfive = (Button) findViewById(R.id.NumberButtonFive);
        btsix = (Button) findViewById(R.id.NumberButtonSix);
        btseven = (Button) findViewById(R.id.NumberButtonSeven);
        bteight = (Button) findViewById(R.id.NumberButtonEight);
        btnine = (Button) findViewById(R.id.NumberButtonNine);
        btten = (Button) findViewById(R.id.NumberButtonTen);

        //tvone = (TextView) findViewById(R.id.TVone);

        BTone.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_PICK, ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
                startActivityForResult(i, PICK_CONTACT);


            }
        });

        Bttwo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_PICK, ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
                startActivityForResult(i, PICK_CONTACTTwo);


            }
        });

        btthree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_PICK, ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
                startActivityForResult(i, PICK_CONTACTThree);


            }
        });

        btfour.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_PICK, ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
                startActivityForResult(i, PICK_CONTACTFour);


            }
        });

        btfive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_PICK, ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
                startActivityForResult(i, PICK_CONTACTFive);


            }
        });

        btsix.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_PICK, ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
                startActivityForResult(i, PICK_CONTACTSix);


            }
        });

        btseven.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_PICK, ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
                startActivityForResult(i, PICK_CONTACTSeven);


            }
        });

        bteight.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_PICK, ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
                startActivityForResult(i, PICK_CONTACTEight);


            }
        });

        btnine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_PICK, ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
                startActivityForResult(i, PICK_CONTACTNine);


            }
        });

        btten.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_PICK, ContactsContract.CommonDataKinds.Phone.CONTENT_URI);
                startActivityForResult(i, PICK_CONTACTTen);


            }
        });
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == PICK_CONTACT && resultCode == RESULT_OK) {
            Uri contactUri = data.getData();
            Cursor cursor = getContentResolver().query(contactUri, null, null, null, null);
            cursor.moveToFirst();
            int column = cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);

            data_phone = cursor.getString(column);

            if(data_phone.isEmpty()){
                //do nothing
            }else{
                BTone.setBackgroundColor(Color.RED);
                ed.setVisibility(View.INVISIBLE);
                BTone.setText("OK");
                BTone.setTextColor(Color.BLUE);
            }

        } else if (requestCode == PICK_CONTACTTwo && resultCode == RESULT_OK) {

            Uri contactUri = data.getData();
            Cursor cursor = getContentResolver().query(contactUri, null, null, null, null);
            cursor.moveToFirst();
            int columnTwo = cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);
            data_phoneTwo = cursor.getString(columnTwo);

            if(data_phoneTwo.isEmpty()){
                //do nothing
            }else{
                Bttwo.setBackgroundColor(Color.RED);
                edzero.setVisibility(View.INVISIBLE);
                Bttwo.setText("OK");
                Bttwo.setTextColor(Color.BLUE);
            }

        }else if (requestCode == PICK_CONTACTThree && resultCode == RESULT_OK) {

            Uri contactUri = data.getData();
            Cursor cursor = getContentResolver().query(contactUri, null, null, null, null);
            cursor.moveToFirst();
            int columnTwo = cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);
            data_phonethree = cursor.getString(columnTwo);

            if(data_phonethree.isEmpty()){
                //do nothing
            }else{
                btthree.setBackgroundColor(Color.RED);
                edone.setVisibility(View.INVISIBLE);
                btthree.setText("OK");
                btthree.setTextColor(Color.BLUE);
            }

        }else if (requestCode == PICK_CONTACTFour && resultCode == RESULT_OK) {

            Uri contactUri = data.getData();
            Cursor cursor = getContentResolver().query(contactUri, null, null, null, null);
            cursor.moveToFirst();
            int columnTwo = cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);
            data_phonefour = cursor.getString(columnTwo);

            if(data_phonefour.isEmpty()){
                //do nothing
            }else{
                btfour.setBackgroundColor(Color.RED);
                edtwo.setVisibility(View.INVISIBLE);
                btfour.setText("OK");
                btfour.setTextColor(Color.BLUE);
            }


        }else if (requestCode == PICK_CONTACTFive && resultCode == RESULT_OK) {

            Uri contactUri = data.getData();
            Cursor cursor = getContentResolver().query(contactUri, null, null, null, null);
            cursor.moveToFirst();
            int columnTwo = cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);
            data_phonefive = cursor.getString(columnTwo);

            if(data_phonefive.isEmpty()){
                //do nothing
            }else{
                btfive.setBackgroundColor(Color.RED);
                edthree.setVisibility(View.INVISIBLE);
                btfive.setText("OK");
                btfive.setTextColor(Color.BLUE);
            }


        }else if (requestCode == PICK_CONTACTSix && resultCode == RESULT_OK) {

            Uri contactUri = data.getData();
            Cursor cursor = getContentResolver().query(contactUri, null, null, null, null);
            cursor.moveToFirst();
            int columnTwo = cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);
            data_phonesix = cursor.getString(columnTwo);

            if(data_phonesix.isEmpty()){
                //do nothing
            }else{
                btsix.setBackgroundColor(Color.RED);
                edfour.setVisibility(View.INVISIBLE);
                btsix.setText("OK");
                btsix.setTextColor(Color.BLUE);
            }


        }else if (requestCode == PICK_CONTACTSeven && resultCode == RESULT_OK) {

            Uri contactUri = data.getData();
            Cursor cursor = getContentResolver().query(contactUri, null, null, null, null);
            cursor.moveToFirst();
            int columnTwo = cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);
            data_phoneseven = cursor.getString(columnTwo);

            if(data_phoneseven.isEmpty()){
                //do nothing
            }else{
                btseven.setBackgroundColor(Color.RED);
                edfive.setVisibility(View.INVISIBLE);
                btseven.setText("OK");
                btseven.setTextColor(Color.BLUE);
            }


        }else if (requestCode == PICK_CONTACTEight && resultCode == RESULT_OK) {

            Uri contactUri = data.getData();
            Cursor cursor = getContentResolver().query(contactUri, null, null, null, null);
            cursor.moveToFirst();
            int columnTwo = cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);
            data_phoneeight = cursor.getString(columnTwo);

            if(data_phoneeight.isEmpty()){
                //do nothing
            }else{
                bteight.setBackgroundColor(Color.RED);
                edsix.setVisibility(View.INVISIBLE);
                bteight.setText("OK");
                bteight.setTextColor(Color.BLUE);
            }

        }else if (requestCode == PICK_CONTACTNine && resultCode == RESULT_OK) {

            Uri contactUri = data.getData();
            Cursor cursor = getContentResolver().query(contactUri, null, null, null, null);
            cursor.moveToFirst();
            int columnTwo = cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);
            data_phonenine = cursor.getString(columnTwo);

            if(data_phonenine.isEmpty()){
                //do nothing
            }else{
                btnine.setBackgroundColor(Color.RED);
                edseven.setVisibility(View.INVISIBLE);
                btnine.setText("OK");
                btnine.setTextColor(Color.BLUE);
            }

        }else if (requestCode == PICK_CONTACTTen && resultCode == RESULT_OK) {

            Uri contactUri = data.getData();
            Cursor cursor = getContentResolver().query(contactUri, null, null, null, null);
            cursor.moveToFirst();
            int columnTwo = cursor.getColumnIndex(ContactsContract.CommonDataKinds.Phone.NUMBER);
            data_phoneten = cursor.getString(columnTwo);

            if(data_phoneten.isEmpty()){
                //do nothing
            }else{
                btten.setBackgroundColor(Color.RED);
                edeight.setVisibility(View.INVISIBLE);
                btten.setText("OK");
                btten.setTextColor(Color.BLUE);
            }

        }

        send.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

              /*  onActivityResult( requestCode,  resultCode, null);
                Toast.makeText(ThirdActivity.this, (cursor.getString(column)).this.onActi ,Toast.LENGTH_LONG).show();*/

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


                /*Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                smsIntent.setType("vnd.android-dir/mms-sms");
                smsIntent.putExtra("address", one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven + ";" + eight + ";" + nine + ";" + ten + ";" + data_phone + ";" + data_phoneTwo
                        + ";" + data_phonethree+ ";" + data_phonefour+ ";" + data_phonefive+ ";" + data_phonesix+ ";" + data_phoneseven+ ";" + data_phoneeight+ ";" + data_phonenine+ ";" + data_phoneten);
                smsIntent.putExtra("sms_body", "জরুরী বিষয় নিয়ে কথা বলতে চাই।ফ্রি হলে প্লিজ একটু কল দিবেন। শেখর, র\u200D্যাপিড পিআর, 01711425005");
                startActivity(smsIntent);*/

                Intent smsIntent = new Intent(Intent.ACTION_SENDTO);
                smsIntent.setData(Uri.parse("smsto:" + Uri.encode(one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven + ";" + eight + ";" + nine + ";" + ten + ";" + data_phone + ";" + data_phoneTwo
                        + ";" + data_phonethree+ ";" + data_phonefour+ ";" + data_phonefive+ ";" + data_phonesix+ ";" + data_phoneseven+ ";" + data_phoneeight+ ";" + data_phonenine+ ";" + data_phoneten)));
                smsIntent.putExtra("sms_body","বিজয় দিবস গ্র্যান্ড র\u200D্যালী-২০১৭ অনলাইন রেজিস্ট্রেশন করতে নিচের লিঙ্ক-এ ক্লিক করুন ।\n" +
                        "https://goo.gl/sU8ay3\n" +
                        "বিস্তারিত জানতেঃ 01730012303, 01730012307");
                startActivity(smsIntent);

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
