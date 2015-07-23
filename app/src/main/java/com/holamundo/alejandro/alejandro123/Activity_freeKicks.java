package com.holamundo.alejandro.alejandro123;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
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
    private RadioButton rbInfraccion1raLinea;
    private RadioButton rbPelotaTorcidaEnElScrum;
    private Button sumarFKlocal;
    private Button sumarFKVisitante;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activity_free_kicks);
        final GlobalVarables g = new GlobalVarables();
        setContentView(R.layout.activity_activity_free_kicks);
        final TextView txcontFKVisitante = (TextView) findViewById(R.id.txSumaFKVisitatne);
        final TextView txcantFKLocal = (TextView) findViewById(R.id.txSumaLocal);
        sumarFKlocal = (Button)findViewById(R.id.btsumarlocalFK);
        rbPrePush = (RadioButton) findViewById(R.id.rbPrePush);
        rbPerdidaTiempo = (RadioButton) findViewById(R.id.rbPerdidaDeTiempo);
        rbDemoraSalida22 = (RadioButton) findViewById(R.id.rbDemoraSalida22);
        rbCaderasBajasRuck =(RadioButton) findViewById(R.id.rbCaderasBajasRuck);
        rbDevolverPelotaAlRuck =(RadioButton) findViewById(R.id.rbDevolverPelotaAlRuck);
        rbSimularSalidaDePelota =(RadioButton) findViewById(R.id.rbSimularSalidaDePelota);
        rbCantidadJugadoresLine = (RadioButton) findViewById(R.id.rbCantidadJugadoresLine);
        rbInfraccion1raLinea = (RadioButton) findViewById(R.id.rbInfraccion1raLinea);
        rbPelotaTorcidaEnElScrum = (RadioButton) findViewById(R.id.rbPelotaTorcidaEnElScrum);
        sumarFKVisitante = (Button) findViewById(R.id.btVisitanteFk);
        sumarFKVisitante.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                            g.setContFKVisitante(g.getContFKVisitante() + 1);
                if (rbPrePush.isChecked()) {
                    g.setContFKPrePushV(g.getContFKPrePushV() + 1);
                }
                if (rbPerdidaTiempo.isChecked()) {
                    g.setContFKperderTiempoV(g.getContFKperderTiempoV() + 1);
                }
                if (rbDemoraSalida22.isChecked()) {
                    g.setContFKdemoraSalida22V(g.getContFKdemoraSalida22V() + 1);
                }
                if (rbCaderasBajasRuck.isChecked()) {
                    g.setContFKHombrosBajosV(g.getContFKHombrosBajosV() + 1);
                }
                if (rbDevolverPelotaAlRuck.isChecked()) {
                    g.setContFKDevolverPelotaRuckV(g.getContFKDevolverPelotaRuckV() + 1);
                }
                if (rbSimularSalidaDePelota.isChecked()) {
                    g.setContFKSimularsalidaDePelotaV(g.getContFKSimularsalidaDePelotaV() + 1);
                }
                if (rbCantidadJugadoresLine.isChecked()) {
                    g.setContFKDiferentCantidadJugEnLineV(g.getContFKDiferentCantidadJugEnLineV() + 1);
                }
                if (rbInfraccion1raLinea.isChecked()) {
                    g.setContFK1eraLineaV(g.getContFK1eraLineaV() + 1);
                }
                if (rbPelotaTorcidaEnElScrum.isChecked()) {
                    g.setContFKPelotaTorcidaScrumV(g.getContFKPelotaTorcidaScrumV() + 1);
                }
                            txcontFKVisitante.setText(String.valueOf(g.getContFKVisitante()));
            }
        });

        sumarFKlocal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g.setContFKLocal(g.getContFKLocal()+1);
                if (rbPrePush.isChecked()) {
                    g.setContFKPrePush(g.getContFKPrePush() + 1);
                }
                if (rbPerdidaTiempo.isChecked()) {
                    g.setContFKperderTiempo(g.getContFKperderTiempo() + 1);
                }
                if (rbDemoraSalida22.isChecked()) {
                    g.setContFKdemoraSalida22(g.getContFKdemoraSalida22() + 1);
                }
                if (rbCaderasBajasRuck.isChecked()) {
                    g.setContFKHombrosBajos(g.getContFKHombrosBajos() + 1);
                }
                if (rbDevolverPelotaAlRuck.isChecked()) {
                    g.setContFKDevolverPelotaRuck(g.getContFKDevolverPelotaRuck() + 1);
                }
                if (rbSimularSalidaDePelota.isChecked()) {
                    g.setContFKSimularsalidaDePelota(g.getContFKSimularsalidaDePelota() + 1);
                }
                if (rbCantidadJugadoresLine.isChecked()) {
                    g.setContFKDiferentCantidadJugEnLine(g.getContFKDiferentCantidadJugEnLine() + 1);
                }
                if (rbInfraccion1raLinea.isChecked()) {
                    g.setContFK1eraLinea(g.getContFK1eraLinea() + 1);
                }
                if (rbPelotaTorcidaEnElScrum.isChecked()) {
                    g.setContFKPelotaTorcidaEnScrum(g.getContFKPelotaTorcidaEnScrum() + 1);
                }

                txcantFKLocal.setText(String.valueOf(g.getContFKLocal()));
            }
        });



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
