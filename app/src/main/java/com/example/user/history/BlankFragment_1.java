package com.example.user.history;


import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */


public class BlankFragment_1 extends Fragment {

    Button button_1, button_2, button_3 , button_4 , button_5 , button_6 , button_7, button_8;
    TextView  textView1 , textView2, textView3, textView4 ,textView5, textView6, textView7 , textView8;

    public Button getButton_1() {
        return button_1;
    }

    public void setButton_1(Button button_1) {
        this.button_1 = button_1;
    }

    public Button getButton_2() {
        return button_2;
    }

    public void setButton_2(Button button_2) {
        this.button_2 = button_2;
    }

    public Button getButton_3() {
        return button_3;
    }

    public void setButton_3(Button button_3) {
        this.button_3 = button_3;
    }

    public Button getButton_4() {
        return button_4;
    }

    public void setButton_4(Button button_4) {
        this.button_4 = button_4;
    }

    public Button getButton_5() {
        return button_5;
    }

    public void setButton_5(Button button_5) {
        this.button_5 = button_5;
    }

    public Button getButton_6() {
        return button_6;
    }

    public void setButton_6(Button button_6) {
        this.button_6 = button_6;
    }

    public Button getButton_7() {
        return button_7;
    }

    public void setButton_7(Button button_7) {
        this.button_7 = button_7;
    }

    public Button getButton_8() {
        return button_8;
    }

    public void setButton_8(Button button_8) {
        this.button_8 = button_8;
    }

    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // привязывается переменная к странице, в которой находится кнопка
        Bundle b = new Bundle();
        View v = inflater.inflate(R.layout.fragment_blank_fragment_1, null);

       // привязывается переменная к странице, в которой находится текст
        View f1 = inflater.inflate(R.layout.content_scrolling_activity_1, null);


      //при нажатии на кнопку...
        button_1 = (Button) v.findViewById(R.id.Button_1);
        textView1 = (TextView) f1.findViewById(R.id.textView1);
        button_1.setOnClickListener(
                new View.OnClickListener()

                {
                    @Override
                    public void onClick(View v) {

                        //переход с какой страницы на какую
                        Intent intent = new Intent(getActivity(), ScrollingActivity_1.class);
                        //передавание текста на другую страницу
                        String str = getString(R.string.Bbutton_1);
                        intent.putExtra("1", str);
                        //запустить
                        startActivity(intent);
                    }
                });

        View f2 = inflater.inflate(R.layout.content_scrolling_activity_2, null);
        View f3 = inflater.inflate(R.layout.content_scrolling_activity_3, null);
        View f4 = inflater.inflate(R.layout.content_scrolling_activity_4, null);
        View f5 = inflater.inflate(R.layout.content_scrolling_activity_5, null);
        View f6 = inflater.inflate(R.layout.content_scrolling_activity_6, null);
        View f7 = inflater.inflate(R.layout.content_scrolling_activity_7, null);
        View f8 = inflater.inflate(R.layout.content_scrolling_activity_8, null);
        button_2 = (Button) v.findViewById(R.id.Button_2);
        textView2 = (TextView) f2.findViewById(R.id.textView2);
        button_2.setOnClickListener(
                new View.OnClickListener()

                {
                    @Override
                    public void onClick(View v) {


                        Intent intent = new Intent(getActivity(), ScrollingActivity_2.class);
                        String str = getString(R.string.Bbutton_2);
                        intent.putExtra("2", str);
                        startActivity(intent);



                    }
                });

        button_3 = (Button) v.findViewById(R.id.Button_3);
        textView3 = (TextView) f3.findViewById(R.id.textView3);
        button_3.setOnClickListener(
                new View.OnClickListener()

                {
                    @Override
                    public void onClick(View v) {


                        Intent intent = new Intent(getActivity(), ScrollingActivity_3.class);
                        String str = getString(R.string.Bbutton_3);
                        intent.putExtra("3", str);
                        startActivity(intent);



                    }
                });


        button_4 = (Button) v.findViewById(R.id.Button_4);
        textView4 = (TextView) f4.findViewById(R.id.textView4);
        button_4.setOnClickListener(
                new View.OnClickListener()

                {
                    @Override
                    public void onClick(View v) {


                        Intent intent = new Intent(getActivity(), ScrollingActivity_4.class);
                        String str = getString(R.string.Bbutton_4);
                        intent.putExtra("4", str);
                        startActivity(intent);



                    }
                });
        button_5 = (Button) v.findViewById(R.id.Button_5);
        textView5 = (TextView) f5.findViewById(R.id.textView5);
        button_5.setOnClickListener(
                new View.OnClickListener()

                {
                    @Override
                    public void onClick(View v) {


                        Intent intent = new Intent(getActivity(), ScrollingActivity_5.class);
                        String str = getString(R.string.Bbutton_5);
                        intent.putExtra("5", str);
                        startActivity(intent);



                    }
                });
        button_6 = (Button) v.findViewById(R.id.Button_6);
        textView6 = (TextView) f6.findViewById(R.id.textView6);
        button_6.setOnClickListener(
                new View.OnClickListener()

                {
                    @Override
                    public void onClick(View v) {


                        Intent intent = new Intent(getActivity(), ScrollingActivity_6.class);
                        String str = getString(R.string.Bbutton_6);
                        intent.putExtra("6", str);
                        startActivity(intent);

                    }
                });
        button_7 = (Button) v.findViewById(R.id.Button_7);
        textView7 = (TextView) f7.findViewById(R.id.textView7);
        button_7.setOnClickListener(
                new View.OnClickListener()

                {
                    @Override
                    public void onClick(View v) {


                        Intent intent = new Intent(getActivity(), ScrollingActivity_7.class);
                        String str = getString(R.string.Bbutton_7);
                        intent.putExtra("7", str);
                        startActivity(intent);

                    }
                });
        button_8 = (Button) v.findViewById(R.id.Button_8);
        textView8 = (TextView) f8.findViewById(R.id.textView8);
        button_8.setOnClickListener(
                new View.OnClickListener()

                {
                    @Override
                    public void onClick(View v) {

                        Intent intent = new Intent(getActivity(), ScrollingActivity_8.class);
                        String str = getString(R.string.Bbutton_8);
                        intent.putExtra("8", str);
                        startActivity(intent);

                    }
                });


        return v;
    }

    public BlankFragment_1() {


    }

}


