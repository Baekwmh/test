package com.example.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    private Button t_denglu;
    private Button t_tuichu;
    private EditText t_username;
    private EditText t_password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        t_denglu = findViewById(R.id.denglu);
        t_tuichu = findViewById(R.id.tuichu);
        t_password = findViewById(R.id.password);
        t_username = findViewById(R.id.username);
        t_denglu.setOnClickListener(this);
        t_tuichu.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent intent;
        switch (v.getId()) {
            case R.id.denglu:
                if("1234".equals(t_username.getText())&&"123".equals(t_password.getText())){
                    intent = new Intent(MainActivity.this, Main2Activity.class);
                    startActivity(intent);
                }else{
                    Toast.makeText(MainActivity.this, "登录失败", Toast.LENGTH_LONG).show();
                }

                break;
            case R.id.tuichu:

                break;
        }
    }


}
