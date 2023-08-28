package uni.edu.ni.app260823;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    EditText etnombre,etedad,etnumero;
    TextView tvnombre,tvedad,tvresultado;
    Button btncalcular;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etnombre=findViewById(R.id.etnombre);
        etedad=findViewById(R.id.etedad);
        etnumero=findViewById(R.id.etcelular);
        btncalcular=findViewById(R.id.btnCalcular);


    }
    public void diasVividos(View v){
        int year=Integer.parseInt(etedad.getText().toString());
        int dias=year*365;
        Toast.makeText(getApplicationContext(),etnombre.getText()+" Los dias vividos son "+dias,Toast.LENGTH_LONG).show();


    }
}