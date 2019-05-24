package com.example.a0516;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

import java.text.NumberFormat;

public class resultscreen extends AppCompatActivity {
    private TextView tvresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mylayout);

        tvresult=(TextView)findViewById(R.id.textView3);
        showresult();
    }
    private  void  showresult(){
        NumberFormat nf =NumberFormat.getInstance();
        Bundle bundle =getIntent().getExtras();
        int data1=bundle.getInt("pro");
        int data2=bundle.getInt("dat");
        int data3=bundle.getInt("alg");
        int sum=data1+data2+data3;
        double avg=sum/3.0;
        String text="Programming="+data1+"\nData Structure="+data2+"\nAlgorithm="+data3+"\nsum="+sum+"\naverage="+nf.format(avg);
        tvresult.setText(text);
    }
    public void back(View v){finish();}

}
