package com.example.dialogslibrary;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.example.dialoglibs.DialogInput;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        DialogInput dialogInput=new DialogInput(this);
        dialogInput.setTitle("User Information")
                .setSubtitle("write your profile info here")
                .setFirstTextField("Username:","mustafa")
                .setSecondTextField("Email","mustafa@gmail.com")
                .isEnabledFirstTextField(false)
                .setIcon(R.mipmap.ic_launcher_round)
                .setLargeTextField("")
                .setThirdTextField("mustafa","email")
                .setFirstButtonText("CONNECT")
                .setSecondButtonText("CANCEL")
                .withFirstButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Toast.makeText(MainActivity.this, dialogInput.getFirstTextField(), Toast.LENGTH_SHORT).show();
                    }
                })
                .withSecondButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialogInput.dismiss();
                    }
                })
                .show();
    }
}