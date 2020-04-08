package ldansorean.s3numbershapes;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void checkNumber(View view) {
        String numberStr = ((EditText) findViewById(R.id.numberEdit)).getText().toString();
        String response = "";

        if (isValid(numberStr)) {
            Integer numberInt = Integer.parseInt(numberStr);
            Number number = new Number(numberInt);

            if (number.isSquare() && number.isTriangular()) {
                response = "Number is both square and triangular!";
            } else if (number.isSquare()) {
                response = "Number is square.";
            } else if (number.isTriangular()) {
                response = "Number is triangular.";
            } else {
                response = "Number is neither square nor triangular.";
            }
        } else {
            response = "Please enter a number greater than 0.";
        }

        Toast.makeText(getApplicationContext(), response, Toast.LENGTH_LONG).show();
    }

    private boolean isValid(String numberStr){
        try {
            int number = Integer.parseInt(numberStr);
            return number > 0;
        } catch (Exception e) {
            return false;
        }
    }
}
