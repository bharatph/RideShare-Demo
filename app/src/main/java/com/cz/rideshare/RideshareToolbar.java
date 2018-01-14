package com.cz.rideshare;

import android.app.Activity;
import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by Home on 09-01-2018.
 */

public class RideshareToolbar extends RelativeLayout {
    public RideshareToolbar(Context context) {
        super(context);
        init();
    }

    public RideshareToolbar(Context context, AttributeSet attrSet) {
        super(context, attrSet);
        init();
    }

    public RideshareToolbar(Context context, AttributeSet attrSet, int style) {
        super(context, attrSet, style);
        init();
    }

    public void init(){
        inflate(getContext(), R.layout.rideshare_toolbar, this);
        ImageButton imgBtton = findViewById(R.id.headerBackButton);
        TextView textView = findViewById(R.id.headerText);

        imgBtton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View v) {
                AppCompatActivity host = (AppCompatActivity)v.getContext();
                host.finish();
            }
        });
    }
}
