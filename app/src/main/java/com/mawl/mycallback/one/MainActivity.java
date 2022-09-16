package com.mawl.mycallback.one;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.mawl.mycallback.R;
import com.mawl.mycallback.two.MainActivity2;

public class MainActivity extends AppCompatActivity implements MyInterfaceOne{


    private MyTest myTest;
    private TextView tv_test_one;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        tv_test_one=findViewById(R.id.tv_test_one);

        myTest=new MyTest(this);
        myTest.getTestResult("高小玉离婚吧");


        findViewById(R.id.button).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, MainActivity2.class));
            }
        });
    }

    @Override
    public void sucess(String s) {
        tv_test_one.setText(s);

    }

    @Override
    public void failed(String erro) {
        tv_test_one.setText(erro);
    }
}