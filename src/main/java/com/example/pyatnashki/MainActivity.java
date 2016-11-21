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
    private int m = 1;
    private int q = 2;
    private int w = 3;
    private int e = 4;
    private int r = 5;
    private int t = 6;
    private int y = 7;
    private int u = 8;
    private int i = 9;
    private int o = 10;
    private int p = 11;
    private int a = 12;
    private int s = 13;
    private int d = 0;
    private int f = 14;
    private int g = 15;

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

//        class Randomise {
//            public int Rand() {
//               int m = 0;
//                do {
//                     m = (int) (Math.random() * 17);
//                } while (m = w | m = e | m = r | m = t | m = y | m = u | m = i | m = o | m = p | m = a | m = s | m = d | m = f | m = g);
//            return m;
//            }
//        }

//        new Randomise().Rand();

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
        e = numbers.get(2);
        r = numbers.get(3);
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

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (m == 0) {
                    m = q;
                    q = 0;
                    updateTextOfButtons();
                    button2.setText("");
                } else if (w == 0) {
                    w = q;
                    q = 0;
                    updateTextOfButtons();
                    button2.setText("");
                } else if (t == 0) {
                    t = q;
                    q = 0;
                    updateTextOfButtons();
                    button2.setText("");
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (q == 0) {
                    q = w;
                    w = 0;
                    updateTextOfButtons();
                    button3.setText("");
                } else if (e == 0) {
                    e = w;
                    w = 0;
                    updateTextOfButtons();
                    button3.setText("");
                } else if (y == 0) {
                    y = w;
                    w = 0;
                    updateTextOfButtons();
                    button3.setText("");
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (w == 0) {
                    w = e;
                    e = 0;
                    updateTextOfButtons();
                    button4.setText("");

                } else if (u == 0) {
                    u = e;
                    e = 0;
                    updateTextOfButtons();
                    button4.setText("");
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (m == 0) {
                    m = r;
                    r = 0;
                    updateTextOfButtons();
                    button5.setText("");
                } else if (t == 0) {
                    t = r;
                    r = 0;
                    updateTextOfButtons();
                    button5.setText("");
                } else if (i == 0) {
                    i = r;
                    r = 0;
                    updateTextOfButtons();
                    button5.setText("");
                }
            }
        });

        button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (r == 0) {
                    r = t;
                    t = 0;
                    updateTextOfButtons();
                    button6.setText("");
                } else if (q == 0) {
                    q = t;
                    t = 0;
                    updateTextOfButtons();
                    button6.setText("");
                } else if (y == 0) {
                    y = t;
                    t = 0;
                    updateTextOfButtons();
                    button6.setText("");
                } else if (o == 0) {
                    o = t;
                    t = 0;
                    updateTextOfButtons();
                    button6.setText("");
                }
            }
        });

        button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (t == 0) {
                    t = y;
                    y = 0;
                    updateTextOfButtons();
                    button7.setText("");
                } else if (w == 0) {
                    w = y;
                    y = 0;
                    updateTextOfButtons();
                    button7.setText("");
                } else if (u == 0) {
                    u = y;
                    y = 0;
                    updateTextOfButtons();
                    button7.setText("");
                } else if (p == 0) {
                    p = y;
                    y = 0;
                    updateTextOfButtons();
                    button7.setText("");
                }
            }
        });

        button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (y == 0) {
                    y = u;
                    u = 0;
                    updateTextOfButtons();
                    button8.setText("");
                } else if (e == 0) {
                    e = u;
                    u = 0;
                    updateTextOfButtons();
                    button8.setText("");
                } else if (a == 0) {
                    a = u;
                    u = 0;
                    updateTextOfButtons();
                    button8.setText("");
                }
            }
        });

        button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (r == 0) {
                    r = i;
                    i = 0;
                    updateTextOfButtons();
                    button9.setText("");
                } else if (o == 0) {
                    o = i;
                    i = 0;
                    updateTextOfButtons();
                    button9.setText("");
                } else if (s == 0) {
                    s = i;
                    i = 0;
                    updateTextOfButtons();
                    button9.setText("");
                }
            }
        });

        button10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i == 0) {
                    i = o;
                    o = 0;
                    updateTextOfButtons();
                    button10.setText("");
                } else if (t == 0) {
                    t = o;
                    o = 0;
                    updateTextOfButtons();
                    button10.setText("");
                } else if (p == 0) {
                    p = o;
                    o = 0;
                    updateTextOfButtons();
                    button10.setText("");
                } else if (d == 0) {
                    d = o;
                    o = 0;
                    updateTextOfButtons();
                    button10.setText("");
                }
            }
        });

        button11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (o == 0) {
                    o = p;
                    p = 0;
                    updateTextOfButtons();
                    button11.setText("");
                } else if (y == 0) {
                    y = p;
                    p = 0;
                    updateTextOfButtons();
                    button11.setText("");
                } else if (a == 0) {
                    a = p;
                    p = 0;
                    updateTextOfButtons();
                    button11.setText("");
                } else if (f == 0) {
                    f = p;
                    p = 0;
                    updateTextOfButtons();
                    button11.setText("");
                }
            }
        });

        button12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (p == 0) {
                    p = a;
                    a = 0;
                    updateTextOfButtons();
                    button12.setText("");
                } else if (u == 0) {
                    u = a;
                    a = 0;
                    updateTextOfButtons();
                    button12.setText("");
                } else if (g == 0) {
                    g = a;
                    a = 0;
                    updateTextOfButtons();
                    button12.setText("");
                }
            }
        });

        button13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (i == 0) {
                    i = s;
                    s = 0;
                    updateTextOfButtons();
                    button13.setText("");
                } else if (d == 0) {
                    d = s;
                    s = 0;
                    updateTextOfButtons();
                    button13.setText("");
                }
            }
        });

        button14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (s == 0) {
                    s = d;
                    d = 0;
                    updateTextOfButtons();
                    button14.setText("");
                } else if (o == 0) {
                    o = d;
                    d = 0;
                    updateTextOfButtons();
                    button14.setText("");
                } else if (f == 0) {
                    f = d;
                    d = 0;
                    updateTextOfButtons();
                    button14.setText("");
                }
            }
        });

        button15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (d == 0) {
                    d = f;
                    f = 0;
                    updateTextOfButtons();
                    button15.setText("");
                } else if (p == 0) {
                    p = f;
                    f = 0;
                    updateTextOfButtons();
                    button15.setText("");
                } else if (g == 0) {
                    g = f;
                    f = 0;
                    updateTextOfButtons();
                    button15.setText("");
                }
            }
        });

        button16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (f == 0) {
                    f = g;
                    g = 0;
                    updateTextOfButtons();
                    button16.setText("");
                } else if (a == 0) {
                    a = g;
                    g = 0;
                    updateTextOfButtons();
                    button16.setText("");
                }

                checkVictory();
            }
        });
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
        Log.d(TAG, "Click on button 1");

        switch (view.getId()) {
            case R.id.button1:
                if (q == 0) {
                    q = m;
                    m = 0;
                    button1.setText("");
                } else if (r == 0) {
                    r = m;
                    m = 0;
                    button1.setText("");
                }
                break;

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

    // TODO: Comment what it does
    public void swap() {
        if (m % 2 == 1) {
            int z = f;
            f = g;
            g = z;

            Toast toast = Toast.makeText(getApplicationContext(),
                    "First item is an even. Replacing...",
                    Toast.LENGTH_LONG);
            toast.show();
        }
    }
}

