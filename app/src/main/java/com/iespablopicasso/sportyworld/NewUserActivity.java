package com.iespablopicasso.sportyworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class NewUserActivity extends AppCompatActivity {

    Controlador miControlador;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);
        miControlador = Controlador.getSingleton();
    }


    /** Called when the user touches the button */
    public void onRegistrarClick(View view) {
        // Do something in response to button click
        String user,passwd,nombre,apellidos,dni,email;


        user = ((EditText)findViewById(R.id.newuser)).getText().toString();
        passwd = ((EditText)findViewById(R.id.newpasswd)).getText().toString();
        nombre = ((EditText)findViewById(R.id.newnombre)).getText().toString();
        apellidos = ((EditText)findViewById(R.id.newapellidos)).getText().toString();
        dni = ((EditText)findViewById(R.id.newdni)).getText().toString();
        email = ((EditText)findViewById(R.id.newemail)).getText().toString();

        //Comprobar si el usuario está ya en el sistema

        if (!miControlador.testNuevoUsuario(user)) {
            miControlador.addNuevoUsuario(user,passwd,nombre,apellidos,dni,email);
            finish();
        }  else  {
            ((TextView)findViewById(R.id.registerResult)).setText("Usuario ya registrado. Pruebe con otro nombre de usuario");
        }


    }
}
