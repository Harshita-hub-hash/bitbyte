package com.example.bitbyte;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity {
    EditText EditText1, EditText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        EditText1 = (EditText)findViewById(R.id.EditText1);
        EditText2 = (EditText)findViewById(R.id.EditText2);
    }

    public void login(View view){
        String password;
       String username = EditText1.getText().toString();
       password = EditText2.getText().toString();



        if(!username.isEmpty()&&!password.isEmpty())
        {
            Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
             startActivity(intent);
        }
        else{
            if(username.isEmpty())
            {
                EditText1.setError("enter ur username or email");
                if(password.isEmpty())
                    EditText2.setError("ur password is weak");
            }
        }

    }
    public void skip(View view){
        Intent intent = new Intent(Main2Activity.this, Main3Activity.class);
        startActivity(intent);
    }
    public void Register(View view){
        Intent intent = new Intent(Main2Activity.this,Main4Activity.class);
        startActivity(intent);
    }
}
