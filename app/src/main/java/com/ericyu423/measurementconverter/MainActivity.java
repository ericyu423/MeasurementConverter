package com.ericyu423.measurementconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.text.InputType;




public class MainActivity extends AppCompatActivity {

    private Button convertButton;
    private EditText editText1;
    private EditText editText2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        linker();

        //refactor this later
        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                convertButtonClicked();
            }
        });


    }

    private void convertButtonClicked(){

        Double input;


        if (editText1.getText().toString().equals("")){
            input = 0.0;
           // editText2.setText(R.string.error);

        }else {
            input = Double.valueOf(editText1.getText().toString());//this can cause error if empty
        }
            input = meterToInch(input);
            editText2.setText(String.format("%.2f", input));


    }


    //if mark private you can't test it...
    public Double meterToInch(Double input){
        Double output;
        output = input * 3.28084;
        return output;
    }

    private void linker(){

        convertButton = (Button) findViewById(R.id.convertButton);
        editText1 = (EditText) findViewById(R.id.editText1);
        editText2 = (EditText) findViewById(R.id.editText2);

        //this android:inputType="number" [design/"text"] or chanage in storyboard or
       // editText1.setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_FLAG_DECIMAL);



    }
}
