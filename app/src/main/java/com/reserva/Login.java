package com.reserva;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

/**
 * Created by CECyT9 on 16/03/2017.
 */

public class Login  extends Activity {

    EditText name;
    EditText psw;
    TextView msj;

    String nomb = "";
    String pas = "";
    String usuario= "Saul";
    String contrasenia= "1234";

    @Override
    public void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
    }
    public void entrar( View v )
    {
        name = (EditText) findViewById(R.id.name);
        psw = (EditText) findViewById(R.id.psw);
        msj = (TextView) findViewById(R.id.msj);

        nomb = name.getText().toString();
        pas = psw.getText().toString();

        if(nomb.equals(usuario))
        {
            if(pas.equals(contrasenia))
            {
                Intent entra = new Intent(this, MainActivity.class);
                Bundle dat = new Bundle();
                dat.putString("nombre", name.getText().toString().trim());
                entra.putExtras(dat);
                finish();
                startActivity(entra);
            }else
            {
                msj.setText("Algo esta mal checa los datos");
                name.setText("");
                psw.setText("");
            }

        }else
        {
            msj.setText("Algo esta mal checa los datos");
            name.setText("");
            psw.setText("");
        }
    }
}
