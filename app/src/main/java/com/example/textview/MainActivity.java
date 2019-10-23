package com.example.textview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private boolean editado;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editado=false;
    }
    public void commentar (View view){
        EditText texte = (EditText) findViewById(R.id.editText);
        Button button =(Button) view;
        if (editado==false){
            button.setText("Stoping adding text");
            texte.setText(texte.getText()+"\n\n#");
            texte.setEnabled(true);
            texte.requestFocus();
        }else{
            texte.clearFocus();
            texte.setText("Add comment");
            texte.setEnabled(false);

        }
        editado^=true;
    }
}
