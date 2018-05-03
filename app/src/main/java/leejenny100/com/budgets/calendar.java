package leejenny100.com.budgets;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.CalendarView;

public class calendar extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calendar);
        CalendarView calendar = findViewById(R.id.calendar);
        calendar.setDate(System.currentTimeMillis());
    }
}
