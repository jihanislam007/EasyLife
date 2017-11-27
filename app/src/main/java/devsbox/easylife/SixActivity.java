package devsbox.easylife;

import android.Manifest;
import android.content.Intent;
import android.database.Cursor;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Toast;

public class SixActivity extends AppCompatActivity {

    CheckBox check_one, check_two, check_three, check_four, check_five;
    EditText ed ,edzero, edone , edtwo , edthree , edfour, edfive , edsix , edseven , edeight;
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
        setContentView(R.layout.activity_six);
        takePermission();

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


                Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                smsIntent.setType("vnd.android-dir/mms-sms");
                smsIntent.putExtra("address", one+";"+two+";"+three+";"+four+";"+five+";"+six+";"+seven+";"+eight+";"+nine+";"+ten+ ";" + data_phone + ";" + data_phoneTwo
                        + ";" + data_phonethree+ ";" + data_phonefour+ ";" + data_phonefive+ ";" + data_phonesix+ ";" + data_phoneseven+ ";" + data_phoneeight+ ";" + data_phonenine+ ";" + data_phoneten);
                smsIntent.putExtra("sms_body","শুভ হোক আপনার প্রতিটি দিন। আনন্দ ঝলমল হোক প্রতিটি মুহূর্ত। এই শুভ কামনায় RAPID PR এর পক্ষ থেকে "+output.toString()  +
                        "\nখন্দকার শহীদুল ইসলাম শেখর,01730012300,info.rapidpr@gmail.com");
                startActivity(smsIntent);

                Toast.makeText(SixActivity.this, "Your Message is ready to send", Toast.LENGTH_LONG).show();
                finish();

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
