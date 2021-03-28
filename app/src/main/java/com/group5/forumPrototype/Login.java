package com.group5.forumPrototype;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.content.Intent;
import android.widget.Button;

public class Login extends AppCompatActivity {




    Button loginBtn;
    Button forgotEmailBtn;
    Button forgotPassnBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);


        loginBtn = findViewById(R.id.button2);
        forgotEmailBtn = findViewById(R.id.button3);
        forgotPassnBtn = findViewById(R.id.button4);
        //event is generated when the user clicks login button
        loginBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //back to homepage with elements initialized
                Intent intent= new Intent(Login.this,SelectModule.class);
                startActivity(intent);

            }


        });

        forgotEmailBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //redirect the user to recover password page
                Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.strath.ac.uk/professionalservices/it/use/password/"));
                startActivity(intent);

            }


        });

        forgotPassnBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //redirect the user to recover password page
                Intent intent= new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.strath.ac.uk/professionalservices/it/use/password/"));
                startActivity(intent);


            }


        });

    }
}