package com.example.robotic;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

import java.util.ArrayList;

public class ConfigActivity extends AppCompatActivity {
    public Spinner versoes_placa;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate( savedInstanceState );
        setContentView( R.layout.activity_config );
        initializeUI();




    }
    private void initializeUI() {

        Spinner versoes_placa = (Spinner)findViewById(R.id.versoes_placa);

        ArrayList<Placas> contacts = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            contacts.add(new Placas("versao_1." + i, "Id_" + i));
        }

        ArrayAdapter<Placas> adapter =
                new ArrayAdapter<Placas>(getApplicationContext(),  android.R.layout.simple_spinner_dropdown_item, contacts);
        adapter.setDropDownViewResource( android.R.layout.simple_spinner_dropdown_item);

        versoes_placa.setAdapter(adapter);

    }

    private class Placas {
        private String placa_name;
        private String placa_id;

        public Placas() {
        }

        public Placas(String contact_name, String contact_id) {
            this.placa_name = contact_name;
            this.placa_id = contact_id;
        }

        public String getPlacas_name() {
            return placa_name;
        }

        public void setPlacas_name(String contact_name) {
            this.placa_name = contact_name;
        }

        public String getPlacas_id() {
            return placa_id;
        }

        public void setPlacas_id(String contact_id) {
            this.placa_id = contact_id;
        }
        public String toString() {
            return placa_name;
        }

    }



}
