package com.via.ist_app;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private int btnClickToggle=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final TextView test111 = findViewById(R.id.Text1);
        final TextView text = findViewById(R.id.Text1);
        final ImageView image = findViewById(R.id.aciel);
        final TextView text2 = findViewById(R.id.textView);
        final Button btn = findViewById(R.id.button);
        final Button btn2 = findViewById(R.id.button2);
        image.setVisibility(View.INVISIBLE);
        text2.setVisibility(View.INVISIBLE);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(btnClickToggle==1){
                    image.setVisibility(View.INVISIBLE);
                    text2.setVisibility(View.INVISIBLE);
                    btn.setText("나와랏!");
                    btnClickToggle=0;
                } else {
                    image.setVisibility(View.VISIBLE);
                    text2.setVisibility(View.VISIBLE);
                    btn.setText("건후닷!");

                    btnClickToggle=1;
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view){
                Intent intent = new Intent(getApplicationContext(), Login_page.class);
                startActivity(intent);
            }
        });
    }
}
