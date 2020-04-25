package br.com.phmiranda.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText numero1EditText;
    EditText numero2EditText;
    Button somaButton;
    Button subtracaoButton;
    Button multiplicacaoButton;
    Button divisaoButton;
    TextView resultadoTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        vincularComponentes();
        criarListeners();
    }

    private void vincularComponentes(){
        numero1EditText     = findViewById(R.id.numero1EditText);
        numero1EditText     = findViewById(R.id.numero2EditText);
        somaButton          = findViewById(R.id.buttonSoma);
        subtracaoButton     = findViewById(R.id.buttonSubtracao);
        multiplicacaoButton = findViewById(R.id.buttonMultiplicacao);
        divisaoButton       = findViewById(R.id.buttonDivisao);
        resultadoTextView   = findViewById(R.id.resultadoTextView);
    }

    private void criarListeners(){
        somaButton.setOnClickListener(evt -> adicao());
        subtracaoButton.setOnClickListener(evt -> subtracao());
        multiplicacaoButton.setOnClickListener(evt -> multiplicacao());
        divisaoButton.setOnClickListener(evt -> divisao());
    }

    private void adicao() {

        String numero1String = numero1EditText.getText().toString();
        String numero2String = numero2EditText.getText().toString();
        if (numero1String.isEmpty() || numero2String.isEmpty()) {
            Toast.makeText(this, "Digite dois números", Toast.LENGTH_LONG).show();
            return;
        }

        double numero1 = Double.parseDouble(numero1String);
        double numero2 = Double.parseDouble(numero2String);

        double resultado = numero1 + numero2;

        resultadoTextView.setText(String.valueOf(resultado));
    }
    private void subtracao() {
        String numero1String = numero1EditText.getText().toString();
        String numero2String = numero2EditText.getText().toString();
        if (numero1String.isEmpty() || numero2String.isEmpty()) {
            Toast.makeText(this, "Digite dois números", Toast.LENGTH_LONG).show();
            return;
        }

        double numero1 = Double.parseDouble(numero1String);
        double numero2 = Double.parseDouble(numero2String);

        double resultado = numero1 - numero2;

        resultadoTextView.setText(String.valueOf(resultado));
    }
    private void multiplicacao() {
        String numero1String = numero1EditText.getText().toString();
        String numero2String = numero2EditText.getText().toString();
        if (numero1String.isEmpty() || numero2String.isEmpty()) {
            Toast.makeText(this, "Digite dois números", Toast.LENGTH_LONG).show();
            return;
        }

        double numero1 = Double.parseDouble(numero1String);
        double numero2 = Double.parseDouble(numero2String);

        double resultado = numero1 * numero2;

        resultadoTextView.setText(String.valueOf(resultado));
    }
    private void divisao() {
        String numero1String = numero1EditText.getText().toString();
        String numero2String = numero2EditText.getText().toString();
        if (numero1String.isEmpty() || numero2String.isEmpty()) {
            Toast.makeText(this, "Digite dois números", Toast.LENGTH_LONG).show();
            return;
        }
        double numero1 = Double.parseDouble(numero1String);
        double numero2 = Double.parseDouble(numero2String);
        if (numero2 == 0) {
            Toast.makeText(this, "Não é possível dividir por 0", Toast.LENGTH_LONG).show();
            return;
        }

        double resultado = numero1 / numero2;
        resultadoTextView.setText(String.valueOf(resultado));
    }
}
