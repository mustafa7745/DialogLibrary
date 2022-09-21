package com.example.dialogslibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.dialoglibs.DialogInput;


public class MainActivity extends AppCompatActivity {
 String[] title=new String[]{"mustafa","asmail","mohammed"};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DialogInput dialogInput=new DialogInput(this);
        dialogInput.setRadioButton(3,title).onSaveRadioButtonListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                dialogInput.onSaveRadioButton();
            }
        }).show();

    }
}