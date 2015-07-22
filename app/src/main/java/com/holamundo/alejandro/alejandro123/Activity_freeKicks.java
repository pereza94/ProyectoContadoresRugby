package com.holamundo.alejandro.alejandro123;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class Activity_freeKicks extends Activity {

    private RadioButton rbPrePush;
    private RadioButton rbPerdidaTiempo;
    private RadioButton rbDemoraSalida22;
    private RadioButton rbCaderasBajasRuck;
    private RadioButton rbDevolverPelotaAlRuck;
    private RadioButton rbSimularSalidaDePelota;
    private RadioButton rbCantidadJugadoresLine;
    private RadioButton rbInfracción1raLinea;
    private RadioButton rbPelotaTorcidaEnElScrum;
    private Button sumarFKlocal;
    private Button sumarFKVisitante;
    private TextView txcontFKVisitante;
    private TextView txContFKLocal;
    

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_free_kicks);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_activity_free_kicks, menu);
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
