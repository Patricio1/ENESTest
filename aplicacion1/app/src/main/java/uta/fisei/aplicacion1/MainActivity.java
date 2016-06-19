package uta.fisei.aplicacion1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private ListView lstViewDatos;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        lstViewDatos = (ListView)findViewById(R.id.lstViewDatos);
        //requiere de un auxiliar para llenar el listview
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,LlenarListView());
        lstViewDatos.setAdapter(adapter);

    }
    private List<String> LlenarListView(){
        //declaracion estructura para almacenar items de la lista
        List<String>listaValores = new ArrayList<String>();
        for (int i=0;i<20;i++){
            listaValores.add("Item Nº "+i);
        }
        return listaValores;
    }


}
