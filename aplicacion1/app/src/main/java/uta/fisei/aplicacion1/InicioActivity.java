package uta.fisei.aplicacion1;

import android.content.res.XmlResourceParser;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.util.Xml;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.TextView;

import org.xml.sax.InputSource;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.concurrent.TimeUnit;

public class InicioActivity extends AppCompatActivity {
    private RadioGroup rdgrOpciones;
    private TextView timer;
    private static final String FORMAT = "%02d:%02d:%02d";
    private Button btnVerbal;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_inicio);
        AñadirItemRadioGroup();
        timer = (TextView)findViewById(R.id.txtTime);
        btnVerbal = (Button)findViewById(R.id.btnVerbal);
        new CountDownTimer(60000, 1000) { // adjust the milli seconds here
        //5400000  ==> 1h30
            public void onTick(long millisUntilFinished) {
                timer.setText(""+String.format(FORMAT,
                        TimeUnit.MILLISECONDS.toHours(millisUntilFinished),
                        TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished) - TimeUnit.HOURS.toMinutes(
                                TimeUnit.MILLISECONDS.toHours(millisUntilFinished)),
                        TimeUnit.MILLISECONDS.toSeconds(millisUntilFinished) - TimeUnit.MINUTES.toSeconds(
                                TimeUnit.MILLISECONDS.toMinutes(millisUntilFinished))));
            }

            public void onFinish() {
                timer.setText("Tiempo Finalizado!");
                //ocultar boton
                btnVerbal.setVisibility(View.INVISIBLE);

            }
        }.start();

 //FormaParseSAX saxparser = new FormaParseSAX(R.xml.preguntas);
        XmlResourceParser xrp = getResources().getXml(R.xml.preguntas);
        FormaParseSAX saxparser = new FormaParseSAX("");
       // myXMLReader.parse(myInputSource);
    }
    private void AñadirItemRadioGroup()
    {
        rdgrOpciones = (RadioGroup)findViewById(R.id.rdgrOpciones);
        for(int i=0;i<4;i++)
        {
            RadioButton radio = new RadioButton(this);
            radio.setText("opcion "+(i+1));
            rdgrOpciones.addView(radio);
        }



    }


}
