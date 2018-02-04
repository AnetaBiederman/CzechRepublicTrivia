package com.example.android.czechrepublictrivia;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    //user starts with 0 points
    private int score = 0;
    String userName;

    private RadioGroup question1;
    private EditText question2;
    private CheckBox chb3Poland;
    private CheckBox chb3Germany;
    private CheckBox chb3Austria;
    private CheckBox chb3France;
    private CheckBox chb3Slovenia;
    private CheckBox chb3Italy;
    private RadioGroup question4;
    private RadioGroup question5;
    private EditText question6;
    private RadioGroup question7;
    private RadioGroup question8;
    private CheckBox chb9Pilsner;
    private CheckBox chb9Bernard;
    private CheckBox chb9Budvar;
    private CheckBox chb9Stela;
    private CheckBox chb9Tuborg;
    private CheckBox chb9Ursur;
    private RadioGroup question10;

    private boolean isChoicePrague;
    private boolean isChoiceSnezka;
    private boolean isChoiceBeer;
    private boolean isChoiceSvickova;
    private boolean isChoiceCzech;
    private boolean isChoiceKutnaHora;

    private RadioGroup.OnCheckedChangeListener question1Prague;
    private RadioGroup.OnCheckedChangeListener question4Snezka;
    private RadioGroup.OnCheckedChangeListener question5Beer;
    private RadioGroup.OnCheckedChangeListener question7Svickova;
    private RadioGroup.OnCheckedChangeListener question8Czech;
    private RadioGroup.OnCheckedChangeListener question10KutnaHora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Initialize the RadioGroups for questions 1,4,5,7,8,9,10
        question1 = (RadioGroup) findViewById(R.id.question_1);
        question4 = (RadioGroup) findViewById(R.id.question_4);
        question5 = (RadioGroup) findViewById(R.id.question_5);
        question7 = (RadioGroup) findViewById(R.id.question_7);
        question8 = (RadioGroup) findViewById(R.id.question_8);
        question10 = (RadioGroup) findViewById(R.id.question_10);

        // Initialize EditTexts for questions 2,6
        question2 = (EditText) findViewById(R.id.question_2);
        question6 = (EditText) findViewById(R.id.question_6);

        // Initialize CheckBoxes for question 3
        chb3Poland = (CheckBox) findViewById(R.id.chb_q3_poland);
        chb3Germany = (CheckBox) findViewById(R.id.chb_q3_germany);
        chb3Austria = (CheckBox) findViewById(R.id.chb_q3_austria);
        chb3France = (CheckBox) findViewById(R.id.chb_q3_france);
        chb3Slovenia = (CheckBox) findViewById(R.id.chb_q3_slovenia);
        chb3Italy = (CheckBox) findViewById(R.id.chb_q3_italy);

        // Initialize CheckBoxes for question 9
        chb9Bernard = (CheckBox) findViewById(R.id.chb9_bernard);
        chb9Pilsner = (CheckBox) findViewById(R.id.chb9_pilsner_urquel);
        chb9Budvar = (CheckBox) findViewById(R.id.chb9_budvar);
        chb9Stela = (CheckBox) findViewById(R.id.chb9_stella_artois);
        chb9Tuborg = (CheckBox) findViewById(R.id.chb9_tuborg);
        chb9Ursur = (CheckBox) findViewById(R.id.chb9_ursur);

        setListeners();
    }

    public void setListeners() {
        // Question 1 answers RadioGroup
        question1Prague = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int radioButtonId) {
                switch (radioGroup.getId()) {
                    case R.id.question_1:
                        if (R.id.question_1_praha == radioButtonId) {
                            //correct answer
                            isChoicePrague = true;
                        } else isChoicePrague = false;
                        break;
                }
            }
        };
        // Question 4 answers RadioGroup
        question4Snezka = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int radioButtonId) {
                switch (radioGroup.getId()) {
                    case R.id.question_4:
                        if (R.id.question_4_snezka == radioButtonId) {
                            //correct answer
                            isChoiceSnezka = true;
                        } else isChoiceSnezka = false;
                        break;
                }
            }
        };
        // Question 5 answers RadioGroup
        question5Beer = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int radioButtonId) {
                switch (radioGroup.getId()) {
                    case R.id.question_5:

                        if (R.id.question_5_beer == radioButtonId) {
                            //correct answer
                            isChoiceBeer = true;
                        } else isChoiceBeer = false;
                        break;
                }
            }
        };
        // Question 7 answers RadioGroup
        question7Svickova = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int radioButtonId) {
                switch (radioGroup.getId()) {
                    case R.id.question_7:
                        if (R.id.question_7_svickova == radioButtonId) {
                            //correct answer
                            isChoiceSvickova = true;
                        } else isChoiceSvickova = false;
                        break;
                }
            }
        };
        // Question 8 answers RadioGroup
        question8Czech = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int radioButtonId) {
                switch (radioGroup.getId()) {
                    case R.id.question_8:
                        if (R.id.question_8_czech == radioButtonId) {
                            //correct answer
                            isChoiceCzech = true;
                        } else isChoiceCzech = false;
                        break;
                }
            }
        };
        // Question 10 answers RadioGroup
        question10KutnaHora = new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int radioButtonId) {
                switch (radioGroup.getId()) {
                    case R.id.question_10:
                        if (R.id.question_10_kutna_hora == radioButtonId) {
                            //correct answer
                            isChoiceKutnaHora = true;
                        } else isChoiceKutnaHora = false;
                        break;
                }
            }
        };
        question1.setOnCheckedChangeListener(question1Prague);
        question4.setOnCheckedChangeListener(question4Snezka);
        question5.setOnCheckedChangeListener(question5Beer);
        question7.setOnCheckedChangeListener(question7Svickova);
        question8.setOnCheckedChangeListener(question8Czech);
        question10.setOnCheckedChangeListener(question10KutnaHora);
    }

    /**
     * This method is called when the submit answers is clicked.
     */
    @SuppressLint("StringFormatInvalid")
    public void submitQuizAnswers(View view) {
        // User add his name for quiz
        Intent intent = getIntent();
        userName = intent.getStringExtra("name");

        // this count points for correct answer for RadioGroups
        if (isChoicePrague) {
            score = +1;
        }
        if (isChoiceSnezka) {
            score += +1;
        }
        if (isChoiceBeer) {
            score += +1;
        }
        if (isChoiceSvickova) {
            score += +1;
        }
        if (isChoiceCzech) {
            score += +1;
        }
        if (isChoiceKutnaHora) {
            score += +1;
        }
        // Question 2 answer EditView
        String answerForQuestion2 = question2.getText().toString();
        if (answerForQuestion2.equals(getString(R.string.zeman))) {
            score += +1;
        }
        // Question 6 answer EditView
        String answerForQuestion6 = question6.getText().toString();
        if (answerForQuestion6.equals("01.01.1993")) {
            score += +1;
        }
        // This counts points for checkbox question 3
        if (chb3Poland.isChecked() && chb3Germany.isChecked() && chb3Austria.isChecked()) {
            score += 1;
        }
        // This counts points for checkbox question 9
        if (chb9Bernard.isChecked() && chb9Pilsner.isChecked() && chb9Budvar.isChecked()) {
            score += 1;
        }
        // display toast messages to user after test is submit
        if (score == 0) {
            Toast.makeText(this, getString(R.string.toast1, userName, score), Toast.LENGTH_LONG).show();
            return;
        }
        if (0 < score && score <= 4) {
            Toast.makeText(this, getString(R.string.toast2, userName, score), Toast.LENGTH_LONG).show();
            return;
        }
        if (4 < score && score <= 7) {
            Toast.makeText(this, getString(R.string.toast3, userName, score), Toast.LENGTH_LONG).show();
            return;
        }
        if (7 < score && score <= 10) {
            Toast.makeText(this, getString(R.string.toast4, userName, score), Toast.LENGTH_LONG).show();
            return;
        }
    }

    /**
     * Reset score.
     */
    public void reset(View View) {
        score = 0;
        // Reset all CheckBoxes
        chb3Austria.setChecked(false);
        chb3Germany.setChecked(false);
        chb3Poland.setChecked(false);
        chb3France.setChecked(false);
        chb3Slovenia.setChecked(false);
        chb3Italy.setChecked(false);
        chb9Budvar.setChecked(false);
        chb9Pilsner.setChecked(false);
        chb9Bernard.setChecked(false);
        chb9Stela.setChecked(false);
        chb9Tuborg.setChecked(false);
        chb9Ursur.setChecked(false);
        // Reset all RadioButtons
        question1.clearCheck();
        question4.clearCheck();
        question5.clearCheck();
        question7.clearCheck();
        question8.clearCheck();
        question10.clearCheck();
        // Reset EditTexts
        question2.setText(null);
        question6.setText(null);
    }

}