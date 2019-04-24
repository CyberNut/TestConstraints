package com.example.testconstraints;

import android.support.constraint.ConstraintLayout;
import android.support.constraint.ConstraintSet;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    ConstraintLayout root;
    ConstraintSet constraintSet = new ConstraintSet();
    LinearLayout container;
    Button button1, button2, button3, button4;
    TextView textView, textCoord;
    private ViewGroup.LayoutParams layoutParams;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_test);

        button1 = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        button3 = findViewById(R.id.button3);
        button4 = findViewById(R.id.button4);
        root = findViewById(R.id.root);
        textView = findViewById(R.id.text);
        layoutParams = textView.getLayoutParams();
        textCoord = findViewById(R.id.textCoord);
        constraintSet.clone(root);
        container = findViewById(R.id.container);
        Button button = findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int containerId = container.getId();
                //container.setRotation(container.getRotation() + 90);
                textView.setRotation(textView.getRotation() + 90);
                constraintSet.clear(containerId);
                constraintSet.connect(containerId, ConstraintSet.START, button4.getId(), ConstraintSet.END, 8);
                constraintSet.connect(containerId, ConstraintSet.TOP, button1.getId(), ConstraintSet.BOTTOM, 8);
                constraintSet.connect(containerId, ConstraintSet.END, button3.getId(), ConstraintSet.START, 8);
                constraintSet.connect(containerId, ConstraintSet.BOTTOM, button2.getId(), ConstraintSet.TOP, 8);
                constraintSet.constrainWidth(containerId, ConstraintSet.MATCH_CONSTRAINT);
                constraintSet.constrainHeight(containerId, ConstraintSet.MATCH_CONSTRAINT);
                constraintSet.constrainWidth(textView.getId(), ConstraintSet.MATCH_CONSTRAINT);
                constraintSet.constrainHeight(textView.getId(), ConstraintSet.MATCH_CONSTRAINT);
                constraintSet.applyTo(root);
            }
        });
    }


    @Override
    protected void onResume() {
        super.onResume();
        //show();

    }

//    public void show() {
//        textCoord.setText("(" + textView.getLeft() + "," + textView.getTop() + ") size w = " + textView.getWidth() + " h = " + textView.getHeight());
//    }
}

