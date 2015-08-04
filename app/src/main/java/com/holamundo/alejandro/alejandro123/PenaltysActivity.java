package com.holamundo.alejandro.alejandro123;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class PenaltysActivity extends Activity{

    private Button btsumar;
    private Button btsumarV;
    private TextView ctpenal;
    private TextView txcantPenales;
    private TextView txcantPenalesV;
    private RadioButton rbCargaSinPelota;
    private RadioButton rbDerrumbeMaul;
    private RadioButton rbEntradaCostado;
    private RadioButton rbInconducta;
    private RadioButton rbLine;
    private RadioButton rbManos;
    private RadioButton rbOffSide;
    private RadioButton rbScrum;
    private RadioButton rbTackleAlto;
    private RadioButton rbRetener;
    private RadioButton rbTirarseEnElRuck;
    private RadioButton rbTacleadorNoLibera;



    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        final GlobalVarables g = new GlobalVarables();
        setContentView(R.layout.activity_penaltys);
        final TextView txcantPenales = (TextView) findViewById(R.id.txContPenales);
        final TextView txcantPenalesV = (TextView) findViewById(R.id.txContFKVisitante);
        btsumar = (Button) findViewById(R.id.btsumarLocalPenal);
        rbCargaSinPelota = (RadioButton) findViewById(R.id.rbCargaSinPelota);
        rbDerrumbeMaul = (RadioButton) findViewById(R.id.brDerrumbe);
        rbEntradaCostado = (RadioButton) findViewById(R.id.rbEntradaDeCostado);
        rbInconducta = (RadioButton) findViewById(R.id.rbInconducta);
        rbLine = (RadioButton) findViewById(R.id.rbLine);
        rbManos = (RadioButton) findViewById(R.id.rbManos);
        rbOffSide = (RadioButton) findViewById(R.id.rbOffSide);
        rbScrum = (RadioButton) findViewById(R.id.rbScrum);
        rbTackleAlto = (RadioButton) findViewById(R.id.rbTackleAlto);
        rbRetener = (RadioButton) findViewById(R.id.rbRetener);
        rbTirarseEnElRuck = (RadioButton) findViewById(R.id.rbTirarseEnElRuck);
        rbTacleadorNoLibera = (RadioButton) findViewById(R.id.rbTacleadorNoLibera);
        txcantPenales.setText(String.valueOf(g.getContpenales()));
        txcantPenalesV.setText(String.valueOf(g.getContpenalesV()));
        btsumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ;
                g.setContpenales(g.getContpenales() + 1);
                if (rbCargaSinPelota.isChecked()) {
                    g.setContpenalesCargaSinPelota(g.getContpenalesCargaSinPelota() + 1);
                }
                if (rbDerrumbeMaul.isChecked()) {
                    g.setContpenalesDerrumbeDeMaul(g.getContpenalesDerrumbeDeMaul() + 1);
                }
                if (rbEntradaCostado.isChecked()) {
                    g.setContpenalesEntrarDeCostado(g.getContpenalesEntrarDeCostado() + 1);
                }
                if (rbInconducta.isChecked()) {
                    g.setContpenalesInconducta(g.getContpenalesInconducta() + 1);
                }
                if (rbLine.isChecked()) {
                    g.setContpenalesLine(g.getContpenalesLine() + 1);
                }
                if (rbManos.isChecked()) {
                    g.setContpenalesManoEnElRuck(g.getContpenalesManoEnElRuck() + 1);
                }
                if (rbOffSide.isChecked()) {
                    g.setContpenalesOffSide(g.getContpenalesOffSide() + 1);
                }
                if (rbScrum.isChecked()) {
                    g.setContpenalesScrum(g.getContpenalesScrum() + 1);
                }
                if (rbTackleAlto.isChecked()) {
                    g.setContpenalesTackleAlto(g.getContpenalesTackleAlto() + 1);
                }
                if (rbRetener.isChecked()) {
                    g.setContpenaleReteners(g.getContpenaleReteners() + 1);
                }
                if (rbTirarseEnElRuck.isChecked()) {
                    g.setContpenalesTirarseEnElRuck(g.getContpenalesTirarseEnElRuck() + 1);
                }
                if (rbTacleadorNoLibera.isChecked()) {
                    g.setContpenalTacleadorNoSuelta(g.getContpenalTacleadorNoSuelta() + 1);
                }
                txcantPenales.setText(String.valueOf(g.getContpenales()));

            }
        });
        btsumarV = (Button) findViewById(R.id.btSumarVisitantePenal);
        btsumarV.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                g.setContpenalesV(g.getContpenalesV() + 1);
                if (rbCargaSinPelota.isChecked()) {
                    g.setContpenalesCargaSinPelotaV(g.getContpenalesCargaSinPelotaV() + 1);
                }
                if (rbDerrumbeMaul.isChecked()) {
                    g.setContpenalesDerrumbeDeMaulV(g.getContpenalesDerrumbeDeMaulV() + 1);
                }
                if (rbEntradaCostado.isChecked()) {
                    g.setContpenalesEntrarDeCostadoV(g.getContpenalesEntrarDeCostadoV() + 1);
                }
                if (rbInconducta.isChecked()) {
                    g.setContpenalesInconductaV(g.getContpenalesInconductaV() + 1);
                }
                if (rbLine.isChecked()) {
                    g.setContpenalesLineV(g.getContpenalesLineV() + 1);
                }
                if (rbManos.isChecked()) {
                    g.setContpenalesManoEnElRuckV(g.getContpenalesManoEnElRuckV() + 1);
                }
                if (rbOffSide.isChecked()) {
                    g.setContpenalesOffSideV(g.getContpenalesOffSideV() + 1);
                }
                if (rbScrum.isChecked()) {
                    g.setContpenalesScrumV(g.getContpenalesScrumV() + 1);
                }
                if (rbTackleAlto.isChecked()) {
                    g.setContpenalesTackleAltoV(g.getContpenalesTackleAltoV() + 1);
                }
                if (rbRetener.isChecked()) {
                    g.setContpenaleRetenersV(g.getContpenaleRetenersV() + 1);
                }
                if (rbTirarseEnElRuck.isChecked()) {
                    g.setContpenalesTirarseEnElRuckV(g.getContpenalesTirarseEnElRuckV() + 1);
                }
                if (rbTacleadorNoLibera.isChecked()) {
                    g.setContpenalTacleadorNoSueltaV(g.getContpenalTacleadorNoSueltaV() + 1);
                }

                txcantPenalesV.setText(String.valueOf(g.getContpenalesV()));
            }
        });
        
    }




    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_penaltys, menu);
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

    @Override
    public boolean onPrepareOptionsMenu(Menu menu) {
        boolean result = super.onPrepareOptionsMenu(menu);
        menu.findItem(R.id.action_settings).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                startActivity(new Intent(PenaltysActivity.this, MainActivity22Activity.class));
                return true;
            }
        });
        menu.findItem(R.id.action_settings).setOnMenuItemClickListener(new MenuItem.OnMenuItemClickListener() {
            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                startActivity(new Intent(PenaltysActivity.this, MainActivity22Activity.class));
                return true;
            }
        });
        return result;
    }
}
