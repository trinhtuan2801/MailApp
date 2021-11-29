package com.example.mailapp;

import android.content.Context;
import android.graphics.Color;
import android.graphics.Movie;
import android.graphics.drawable.Drawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.core.graphics.drawable.DrawableCompat;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MailAdapter extends ArrayAdapter<MailDetail> {

    private Context mContext;
    private List<MailDetail> MailList = new ArrayList<>();
    private String[] colors = {"yellow", "cyan", "purple", "green", "red", "grey"};

    public MailAdapter(Context context, ArrayList<MailDetail> list) {
        super(context, 0, list);
        mContext = context;
        MailList = list;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View listItem = convertView;
        if(listItem == null)
            listItem = LayoutInflater.from(mContext).inflate(R.layout.list_item_layout,parent,false);

        MailDetail currentMail = MailList.get(position);

        ImageView avatarcolor = (ImageView) listItem.findViewById(R.id.avatarcolor);
        TextView avatarname = (TextView) listItem.findViewById(R.id.avatarname);
        TextView username = (TextView) listItem.findViewById(R.id.username);
        TextView message = (TextView) listItem.findViewById(R.id.usermessage);
        TextView time = (TextView) listItem.findViewById(R.id.receivetime);

        int rnd = new Random().nextInt(colors.length);
        Drawable background= avatarcolor.getBackground();
        background = DrawableCompat.wrap(background);
        DrawableCompat.setTint(background, Color.parseColor(colors[rnd]));
        avatarcolor.setBackground(background);
        avatarname.setText(currentMail.username.substring(0, 1));
        username.setText(currentMail.username);
        message.setText(currentMail.message);
        time.setText(currentMail.time);

        return listItem;
    }
}
