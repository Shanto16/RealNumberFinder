package com.realnumberfinder.aos.realnumberfinder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Shanto on 5/24/2017.
 */



public class commentModel extends AppCompatActivity {

    ImageView propic,imo,whatsapp,messenger,viber;
    TextView name,number,time,day;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.contactmodel);

        propic = (ImageView)findViewById(R.id.propic);
        imo = (ImageView)findViewById(R.id.imo);
        whatsapp = (ImageView)findViewById(R.id.whatsapp);
        messenger = (ImageView)findViewById(R.id.messenger);
        viber = (ImageView)findViewById(R.id.viber);

        name = (TextView) findViewById(R.id.nameText);
        number = (TextView)findViewById(R.id.number);
        time=(TextView)findViewById(R.id.callTime);
        day = (TextView)findViewById(R.id.callDay);

    }
}
