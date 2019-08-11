package com.example.gee;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class gItems extends AppCompatActivity {
    Button add_view;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gactivity_items);

        add_view = findViewById(R.id.item_small_button1);

    }


    @Override
    protected void onResume() {
        super.onResume();

        add_view.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(com.example.gee.gItems.this, com.example.gee.gItemDescription.class);
                startActivity(intent);
            }
        });
    }
}
