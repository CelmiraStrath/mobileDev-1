package com.group5.forumPrototype;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class SelectModule extends Activity {

    Spinner studentSpinner;
    ArrayAdapter<CharSequence> studentAdapter;
    Button cs991Button;
    Button logoutBtn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_select_module);

        cs991Button = findViewById(R.id.CS991Button);
        cs991Button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {
                openPostPage();
            }
        });

        studentSpinner = (Spinner) findViewById(R.id.studentSpinner);
        studentAdapter = ArrayAdapter.createFromResource(this, R.array.student_spinner, android.R.layout.simple_spinner_item);
        studentAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        studentSpinner.setAdapter(studentAdapter);

        // to complete
       // logoutBtn = findViewById(R.id.);


        logoutBtn.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {

                //back to homepage with elements initialized
                Intent intent= new Intent(SelectModule.this,Login.class);
                startActivity(intent);

            }


        });
    }

    private void openPostPage() {
        Intent intent = new Intent(this, DisplayForumPost.class);
        startActivity(intent);
    }


}
