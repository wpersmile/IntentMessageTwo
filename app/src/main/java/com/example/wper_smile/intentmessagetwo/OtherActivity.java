package com.example.wper_smile.intentmessagetwo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import static android.widget.Toast.LENGTH_LONG;

public class OtherActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_other);

        Intent intent=getIntent();
        final String name=intent.getStringExtra("name");
        final Integer age=intent.getIntExtra("age", 20);
        Toast.makeText(this, name+age+"岁", Toast.LENGTH_SHORT).show();


        Button button=(Button)findViewById(R.id.returnBtn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent1=new Intent(OtherActivity.this,MainActivity.class);
                intent1.putExtra("result","姓名:"+name+" 年龄:"+age);
                setResult(0,intent1);
                finish();
            }
        });
    }
}
