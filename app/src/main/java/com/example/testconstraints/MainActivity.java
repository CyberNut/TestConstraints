package com.example.testconstraints;

import android.os.Bundle;
import android.support.constraint.ConstraintLayout;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.github.rongi.rotate_layout.layout.RotateLayout;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout root;
    RotateLayout container;
    Button button1, button2, button3, button4;

    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        root = findViewById(R.id.root);

        button1 = findViewById(R.id.button);
        button1.setText("+90");

        button2 = findViewById(R.id.button2);
        button2.setText("+180");

        button3 = findViewById(R.id.button3);
        button3.setText("-90");

        button4 = findViewById(R.id.button4);
        button4.setText("+360");

        textView = findViewById(R.id.text);

        container = findViewById(R.id.container);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                container.setAngle(90);
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                container.setAngle(180);
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                container.setAngle(-90);
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                container.setAngle(0);
            }
        });
    }

    @Override
    protected void onResume() {
        super.onResume();
    }


}

