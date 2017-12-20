package com.codeclan.rockpaperscissors;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class ResultsActivity extends AppCompatActivity {

    TextView result;
    TextView computerSelection;
    TextView userSelection;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_results);
        Log.d(getClass().toString(), "onCreate called");

        result = findViewById(R.id.result);
        computerSelection = findViewById(R.id.computerSelection);
        userSelection = findViewById(R.id.userSelection);

        Intent intent = getIntent();
        Bundle extras = intent.getExtras();
        String answer = extras.getString("selection");

        User player;
        User computer;
        RockPaperScissors game;
        String whoWon;

        game = new RockPaperScissors();


        player = new User(answer);
        userSelection.setText("The player selected: " + answer);



        computer = new User(game.randomSelection());
        computerSelection.setText("The computer selected: " + computer.getSelection());

        whoWon = game.whoWins(player, computer);


        result.setText(whoWon);

    }
}
