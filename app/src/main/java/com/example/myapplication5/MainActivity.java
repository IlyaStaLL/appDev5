package com.example.myapplication5;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.annotation.SuppressLint;
import android.graphics.Typeface;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.Gravity;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.view.View;
import android.widget.Toast;
import android.widget.ToggleButton;

import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    EditText editText;
    TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        // Найти элементы RadioButton в разметке (layout) по их id
        RadioButton RButton1 = findViewById(R.id.RButton1);
        RadioButton RButton2 = findViewById(R.id.RButton2);
        TextView selection = findViewById(R.id.selection);
    }
        public void onRadioButtonClicked(View view) {
            // если переключатель отмечен
            boolean checked = ((RadioButton) view).isChecked();
            TextView selection = findViewById(R.id.selection);
            // Получаем нажатый переключатель
            switch(view.getId()) {
                case R.id.RButton1:
                    if (checked){
                        selection.setText("Выбрана Java");
                    }
                    break;
                case R.id.RButton2:
                    if (checked){
                        selection.setText("Выбран Kotlin");
                    }
                    break;
            }
        }

//        ConstraintLayout layout2 = new ConstraintLayout(this);
//        ConstraintLayout.LayoutParams layoutParams = new
//                ConstraintLayout.LayoutParams
//                (ConstraintLayout.LayoutParams.WRAP_CONTENT,
//                        ConstraintLayout.LayoutParams.WRAP_CONTENT);
//        ToggleButton toggleButton = new ToggleButton(this);
//        toggleButton.setTextOff("Выключено");
//        toggleButton.setTextOn("Включено");
//        toggleButton.setText("Выключено");
//        toggleButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                boolean on = ((ToggleButton) view).isChecked();
//                if (on) {
//                    Toast.makeText(getApplicationContext(), "Кнопка включена",
//                            Toast.LENGTH_LONG).show();
//                } else {
//                    Toast.makeText(getApplicationContext(), "Кнопка выключена",
//                            Toast.LENGTH_LONG).show();
//                }
//            }
//        });
//        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
//        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
//        layout2.addView(toggleButton);
//        setContentView(layout2);
//    }
        //======================================================================

//        TextView selection = findViewById(R.id.selection);
//        CheckBox enableBox = findViewById(R.id.enabled);
//        enableBox.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
//            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
//                if(isChecked) {
//                    selection.setText("Включено");
//                    buttonView.setText("Выключить");
//                }
//                else {
//                    selection.setText("Выключено");
//                    buttonView.setText("Включить");
//                }
//            }
//        });
//    }
//    public void onToggleClicked(View view) {
//        // включена ли кнопка
//        boolean on = ((ToggleButton) view).isChecked();
//        if (on) {
//            // действия если включена
//            Toast.makeText(this, "Кнопка включена", Toast.LENGTH_LONG).show();
//        } else {
//            // действия, если выключена
//            Toast.makeText(this, "Кнопка выключена", Toast.LENGTH_LONG).show();
//        }
//    }

    //ConstraintLayout constraintLayout = new ConstraintLayout(this);

