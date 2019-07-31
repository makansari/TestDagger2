package com.ansari.testdagger2.second;

import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.ansari.testdagger2.R;

import javax.inject.Inject;

public class Main2Activity extends AppCompatActivity {

    Button saveButton,showButton;
    EditText nameEditText;
    TextView resultTextView;

    @Inject
    SharedPreferences sharedPreferences;

    MyComponent myComponent;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        nameEditText = findViewById(R.id.editTextInput);
        resultTextView = findViewById(R.id.textViewResult);
        saveButton = findViewById(R.id.buttonsave);
        showButton = findViewById(R.id.buttonShow);

        myComponent = DaggerMyComponent.builder().sharedPredModule(new SharedPredModule(this)).build();
        myComponent.inject(this);


        saveButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                SharedPreferences.Editor editor = sharedPreferences.edit();
                editor.putString("key",nameEditText.getText().toString());
                editor.commit();
                nameEditText.setText("");

            }
        });

        showButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
            resultTextView.setText(sharedPreferences.getString("key", "no Value"));
            }
        });
    }
}
