package com.codeclan.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    Button paper;
    Button scissor;
    Button rock;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        paper = findViewById(R.id.paper);
        scissor = findViewById(R.id.scissor);
        rock = findViewById(R.id.rock);


    }

    public void onPaperButtonClick(View view){
        String selectionPaper = "paper";
        Intent intentPaper = new Intent(this, ResultsActivity.class);
        intentPaper.putExtra("selection", selectionPaper);
        startActivity(intentPaper);
    }

    public void onScissorButtonClick(View view){
        String selectionScissor = "scissor";
        Intent intentScissor = new Intent(this, ResultsActivity.class);
        intentScissor.putExtra("selection", selectionScissor);
        startActivity(intentScissor);
    }

    public void onRockButtonClick(View view){
        String selectionRock = "rock";
        Intent intentRock = new Intent(this, ResultsActivity.class);
        intentRock.putExtra("selection", selectionRock);
        startActivity(intentRock);
    }
}
