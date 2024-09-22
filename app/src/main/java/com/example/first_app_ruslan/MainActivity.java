package com.example.first_app_ruslan;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    TextView textToChange;
    Button btnTextChanger;
    Button btnTextColorChanger;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        this.btnTextColorChanger = findViewById(R.id.btnTextColorChanger);
        this.textToChange = findViewById(R.id.textToChange);
        this.btnTextChanger = findViewById(R.id.btnTextChanger);
        this.btnTextChanger.setOnClickListener(view -> textToChange.setText("Hello Earth!"));
        this.btnTextColorChanger.setOnClickListener(view -> textToChange.setTextColor(Color.parseColor("#FF0000")));
    }
}