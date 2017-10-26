/*Prova Arqdesis 26/10/2017
Mônica Gomes RA:201502920
 */
package com.example.arqdsis.provaintermediariaarqdesis201502920;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    public final static String EXTRA_MESSAGE = "com.example.arqdesis.provaintermediariaarqdesis201502920.MESSAGE";

    //será chamado quando o usuário clicar em Enviar
    public void sendMessage(View view){
        Intent intent = new Intent(this, DisplayCalc.class);
        EditText editText = (EditText) findViewById(R.id.numero);
        EditText editText2 = (EditText) findViewById(R.id.ate);
        String message = editText.getText().toString();
        String message2 = editText2.getText().toString();

        for (int i = 0; i < message2.length(); i++) {
            message2 += message;
        }

        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
