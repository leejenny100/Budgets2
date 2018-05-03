package leejenny100.com.budgets;
import java.text.DecimalFormat;
import android.os.Bundle;
import android.databinding.DataBindingUtil;
import leejenny100.com.budgets.databinding.ActivityCalculatorBinding;

import java.lang.Object;

import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class calculator extends AppCompatActivity{

    private static final char ADDITION = '+';
    private static final char SUBTRACTION = '-';
    private static final char MULTIPLICATION = '*';
    private static final char DIVISION = '/';
    private   ActivityCalculatorBinding binding;

    private char CURRENT_ACTION;

    private double valueOne = Double.NaN;
    private double valueTwo;

    private DecimalFormat decimalFormat;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        decimalFormat = new DecimalFormat("#.##########");

        binding = DataBindingUtil.setContentView(this, R.layout.activity_calculator);


        binding.button0.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.textView3.setText(binding.textView3.getText() + "0");
            }
        });

        binding.button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.textView3.setText(binding.textView3.getText() + "1");
            }
        });

        binding.button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.textView3.setText(binding.textView3.getText() + "2");
            }
        });

        binding.button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.textView3.setText(binding.textView3.getText() + "3");
            }
        });

        binding.button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.textView3.setText(binding.textView3.getText() + "4");
            }
        });

        binding.button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.textView3.setText(binding.textView3.getText() + "5");
            }
        });

        binding.button6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.textView3.setText(binding.textView3.getText() + "6");
            }
        });

        binding.button7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.textView3.setText(binding.textView3.getText() + "7");
            }
        });

        binding.button8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.textView3.setText(binding.textView3.getText() + "8");
            }
        });

        binding.button9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                binding.textView3.setText(binding.textView3.getText() + "9");
            }
        });

        binding.buttonADD.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                CURRENT_ACTION = ADDITION;
                binding.infoTextView.setText(decimalFormat.format(valueOne) + "+");
                binding.textView3.setText(null);
            }
        });

        binding.buttonSUB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                CURRENT_ACTION = SUBTRACTION;
                binding.infoTextView.setText(decimalFormat.format(valueOne) + "-");
                binding.textView3.setText(null);
            }
        });

        binding.buttonMULT.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                CURRENT_ACTION = MULTIPLICATION;
                binding.infoTextView.setText(decimalFormat.format(valueOne) + "*");
                binding.textView3.setText(null);
            }
        });

        binding.buttonDIV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                CURRENT_ACTION = DIVISION;
                binding.infoTextView.setText(decimalFormat.format(valueOne) + "/");
                binding.textView3.setText(null);
            }
        });

        binding.buttonEQ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                computeCalculation();
                binding.infoTextView.setText(binding.infoTextView.getText().toString() +
                        decimalFormat.format(valueTwo) + " = " + decimalFormat.format(valueOne));
                valueOne = Double.NaN;
                CURRENT_ACTION = '0';
            }
        });

        binding.buttonAC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(binding.textView3.getText().length() > 0) {
                    CharSequence currentText = binding.textView3.getText();
                    binding.textView3.setText(currentText.subSequence(0, currentText.length()-1));
                }
                else {
                    valueOne = Double.NaN;
                    valueTwo = Double.NaN;
                    binding.textView3.setText("");
                    binding.infoTextView.setText("");
                }
            }
        });
    }

    private void computeCalculation() {
        if(!Double.isNaN(valueOne)) {
            valueTwo = Double.parseDouble(binding.textView3.getText().toString());
            binding.textView3.setText(null);

            if(CURRENT_ACTION == ADDITION)
                valueOne = this.valueOne + valueTwo;
            else if(CURRENT_ACTION == SUBTRACTION)
                valueOne = this.valueOne - valueTwo;
            else if(CURRENT_ACTION == MULTIPLICATION)
                valueOne = this.valueOne * valueTwo;
            else if(CURRENT_ACTION == DIVISION)
                valueOne = this.valueOne / valueTwo;
        }
        else {
            try {
                valueOne = Double.parseDouble(binding.textView3.getText().toString());
            }
            catch (Exception e){}
        }
    }
}