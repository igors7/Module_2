package ru.startandroid.testapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity implements View.OnClickListener {


    TextView outputText;
    EditText inputText;
    Button btnInput;
    Button btnDelete;

    //int wrapContent = LinearLayout.LayoutParams.WRAP_CONTENT;


    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        /*llMain = (LinearLayout) findViewById(R.id.llMain);
        rgGravity = (RadioGroup) findViewById(R.id.rgGravity);*/
        outputText = (TextView) findViewById(R.id.outputText);
        inputText = (EditText) findViewById(R.id.inputText);

        btnInput = (Button) findViewById(R.id.btnInput);
        btnInput.setOnClickListener(this);

        btnDelete = (Button) findViewById(R.id.btnDelete);
        btnDelete.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.btnInput:
                outputText.setText(inputText.getText().toString());
                inputText.setText("");
                break;
            case R.id.btnDelete:
                outputText.setText("");
                //inputText.setText("");
                //inputText.setText(outputText.getText().toString());
                break;
                // Создание LayoutParams c шириной и высотой по содержимому
                //LinearLayout.LayoutParams lParams = new LinearLayout.LayoutParams(
                       // wrapContent, wrapContent);
                // переменная для хранения значения выравнивания
                // по умолчанию пусть будет LEFT
                //int btnGravity = Gravity.LEFT;
                // определяем, какой RadioButton "чекнут" и
                // соответственно заполняем btnGravity
               /* switch (rgGravity.getCheckedRadioButtonId()) {
                    case R.id.rbLeft:
                        btnGravity = Gravity.LEFT;
                        break;
                    case R.id.rbCenter:
                        btnGravity = Gravity.CENTER_HORIZONTAL;
                        break;
                    case R.id.rbRight:
                        btnGravity = Gravity.RIGHT;
                        break;
                }
                // переносим полученное значение выравнивания в LayoutParams
                lParams.gravity = btnGravity;

                // создаем Button, пишем текст и добавляем в LinearLayout
                Button btnNew = new Button(this);
                btnNew.setText(etName.getText().toString());
                llMain.addView(btnNew, lParams);

                break;
            case R.id.btnClear:
                llMain.removeAllViews();
                Toast.makeText(this, "Удалено", Toast.LENGTH_SHORT).show();
                break;*/
        }
    }
}