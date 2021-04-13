package my.unimas.calculator_project;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button but0, but1, but2, but3, but4, but5, but6,
            but7, but8, but9, butPlus, butMinus, butDivide,
            butMultiply, butDot, butC, butEqual;

    EditText edl;

    float mValueOne, mValueTwo;

    boolean Addition, Subtract, Multiplication, Division;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edl = findViewById(R.id.editText);
        but1 = findViewById(R.id.but1);
        but2 = findViewById(R.id.but2);
        but3 = findViewById(R.id.but3);
        but4 = findViewById(R.id.but4);
        but5 = findViewById(R.id.but5);
        but6 = findViewById(R.id.but6);
        but7 = findViewById(R.id.but7);
        but8 = findViewById(R.id.but8);
        but9 = findViewById(R.id.but9);
        but0 = findViewById(R.id.but0);
        butPlus = findViewById(R.id.butPlus);
        butMinus = findViewById(R.id.butMinus);
        butDivide = findViewById(R.id.butDivide);
        butMultiply = findViewById(R.id.butMultiply);
        butEqual = findViewById(R.id.butEqual);
        butC = findViewById(R.id.butC);
        butDot = findViewById(R.id.butDot);


        but1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edl.setText(edl.getText() + "1");
            }
        });

        but2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edl.setText(edl.getText() + "2");
            }
        });

        but3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edl.setText(edl.getText() + "3");
            }
        });

        but4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edl.setText(edl.getText() + "4");
            }
        });

        but5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edl.setText(edl.getText() + "5");
            }
        });

        but6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edl.setText(edl.getText() + "6");
            }
        });

        but7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edl.setText(edl.getText() + "7");
            }
        });

        but8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edl.setText(edl.getText() + "8");
            }
        });

        but9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edl.setText(edl.getText() + "9");
            }
        });

        but0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edl.setText(edl.getText() + "0");
            }
        });

        butPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                if (edl == null) {
                    edl.setText("");
                } else {
                    mValueOne = Float.parseFloat(edl.getText() + "");
                    Addition = true;
                    edl.setText(null);
                }
            }
        });

        butEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(edl.getText() + "");

                if (Addition == true) {
                    edl.setText(mValueOne + mValueTwo + "");
                    Addition = false;
                }

            }
        });

        butMinus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edl.getText() + "");
                Subtract = true;
                edl.setText(null);
            }
        });

        butMultiply.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edl.getText() + "");
                Multiplication = true;
                edl.setText(null);
            }
        });

        butDivide.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueOne = Float.parseFloat(edl.getText() + "");
                Division = true;
                edl.setText(null);
            }
        });

        butEqual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mValueTwo = Float.parseFloat(edl.getText() + "");

                if (Addition == true) {
                    edl.setText(mValueOne + mValueTwo + "");
                    Addition = false;
                }

                if (Subtract == true) {
                    edl.setText(mValueOne - mValueTwo + "");
                    Subtract = false;
                }

                if (Multiplication == true) {
                    edl.setText(mValueOne * mValueTwo + "");
                    Multiplication = false;
                }

                if (Division == true) {
                    edl.setText(mValueOne / mValueTwo + "");
                    Division = false;
                }
            }
        });

        butC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edl.setText("");
            }
        });

        butDot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edl.setText(edl.getText() + ".");
            }
        });
    }
}