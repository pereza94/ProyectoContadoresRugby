package com.holamundo.alejandro.alejandro123;

import android.app.Activity;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;
import android.widget.Toast;


public class linesOut extends Activity {

    private Button btSumarLine;
    private RadioButton rbLFavorc;
    private RadioButton rbLFavorGanadoc;
    private RadioButton rbLFavorPerdidoc;
    private RadioButton rbLFavorPPc;
    private RadioButton rbLContrac;
    private RadioButton rbLContraGanadoc;
    private RadioButton rbLContraPerdidoc;
    private RadioButton rbLContraPPc;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lines_out);
        final GlobalVarables g = new GlobalVarables();
        rbLFavorc = (RadioButton)findViewById(R.id.rbLineAFavor);
        rbLFavorGanadoc = (RadioButton)findViewById(R.id.rbLineFAvorGanado);
        rbLFavorPerdidoc = (RadioButton) findViewById(R.id.rbLineFAvorPerdido);
        rbLFavorPPc = (RadioButton) findViewById(R.id.rbLineFAvorPelotaParcial);
        rbLContrac =(RadioButton) findViewById(R.id.rbLineContra);
        rbLContraGanadoc = (RadioButton) findViewById(R.id.rbLineContraRobado);
        rbLContraPerdidoc =(RadioButton) findViewById(R.id.rbLineContraPerdido);
        rbLContraPPc = (RadioButton) findViewById(R.id.rbLineContraPelotaParcial);
        btSumarLine = (Button) findViewById(R.id.btSumarLine);
        final TextView txAFG = (TextView) findViewById(R.id.txLineAFGAnado);
        final TextView txAFP = (TextView) findViewById(R.id.txLineAFPerdido);
        final TextView txAFR = (TextView) findViewById(R.id.txSLineAFPP);
        final TextView txECR = (TextView) findViewById(R.id.txLineRobado);
        final TextView txECP = (TextView) findViewById(R.id.txLineECPerdido);
        final TextView txECReset = (TextView) findViewById(R.id.txLineECPP);

        txAFG.setText(String.valueOf(g.getContLineAFGanados()));
        txAFP.setText(String.valueOf(g.getContLineAFPerdidos()));
        txAFR.setText(String.valueOf(g.getContLineAFPelotaParcial()));
        txECR.setText(String.valueOf(g.getContLineECGanados()));
        txECP.setText(String.valueOf(g.getContLineECPerdidos()));
        txECReset.setText(String.valueOf(g.getContLineECPelotaParcial()));

        btSumarLine.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rbLFavorc.isChecked()) {
                    g.setContLineAF(g.getContLineAF() + 1);
                    if (rbLFavorGanadoc.isChecked()) {
                        g.setContLineAFGanados(g.getContLineAFGanados() + 1);
                        txAFG.setText(String.valueOf(g.getContLineAFGanados()));
                    }
                    if (rbLFavorPerdidoc.isChecked()){
                        g.setContLineAFPerdidos(g.getContLineAFPerdidos() + 1);
                        txAFP.setText(String.valueOf(g.getContLineAFPerdidos()));

                    }
                    if (rbLFavorPPc.isChecked()){
                        g.setContLineAFPelotaParcial(g.getContLineAFPelotaParcial() + 1);
                        txAFR.setText(String.valueOf(g.getContLineAFPelotaParcial()));
                    }
                }
                if (rbLContrac.isChecked()){
                    g.setContScrumEnContra(g.getContScrumEnContra() + 1);
                    if (rbLContraGanadoc.isChecked()) {
                        g.setContLineECGanados(g.getContLineECGanados() + 1);
                        txECR.setText(String.valueOf(g.getContLineECGanados()));
                    }
                    if (rbLContraPerdidoc.isChecked()) {
                        g.setContLineECPerdidos(g.getContLineECPerdidos() + 1);
                        txECP.setText(String.valueOf(g.getContLineECPerdidos()));
                    }
                    if (rbLContraPPc.isChecked()) {
                        g.setContLineECPelotaParcial(g.getContLineECPelotaParcial() + 1);
                        txECReset.setText(String.valueOf(g.getContLineECPelotaParcial()));
                    }
                }


            }
        });
    }


    public void lanzarToast (View v){
         Toast sumado = Toast.makeText(getApplicationContext(),"SUMADO!!",Toast.LENGTH_LONG);
        sumado.setGravity(Gravity.CENTER|Gravity.LEFT,0,0);
        sumado.show();
    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_lines_out, menu);
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
