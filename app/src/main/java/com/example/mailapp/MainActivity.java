package com.example.mailapp;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Adapter;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    ListView listview;
    String[] colors = {"yellow", "cyan", "purple", "green"};
    ArrayList<MailDetail> mailDetails = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        listview = findViewById(R.id.listview);
        MailDetail user1 = new MailDetail("Tuan", "hello", "12:30");
        MailDetail user2 = new MailDetail("Minh", "sdawdsadwadsadsadwadwadwada\ndsadwadsa", "12:31");
        MailDetail user3 = new MailDetail("Tien", "wdhuwadsadadawd\nsdawdadad", "12:32");
        MailDetail user4 = new MailDetail("Tho", "wdwadsdawdwadsdwg", "12:33");
        MailDetail user5 = new MailDetail("Nam Anh", "dwdawdwadwadsadwadawdwadwad", "12:34");
        MailDetail user6 = new MailDetail("Khanh", "dwads dwadsadw awda sdas", "12:31");
        MailDetail user7 = new MailDetail("Hung", "Hellooooowadwadsaoooo", "12:31");
        MailDetail user8 = new MailDetail("Tri", "Hellooooodwads a oooo", "12:31");
        MailDetail user9 = new MailDetail("Hai", "Hellooooo  wdawddoooo", "12:31");

        mailDetails.add(user1);
        mailDetails.add(user2);
        mailDetails.add(user3);
        mailDetails.add(user4);
        mailDetails.add(user5);
        mailDetails.add(user6);
        mailDetails.add(user7);
        mailDetails.add(user8);
        mailDetails.add(user9);

        addView();
    }

    private void addView(){
        MailAdapter arrayAdapter = new MailAdapter(this, mailDetails);
        listview.setAdapter(arrayAdapter);
    }


}