//        TextView textView = new TextView(this);
//        // установка фонового цвета
//        textView.setBackgroundColor(0xffe8eaf6);
//        // установка цвета текста
//        textView.setTextColor(0xff5c6bc0);
//        // делаем все буквы заглавными
//        //textView.setAllCaps(true);
//        // устанавливаем вравнивание текста по центру
//        textView.setTextAlignment(TextView.TEXT_ALIGNMENT_CENTER);
//        // устанавливаем текста
//        //textView.setText("Hello Android");
//        // установка шрифта
//        textView.setTypeface(Typeface.create("Times New Roman", Typeface.NORMAL));
//        // устанавливаем высоту текста
//        textView.setTextSize(26);
//        ConstraintLayout.LayoutParams layoutParams = new
//                ConstraintLayout.LayoutParams
//                (ConstraintLayout.LayoutParams.WRAP_CONTENT,
//                        ConstraintLayout.LayoutParams.WRAP_CONTENT);
//        layoutParams.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
//        layoutParams.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
//        textView.setLayoutParams(layoutParams);
//        constraintLayout.addView(textView);
//        setContentView(constraintLayout); // Hello android
//
//        textView = new TextView(this);
//        textView.setId(View.generateViewId());
//        ConstraintLayout.LayoutParams textViewLayout = new
//                ConstraintLayout.LayoutParams(
//                ConstraintLayout.LayoutParams.MATCH_CONSTRAINT,
//                ConstraintLayout.LayoutParams.WRAP_CONTENT
//        );
//        textViewLayout.topToTop = ConstraintLayout.LayoutParams.PARENT_ID;
//        textViewLayout.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
//        textViewLayout.rightToRight =
//                ConstraintLayout.LayoutParams.PARENT_ID;
//        textView.setLayoutParams(textViewLayout);
//        constraintLayout.addView(textView);
//        editText = new EditText(this);
//        editText.setId(View.generateViewId());
//        editText.setHint("Введите имя");
//        ConstraintLayout.LayoutParams editTextLayout = new
//                ConstraintLayout.LayoutParams(
//                ConstraintLayout.LayoutParams.MATCH_CONSTRAINT,
//                ConstraintLayout.LayoutParams.WRAP_CONTENT
//        );
//        editTextLayout.topToBottom = textView.getId();
//        editTextLayout.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
//        editTextLayout.rightToRight =
//                ConstraintLayout.LayoutParams.PARENT_ID;
//        editText.setLayoutParams(editTextLayout);
//        constraintLayout.addView(editText);
//        Button button = new Button(this);
//        button.setText("Ввод");
//        ConstraintLayout.LayoutParams buttonLayout = new
//                ConstraintLayout.LayoutParams(
//                ConstraintLayout.LayoutParams.WRAP_CONTENT,
//                ConstraintLayout.LayoutParams.WRAP_CONTENT
//        );
//        buttonLayout.topToBottom = editText.getId();
//        buttonLayout.leftToLeft = ConstraintLayout.LayoutParams.PARENT_ID;
//        button.setLayoutParams(buttonLayout);
//        constraintLayout.addView(button);
//        TextView finalTextView = textView;
//        button.setOnClickListener(new View.OnClickListener() {
//            public void onClick(View v) {
//                // Обработка нажатия
//                Toast toast = Toast.makeText(getApplicationContext(), "Hello," + editText.getText(), Toast.LENGTH_LONG);
//                toast.setGravity(Gravity.CENTER, 0,0);
//                //toast.show();
//                Snackbar snackbar = Snackbar.make(v, "hello Android", Snackbar.LENGTH_LONG);
//                snackbar.setAction("Next...", new View.OnClickListener (){
//                            @Override
//                            public void onClick(View v) {
//                                Toast toast = Toast.makeText(getApplicationContext(), "Next clicked!",Toast.LENGTH_LONG);
//                                toast.show();
//                            }
//                });
//                snackbar.setBackgroundTint(0XFAAAFFFF);
//                snackbar.show();
//
//                ////finalTextView.setText("Добро пожаловать, " + editText.getText()); // Реализовал в Toast
//            }




//==============================================================


//        setContentView(R.layout.activity_main); //Mirea
//
//        EditText editText = findViewById(R.id.editText);
//        editText.addTextChangedListener(new TextWatcher() {
//            public void afterTextChanged(Editable s) {}
//            public void beforeTextChanged(CharSequence s, int start,
//                                          int count, int after) {
//            }
//            public void onTextChanged(CharSequence s, int start, int before, int count)
//            {
//                TextView textView = findViewById(R.id.textView);
//                textView.setText(s);
//            }
//            CheckBox enableBox = findViewById(R.id.enabled);
//            CheckBox enableBox2 = findViewById(R.id.enabled2);
//
//        });
//
//    }
//
//    public void onCheckboxClicked(View v) {
//        // Получаем флажок
//        CheckBox checkBox = (CheckBox) v;
//        TextView selection = findViewById(R.id.textView3);
//        // Получаем, отмечен ли данный флажок
//        if(checkBox.isChecked()) {
//            selection.setText("Включено");
//            checkBox.setText("Выключите");
//        }
//        else {
//            selection.setText("Выключено");
//            checkBox.setText("Включить");
//        }
//    }
//
//    // Обработка нажатия кнопки
//    public void sendMessage(View view) {
//        TextView textView2 = findViewById(R.id.textView3);
//        EditText editText2 = findViewById(R.id.editText2);
//        textView2.setText("Привет, " + editText2.getText());
//}
}