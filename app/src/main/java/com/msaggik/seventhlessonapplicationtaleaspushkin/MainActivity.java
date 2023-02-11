package com.msaggik.seventhlessonapplicationtaleaspushkin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    // создание полей
    private TextView textOut; // окно вывода случайной подстроки
    private Button button; // кнопка вывода стучайной подстроки

    // дополнительное поле
    private String[] arrayInput;

    // создание объекта алгоритма
    Algorithm algorithm = new Algorithm();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // привязка окон activity_main
        textOut = findViewById(R.id.textOut);
        button = findViewById(R.id.button);

        // инициализация массива сказкой А.С. Пушкина
        arrayInput = algorithm.textExampleArray();

        button.setOnClickListener(listener);
    }

    private View.OnClickListener listener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            // определение случайного индекса инициализированного массива
            int input = algorithm.textExampleRandom(arrayInput);

            // вывод на экран случайной подстроки
            textOut.setText("Сгенерирована " + Integer.toString(input) + " строка\nПодстрока: " + arrayInput[input]
                    + "\nКоличество строк " + arrayInput.length);
        }
    };
}