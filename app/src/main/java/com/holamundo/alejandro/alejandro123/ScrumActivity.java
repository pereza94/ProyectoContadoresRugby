package com.holamundo.alejandro.alejandro123;

import android.app.Activity;
import android.renderscript.Sampler;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.TextView;


public class ScrumActivity extends Activity {

    private Button btSumarScrum;
    private RadioButton rbScrumFavorc;
    private RadioButton rbScrumFavorGanadoc;
    private RadioButton rbScrumFavorPerdidoc;
    private RadioButton rbScrumFavorReseteadoc;
    private RadioButton rbScrumContrac;
    private RadioButton rbScrumContraRobadoc;
    private RadioButton rbScrumContraPerdidoc;
    private RadioButton rbScrumContraReseteadoc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_scrum);
        final GlobalVarables g = new GlobalVarables();
        rbScrumFavorc = (RadioButton)findViewById(R.id.rbScrumAFavor);
        rbScrumFavorGanadoc = (RadioButton)findViewById(R.id.rbScrumAFavorGanado);
        rbScrumFavorPerdidoc = (RadioButton) findViewById(R.id.rbSrcumAfavorPerdido);
        rbScrumFavorReseteadoc = (RadioButton) findViewById(R.id.rbScrumAFavorReseteado);
        rbScrumContrac =(RadioButton) findViewById(R.id.rbScrumenContra);
        rbScrumContraRobadoc = (RadioButton) findViewById(R.id.rbScrumEncontraPerdido);
        rbScrumContraReseteadoc = (RadioButton) findViewById(R.id.rbScrumEnContraReseteado);
        btSumarScrum = (Button) findViewById(R.id.btSumarScrum);
        final TextView txAFG = (TextView) findViewById(R.id.txScrumAFGAnado);
        final TextView txAFP = (TextView) findViewById(R.id.txScrumAFPerdido);
        final TextView txAFR = (TextView) findViewById(R.id.txScrumAFReseteado);
        btSumarScrum.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (rbScrumFavorc.isChecked()) {
                    g.setContScrumaFavor(g.getContScrumaFavor() + 1);
                    if (rbScrumFavorGanadoc.isChecked()) {
                        g.setContScrumAFGanados(g.getContScrumAFGanados() + 1);
                        txAFG.setText(String.valueOf(g.getContScrumAFGanados()));
                    }
                    if (rbScrumFavorPerdidoc.isChecked()){
                        g.setContScrumAFPerdidos(g.getContScrumAFPerdidos() + 1);
                        txAFP.setText(String.valueOf(g.getContScrumAFPerdidos()));

                    }
                    if (rbScrumFavorReseteadoc.isChecked()){
                        g.setContScrumAFReseteados(g.getContScrumAFReseteados() + 1);
                        txAFR.setText(String.valueOf(g.getContScrumAFReseteados()));
                    }
                }
            }
        });


    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_scrum, menu);
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
