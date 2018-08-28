package com.example.anukool.zero0xcross;



import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener{
    //buttons are declared global
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9;
    //bool variable to check Xis clicked or Y
    static  boolean x=false,y=true;
    //text field to set result
    EditText t1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        //connecting buttons with xml buttons
        b1=(Button)findViewById(R.id.b1);
        b2=(Button)findViewById(R.id.b2);
        b3=(Button)findViewById(R.id.b3);
        b4=(Button)findViewById(R.id.b4);
        b5=(Button)findViewById(R.id.b5);
        b6=(Button)findViewById(R.id.b6);
        b7=(Button)findViewById(R.id.b7);
        b8=(Button)findViewById(R.id.b8);
        b9=(Button)findViewById(R.id.b9);
        t1=(EditText)findViewById(R.id.t1);
        //adding action listener to buttons
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
        b3.setOnClickListener(this);
        b4.setOnClickListener(this);
        b5.setOnClickListener(this);
        b6.setOnClickListener(this);
        b7.setOnClickListener(this);
        b8.setOnClickListener(this);
        b9.setOnClickListener(this);

    }
    //function to compute who is the winner
    void result()
    {
        if((b1.getText()==b2.getText())&&(b1.getText()==b3.getText()))
        {
            if(b1.getText()=="X")
            {
                t1.setText("X wins");

            }
            else if(b1.getText()=="Y")
            {
                t1.setText("Y wins");

            }
        }

        if((b4.getText()==b5.getText())&&(b4.getText()==b6.getText()))
        {
            if(b4.getText()=="X")
            {
                t1.setText("X wins");

            }
            else if(b4.getText()=="Y")
            {
                t1.setText("Y wins");

            }
        }
        if((b7.getText()==b8.getText())&&(b7.getText()==b9.getText()))
        {
            if(b7.getText()=="X")
            {
                t1.setText("X wins");

            }
            else if(b7.getText()=="Y")
            {
                t1.setText("Y wins");

            }
        }
        if((b1.getText()==b5.getText())&&(b1.getText()==b9.getText()))
        {
            if(b1.getText()=="X")
            {
                t1.setText("X wins");

            }
            else if(b1.getText()=="Y")
            {
                t1.setText("Y wins");

            }
        }
        if((b3.getText()==b5.getText())&&(b3.getText()==b7.getText()))
        {
            if(b3.getText()=="X")
            {
                t1.setText("X wins");

            }
            else if(b3.getText()=="Y")
            {
                t1.setText("Y wins");

            }
        }
        if((b1.getText()==b4.getText())&&(b1.getText()==b7.getText()))
        {
            if(b1.getText()=="X")
            {
                t1.setText("X wins");

            }
            else if(b1.getText()=="Y")
            {
                t1.setText("Y wins");

            }
        }
        if((b2.getText()==b5.getText())&&(b2.getText()==b8.getText()))
        {
            if(b2.getText()=="X")
            {
                t1.setText("X wins");

            }
            else if(b2.getText()=="Y")
            {
                t1.setText("Y wins");

            }
        }
        if((b3.getText()==b6.getText())&&(b3.getText()==b9.getText()))
        {
            if(b3.getText()=="X")
            {
                t1.setText("X wins");

            }
            else if(b3.getText()=="Y")
            {
                t1.setText("Y wins");

            }
        }
    }

    //to stop after game over
    void stop()
    {
        System.exit(0);
    }
    @Override

    public void onClick(View v) {
        if(v.getId()==b1.getId())
        {
            if(x==true)
            {
                b1.setText("Y");
                x=false;
                y=true;
            }
            else if(y==true)
            {
                b1.setText("X");
                y=false;
                x=true;
            }
            b1.setClickable(false);
            result();
        }
        if(v.getId()==b2.getId())
        {
            if(x==true)
            {
                b2.setText("Y");
                x=false;
                y=true;
            }
            else if(y==true)
            {
                b2.setText("X");
                y=false;
                x=true;
            }  b2.setClickable(false);
            result();
        }


        if(v.getId()==b3.getId())
        {
            if(x==true)
            {
                b3.setText("Y");
                x=false;
                y=true;
            }
            else if(y==true)
            {
                b3.setText("X");
                y=false;
                x=true;
            }  b3.setClickable(false);
            result();
        }


        if(v.getId()==b4.getId())
        {
            if(x==true)
            {
                b4.setText("Y");
                x=false;
                y=true;
            }
            else if(y==true)
            {
                b4.setText("X");
                y=false;
                x=true;
            }  b4.setClickable(false);
            result();
        }


        if(v.getId()==b5.getId())
        {
            if(x==true)
            {
                b5.setText("Y");
                x=false;
                y=true;
            }
            else if(y==true)
            {
                b5.setText("X");
                x=true;
                y=false;
            }  b5.setClickable(false);
            result();
        }

        if(v.getId()==b6.getId())
        {
            if(x==true)
            {
                b6.setText("Y");
                x=false;
                y=true;
            }
            else if(y==true)
            {
                b6.setText("X");
                y=false;
                x=true;
            }  b6.setClickable(false);
            result();
        }



        if(v.getId()==b7.getId())
        {
            if(x==true)
            {
                b7.setText("Y");
                x=false;
                y=true;
            }
            else if(y==true)
            {
                b7.setText("X");
                y=false;
                x=true;
            }  b7.setClickable(false);
            result();
        }



        if(v.getId()==b8.getId())
        {
            if(x==true)
            {
                b8.setText("Y");
                x=false;
                y=true;
            }
            else if(y==true)
            {
                b8.setText("X");
                x=true;
                y=false;
            }  b8.setClickable(false);
            result();
        }




        if(v.getId()==b9.getId())
        {
            if(x==true)
            {
                b9.setText("Y");
                x=false;
                y=true;
            }
            else if(y==true)
            {
                b9.setText("X");
                x=true;
                y=false;
            }  b9.setClickable(false);
            result();
        }





















    }
}