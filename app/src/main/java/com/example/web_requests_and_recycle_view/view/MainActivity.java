package com.example.web_requests_and_recycle_view.view;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

import com.example.web_requests_and_recycle_view.R;
import com.google.android.material.button.MaterialButton;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textview.MaterialTextView;

public class MainActivity extends AppCompatActivity {
    MaterialButton btn;
    MaterialTextView txtView;
    TextInputEditText editText;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = findViewById(R.id.material_button);
        txtView = findViewById(R.id.material_text_view);
        editText = findViewById(R.id.material_edit_text);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView.setText(editText.getText().toString());
            }
        });
    }
}