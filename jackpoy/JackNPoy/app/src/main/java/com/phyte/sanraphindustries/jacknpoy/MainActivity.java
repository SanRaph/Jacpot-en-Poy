package com.phyte.sanraphindustries.jacknpoy;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.Toast;


import com.example.phyte.jacknpoy.R;

import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Button button_rock;
    Button button_scissors;
    Button button_paper;

    ImageView imageView_computer;
    ImageView imageView_player;

    String computerChoice;
    String playerChoice;

    String result;
    String challenge;

    Random random;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       imageView_computer = findViewById(R.id.image_view_computer);
       imageView_player = findViewById(R.id.image_view_player);

       button_rock = findViewById(R.id.button_rock);
       button_scissors = findViewById(R.id.button_scissors);
       button_paper = findViewById(R.id.button_paper);

       random = new Random();





       button_rock.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {

               playerChoice = "rock";
               imageView_player.setImageResource(R.drawable.rockright);
               calculate();

           }
       });



        button_scissors.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playerChoice = "scissors";
                imageView_player.setImageResource(R.drawable.scissorsright);
                calculate();

            }
        });



        button_paper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                playerChoice = "paper";
                imageView_player.setImageResource(R.drawable.paperright);
                calculate();

            }
        });







    }





    public void calculate(){
        int computer = random.nextInt(3);
        if(computer == 0){
            computerChoice = "rock";
            imageView_computer.setImageResource(R.drawable.rockleft);
        } else if (computer == 1){
            computerChoice = "paper";
            imageView_computer.setImageResource(R.drawable.paperleft);
        }else if (computer == 2){
            computerChoice = "scissors";
            imageView_computer.setImageResource(R.drawable.scissorsleft);
        }

        //this is going in the method calculate immediately after the last if-else
        if (playerChoice.equals("rock") && computerChoice.equals("paper")){
            result = getString(R.string.you_lose);
            challenge = getString(R.string.challenge_one);
            Toast.makeText(MainActivity.this, challenge, Toast.LENGTH_SHORT).show();
        }else


        if (playerChoice.equals("rock") && computerChoice.equals("scissors")){
            result = getString(R.string.you_win);
        }else


        if (playerChoice.equals("paper") && computerChoice.equals("rock")){
            result = getString(R.string.you_win_two);
        }else


        if (playerChoice.equals("paper") && computerChoice.equals("scissors")){
            result = getString(R.string.you_lose_two);
            challenge = getString(R.string.challenge_two);
            Toast.makeText(MainActivity.this, challenge, Toast.LENGTH_SHORT).show();
        }else


        if (playerChoice.equals("scissors") && computerChoice.equals("paper")){
            result = getString(R.string.you_win_three);
        }else


        if (playerChoice.equals("scissors") && computerChoice.equals("rock")){
            result = getString(R.string.you_lose_three);
            challenge = getString(R.string.challenge_three);
            Toast.makeText(MainActivity.this, challenge, Toast.LENGTH_SHORT).show();
        }else


        if (playerChoice.equals("scissors") && computerChoice.equals("scissors")){
            result = getString(R.string.draw);
        }else


        if (playerChoice.equals("rock") && computerChoice.equals("rock")){
            result = getString(R.string.draw_two);
        }else

        if (playerChoice.equals("paper") && computerChoice.equals("paper")){
            result = getString(R.string.draw_three);
        }


        Toast.makeText(MainActivity.this, result, Toast.LENGTH_SHORT).show();

    }



}
