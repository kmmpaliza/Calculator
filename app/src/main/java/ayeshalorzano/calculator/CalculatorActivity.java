package ayeshalorzano.calculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class CalculatorActivity extends AppCompatActivity {

    Button btnClr , btn0 , btn1 , btn2 , btn3 , btn4, btn5 , btn6 , btn7 ,
            btn8 , btn9 , btnAdd , btnSub , btnMul , btnDiv , btnEq;
    TextView txtScreen ;
    float value1, value2;
    boolean oAdd, oSub, oDiv, oMul;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculator);

        txtScreen = (TextView) findViewById(R.id.txtScreen);

        btnClr = (Button) findViewById(R.id.btnClr);
        btn0 = (Button) findViewById(R.id.btn0);
        btn1 = (Button) findViewById(R.id.btn1);
        btn2 = (Button) findViewById(R.id.btn2);
        btn3 = (Button) findViewById(R.id.btn3);
        btn4 = (Button) findViewById(R.id.btn4);
        btn5 = (Button) findViewById(R.id.btn5);
        btn6 = (Button) findViewById(R.id.btn6);
        btn7 = (Button) findViewById(R.id.btn7);
        btn8 = (Button) findViewById(R.id.btn8);
        btn9 = (Button) findViewById(R.id.btn9);
        btnAdd = (Button) findViewById(R.id.btnAdd);
        btnSub = (Button) findViewById(R.id.btnSub);
        btnMul = (Button) findViewById(R.id.btnMul);
        btnDiv = (Button) findViewById(R.id.btnDiv);
        btnEq = (Button) findViewById(R.id.btnEq);


    }


    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btnClr:
               txtScreen.setText("");

                break;
            case R.id.btn0:
                txtScreen.append("0");
                break;
            case R.id.btn1:

                    txtScreen.setText(txtScreen.getText().toString() +  "1");

                break;
            case R.id.btn2:

                    txtScreen.setText(txtScreen.getText().toString() +  "2");

                break;
            case R.id.btn3:

                    txtScreen.setText(txtScreen.getText().toString() +  "3");

                break;
            case R.id.btn4:
                    txtScreen.setText(txtScreen.getText().toString() +  "4");

                break;
            case R.id.btn5:
                    txtScreen.setText(txtScreen.getText().toString() +  "5");

                break;
            case R.id.btn6:

                    txtScreen.setText(txtScreen.getText().toString() +  "6");


                break;
            case R.id.btn7:

                    txtScreen.setText(txtScreen.getText().toString() +  "7");

                break;
            case R.id.btn8:

                    txtScreen.setText(txtScreen.getText().toString() +  "8");

                break;
            case R.id.btn9:

                    txtScreen.setText(txtScreen.getText().toString() +  "9");

                break;
            case R.id.btnAdd:

                if (txtScreen == null){
                    txtScreen.setText("");
                }else{
                    value1 = Float.parseFloat(txtScreen.getText().toString() + "");
                    oAdd = true;
                    txtScreen.setText(null);
                }
                break;
            case R.id.btnSub:
                if (txtScreen == null){
                    txtScreen.setText("");
                }else{
                    value1 = Float.parseFloat(txtScreen.getText().toString() + "");
                    oSub = true;
                    txtScreen.setText(null);
                }
                break;
            case R.id.btnMul:
                if (txtScreen == null){
                    txtScreen.setText("");
                }else{
                    value1 = Float.parseFloat(txtScreen.getText().toString() + "");
                    oMul = true;
                    txtScreen.setText(null);
                }
                break;
            case R.id.btnDiv:
                if (txtScreen == null){
                    txtScreen.setText("");
                }else{
                    value1 = Float.parseFloat(txtScreen.getText().toString() + "");
                    oDiv = true;
                    txtScreen.setText(null);
                }
                break;
            case R.id.btnDot:
                txtScreen.setText(txtScreen.getText().toString() + ".");
                break;
            case R.id.btnEq:
               value2 = Float.parseFloat(txtScreen.getText().toString() + "");

                if (oAdd == true){
                    txtScreen.setText(value1 + value2 + "");
                    oAdd = false;
                } else if (oSub == true){
                    txtScreen.setText(value1 - value2 + "");
                    oSub = false;
                }else if (oMul == true){
                    txtScreen.setText(value1 * value2 + "");
                    oMul = false;
                }else if (oDiv == true){
                    txtScreen.setText(value1 / value2 + "");
                    oDiv = false;
                }

                break;

        }
    }
}
