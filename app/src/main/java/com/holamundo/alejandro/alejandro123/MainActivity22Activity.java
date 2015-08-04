package com.holamundo.alejandro.alejandro123;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;


public class MainActivity22Activity extends Activity {
    private TextView pcargasinpelota;
    private TextView pDerrumbeMaul;
    private TextView pEntradaDeCostado;
    private TextView pCargaEnelLine;
    private TextView pManosEnElRuck;
    private TextView pOffSide;
    private TextView pScrum;
    private TextView pTacleAlto;
    private TextView pRetencion;
    private TextView pTirarseEnElRuck;
    private TextView pTacleadorNoSeAleja;
    private TextView pcargasinpelotaVisitante;
    private TextView pDerrumbeMaulVisitante;
    private TextView pEntradaDeCostadoVisitante;
    private TextView pCargaEnelLineVisitante;
    private TextView pManosEnElRuckVisitante;
    private TextView pOffSideVisitante;
    private TextView pScrumVisitante;
    private TextView pTacleAltoVisitante;
    private TextView pRetencionVisitante;
    private TextView pTirarseEnElRuckVisitante;
    private TextView pTacleadorNoSeAlejaVisitante;
    private TextView pTotalPenales;
    private TextView pTotalPenalesVisitante;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activity22);
        GlobalVarables g = new GlobalVarables();
        pcargasinpelota = (TextView) findViewById(R.id.txCargaSinPelotaLocal);
        pcargasinpelotaVisitante = (TextView) findViewById(R.id.txCargaSinPelotaVisitante);
        pDerrumbeMaul = (TextView) findViewById(R.id.txDerrumbeMaulLocal);
        pDerrumbeMaulVisitante = (TextView) findViewById(R.id.txDerrumbeMaulVisitante);
        pEntradaDeCostado= (TextView) findViewById(R.id.txEntradaCostadoLocal);
        pEntradaDeCostadoVisitante= (TextView) findViewById(R.id.txEntradaDeCostadoVisitante);
        pCargaEnelLine= (TextView) findViewById(R.id.txCargaEnElLineLocal);
        pCargaEnelLineVisitante= (TextView) findViewById(R.id.txCagaLineVisitante);
        pManosEnElRuck= (TextView) findViewById(R.id.txManosEnElRuckLocal);
        pManosEnElRuckVisitante= (TextView) findViewById(R.id.txManosEnElRuckVisistante);
        pOffSide= (TextView) findViewById(R.id.txOffSideLocal);
        pOffSideVisitante= (TextView) findViewById(R.id.txOffsideVisitante);
        pScrum= (TextView) findViewById(R.id.txScrumPenalLocal);
        pScrumVisitante= (TextView) findViewById(R.id.txScrumPenalVisitante);
        pTacleAlto= (TextView) findViewById(R.id.txTacleAltoLocal);
        pTacleAltoVisitante= (TextView) findViewById(R.id.txTacleAltoVisitante);
        pRetencion= (TextView) findViewById(R.id.txRetencionLocal);
        pRetencionVisitante= (TextView) findViewById(R.id.txRetencionVisitante);
        pTirarseEnElRuck = (TextView) findViewById(R.id.txTirarseRuckLocal);
        pTirarseEnElRuckVisitante = (TextView) findViewById(R.id.txTirarseEnRuckVisitante);
        pTacleadorNoSeAleja = (TextView)findViewById(R.id.txTacleadorNoSueltaLocal);
        pTacleadorNoSeAlejaVisitante = (TextView)findViewById(R.id.txTacleadorNoSueltaVisitante);
        pTotalPenales =(TextView) findViewById(R.id.txTotalPenalesLocal);
        pTotalPenalesVisitante =(TextView) findViewById(R.id.txTotalPenalesVisitante);
        pcargasinpelota.setText(String.valueOf(g.getContpenalesCargaSinPelota()));
        pcargasinpelotaVisitante.setText(String.valueOf(g.getContpenalesCargaSinPelotaV()));
        pDerrumbeMaul.setText(String.valueOf(g.getContpenalesDerrumbeDeMaul()));
        pDerrumbeMaulVisitante.setText(String.valueOf(g.getContpenalesDerrumbeDeMaulV()));
        pEntradaDeCostado.setText(String.valueOf(g.getContpenalesEntrarDeCostado()));
        pEntradaDeCostadoVisitante.setText(String.valueOf(g.getContpenalesEntrarDeCostadoV()));
        pCargaEnelLine.setText(String.valueOf(g.getContpenalesLine()));
        pCargaEnelLineVisitante.setText(String.valueOf(g.getContpenalesLineV()));
        pManosEnElRuck.setText(String.valueOf(g.getContpenalesManoEnElRuck()));
        pManosEnElRuckVisitante.setText(String.valueOf(g.getContpenalesManoEnElRuckV()));
        pOffSide.setText(String.valueOf(g.getContpenalesOffSide()));
        pOffSideVisitante.setText(String.valueOf(g.getContpenalesOffSideV()));
        pScrum.setText(String.valueOf(g.getContpenalesScrum()));
        pScrumVisitante.setText(String.valueOf(g.getContpenalesScrumV()));
        pTacleAlto.setText(String.valueOf(g.getContpenalesTackleAlto()));
        pTacleAltoVisitante.setText(String.valueOf(g.getContpenalesTackleAltoV()));
        pRetencion.setText(String.valueOf(g.getContpenaleReteners()));
        pRetencionVisitante.setText(String.valueOf(g.getContpenaleRetenersV()));
        pTirarseEnElRuck.setText(String.valueOf(g.getContpenalesTirarseEnElRuck()));
        pTirarseEnElRuckVisitante.setText(String.valueOf(g.getContpenalesTirarseEnElRuckV()));
        pTacleadorNoSeAleja.setText(String.valueOf(g.getContpenalTacleadorNoSuelta()));
        pTacleadorNoSeAlejaVisitante.setText(String.valueOf(g.getContpenalTacleadorNoSueltaV()));
        pTotalPenales.setText(String.valueOf(g.getContpenales()));
        pTotalPenalesVisitante.setText(String.valueOf(g.getContpenalesV()));

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main_activity22, menu);
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
