package leejenny100.com.budgets;

import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.view.View.OnClickListener;
import android.app.Activity;

public class home extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        Button calendarbutton = findViewById(R.id.button9);
        calendarbutton.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {

                startActivity(new Intent(home.this, calendar.class));
            }
        });
        Button calcbutton = findViewById(R.id.button8);
        calcbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(home.this, calculator.class));
            }
        });


    }
}