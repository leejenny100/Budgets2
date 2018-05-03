package leejenny100.com.budgets;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.view.View.OnClickListener;
import java.text.DateFormat;
import java.util.Date;

public class home extends AppCompatActivity {
    private TextView countertext;
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        countertext = findViewById(R.id.editText2);

        TextView date = findViewById(R.id.editText);
        String currentDateTimeString = DateFormat.getDateTimeInstance().format(new Date());
        date.setText(currentDateTimeString);

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

        public void dec10 (View view){
            counter += 10;
            countertext.setText(String.valueOf(counter));
        }
        public void inc10 (View view){
            counter -= 10;
            countertext.setText(String.valueOf(counter));
        }
    }

