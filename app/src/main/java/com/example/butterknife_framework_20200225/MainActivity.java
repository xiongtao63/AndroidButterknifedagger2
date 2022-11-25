package com.example.butterknife_framework_20200225;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

import com.example.annotations.BindView;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn)
    Button btn;

//    @BindView(R.id.btn2)
//    Button btn2;
//
//    @BindView(R.id.btn3)
//    Button btn3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        JettButterknife.bind(this);

        btn.setText("1234");
    }
}
