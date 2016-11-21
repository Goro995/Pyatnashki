package com.example.pyatnashki;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private static final String TAG = "MainActivity";

    // Переменные кнопок по порядку с левого верхнего угла до нижнего правого
    private int m;
    private int q;
    private int w;
    private int e;
    private int r;
    private int t;
    private int y;
    private int u;
    private int i;
    private int o;
    private int p;
    private int a;
    private int s;
    private int d;
    private int f;
    private int g;

    // UI elements
    Button button1;
    Button button2;
    Button button3;
    Button button4;
    Button button5;
    Button button6;
    Button button7;
    Button button8;
    Button button9;
    Button button10;
    Button button11;
    Button button12;
    Button button13;
    Button button14;
    Button button15;
    Button button16;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.tablelayout);


        // найдем View-элементы
        button1 = (Button) findViewById(R.id.button1);
        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        button6 = (Button) findViewById(R.id.button6);
        button7 = (Button) findViewById(R.id.button7);
        button8 = (Button) findViewById(R.id.button8);
        button9 = (Button) findViewById(R.id.button9);
        button10 = (Button) findViewById(R.id.button10);
        button11 = (Button) findViewById(R.id.button11);
        button12 = (Button) findViewById(R.id.button12);
        button13 = (Button) findViewById(R.id.button13);
        button14 = (Button) findViewById(R.id.button14);
        button15 = (Button) findViewById(R.id.button15);
        button16 = (Button) findViewById(R.id.button16);

        List<Integer> numbers = new ArrayList<Integer>();
        Random randomGenerator = new Random();
        while (numbers.size() < 16) {
            int randomInt = randomGenerator.nextInt(16);
            if (!numbers.contains(randomInt)) {
                numbers.add(randomInt);
                Log.d(TAG, "Generated: " + randomInt);
            }
        }

        m = numbers.get(0);
        q = numbers.get(1);
        w = numbers.get(2);
        e = numbers.get(3);
        r = numbers.get(4);
        t = numbers.get(5);
        y = numbers.get(6);
        u = numbers.get(7);
        i = numbers.get(8);
        o = numbers.get(9);
        p = numbers.get(10);
        a = numbers.get(11);
        s = numbers.get(12);
        d = numbers.get(13);
        f = numbers.get(14);
        g = numbers.get(15);

        swap();
        updateTextOfButtons();
        checkVictory();

        button1.setOnClickListener(this);
        button2.setOnClickListener(this);
        button3.setOnClickListener(this);
        button4.setOnClickListener(this);
        button5.setOnClickListener(this);
        button6.setOnClickListener(this);
        button7.setOnClickListener(this);
        button8.setOnClickListener(this);
        button9.setOnClickListener(this);
        button10.setOnClickListener(this);
        button11.setOnClickListener(this);
        button12.setOnClickListener(this);
        button13.setOnClickListener(this);
        button14.setOnClickListener(this);
        button15.setOnClickListener(this);
        button16.setOnClickListener(this);
    }


    public boolean onCreateOptionsMenu(Menu menu) {
        // TODO Auto-generated method stub

        menu.add("New Game");

        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // TODO Auto-generated method stub
        Toast.makeText(this, item.getTitle(), Toast.LENGTH_SHORT).show();
//        MainActivity.recreate();
        return super.onOptionsItemSelected(item);
    }

    @Override
    public void onClick(View view) {

        switch (view.getId()) {
            case R.id.button1:
                if (q == 0) {
                    q = m;
                    m = 0;
                } else if (r == 0) {
                    r = m;
                    m = 0;
                }
                break;

            case R.id.button2:
                if (m == 0) {
                    m = q;
                    q = 0;
                } else if (w == 0) {
                    w = q;
                    q = 0;
                } else if (t == 0) {
                    t = q;
                    q = 0;
                }
                break;

            case R.id.button3:
                if (q == 0) {
                    q = w;
                    w = 0;
                } else if (e == 0) {
                    e = w;
                    w = 0;
                } else if (y == 0) {
                    y = w;
                    w = 0;
                }
                break;

            case R.id.button4:
                if (w == 0) {
                    w = e;
                    e = 0;
                } else if (u == 0) {
                    u = e;
                    e = 0;
                }
                break;
            case R.id.button5:
                if (m == 0) {
                    m = r;
                    r = 0;
                } else if (t == 0) {
                    t = r;
                    r = 0;
                } else if (i == 0) {
                    i = r;
                    r = 0;
                }
                break;
            case R.id.button6:
                if (r == 0) {
                    r = t;
                    t = 0;
                } else if (q == 0) {
                    q = t;
                    t = 0;
                } else if (y == 0) {
                    y = t;
                    t = 0;
                } else if (o == 0) {
                    o = t;
                    t = 0;
                }
                break;

            case R.id.button7:
                if (t == 0) {
                    t = y;
                    y = 0;
                } else if (w == 0) {
                    w = y;
                    y = 0;
                } else if (u == 0) {
                    u = y;
                    y = 0;
                } else if (p == 0) {
                    p = y;
                    y = 0;
                }
                break;

            case R.id.button8:
                if (y == 0) {
                    y = u;
                    u = 0;
                } else if (e == 0) {
                    e = u;
                    u = 0;
                } else if (a == 0) {
                    a = u;
                    u = 0;
                }
                break;

            case R.id.button9:
                if (r == 0) {
                    r = i;
                    i = 0;
                } else if (o == 0) {
                    o = i;
                    i = 0;
                } else if (s == 0) {
                    s = i;
                    i = 0;
                }
                break;

            case R.id.button10:
                if (i == 0) {
                    i = o;
                    o = 0;
                } else if (t == 0) {
                    t = o;
                    o = 0;
                } else if (p == 0) {
                    p = o;
                    o = 0;
                } else if (d == 0) {
                    d = o;
                    o = 0;
                }
                break;

            case R.id.button11:
                if (o == 0) {
                    o = p;
                    p = 0;
                } else if (y == 0) {
                    y = p;
                    p = 0;
                } else if (a == 0) {
                    a = p;
                    p = 0;
                } else if (f == 0) {
                    f = p;
                    p = 0;
                }
                break;

            case R.id.button12:
                if (p == 0) {
                    p = a;
                    a = 0;
                } else if (u == 0) {
                    u = a;
                    a = 0;
                } else if (g == 0) {
                    g = a;
                    a = 0;
                }
                break;

            case R.id.button13:
                if (i == 0) {
                    i = s;
                    s = 0;
                } else if (d == 0) {
                    d = s;
                    s = 0;
                }
                break;

            case R.id.button14:
                if (s == 0) {
                    s = d;
                    d = 0;
                } else if (o == 0) {
                    o = d;
                    d = 0;
                } else if (f == 0) {
                    f = d;
                    d = 0;
                }
                break;

            case R.id.button15:
                if (d == 0) {
                    d = f;
                    f = 0;
                } else if (p == 0) {
                    p = f;
                    f = 0;
                } else if (g == 0) {
                    g = f;
                    f = 0;
                }
                break;

            case R.id.button16:
                if (f == 0) {
                    f = g;
                    g = 0;
                } else if (a == 0) {
                    a = g;
                    g = 0;
                }
                checkVictory();

            default:
                break;
        }

        updateTextOfButtons();
    }


    private void updateTextOfButtons() {
        if (m == 0) {
            button1.setText("");
        } else {
            button1.setText(Integer.toString(m));
        }
        if (q == 0) {
            button2.setText("");
        } else {
            button2.setText(Integer.toString(q));
        }
        if (w == 0) {
            button3.setText("");
        } else button3.setText(Integer.toString(w));
        if (e == 0) {
            button4.setText("");
        } else button4.setText(Integer.toString(e));
        if (r == 0) {
            button5.setText("");
        } else button5.setText(Integer.toString(r));
        if (t == 0) {
            button6.setText("");
        } else button6.setText(Integer.toString(t));
        if (y == 0) {
            button7.setText("");
        } else button7.setText(Integer.toString(y));
        if (u == 0) {
            button8.setText("");
        } else button8.setText(Integer.toString(u));
        if (i == 0) {
            button9.setText("");
        } else button9.setText(Integer.toString(i));
        if (o == 0) {
            button10.setText("");
        } else button10.setText(Integer.toString(o));
        if (p == 0) {
            button11.setText("");
        } else button11.setText(Integer.toString(p));
        if (a == 0) {
            button12.setText("");
        } else button12.setText(Integer.toString(a));
        if (s == 0) {
            button13.setText("");
        } else button13.setText(Integer.toString(s));
        if (d == 0) {
            button14.setText("");
        } else button14.setText(Integer.toString(d));
        if (f == 0) {
            button15.setText("");
        } else button15.setText(Integer.toString(f));
        if (g == 0) {
            button16.setText("");
        } else button16.setText(Integer.toString(g));
    }

    private void checkVictory() {
        if (m == 1 && q == 2 && w == 3 && e == 4 && r == 5 && t == 6 && y == 7 && u == 8 && i == 9 && o == 10 && p == 11 && a == 12 && s == 13 && d == 14 && f == 15) {
            Toast toast = Toast.makeText(getApplicationContext(),
                    "Victory!", Toast.LENGTH_LONG);
            toast.show();
            button1.setEnabled(false);
            button2.setEnabled(false);
            button3.setEnabled(false);
            button4.setEnabled(false);
            button5.setEnabled(false);
            button6.setEnabled(false);
            button7.setEnabled(false);
            button8.setEnabled(false);
            button9.setEnabled(false);
            button10.setEnabled(false);
            button11.setEnabled(false);
            button12.setEnabled(false);
            button13.setEnabled(false);
            button14.setEnabled(false);
            button15.setEnabled(false);
            button16.setEnabled(false);
        }
    }

    // Swap last two elements if the first one is odd
    public void swap() {
        if (m % 2 == 1) {
            int z = f;
            f = g;
            g = z;

            Toast toast = Toast.makeText(getApplicationContext(),
                    "Первый элемент непарный. Перемещение двух последних...",
                    Toast.LENGTH_LONG);
            toast.show();
        }
    }
}

