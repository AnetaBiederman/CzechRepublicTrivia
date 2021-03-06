package com.example.android.czechrepublictrivia;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class UserName extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_name);

    Button next = findViewById(R.id.button_next);
        next.setOnClickListener(new View.OnClickListener() {

            @Override
        public void onClick(View v) {
                EditText nameInput = (EditText) findViewById(R.id.edit_user_name);
                String userName = nameInput.getText().toString();
            if(!TextUtils.isEmpty(userName)) {
                Intent intent = new Intent(UserName.this, MainActivity.class);
                intent.putExtra("name", userName);
                startActivity(intent);
            }
            else {
                AlertDialog.Builder alertDialog = new AlertDialog.Builder(UserName.this);
                alertDialog.setMessage("Please enter your name!");
                alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {

                    }
                });
                alertDialog.show();
            }
        }
    });
}
}

