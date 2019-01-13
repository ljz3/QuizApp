package com.example.android.quizapp;

import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    int correct = 0;
    int incorrect = 0;
    int questionNumber = 1;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView aOne = (TextView) findViewById(R.id.aOne);
        TextView aTwo = (TextView) findViewById(R.id.aTwo);
        TextView aThree = (TextView) findViewById(R.id.aThree);
        TextView aFour = (TextView) findViewById(R.id.aFour);
        CheckBox cOne = (CheckBox) findViewById(R.id.buttonOne);
        CheckBox cTwo = (CheckBox) findViewById(R.id.buttonTwo);
        CheckBox cThree = (CheckBox) findViewById(R.id.buttonThree);
        CheckBox cFour = (CheckBox) findViewById(R.id.buttonFour);
        RadioGroup radioGroup = (RadioGroup) findViewById(R.id.radioButtons);

        aOne.setVisibility(View.INVISIBLE);
        aTwo.setVisibility(View.INVISIBLE);
        aThree.setVisibility(View.INVISIBLE);
        aFour.setVisibility(View.INVISIBLE);
        cOne.setVisibility(View.INVISIBLE);
        cTwo.setVisibility(View.INVISIBLE);
        cThree.setVisibility(View.INVISIBLE);
        cFour.setVisibility(View.INVISIBLE);
        radioGroup.setVisibility(View.INVISIBLE);

        textQuestion();
    }

    public void submit(View v) {
        checkAnswer();
        textQuestion();

    }


    public void updateScore() {
        TextView score = (TextView) findViewById(R.id.score);
        score.setText("Score: " + correct + "/" + questionNumber + "\nCorrect: " + correct + "\nIncorrect: " + incorrect);


    }

    public void checkAnswer() {
        String strCorrect = "Correct!";
       String strIncorrect = "Incorrect!";
       int duration = Toast.LENGTH_SHORT;
        TextView question = (TextView) findViewById(R.id.question);
        CheckBox cOne = (CheckBox) findViewById(R.id.buttonOne);
        CheckBox cTwo = (CheckBox) findViewById(R.id.buttonTwo);
        CheckBox cThree = (CheckBox) findViewById(R.id.buttonThree);
        CheckBox cFour = (CheckBox) findViewById(R.id.buttonFour);
        EditText editText = (EditText) findViewById(R.id.editText);
        RadioButton bOne = (RadioButton) findViewById(R.id.radioOne);
        RadioButton bThree = (RadioButton) findViewById(R.id.radioThree);
        RadioGroup radioGrp = (RadioGroup) findViewById(R.id.radioButtons);

        switch (questionNumber) {
            case 1:
                if ("russia".equalsIgnoreCase(editText.getText().toString())) {
                    correct++;
                    Toast.makeText(this,strCorrect,duration).show();
                } else {
                    incorrect++;
                    Toast.makeText(this,strIncorrect,duration).show();
                }
                updateScore();
                questionNumber++;
                break;
            case 2:
                if (!cOne.isChecked() && cTwo.isChecked() && cThree.isChecked() && cFour.isChecked()) {
                    correct++;
                    Toast.makeText(this,strCorrect,duration).show();
                } else {
                    incorrect++;
                    Toast.makeText(this,strIncorrect,duration).show();
                }
                updateScore();
                questionNumber++;
                break;
            case 3:
                if (bOne.isChecked()) {
                    correct++;
                    Toast.makeText(this,strCorrect,duration).show();
                } else {
                    incorrect++;
                    Toast.makeText(this,strIncorrect,duration).show();
                }
                updateScore();
                questionNumber++;
                break;
            case 4:
                if (bThree.isChecked()) {
                    correct++;
                    Toast.makeText(this,strCorrect,duration).show();
                } else {
                    incorrect++;
                    Toast.makeText(this,strIncorrect,duration).show();
                }
                updateScore();
                questionNumber++;
                question.setText("All questions done!");
                radioGrp.setVisibility(View.INVISIBLE);
                break;
            default:
                question.setText("All questions done!");
                radioGrp.setVisibility(View.INVISIBLE);

        }

    }

    public void textQuestion() {
        TextView question = (TextView) findViewById(R.id.question);
        TextView aOne = (TextView) findViewById(R.id.aOne);
        TextView aTwo = (TextView) findViewById(R.id.aTwo);
        TextView aThree = (TextView) findViewById(R.id.aThree);
        TextView aFour = (TextView) findViewById(R.id.aFour);
        Button bOne = (CheckBox) findViewById(R.id.buttonOne);
        Button bTwo = (CheckBox) findViewById(R.id.buttonTwo);
        Button bThree = (CheckBox) findViewById(R.id.buttonThree);
        Button bFour = (CheckBox) findViewById(R.id.buttonFour);
        EditText editText = (EditText) findViewById(R.id.editText);
        RadioGroup radioGrp = (RadioGroup) findViewById(R.id.radioButtons);
        RadioButton radioOne = (RadioButton) findViewById(R.id.radioOne);
        RadioButton radioTwo = (RadioButton) findViewById(R.id.radioTwo);
        RadioButton radioThree = (RadioButton) findViewById(R.id.radioThree);
        RadioButton radioFour = (RadioButton) findViewById(R.id.radioFour);
        switch (questionNumber) {
            case 1:
                question.setText("What is the largest country in the world by landmass?");
                break;
            case 2:
                editText.setVisibility(View.INVISIBLE);
                aOne.setVisibility(View.VISIBLE);
                aTwo.setVisibility(View.VISIBLE);
                aThree.setVisibility(View.VISIBLE);
                aFour.setVisibility(View.VISIBLE);
                bOne.setVisibility(View.VISIBLE);
                bTwo.setVisibility(View.VISIBLE);
                bThree.setVisibility(View.VISIBLE);
                bFour.setVisibility(View.VISIBLE);
                question.setText("Which of these are real graphics card models? (Select all that apply)");
                aOne.setText("GTX 1060 10GB");
                aTwo.setText("Titan V");
                aThree.setText("GTX 1050TI");
                aFour.setText("RX580");
                break;
            case 3:

                bOne.setVisibility(View.INVISIBLE);
                bTwo.setVisibility(View.INVISIBLE);
                bThree.setVisibility(View.INVISIBLE);
                bFour.setVisibility(View.INVISIBLE);
                radioGrp.setVisibility(View.VISIBLE);
                bOne.setVisibility(View.INVISIBLE);
                bTwo.setVisibility(View.INVISIBLE);
                bThree.setVisibility(View.INVISIBLE);
                bFour.setVisibility(View.INVISIBLE);
                aOne.setVisibility(View.INVISIBLE);
                aTwo.setVisibility(View.INVISIBLE);
                aThree.setVisibility(View.INVISIBLE);
                aFour.setVisibility(View.INVISIBLE);
                question.setText("Who was the first president of the united states");
                radioOne.setText("George Washington");
                radioTwo.setText("Denzel Washington");
                radioThree.setText("John Washington ");
                radioFour.setText("James Washington");


                break;
            case 4:
                question.setText("What is the video game with the largest player base?");
                radioOne.setText("Fortnite");
                radioTwo.setText("Hearthstone");
                radioThree.setText("League of Legends");
                radioFour.setText("PlayerUnknown's Battlegrounds");
                break;
            default:
                break;
        }
    }
}
