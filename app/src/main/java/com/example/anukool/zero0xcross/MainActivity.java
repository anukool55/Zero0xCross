package com.example.anukool.zero0xcross;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
Button b1,b2;

    Intent i,i2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
  i=new Intent(this,Main2Activity.class);
        i2=new Intent(this,Main3Activity.class);

    }

    @Override
    public void onClick(View v) {
        if(b1.getId()==v.getId())
        {
           startActivity(i);
        }
        if(b2.getId()==v.getId())
        {
            startActivity(i2);
        }
    }
}
