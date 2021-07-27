package com.example.gonextavtivity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class ActivityNext extends AppCompatActivity {
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_next);
        btn=(Button)findViewById(R.id.button2);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(getApplicationContext(),MainActivity.class);

                Bundle extras = getIntent().getExtras();
                String value1 = extras.getString("Value1");
                String value2 = extras.getString("Value2");
                Toast.makeText(getApplicationContext(),"Values are:\n First value: "+value1+
                        "\n Second Value: "+value2, Toast.LENGTH_LONG).show();
                startActivity(i);
            }
        });
    }
}