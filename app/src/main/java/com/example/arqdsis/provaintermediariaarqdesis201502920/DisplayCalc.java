/*Prova Arqdesis 26/10/2017
Mônica Gomes RA:201502920
 */
package com.example.arqdsis.provaintermediariaarqdesis201502920;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.TextView;

public class DisplayCalc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_calc);
        Intent intent = getIntent();
        String message =   intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView textView = new TextView(this);
        textView.setTextSize(40);
        textView.setText(message);

        ViewGroup layout = (ViewGroup)   findViewById(R.id.activity_display_calc);
        layout.addView(textView);
    }
}
