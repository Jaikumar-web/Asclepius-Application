package com.example.asclepius;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.os.Bundle;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;

public class Skincare extends AppCompatActivity {

    LinearLayout expandable_view, x1, x2, x3, x4, x5;
    TextView textView, t1, t2, t3, t4, t5;
    CardView cardView, c1, c2, c3, c4, c5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_skincare);


        expandable_view = findViewById(R.id.expandable_view);
        textView = findViewById(R.id.showtext);
        cardView = findViewById(R.id.cardview_expandable);
        x1 = findViewById(R.id.expandable_view1);
        t1 = findViewById(R.id.showtext1);
        c1 = findViewById(R.id.cardview_expandable1);
        x2 = findViewById(R.id.expandable_view2);
        t2 = findViewById(R.id.showtext2);
        c2 = findViewById(R.id.cardview_expandable2);
        x3 = findViewById(R.id.expandable_view3);
        t3 = findViewById(R.id.showtext3);
        c3 = findViewById(R.id.cardview_expandable3);
        x4 = findViewById(R.id.expandable_view4);
        t4 = findViewById(R.id.showtext4);
        c4 = findViewById(R.id.cardview_expandable4);
        x5 = findViewById(R.id.expandable_view5);
        t5 = findViewById(R.id.showtext5);
        c5 = findViewById(R.id.cardview_expandable5);


    }

    public void showmore(View view) {

        if (expandable_view.getVisibility() == View.GONE) {
            textView.setText("show less");
            TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
            expandable_view.setVisibility(View.VISIBLE);
        } else {
            textView.setText("show more");
            TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
            expandable_view.setVisibility(View.GONE);
        }
    }

    public void showmore2(View view) {
        if (x5.getVisibility() == View.GONE) {
            t5.setText("show less");
            TransitionManager.beginDelayedTransition(c5, new AutoTransition());
            x5.setVisibility(View.VISIBLE);
        } else {
            t5.setText("show more");
            TransitionManager.beginDelayedTransition(c5, new AutoTransition());
            x5.setVisibility(View.GONE);
        }


    }
}
