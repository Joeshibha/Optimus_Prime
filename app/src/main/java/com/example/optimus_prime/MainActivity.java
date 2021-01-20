package com.example.optimus_prime;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button toast;
Button tv;
Button go;
EditText e;
String s1;
String s2;
String s3;
TextView t;
RadioGroup radioGroup;
RadioButton radioButton;
EditText buy1;
EditText buy2;
EditText buy3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toast=findViewById(R.id.button);
        tv=findViewById(R.id.button2);
        go=findViewById(R.id.button4);
        buy1=findViewById(R.id.editTextTextPersonName3);
        buy2=findViewById(R.id.editTextTextPersonName4);
        buy3=findViewById(R.id.editTextTextPersonName5);
        toast.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                s1=buy1.getText().toString();
                s2=buy2.getText().toString();
                s3=buy3.getText().toString();
                Toast.makeText(MainActivity.this,s1,Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this,s2,Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this,s3,Toast.LENGTH_SHORT).show();
                t.setText(s1);
                t.setText(s2);
                t.setText(s3);
            }
        });
        tv.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=buy1.getText().toString();
                s2=buy2.getText().toString();
                s3=buy3.getText().toString();
            }
        });
        go.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1=buy1.getText().toString();
                s2=buy2.getText().toString();
                s3=buy3.getText().toString();
                Toast.makeText(MainActivity.this,s1,Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this,s2,Toast.LENGTH_SHORT).show();
                Toast.makeText(MainActivity.this,s3,Toast.LENGTH_SHORT).show();
                Intent obj=new Intent(MainActivity.this,MainActivity2.class);
                startActivity(obj);
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.sp,menu);
        return super.onCreateOptionsMenu(menu);
    }
    public void jarvis(MenuItem item){
        new AlertDialog.Builder(MainActivity.this)
                .setTitle("Alert!")
                .setMessage("Battery Low!")
                .setPositiveButton("YES", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialog, int which) {
                        Intent obj=new Intent(MainActivity.this,MainActivity2.class);
                        startActivity(obj);
                    }
                })
                .setNegativeButton("NO",null)
                .setNeutralButton("MAYBE",null)
                .show();
    }
    public void friday(MenuItem item){
        Dialog dia=new Dialog(MainActivity.this);
        dia.setContentView(R.layout.customdia);
        dia.show();
    }
    public void vision(MenuItem item){
        Toast.makeText(this, "website",Toast.LENGTH_SHORT).show();
        Intent obj=new Intent(MainActivity.this,MainActivity2.class);
        startActivity(obj);
    }
}