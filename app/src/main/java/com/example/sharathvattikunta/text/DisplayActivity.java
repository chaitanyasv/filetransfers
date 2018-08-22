package com.example.sharathvattikunta.text;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayActivity extends AppCompatActivity {

    String Text;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display);
        Text = getIntent().getExtras().getString("TEXT");

        TextView textView = (TextView)findViewById(R.id.textView);
        textView.setText(""+""+Text);

    }
}
