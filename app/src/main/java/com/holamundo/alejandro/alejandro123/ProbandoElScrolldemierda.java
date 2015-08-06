package com.holamundo.alejandro.alejandro123;

import android.app.Activity;
import android.content.pm.ActivityInfo;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class ProbandoElScrolldemierda extends Activity{

    private TextView txprepushlocal;
    private TextView txprepushvisitante;
    private TextView txperdidaTiempoLocal;
    private TextView txPerdidaTiempovisitante;
    private TextView txDemoraSalidade22Local;
    private TextView TxDemoraSalidade22visitante;
    private TextView txHombrosDebajoDelacaderaLocal;
    private TextView txHombrosdebajodelacaderaVisitante;
    private TextView txDevolverPelotaAlRuckLocal;
    private TextView txDevolverPelotaAlruckVisitante;
    private TextView txSimularSalidadePelotaLocal;
    private TextView txSimularSalidaPelotaVisitante;
    private TextView txDifCantJugadoresLineLocal;
    private TextView txDifCantJugadoresLineVisitante;
    private TextView txInfraccion1eraLineaLocal;
    private TextView txInfraccion1eraLineaVisitante;
    private TextView txPelotatorcidaenelScrumLocal;
    private TextView txPelotatorcidaenelScrumVisitante;
    private TextView txTotalFKLocal;
    private TextView txToalfkVisitante;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activty_estadisticas_freekicks);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        final GlobalVarables g = new GlobalVarables();
        txprepushlocal = (TextView) findViewById(R.id.txPrePushLocal);
        txprepushvisitante = (TextView) findViewById(R.id.txPrePushVisitante);
        txperdidaTiempoLocal = (TextView) findViewById(R.id.txPerdidaDeTiempoLocal);
        txPerdidaTiempovisitante = (TextView) findViewById(R.id.txPerdidaTiempoVisitante);
        txDemoraSalidade22Local = (TextView) findViewById(R.id.txDemoraSalida22Local);
        TxDemoraSalidade22visitante = (TextView) findViewById(R.id.txDemoraSalida22Visitante);
        txHombrosDebajoDelacaderaLocal = (TextView) findViewById(R.id.txHombrosBajosLocal);
        txHombrosdebajodelacaderaVisitante = (TextView) findViewById(R.id.txHombrosBajosVisitante);
        txDevolverPelotaAlRuckLocal = (TextView) findViewById(R.id.txDevolverPelotaLocal);
        txDevolverPelotaAlruckVisitante = (TextView) findViewById(R.id.txDevuelvePelotaVisitane);
        txSimularSalidadePelotaLocal = (TextView) findViewById(R.id.txSimularSalidaLocal);
        txSimularSalidaPelotaVisitante = (TextView) findViewById(R.id.txSimulaSalidaVisitante);
        txDifCantJugadoresLineLocal = (TextView) findViewById(R.id.txDifCantJugadoresLocal);
        txDifCantJugadoresLineVisitante = (TextView) findViewById(R.id.txDifCantJugadoresVisitante);
        txInfraccion1eraLineaLocal = (TextView) findViewById(R.id.txInfraccion1eraLineaLocal);
        txInfraccion1eraLineaVisitante = (TextView) findViewById(R.id.txInfraccion1eraLineaVisitante);
        txPelotatorcidaenelScrumLocal= (TextView) findViewById(R.id.txPelotaTorcidaLocal);
        txPelotatorcidaenelScrumVisitante= (TextView) findViewById(R.id.txPelotaTorcidaVisitante);
        txTotalFKLocal = (TextView) findViewById(R.id.txTotalFreeKicksLocal);
        txToalfkVisitante = (TextView) findViewById(R.id.txTotalFreeKicksVisitante);


        txprepushlocal.setText(String.valueOf(g.getContFKPrePush()));
        txprepushvisitante.setText(String.valueOf(g.getContFKPrePushV()));
        txperdidaTiempoLocal.setText(String.valueOf(g.getContFKperderTiempo()));
        txPerdidaTiempovisitante.setText(String.valueOf(g.getContFKperderTiempoV()));
        txDemoraSalidade22Local.setText(String.valueOf(g.getContFKdemoraSalida22()));
        TxDemoraSalidade22visitante.setText(String.valueOf(g.getContFKdemoraSalida22V()));
        txHombrosDebajoDelacaderaLocal.setText(String.valueOf(g.getContFKHombrosBajos()));;
        txHombrosdebajodelacaderaVisitante.setText(String.valueOf(g.getContFKHombrosBajosV()));;
        txDevolverPelotaAlRuckLocal.setText(String.valueOf(g.getContFKDevolverPelotaRuck()));;
        txDevolverPelotaAlruckVisitante.setText(String.valueOf(g.getContFKDevolverPelotaRuckV()));
        txSimularSalidadePelotaLocal.setText(String.valueOf(g.getContFKSimularsalidaDePelota()));;
        txSimularSalidaPelotaVisitante.setText(String.valueOf(g.getContFKSimularsalidaDePelotaV()));;
        txDifCantJugadoresLineLocal.setText(String.valueOf(g.getContFKDiferentCantidadJugEnLine()));;
        txDifCantJugadoresLineVisitante.setText(String.valueOf(g.getContFKDiferentCantidadJugEnLineV()));;
        txInfraccion1eraLineaLocal.setText(String.valueOf(g.getContFK1eraLinea()));;
        txInfraccion1eraLineaVisitante.setText(String.valueOf(g.getContFK1eraLineaV()));;
        txPelotatorcidaenelScrumLocal.setText(String.valueOf(g.getContFKPelotaTorcidaEnScrum()));;
        txPelotatorcidaenelScrumVisitante.setText(String.valueOf(g.getContFKPelotaTorcidaScrumV()));
        txTotalFKLocal.setText(String.valueOf(g.getContFKLocal()));
        txToalfkVisitante.setText(String.valueOf(g.getContFKVisitante()));


    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_probando_el_scrolldemierda, menu);
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
