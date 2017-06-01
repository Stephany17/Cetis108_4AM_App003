package mx.edu.cetis108.cetis108_4am_app003;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resultado = (TextView) findViewById(R.id.txtResultado);
        numero = (EditText) findViewById(R.id.txtNumero);
        numero2 = (EditText) findViewById(R.id.txtNumero2);
    }

    EditText numero;
    EditText numero2;
    TextView resultado;
    Button aceptar;
    double num, num2, result;

    public Button ACEPTAR(View view)
    {
        num = Integer.parseInt(numero.getText().toString());
        num2 = Integer.parseInt(numero2.getText().toString());
        if (num>num2)
        {
            result= num - num2;
            resultado.setText("El resultado es:  " + result);
        } else
            result = num + num2;
            resultado.setText("El resultado es: " + result);
            return aceptar;
    }

}