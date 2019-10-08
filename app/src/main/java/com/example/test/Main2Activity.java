package com.example.test;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Main2Activity extends AppCompatActivity implements View.OnClickListener {
    private Button t_course;
    private Button t_tool;
    private EditText t_name;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        t_course.findViewById(R.id.course);
        t_name.findViewById(R.id.name);
        t_tool.findViewById(R.id.tool);
        t_course.setOnClickListener(this);
        t_tool.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        Intent intent;
        switch (v.getId()) {
            case R.id.course:
                intent = new Intent(Main2Activity.this, Main3Activity.class);
                startActivity(intent);
        }
    }
}
