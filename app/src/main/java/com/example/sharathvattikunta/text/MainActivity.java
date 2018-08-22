package com.example.sharathvattikunta.text;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        final EditText Text =(EditText) findViewById(R.id.matter);

        Button Send = (Button)findViewById(R.id.Send);
       Send.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View view) {
               String matter = Text.getText().toString();

               Intent intent = new Intent(MainActivity.this, DisplayActivity.class);
               intent.putExtra("TEXT", matter );
               startActivity(intent);
           }
       });
    }
}
