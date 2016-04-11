package com.example.student.createanapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.content.Intent;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.view.View;
import java.util.Random;


public class GameMainMenuActivity extends AppCompatActivity {

    Button btnRock, btnPaper, btnScissors, btnLizard, btnSpock, btnQuit;
    TextView txtvwStatus;

    //Creates the computer's Rock, Paper, Lizard, Spock
    Random playGame = new Random();
    int i = playGame.nextInt(5);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game_main_menu);

        btnSpock = (Button) findViewById(R.id.btnSpock);
        btnLizard = (Button) findViewById(R.id.btnLizard);
        btnPaper = (Button) findViewById(R.id.btnPaper);
        btnRock = (Button) findViewById(R.id.btnRock);
        btnScissors = (Button) findViewById(R.id.btnScissors);
        btnQuit = (Button) findViewById(R.id.btnQuit);
        txtvwStatus = (TextView) findViewById(R.id.txtvwStatus);

    }

    //When Rock button is clicked, it will do one of the five things (a random play)
    public void playRock(View vw) {
        if (i == 0) {
            txtvwStatus.setText("Rock vs. Rock: It's a tie!");
        } else if (i == 1) {
            txtvwStatus.setText("Paper covers Rock: Computer wins this round");
        } else if (i == 2) {
            txtvwStatus.setText("Rock crushes Scissors: Player wins this round");
        } else if (i == 3) {
            txtvwStatus.setText("Rock crushes Lizard: Player wins this round");
        } else {
            txtvwStatus.setText("Spock vaporizes Rock: Computer wins this round");
        }
    }

    //When Paper button is clicked, it will do one of the five things (a random play)
    public void playPaper(View vw) {
        if (i == 0) {
            txtvwStatus.setText("Paper covers Rock: Player wins this round");
        } else if (i == 1) {
            txtvwStatus.setText("Paper vs. Paper: It's a tie!");
        } else if (i == 2) {
            txtvwStatus.setText("Scissors cuts Paper: Cmputer wins this round");
        } else if (i == 3) {
            txtvwStatus.setText("Lizard eats Paper: Computer wins this round");
        } else {
            txtvwStatus.setText("Paper disproves Spock: Player wins this round");
        }
    }

    //When Scissors button is clicked, it will do one of the five things (a random play)
    public void playScissors(View vw) {
        if (i == 0) {
            txtvwStatus.setText("Rock crushes Scissors: Computer wins this round");
        } else if (i == 1) {
            txtvwStatus.setText("Sicssors cuts Paper: Player wins this round");
        } else if (i == 2) {
            txtvwStatus.setText("Scissors vs. Scissors: It's a tie!");
        } else if (i == 3) {
            txtvwStatus.setText("Scissors cuts Lizard: Player wins this round");
        } else {
            txtvwStatus.setText("Spock smashes Scissors: Computer wins this round");
        }
    }

    //When Lizard button is clicked, it will do one of the five things (a random play)
    public void playLizard(View vw) {
        if (i == 0) {
            txtvwStatus.setText("Rock smashes Lizard: Computer wins this round");
        } else if (i == 1) {
            txtvwStatus.setText("Lizard eats Paper: Player wins this round");
        } else if (i == 2) {
            txtvwStatus.setText("Rock crushes Lizard: Computer wins this round");
        } else if (i == 3) {
            txtvwStatus.setText("Lizard vs. Lizard: It's a tie!");
        } else {
            txtvwStatus.setText("Lizard poisons Spock: Player wins this round");
        }
    }

    //When Spock button is clicked, it will do one of the five things (a random play)
    public void playSpock(View vw) {
        if (i == 0) {
            txtvwStatus.setText("Spock vaporizes Rock: Player wins this round");
        } else if (i == 1) {
            txtvwStatus.setText("Paper disproves Spock: Computer wins this round");
        } else if (i == 2) {
            txtvwStatus.setText("Spock smashes Scissors: Player wins this round");
        } else if (i == 3) {
            txtvwStatus.setText("Lizzard poisons Spock: Computer wins this round");
        } else {
            txtvwStatus.setText("Spock vs. Spock: It's a tie");
        }
    }

    //A pop-up dialog that asks the player when he/she clicks the Quit button
    public void quitGame(View vw) {
        AlertDialog.Builder quittingGame = new AlertDialog.Builder(GameMainMenuActivity.this);
        quittingGame.setTitle("Quit Game?");
        quittingGame.setMessage("Are you sure you want to quit the game?");
//If the player clicks yes, it will send it back to the main menu (intent)
        quittingGame.setPositiveButton("YES", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                Intent goBackToStart = new Intent(GameMainMenuActivity.this, MainMenuActivity.class);
                startActivity(goBackToStart);
            }
        });
//If the player clicks no, the pop-up dialog will disappear and the player cna continue playing
        quittingGame.setNegativeButton("NO", new DialogInterface.OnClickListener() {
            public void onClick(DialogInterface dialog, int id) {
                dialog.cancel();
            }
        });
//How the pop-up dialog be shown on the phone screen
        quittingGame.show();

    }
}
