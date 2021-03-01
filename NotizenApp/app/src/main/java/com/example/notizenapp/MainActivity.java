package com.example.notizenapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.FileNotFoundException;
import java.io.IOException;

public class MainActivity extends AppCompatActivity {

    ReadWrite r;
    TextView t;

    public MainActivity() throws FileNotFoundException {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        try {
            r = new ReadWrite(openFileOutput("file.csv",MODE_APPEND),openFileInput("file.csv"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        Button b = (Button) findViewById(R.id.button);

        t = (TextView) findViewById(R.id.textView);


    }

    public void methonde1(View view) throws IOException {


            Toast.makeText(this, "Button pressed  -> " + t.getText(), Toast.LENGTH_SHORT).show();
            r.writetoFile((String) t.getText());



    }
}