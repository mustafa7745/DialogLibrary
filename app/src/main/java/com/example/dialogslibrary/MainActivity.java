package com.example.dialogslibrary;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.dialoglibs.DialogInput;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        DialogInput dialogInput=new DialogInput(this);
        dialogInput
                .setTitle("Please Wait...")
//                .setSubtitle("write your profile info here")
                  .setProgressbar(View.VISIBLE)
                .setBackgroundColor(R.color.white)
                .setFirstButtonText("CANCEL")
                .withFirstButtonListner(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        dialogInput.dismiss();
                        DialogInput dialogInput1=new DialogInput(MainActivity.this);
                        dialogInput1.setBackgroundColor(R.color.white).image_fail().setFirstButtonText("Ok").withFirstButtonListner(view1 -> {
                            dialogInput1.dismiss();
                        }).show();
                    }
                }).show();
    }
}