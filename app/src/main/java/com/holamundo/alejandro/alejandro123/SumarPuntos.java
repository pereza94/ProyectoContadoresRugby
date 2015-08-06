package com.holamundo.alejandro.alejandro123;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class SumarPuntos extends Activity{

    private Button btsumarLocal;
    private Button btsumarVisitante;
    private RadioButton rbSumarTry;
    private RadioButton rbSumarConvercion;
    private RadioButton rbSumarPenal;
    private RadioButton rbSumarDrop;
    private TextView txptosLocal;
    private TextView txptosVisitante;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sumar_puntos);
        final GlobalVarables g =new GlobalVarables();
        btsumarLocal =(Button)findViewById(R.id.btSumarLocalPtos);
        btsumarVisitante = (Button) findViewById(R.id.btSumarVisitantePtos);
        rbSumarTry = (RadioButton) findViewById(R.id.rbSumarTry);
        rbSumarConvercion = (RadioButton) findViewById(R.id.btSumarConvercion);
        rbSumarPenal = (RadioButton) findViewById(R.id.rbSumarPenal);
        rbSumarDrop = (RadioButton) findViewById(R.id.rbSumarDrop);
        txptosLocal = (TextView) findViewById(R.id.txTotalPtosLocal);
        txptosVisitante = (TextView) findViewById(R.id.txTotalPtosVisitante);
        txptosVisitante.setText(String.valueOf(g.getContPtosVisitante()));
        txptosLocal.setText(String.valueOf(g.getContPtosLocal()));
        btsumarLocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rbSumarDrop.isChecked()){
                    g.setContPtosLocal(g.getContPtosLocal() + 3);
                }
                if (rbSumarTry.isChecked()){
                    g.setContPtosLocal(g.getContPtosLocal()+ 5);
                }
                if (rbSumarConvercion.isChecked()){
                    g.setContPtosLocal(g.getContPtosLocal()+ 2);
                }
                if (rbSumarPenal .isChecked()){
                    g.setContPtosLocal(g.getContPtosLocal()+ 3);
                }
                txptosLocal.setText(String.valueOf(g.getContPtosLocal()));
                startActivity(new Intent(SumarPuntos.this, MainActivity.class));
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Puntos sumados correctamente !!!",
                        Toast.LENGTH_SHORT);
                toast.setDuration(Toast.LENGTH_SHORT);

                toast.show();
            }
        });
        btsumarVisitante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rbSumarDrop.isChecked()){
                    g.setContPtosVisitante(g.getContPtosVisitante() + 3);
                }
                if (rbSumarPenal.isChecked()){
                    g.setContPtosVisitante(g.getContPtosVisitante() + 3);
                }
                if (rbSumarTry.isChecked()){
                    g.setContPtosVisitante(g.getContPtosVisitante() + 5);
                }
                if (rbSumarConvercion.isChecked()){
                    g.setContPtosVisitante(g.getContPtosVisitante() + 2);
                }
                txptosVisitante.setText(String.valueOf(g.getContPtosVisitante()));
                startActivity(new Intent(SumarPuntos.this, MainActivity.class));
                Toast toast = Toast.makeText(getApplicationContext(),
                        "Puntos sumados correctamente !!!",
                        Toast.LENGTH_SHORT);
                toast.setDuration(Toast.LENGTH_SHORT);

                toast.show();
            }
        });
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_sumar_puntos, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
