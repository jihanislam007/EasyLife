package devsbox.easylife;

import android.Manifest;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class ThirteenTo26Activity extends AppCompatActivity {

    EditText ed, edzero, edone, edtwo, edthree, edfour, edfive, edsix, edseven, edeight;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_thirteento26);

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

                Intent in = getIntent();
                final int identityValue = in.getIntExtra("identity", 0);

                if (identityValue == 12) {

                    if (one.equals("")) {
                        Toast.makeText(ThirteenTo26Activity.this, "Please file-up first field", Toast.LENGTH_SHORT).show();
                    } else {
                        /*Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                        smsIntent.setType("vnd.android-dir/mms-sms");
                        smsIntent.putExtra("address", one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven + ";" + eight + ";" + nine + ";" + ten);
                        smsIntent.putExtra("sms_body", "সারা বিশ্বব্যাপী আপনার পন্যের প্রচারের জন্য RPR TV তে বিজ্ঞাপন দিন। ৩০ সেকেন্ডের একটি বিজ্ঞাপন  ১৪৪০ বার প্রচার করতে খরচ মাত্র ২০,০০০ টাকা।\n" +
                                "বিস্তারিত : 01730012307");
                        startActivity(smsIntent);*/

                        Intent smsIntent = new Intent(Intent.ACTION_SENDTO);
                        smsIntent.setData(Uri.parse("smsto:" + Uri.encode(one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven + ";" + eight + ";" + nine + ";" + ten)));
                        smsIntent.putExtra("sms_body", "সারা বিশ্বব্যাপী আপনার পন্যের প্রচারের জন্য RPR TV তে বিজ্ঞাপন দিন। ৩০ সেকেন্ডের একটি বিজ্ঞাপন  ১৪৪০ বার প্রচার করতে খরচ মাত্র ২০,০০০ টাকা।\n" +
                                "বিস্তারিত : 01730012307");
                        startActivity(smsIntent);

                        Toast.makeText(ThirteenTo26Activity.this, "Your Message is ready to send", Toast.LENGTH_LONG).show();
                        finish();
                    }
                } else if (identityValue == 13) {
                    if (one.equals("")) {
                        Toast.makeText(ThirteenTo26Activity.this, "Please file-up first field", Toast.LENGTH_SHORT).show();
                    } else {
                        /*Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                        smsIntent.setType("vnd.android-dir/mms-sms");
                        smsIntent.putExtra("address", one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven + ";" + eight + ";" + nine + ";" + ten);
                        smsIntent.putExtra("sms_body", "আপনার সাথে পরিচিত হতে পেরে আমি সত্যিই আনন্দিত। আপনার সুন্দর সুস্বাস্থ্য কামনা করি।\nশুভেচ্ছান্তে, খন্দকার শহীদুল ইসলাম শেখর, ব্যবস্থাপনা পরিচালক, র\u200C্যাপিড পিআর। 01730012300, info.rapidpr@gmail.com");
                        startActivity(smsIntent);*/

                        Intent smsIntent = new Intent(Intent.ACTION_SENDTO);
                        smsIntent.setData(Uri.parse("smsto:" + Uri.encode(one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven + ";" + eight + ";" + nine + ";" + ten)));
                        smsIntent.putExtra("sms_body", "আপনার সাথে পরিচিত হতে পেরে আমি সত্যিই আনন্দিত। আপনার সুন্দর সুস্বাস্থ্য কামনা করি।\nশুভেচ্ছান্তে, খন্দকার শহীদুল ইসলাম শেখর, ব্যবস্থাপনা পরিচালক, র\u200C্যাপিড পিআর। 01730012300, info.rapidpr@gmail.com");
                        startActivity(smsIntent);

                        Toast.makeText(ThirteenTo26Activity.this, "Your Message is ready to send", Toast.LENGTH_LONG).show();
                        finish();
                    }
                } else if (identityValue == 14) {
                    if (one.equals("")) {
                        Toast.makeText(ThirteenTo26Activity.this, "Please file-up first field", Toast.LENGTH_SHORT).show();
                    } else {
                        /*Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                        smsIntent.setType("vnd.android-dir/mms-sms");
                        smsIntent.putExtra("address", one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven + ";" + eight + ";" + nine + ";" + ten);
                        smsIntent.putExtra("sms_body", "আপনার প্রতিষ্ঠানের বিজ্ঞাপণ টেলিভিশনে ঠিকমত প্রচার হচ্ছে কিনা সে সম্পর্কে মনিটরিং রিপোর্ট পেতে যোগাযোগ করুন।\n" +
                                "র\u200C্যাপিড পিআর : 01730012307, 01730012303 info.rapidpr@gmail.com");
                        startActivity(smsIntent);*/

                        Intent smsIntent = new Intent(Intent.ACTION_SENDTO);
                        smsIntent.setData(Uri.parse("smsto:" + Uri.encode(one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven + ";" + eight + ";" + nine + ";" + ten)));
                        smsIntent.putExtra("sms_body", "আপনার প্রতিষ্ঠানের বিজ্ঞাপণ টেলিভিশনে ঠিকমত প্রচার হচ্ছে কিনা সে সম্পর্কে মনিটরিং রিপোর্ট পেতে যোগাযোগ করুন।\n" +
                                "র\u200C্যাপিড পিআর : 01730012307, 01730012303 info.rapidpr@gmail.com");
                        startActivity(smsIntent);

                        Toast.makeText(ThirteenTo26Activity.this, "Your Message is ready to send", Toast.LENGTH_LONG).show();
                        finish();
                    }
                } else if (identityValue == 15) {
                    if (one.equals("")) {
                        Toast.makeText(ThirteenTo26Activity.this, "Please file-up first field", Toast.LENGTH_SHORT).show();
                    } else {
                        /*Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                        smsIntent.setType("vnd.android-dir/mms-sms");
                        smsIntent.putExtra("address", one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven + ";" + eight + ";" + nine + ";" + ten);
                        smsIntent.putExtra("sms_body", "আপনার পণ্য বা প্রতিষ্ঠান সম্পর্কে স্বল্প খরচে টার্গেট ক্লায়েন্টের কাছে তথ্য পৌছে দিতে ইমেইল ও এসএমএস মার্কেটিংয়ের জন্য যোগাযোগ করুন। র\u200C্যাপিড পিআর: 01730012307, 01730012303, info.rapidpr@gmail.com");
                        startActivity(smsIntent);*/

                        Intent smsIntent = new Intent(Intent.ACTION_SENDTO);
                        smsIntent.setData(Uri.parse("smsto:" + Uri.encode(one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven + ";" + eight + ";" + nine + ";" + ten)));
                        smsIntent.putExtra("sms_body", "আপনার পণ্য বা প্রতিষ্ঠান সম্পর্কে স্বল্প খরচে টার্গেট ক্লায়েন্টের কাছে তথ্য পৌছে দিতে ইমেইল ও এসএমএস মার্কেটিংয়ের জন্য যোগাযোগ করুন। র\u200C্যাপিড পিআর: 01730012307, 01730012303, info.rapidpr@gmail.com");
                        startActivity(smsIntent);

                        Toast.makeText(ThirteenTo26Activity.this, "Your Message is ready to send", Toast.LENGTH_LONG).show();
                        finish();
                    }
                } else if (identityValue == 16) {
                    if (one.equals("")) {
                        Toast.makeText(ThirteenTo26Activity.this, "Please file-up first field", Toast.LENGTH_SHORT).show();
                    } else {
                        /*Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                        smsIntent.setType("vnd.android-dir/mms-sms");
                        smsIntent.putExtra("address", one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven + ";" + eight + ";" + nine + ";" + ten);
                        smsIntent.putExtra("sms_body", "আপনার পণ্য বা প্রতিষ্ঠান সম্পর্কে ব্যপক প্রচারের জন্য র\u200C্যাপিড পিআর এনড্রয়েড টেলিভিশনে স্বল্প খরচে বিজ্ঞাপন দিন। র\u200C্যাপিড পিআর এনড্রয়েড টেলিভিশন বিশ্বের ১৯৫ টি দেশে ২৪ ঘন্টা প্রচারিত হয়। র\u200C্যাপিড পিআর টিভি অ্যাপস ডাউনলোড করতে গুগল প্লেষ্টোরে RPR TV লিখে সার্চ করে ডাউনলোড করুন এবং উপভোগ করুন বাংলাদেশের প্রথম এনড্রয়েড টিভি। র\u200C্যাপিড পিআর: 01730012307, 01709955691, 01709955692, info.rapidpr@gmail.com");
                        startActivity(smsIntent);*/

                        Intent smsIntent = new Intent(Intent.ACTION_SENDTO);
                        smsIntent.setData(Uri.parse("smsto:" + Uri.encode(one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven + ";" + eight + ";" + nine + ";" + ten)));
                        smsIntent.putExtra("sms_body", "আপনার পণ্য বা প্রতিষ্ঠান সম্পর্কে ব্যপক প্রচারের জন্য র\u200C্যাপিড পিআর এনড্রয়েড টেলিভিশনে স্বল্প খরচে বিজ্ঞাপন দিন। র\u200C্যাপিড পিআর এনড্রয়েড টেলিভিশন বিশ্বের ১৯৫ টি দেশে ২৪ ঘন্টা প্রচারিত হয়। র\u200C্যাপিড পিআর টিভি অ্যাপস ডাউনলোড করতে গুগল প্লেষ্টোরে RPR TV লিখে সার্চ করে ডাউনলোড করুন এবং উপভোগ করুন বাংলাদেশের প্রথম এনড্রয়েড টিভি। র\u200C্যাপিড পিআর: 01730012307, 01709955691, 01709955692, info.rapidpr@gmail.com");
                        startActivity(smsIntent);

                        Toast.makeText(ThirteenTo26Activity.this, "Your Message is ready to send", Toast.LENGTH_LONG).show();
                        finish();
                    }
                } else if (identityValue == 17) {
                    if (one.equals("")) {
                        Toast.makeText(ThirteenTo26Activity.this, "Please file-up first field", Toast.LENGTH_SHORT).show();
                    } else {
                        /*Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                        smsIntent.setType("vnd.android-dir/mms-sms");
                        smsIntent.putExtra("address", one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven + ";" + eight + ";" + nine + ";" + ten);
                        smsIntent.putExtra("sms_body", "ইনডোর অথবা আউটডোর যে কোন ধরনের কালচারাল ইভেন্টের জন্য যোগাযোগ করুন। র\u200C্যাপিড পিআর: 01730012307, 01730012300, info.rapidpr@gmail.com");
                        startActivity(smsIntent);*/

                        Intent smsIntent = new Intent(Intent.ACTION_SENDTO);
                        smsIntent.setData(Uri.parse("smsto:" + Uri.encode(one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven + ";" + eight + ";" + nine + ";" + ten)));
                        smsIntent.putExtra("sms_body", "ইনডোর অথবা আউটডোর যে কোন ধরনের কালচারাল ইভেন্টের জন্য যোগাযোগ করুন। র\u200C্যাপিড পিআর: 01730012307, 01730012300, info.rapidpr@gmail.com");
                        startActivity(smsIntent);

                        Toast.makeText(ThirteenTo26Activity.this, "Your Message is ready to send", Toast.LENGTH_LONG).show();
                        finish();
                    }
                } else if (identityValue == 18) {
                    if (one.equals("")) {
                        Toast.makeText(ThirteenTo26Activity.this, "Please file-up first field", Toast.LENGTH_SHORT).show();
                    } else {
                        /*Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                        smsIntent.setType("vnd.android-dir/mms-sms");
                        smsIntent.putExtra("address", one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven + ";" + eight + ";" + nine + ";" + ten);
                        smsIntent.putExtra("sms_body", "র\u200C্যাপিড পিআর বাংলাদেশের প্রথম ডিজিটাল মিডিয়া আর্কাইভ। ২০০০ সাল থেকে শুরু করে বাংলাদেশের সবকটি টেলিভিশনে প্রচারিত সংবাদ ও টকশো এবং সংবাদপত্রে প্রচারিত সকল তথ্য আমাদের আর্কাইভে সংরক্ষিত আছে। র\u200C্যাপিড পিআর 01730012307, 01730012308, 01730012309, info.rapidpr@gmail.com");
                        startActivity(smsIntent);*/

                        Intent smsIntent = new Intent(Intent.ACTION_SENDTO);
                        smsIntent.setData(Uri.parse("smsto:" + Uri.encode(one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven + ";" + eight + ";" + nine + ";" + ten)));
                        smsIntent.putExtra("sms_body", "র\u200C্যাপিড পিআর বাংলাদেশের প্রথম ডিজিটাল মিডিয়া আর্কাইভ। ২০০০ সাল থেকে শুরু করে বাংলাদেশের সবকটি টেলিভিশনে প্রচারিত সংবাদ ও টকশো এবং সংবাদপত্রে প্রচারিত সকল তথ্য আমাদের আর্কাইভে সংরক্ষিত আছে। র\u200C্যাপিড পিআর 01730012307, 01730012308, 01730012309, info.rapidpr@gmail.com");
                        startActivity(smsIntent);

                        Toast.makeText(ThirteenTo26Activity.this, "Your Message is ready to send", Toast.LENGTH_LONG).show();
                        finish();
                    }
                } else if (identityValue == 19) {
                    if (one.equals("")) {
                        Toast.makeText(ThirteenTo26Activity.this, "Please file-up first field", Toast.LENGTH_SHORT).show();
                    } else {
                        /*Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                        smsIntent.setType("vnd.android-dir/mms-sms");
                        smsIntent.putExtra("address", one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven + ";" + eight + ";" + nine + ";" + ten);
                        smsIntent.putExtra("sms_body", "আপনার প্রতিষ্ঠানকে সারা বিশ্বের কাছে নান্দনিকভাবে তুলে ধরতে স্বল্প খরচে নান্দনিক ওয়েব সাইট নির্মান করতে আমাদের সাথে যোগাযোগ করুন। র\u200C্যাপিড পিআর: 01730012307, 01730012302, 01730012303, info.rapidpr@gmail.com");
                        startActivity(smsIntent);*/

                        Intent smsIntent = new Intent(Intent.ACTION_SENDTO);
                        smsIntent.setData(Uri.parse("smsto:" + Uri.encode(one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven + ";" + eight + ";" + nine + ";" + ten)));
                        smsIntent.putExtra("sms_body", "আপনার প্রতিষ্ঠানকে সারা বিশ্বের কাছে নান্দনিকভাবে তুলে ধরতে স্বল্প খরচে নান্দনিক ওয়েব সাইট নির্মান করতে আমাদের সাথে যোগাযোগ করুন। র\u200C্যাপিড পিআর: 01730012307, 01730012302, 01730012303, info.rapidpr@gmail.com");
                        startActivity(smsIntent);

                        Toast.makeText(ThirteenTo26Activity.this, "Your Message is ready to send", Toast.LENGTH_LONG).show();
                        finish();
                    }
                } else if (identityValue == 20) {
                    if (one.equals("")) {
                        Toast.makeText(ThirteenTo26Activity.this, "Please file-up first field", Toast.LENGTH_SHORT).show();
                    } else {
                        /*Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                        smsIntent.setType("vnd.android-dir/mms-sms");
                        smsIntent.putExtra("address", one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven + ";" + eight + ";" + nine + ";" + ten);
                        smsIntent.putExtra("sms_body", "গুগল প্লে-ষ্টোরে আপনার একটি নিজস্ব অ্যাপস থাকা মানেই সারা বিশ্বের সাথে সার্বক্ষণিক যুক্ত থাকা। ডিজিটাল যুগের সাথে নিজেকে পরিচিত রাখুন সারা বিশ্বের কাছে। বিস্তারিত জানতে: র\u200C্যাপিড পিআর 01730012307, 01730012309, info.rapidpr@gmail.com");
                        startActivity(smsIntent);*/

                        Intent smsIntent = new Intent(Intent.ACTION_SENDTO);
                        smsIntent.setData(Uri.parse("smsto:" + Uri.encode(one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven + ";" + eight + ";" + nine + ";" + ten)));
                        smsIntent.putExtra("sms_body", "গুগল প্লে-ষ্টোরে আপনার একটি নিজস্ব অ্যাপস থাকা মানেই সারা বিশ্বের সাথে সার্বক্ষণিক যুক্ত থাকা। ডিজিটাল যুগের সাথে নিজেকে পরিচিত রাখুন সারা বিশ্বের কাছে। বিস্তারিত জানতে: র\u200C্যাপিড পিআর 01730012307, 01730012309, info.rapidpr@gmail.com");
                        startActivity(smsIntent);

                        Toast.makeText(ThirteenTo26Activity.this, "Your Message is ready to send", Toast.LENGTH_LONG).show();
                        finish();
                    }
                } else if (identityValue == 21) { //done
                    if (one.equals("")) {
                        Toast.makeText(ThirteenTo26Activity.this, "Please file-up first field", Toast.LENGTH_SHORT).show();
                    } else {
                        /*Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                        smsIntent.setType("vnd.android-dir/mms-sms");
                        smsIntent.putExtra("address", one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven + ";" + eight + ";" + nine + ";" + ten);
                        smsIntent.putExtra("sms_body", "আপনার প্রতিষ্ঠানের যে কোন ধরনের প্রিন্টিং সাপোর্টের জন্য যোগাযোগ করুন: র\u200C্যাপিড পিআর 01730012307, 01730012300, info.rapidpr@gmail.com");
                        startActivity(smsIntent);*/

                        Intent smsIntent = new Intent(Intent.ACTION_SENDTO);
                        smsIntent.setData(Uri.parse("smsto:" + Uri.encode(one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven + ";" + eight + ";" + nine + ";" + ten)));
                        smsIntent.putExtra("sms_body", "আপনার প্রতিষ্ঠানের যে কোন ধরনের প্রিন্টিং সাপোর্টের জন্য যোগাযোগ করুন: র\u200C্যাপিড পিআর 01730012307, 01730012300, info.rapidpr@gmail.com");
                        startActivity(smsIntent);

                        Toast.makeText(ThirteenTo26Activity.this, "Your Message is ready to send", Toast.LENGTH_LONG).show();
                        finish();
                    }
                } else if (identityValue == 22) {
                    if (one.equals("")) {
                        Toast.makeText(ThirteenTo26Activity.this, "Please file-up first field", Toast.LENGTH_SHORT).show();
                    } else {
                        /*Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                        smsIntent.setType("vnd.android-dir/mms-sms");
                        smsIntent.putExtra("address", one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven + ";" + eight + ";" + nine + ";" + ten);
                        smsIntent.putExtra("sms_body", "সর্বাধুনিক ক্যামেরা ও এডিটিং প্যানেলে আপনার প্রতিষ্ঠানের ডকুমেন্টারী নির্মান করতে আমাদের সাথে যোগাযোগ করুন। র\u200C্যাপিড পিআর 01730012307, 01709955691,01709955692, info.rapidpr@gmail.com");
                        startActivity(smsIntent);*/

                        Intent smsIntent = new Intent(Intent.ACTION_SENDTO);
                        smsIntent.setData(Uri.parse("smsto:" + Uri.encode(one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven + ";" + eight + ";" + nine + ";" + ten)));
                        smsIntent.putExtra("sms_body", "সর্বাধুনিক ক্যামেরা ও এডিটিং প্যানেলে আপনার প্রতিষ্ঠানের ডকুমেন্টারী নির্মান করতে আমাদের সাথে যোগাযোগ করুন। র\u200C্যাপিড পিআর 01730012307, 01709955691,01709955692, info.rapidpr@gmail.com");
                        startActivity(smsIntent);

                        Toast.makeText(ThirteenTo26Activity.this, "Your Message is ready to send", Toast.LENGTH_LONG).show();
                        finish();
                    }
                } else if (identityValue == 23) {
                    if (one.equals("")) {
                        Toast.makeText(ThirteenTo26Activity.this, "Please file-up first field", Toast.LENGTH_SHORT).show();
                    } else {
                        /*Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                        smsIntent.setType("vnd.android-dir/mms-sms");
                        smsIntent.putExtra("address", one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven + ";" + eight + ";" + nine + ";" + ten);
                        smsIntent.putExtra("sms_body", "আপনার প্রতিষ্ঠানের এজিএম কনফারেন্স বা যে কোন ধরনের অনুষ্ঠানের সফল আয়োজনের জন্য যোগাযোগ করুন। র\u200C্যাপিড পিআর 01730012307, 01709955691,01709955692, info.rapidpr@gmail.com");
                        startActivity(smsIntent);*/

                        Intent smsIntent = new Intent(Intent.ACTION_SENDTO);
                        smsIntent.setData(Uri.parse("smsto:" + Uri.encode(one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven + ";" + eight + ";" + nine + ";" + ten)));
                        smsIntent.putExtra("sms_body", "আপনার প্রতিষ্ঠানের এজিএম কনফারেন্স বা যে কোন ধরনের অনুষ্ঠানের সফল আয়োজনের জন্য যোগাযোগ করুন। র\u200C্যাপিড পিআর 01730012307, 01709955691,01709955692, info.rapidpr@gmail.com");
                        startActivity(smsIntent);

                        Toast.makeText(ThirteenTo26Activity.this, "Your Message is ready to send", Toast.LENGTH_LONG).show();
                        finish();
                    }
                } else if (identityValue == 24) {
                    if (one.equals("")) {
                        Toast.makeText(ThirteenTo26Activity.this, "Please file-up first field", Toast.LENGTH_SHORT).show();
                    } else {
                        /*Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                        smsIntent.setType("vnd.android-dir/mms-sms");
                        smsIntent.putExtra("address", one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven + ";" + eight + ";" + nine + ";" + ten);
                        smsIntent.putExtra("sms_body", "আপনার প্রোডাক্টকে সঠিক ক্রেতার কাছে তুলে ধরতে স্বল্প খরচে প্রমোশনের জন্য আমাদের সেবা নিন।\n" +
                                "র\u200C্যাপিড পিআর: 01730012307, 01730012302, 01730012303, info.rapidpr@gmail.com");
                        startActivity(smsIntent);*/

                        Intent smsIntent = new Intent(Intent.ACTION_SENDTO);
                        smsIntent.setData(Uri.parse("smsto:" + Uri.encode(one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven + ";" + eight + ";" + nine + ";" + ten)));
                        smsIntent.putExtra("sms_body", "আপনার প্রোডাক্টকে সঠিক ক্রেতার কাছে তুলে ধরতে স্বল্প খরচে প্রমোশনের জন্য আমাদের সেবা নিন।\n" +
                                "র\u200C্যাপিড পিআর: 01730012307, 01730012302, 01730012303, info.rapidpr@gmail.com");
                        startActivity(smsIntent);

                        Toast.makeText(ThirteenTo26Activity.this, "Your Message is ready to send", Toast.LENGTH_LONG).show();
                        finish();
                    }
                } else if (identityValue == 25) {
                    if (one.equals("")) {
                        Toast.makeText(ThirteenTo26Activity.this, "Please file-up first field", Toast.LENGTH_SHORT).show();
                    } else {
                        /*Intent smsIntent = new Intent(Intent.ACTION_VIEW);
                        smsIntent.setType("vnd.android-dir/mms-sms");
                        smsIntent.putExtra("address", one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven + ";" + eight + ";" + nine + ";" + ten);
                        smsIntent.putExtra("sms_body", "আপনার প্রতিষ্ঠানের রপ্তানীযোগ্য পণ্যের তথ্য সারা বিশ্বের বায়ারদের কাছে মুহূর্তেই পৌছে দিতে আমাদের সাথে যোগাযোগ করুন। র\u200C্যাপিড পিআর: 01730012307, 01730012303,info.rapidpr@gmail.com");
                        startActivity(smsIntent);*/

                        Intent smsIntent = new Intent(Intent.ACTION_SENDTO);
                        smsIntent.setData(Uri.parse("smsto:" + Uri.encode(one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven + ";" + eight + ";" + nine + ";" + ten)));
                        smsIntent.putExtra("sms_body", "আপনার প্রতিষ্ঠানের রপ্তানীযোগ্য পণ্যের তথ্য সারা বিশ্বের বায়ারদের কাছে মুহূর্তেই পৌছে দিতে আমাদের সাথে যোগাযোগ করুন। র\u200C্যাপিড পিআর: 01730012307, 01730012303,info.rapidpr@gmail.com");
                        startActivity(smsIntent);

                        Toast.makeText(ThirteenTo26Activity.this, "Your Message is ready to send", Toast.LENGTH_LONG).show();
                        finish();
                    }
                } else if (identityValue == 26) {
                    if (one.equals("")) {
                        Toast.makeText(ThirteenTo26Activity.this, "Please file-up first field", Toast.LENGTH_SHORT).show();
                    } else {
                        Intent intent = new Intent(Intent.ACTION_SENDTO);
                        intent.setData(Uri.parse("smsto:" + Uri.encode(one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven + ";" + eight + ";" + nine + ";" + ten)));
                        intent.putExtra("sms_body", "সালাম নিবেন। র\u200C্যাপিড পিআর থেকে আপনার জন্য উপহার হিসাবে একটি ডায়েরি পাঠাতে চাই। বিস্তারিত ঠিকানা SMS করার অনুরোধ করছি। \n" +
                                "শুভেচ্ছান্তে\n" +
                                "শহীদুল ইসলাম শেখর\n" +
                                "ব্যবস্থাপনা পরিচালক \n" +
                                "র\u200C্যাপিড পিআর: 01730012300");
                        startActivity(intent);

                        Toast.makeText(ThirteenTo26Activity.this, "Your Message is ready to send", Toast.LENGTH_LONG).show();
                        finish();
                    }


                } else if (identityValue == 27) {
                    if (one.equals("")) {
                        Toast.makeText(ThirteenTo26Activity.this, "Please file-up first field", Toast.LENGTH_SHORT).show();
                    } else {
                        Intent intent = new Intent(Intent.ACTION_SENDTO);
                        intent.setData(Uri.parse("smsto:" + Uri.encode(one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven + ";" + eight + ";" + nine + ";" + ten)));
                        intent.putExtra("sms_body", "রিহ্যাব ফেয়ার-এ আপনার প্রতিষ্ঠানের  ব্যাপক প্রচার  স্বল্পমূল্যে করতে চাইলে এবং আপনার স্টলে লক্ষাধিক ক্রেতার ভিজিট চাইলে আমাদের সেবা নিন।  র\u200D্যাপিড পিআর : 01730012307, 01730012302, 01730012303. Info.rapidpr@gmail.com");
                        startActivity(intent);

                        Toast.makeText(ThirteenTo26Activity.this, "Your Message is ready to send", Toast.LENGTH_LONG).show();
                        finish();
                    }

                } else if (identityValue == 28) {
                    if (one.equals("")) {
                        Toast.makeText(ThirteenTo26Activity.this, "Please file-up first field", Toast.LENGTH_SHORT).show();
                    } else {
                        Intent intent = new Intent(Intent.ACTION_SENDTO);
                        intent.setData(Uri.parse("smsto:" + Uri.encode(one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven + ";" + eight + ";" + nine + ";" + ten)));
                        intent.putExtra("sms_body", "নতুন অথবা পুরাতন বেচে দিন যখন তখন।র\u200C্যাপিড সেবা - +8801975012300 ,+8801976012300\nwww.rapidseba.com");
                        startActivity(intent);

                        Toast.makeText(ThirteenTo26Activity.this, "Your Message is ready to send", Toast.LENGTH_LONG).show();
                        finish();
                    }

                    /*Intent intent = new Intent(Intent.ACTION_SENDTO);
                    intent.setData(Uri.parse("smsto:" + Uri.encode(one + ";" + two + ";" + three + ";" + four + ";" + five + ";" + six + ";" + seven + ";" + eight + ";" + nine + ";" + ten)));
                    intent.putExtra("sms_body", "সালাম নিবেন। র\u200C্যাপিড পিআর থেকে আপনার জন্য উপহার হিসাবে একটি ডায়েরি পাঠাতে চাই। বিস্তারিত ঠিকানা SMS করার অনুরোধ করছি। \n" +
                            "শুভেচ্ছান্তে\n" +
                            "শহীদুল ইসলাম শেখর\n" +
                            "ব্যবস্থাপনা পরিচালক \n" +
                            "র\u200C্যাপিড পিআর: 01730012300");
                    startActivity(intent);*/

                }


            }
        });

    }

    private void takePermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            requestPermissions(new String[]{
                    Manifest.permission.CALL_PHONE,
                    Manifest.permission.SEND_SMS
            }, 1);
        }
    }
}

