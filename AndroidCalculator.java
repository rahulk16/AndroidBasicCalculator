package com.basic.calc;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Basic_CalculatorActivity extends Activity {

    Button bOne, bTwo, bThree, bFour, bFive, bSix, bSeven, bEight, bNine,
            bZero, bAdd, bSub, bMul, bDiv, bClear, bCe, bEqual;
    TextView txtViewResult, txtViewInput;
    String s = "", s1 = "", s2 = "", resultString = "";
    int i = 0, i1 = 0, c = -1;
    int result = 0;

    /**
     * Called when the activity is first created.
     */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);

        bOne = (Button) findViewById(R.id.one);
        bTwo = (Button) findViewById(R.id.two);
        bThree = (Button) findViewById(R.id.three);
        bFour = (Button) findViewById(R.id.four);
        bFive = (Button) findViewById(R.id.five);
        bSix = (Button) findViewById(R.id.six);
        bSeven = (Button) findViewById(R.id.seven);
        bEight = (Button) findViewById(R.id.eight);
        bNine = (Button) findViewById(R.id.nine);
        bZero = (Button) findViewById(R.id.zero);
        bAdd = (Button) findViewById(R.id.add);
        bSub = (Button) findViewById(R.id.sub);
        bMul = (Button) findViewById(R.id.mul);
        bDiv = (Button) findViewById(R.id.div);
        bClear = (Button) findViewById(R.id.clear);
        bCe = (Button) findViewById(R.id.ce);
        bEqual = (Button) findViewById(R.id.equal);

        txtViewResult = (TextView) findViewById(R.id.textViewResult);
        txtViewInput = (TextView) findViewById(R.id.textViewInput);

        bOne.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                s = (String) txtViewResult.getText();
                if (s.equals("+") || s.equals("-") || s.equals("/")
                        || s.equals("*")) {
                    txtViewResult.setText("");
                    s = "";
                }
                txtViewResult.setText(s + "1");
                s = "";
            }
        });

        bTwo.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                s = (String) txtViewResult.getText();
                if (s.equals("+") || s.equals("-") || s.equals("/")
                        || s.equals("*")) {
                    txtViewResult.setText("");
                    s = "";
                }
                txtViewResult.setText(s + "2");
                s = "";
            }
        });

        bThree.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                s = (String) txtViewResult.getText();
                if (s.equals("+") || s.equals("-") || s.equals("/")
                        || s.equals("*")) {
                    txtViewResult.setText("");
                    s = "";
                }
                txtViewResult.setText(s + "3");
                s = "";
            }
        });

        bFour.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                s = (String) txtViewResult.getText();
                if (s.equals("+") || s.equals("-") || s.equals("/")
                        || s.equals("*")) {
                    txtViewResult.setText("");
                    s = "";
                }
                txtViewResult.setText(s + "4");
                s = "";
            }
        });

        bFive.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                s = (String) txtViewResult.getText();
                if (s.equals("+") || s.equals("-") || s.equals("/")
                        || s.equals("*")) {
                    txtViewResult.setText("");
                    s = "";
                }
                txtViewResult.setText(s + "5");
                s = "";
            }
        });

        bSix.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                s = (String) txtViewResult.getText();
                if (s.equals("+") || s.equals("-") || s.equals("/")
                        || s.equals("*")) {
                    txtViewResult.setText("");
                    s = "";
                }
                txtViewResult.setText(s + "6");
                s = "";
            }
        });

        bSeven.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                s = (String) txtViewResult.getText();
                if (s.equals("+") || s.equals("-") || s.equals("/")
                        || s.equals("*")) {
                    txtViewResult.setText("");
                    s = "";
                }
                txtViewResult.setText(s + "7");
                s = "";
            }
        });

        bEight.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                s = (String) txtViewResult.getText();
                if (s.equals("+") || s.equals("-") || s.equals("/")
                        || s.equals("*")) {
                    txtViewResult.setText("");
                    s = "";
                }
                txtViewResult.setText(s + "8");
                s = "";
            }
        });
        bNine.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                s = (String) txtViewResult.getText();
                if (s.equals("+") || s.equals("-") || s.equals("/")
                        || s.equals("*")) {
                    txtViewResult.setText("");
                    s = "";
                }
                txtViewResult.setText(s + "9");
                s = "";
            }
        });

        bZero.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                s = (String) txtViewResult.getText();
                if (s.equals("+") || s.equals("-") || s.equals("/")
                        || s.equals("*")) {
                    txtViewResult.setText("");
                    s = "";
                }
                txtViewResult.setText(s + "0");
                s = "";
            }
        });

        bClear.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                s = (String) txtViewResult.getText();
                if (s.equals("+") || s.equals("-") || s.equals("/")
                        || s.equals("*") || s.equals("")) {
                    i = 0;
                } else {
                    i = Integer.parseInt(s);
                    i = i / 10;
                }
                if (i == 0) {
                    txtViewResult.setText("");
                } else {
                    txtViewResult.setText(i + "");
                }
                s = null;
            }
        });

        bAdd.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String tmp = (String) txtViewResult.getText();
                if(tmp.isEmpty()) {
                    s1 = "0";
                } else if (!tmp.equals("+") && !tmp.equals("-") && !tmp.equals("*")
                        && !tmp.equals("/")) {
                    s1 = tmp;
                }
                c = 0;
                resultString = "";
                txtViewResult.setText("+");
                txtViewInput.setText(s1 + " + ");
            }

        });

        bSub.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String tmp = (String) txtViewResult.getText();
                if(tmp.isEmpty()) {
                    s1 = "0";
                } else if (!tmp.equals("+") && !tmp.equals("-") && !tmp.equals("*")
                        && !tmp.equals("/")) {
                    s1 = tmp;
                }
                c = 1;
                resultString = "";
                txtViewResult.setText("-");
                txtViewInput.setText(s1 + " - ");
            }

        });

        bDiv.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String tmp = (String) txtViewResult.getText();
                if(tmp.isEmpty()) {
                    s1 = "0";
                } else if (!tmp.equals("+") && !tmp.equals("-") && !tmp.equals("*")
                        && !tmp.equals("/")) {
                    s1 = tmp;
                }
                c = 2;
                resultString = "";
                txtViewResult.setText("/");
                txtViewInput.setText(s1 + " / ");
            }

        });

        bMul.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                String tmp = (String) txtViewResult.getText();
                if(tmp.isEmpty()) {
                    s1 = "0";
                } else if (!tmp.equals("+") && !tmp.equals("-") && !tmp.equals("*")
                        && !tmp.equals("/")) {
                    s1 = tmp;
                }
                c = 3;
                resultString = "";
                txtViewResult.setText("*");
                txtViewInput.setText(s1 + " * ");
            }

        });

        bCe.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                txtViewResult.setText("");
                txtViewInput.setText("");
                i = 0;
                i1 = 0;
                s1 = "";
                s2 = "";
                resultString = "";
                c = -1;
                result = 0;
            }

        });

        bEqual.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                String operator = "";
                if (s1.equalsIgnoreCase("+") || s1.equalsIgnoreCase("-") || s1.equalsIgnoreCase("/") || s1.equalsIgnoreCase("*")) {
                    i = 0;
                } else if (s1 == null || s1.isEmpty()) {
                    i = 0;
                } else {
                    i = Integer.parseInt(s1);
                }

                if(resultString.isEmpty()) {
                    s2 = (String) txtViewResult.getText();
                    if (s2.equalsIgnoreCase("+") || s2.equalsIgnoreCase("-") || s2.equalsIgnoreCase("/") || s2.equalsIgnoreCase("*")) {
                        i1 = 0;
                    } else if (s2 == null || s2.isEmpty()) {
                        i1 = 0;
                    } else {
                        i1 = Integer.parseInt(s2);
                    }
                } else {
                    i = result;
                }

                if (c == 0) {
                    operator = "+";
                    result = i + i1;
                } else if (c == 1) {
                    operator = "-";
                    result = i - i1;
                } else if (c == 2) {
                    operator = "/";
                    if (i1 == 0) {
                        Toast.makeText(getApplicationContext(),
                                "Invalid Input", Toast.LENGTH_LONG).show();
                        result = 0;
                    } else {
                        result = i / i1;
                    }
                } else if (c == 3) {
                    operator = "*";
                    result = i * i1;
                } else {
                    operator = "";
                    result = 0;
                }

                //History Storage
                if(!operator.isEmpty()) {
                    txtViewInput.setText(i + " " + operator + " " + i1);
                } else {
                    txtViewInput.setText("");
                }

                resultString = String.valueOf(result);
                txtViewResult.setText(resultString);
            }

        });
    }
}