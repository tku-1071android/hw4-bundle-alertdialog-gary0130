package com.example.a0516;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText e1,e2,e3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initobj();
    }

    protected void initobj(){
        e1=(EditText)findViewById(R.id.et1);
        e2=(EditText)findViewById(R.id.et2);
        e3=(EditText)findViewById(R.id.et3);
    }

    private boolean isValid(EditText editText){
        String pattern="1[0]{2}|[0-9]{1,2}";
        String text=editText.getText().toString();
        if(!text.matches(pattern)){
            editText.setError("0~100");
            return  false;
        }else{
            return true;
        }

    }
    public void submit(View v){
        boolean pass=isValid(e1)&&isValid(e2)&&isValid(e3);
        if(!pass){
            return;
        }
        int data1=Integer.parseInt(e1.getText().toString());
        int data2=Integer.parseInt(e2.getText().toString());
        int data3=Integer.parseInt(e3.getText().toString());
        Intent intent=new Intent(this,resultscreen.class);
        Bundle bundle =new Bundle();
        bundle.putInt("pro",data1);
        bundle.putInt("dat",data2);
        bundle.putInt("alg",data3);
        intent.putExtras(bundle);
        startActivity(intent);
    }
}
