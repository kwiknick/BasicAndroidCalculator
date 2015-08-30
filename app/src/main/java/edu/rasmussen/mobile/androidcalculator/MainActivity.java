package edu.rasmussen.mobile.androidcalculator;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import java.math.BigDecimal;

public class MainActivity extends AppCompatActivity {
    Button b1,b2,b3,b4,b5,b6,b7,b8,b9,b0,bdot,badd,bsub,bmul,bdiv,beq,clear;
    EditText et;
    BigDecimal val1,val2;
    boolean add,sub,div,mul;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1=(Button) findViewById(R.id.btn1);
        b2=(Button) findViewById(R.id.btn2);
        b3=(Button) findViewById(R.id.btn3);
        b4=(Button) findViewById(R.id.btn4);
        b5=(Button) findViewById(R.id.btn5);
        b6=(Button) findViewById(R.id.btn6);
        b7=(Button) findViewById(R.id.btn7);
        b8=(Button) findViewById(R.id.btn8);
        b9=(Button) findViewById(R.id.btn9);
        b0=(Button) findViewById(R.id.btn0);
        bdot=(Button) findViewById(R.id.decimalBtn);
        badd=(Button) findViewById(R.id.plusBtn);
        bsub=(Button) findViewById(R.id.minusBtn);
        bmul=(Button) findViewById(R.id.multiplyBtn);
        bdiv=(Button) findViewById(R.id.divideBtn);
        beq=(Button) findViewById(R.id.equalsBtn);
        et=(EditText) findViewById(R.id.calcInput);
        clear=(Button) findViewById(R.id.clearBtn);


        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"1");
            }
        });
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"2");
            }
        });
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"3");
            }
        });
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"4");
            }
        });
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"5");
            }
        });
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"6");
            }
        });
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"7");
            }
        });
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"8");
            }
        });
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"9");
            }
        });
        b0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+"0");
            }
        });
        bdot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText(et.getText()+".");
            }
        });
        try {
            badd.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                        val1 = BigDecimal.valueOf(Double.valueOf(et.getText() + ""));
                        add = true;
                        et.setText(null);
                }
            });
            bsub.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    val1 = BigDecimal.valueOf(Double.valueOf(et.getText() + ""));
                    sub = true;
                    et.setText(null);
                }
            });
            bdiv.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    val1 = BigDecimal.valueOf(Double.valueOf(et.getText() + ""));
                    div = true;
                    et.setText(null);
                }
            });
            bmul.setOnClickListener(new View.OnClickListener() {

                @Override
                public void onClick(View v) {
                    val1 = BigDecimal.valueOf(Double.valueOf(et.getText() + ""));
                    mul = true;
                    et.setText(null);
                }
            });
        }catch (NumberFormatException e) {
            Toast toast = Toast.makeText(this, "Please Enter a Valid Number", Toast.LENGTH_LONG);
            toast.show();
        }

        beq.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                double valDouble = Double.valueOf(et.getText()+"");

                val2=BigDecimal.valueOf(valDouble);
                if (add==true) {
                    et.setText(val1.add(val2) + "");
                    add=false;
                }
                if (sub==true) {
                    et.setText(val1.subtract(val2)+"");
                    sub=false;
                }
                if (mul==true) {
                    et.setText(val1.multiply(val2)+"");
                    mul=false;
                }
                if (div==true) {
                    et.setText(val1.divide(val2)+"");
                    div=false;
                }
            }

        });
        clear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                et.setText("");
            }
        });

    }
}