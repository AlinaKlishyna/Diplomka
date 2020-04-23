package com.example.user.history;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity_test_1 extends MainActivity {
    //типи даних та модификатори доступа

    private QuestionLibrary mQuestionLibrary = new QuestionLibrary();

    private TextView mScoreView;
    private TextView mScoreView_result;

    private TextView mQuestionView;
    private Button mButtonChoice1;
    private Button mButtonChoice2;
    private Button mButtonChoice3;

    String button1String;
    String button2String;

    private String mAnswer;
    private int mScore = 0;
    private int mScore_result = 1;
    private int mQuestionNumber = 0;


    AlertDialog.Builder ad;
    Context context;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_test_1);

        //инициализация
        mScoreView = (TextView)findViewById(R.id.score);
        mScoreView_result = (TextView)findViewById(R.id.score_result);

        mQuestionView = (TextView)findViewById(R.id.question);
        mButtonChoice1 = (Button)findViewById(R.id.choice1);
        mButtonChoice2 = (Button)findViewById(R.id.choice2);
        mButtonChoice3 = (Button)findViewById(R.id.choice3);

        //выполнение метода
        updateQuestion();

        //кнопка-ответ, по ее нажатию...
        mButtonChoice1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice1.getText() == mAnswer){
                    //бали
                    mScore = mScore + 1;
                    //номер вопроса
                    mScore_result = mScore_result + 1;

                    //принятие переменную в метод
                    updateScore(mScore);
                    updateScore_result(mScore_result);
                    //выполнение метода
                    updateQuestion();
                    //экранное сообщение
                    Toast.makeText( MainActivity_test_1.this, "Молодець!", Toast.LENGTH_SHORT).show();

                    result();

                }else {
                    mScore_result = mScore_result + 1;
                    updateScore_result(mScore_result);

                    Toast.makeText( MainActivity_test_1.this, "Наступного разу вийде", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                    result();
                }
            }
        });

        //End of Button Listener for Button1

        //Start of Button Listener for Button2
        mButtonChoice2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice2.getText() == mAnswer){
                    mScore = mScore + 1;
                    mScore_result = mScore_result + 1;

                    updateScore(mScore);
                    updateScore_result(mScore_result);
                    updateQuestion();
                    //This line of code is optiona
                    Toast.makeText( MainActivity_test_1.this, "Правильно!", Toast.LENGTH_SHORT).show();
                    result();
                }else {
                    mScore_result = mScore_result + 1;
                    updateScore_result(mScore_result);

                    Toast.makeText( MainActivity_test_1.this, "Неправильно", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                    result();
                }
            }
        });

        //End of Button Listener for Button2


        //Start of Button Listener for Button3
        mButtonChoice3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view){
                //My logic for Button goes in here

                if (mButtonChoice3.getText() == mAnswer){
                    mScore = mScore + 1;
                    mScore_result = mScore_result + 1;

                    updateScore(mScore);
                    updateScore_result(mScore_result);

                    updateQuestion();
                    //This line of code is optiona
                    Toast.makeText( MainActivity_test_1.this, "Так тримати!", Toast.LENGTH_SHORT).show();
                    result();

                }else {
                    mScore_result = mScore_result + 1;
                    updateScore_result(mScore_result);
                    Toast.makeText( MainActivity_test_1.this, "Відповідь неправильна, не засмучуйся", Toast.LENGTH_SHORT).show();
                    updateQuestion();
                    result();
                }
            }
        });

        //End of Button Listener for Button3
        context =  MainActivity_test_1.this;
        String title = "Тест завершений";
        String message = "Набрато балів "+mScore+" з 12-ти";
        button1String = "Вкусная пища";
        button2String = "Здоровая пища";

        ad = new AlertDialog.Builder(context);
        ad.setTitle(title);  // заголовок
        ad.setMessage(message); // сообщение






    }


    private void updateQuestion(){
        mQuestionView.setText(mQuestionLibrary.getQuestion(mQuestionNumber));
        mButtonChoice1.setText(mQuestionLibrary.getChoice1(mQuestionNumber));
        mButtonChoice2.setText(mQuestionLibrary.getChoice2(mQuestionNumber));
        mButtonChoice3.setText(mQuestionLibrary.getChoice3(mQuestionNumber));

        mAnswer = mQuestionLibrary.getCorrectAnswer(mQuestionNumber);
        mQuestionNumber++;

    }


    private void updateScore(int point) {
        mScoreView.setText("" + mScore);
    }

    private void updateScore_result(int point) {
        mScoreView_result.setText("" + mScore_result);
    }

    private void result() {
        if(mScore_result==13){

                    String title = "Тест завершений";
                    String message1="Тест складається з 12-ти питань\n";
                    String message = "Набрато балів: "+mScore;
                    button1String = "Повторне тестування";
                    button2String = "Вихід";

                    ad = new AlertDialog.Builder(context);
                    ad.setTitle(title);  // заголовок
                    ad.setMessage(message1+message); // сообщение


            ad.setNegativeButton(button2String, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int arg1) {
                    Intent intent2 = new Intent( MainActivity_test_1.this,MainActivity.class);
                    startActivity(intent2);

                }
            });
            ad.setPositiveButton(button1String, new DialogInterface.OnClickListener() {
                public void onClick(DialogInterface dialog, int arg1) {
                    Intent intent1 = new Intent( MainActivity_test_1.this,  MainActivity_test_1.class);
                    startActivity(intent1);
                }
            });
            ad.show();
        }

    }
}

