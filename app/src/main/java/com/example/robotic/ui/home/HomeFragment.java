package com.example.robotic.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import com.example.robotic.Placas;
import com.example.robotic.PlacasAdapter;
import com.example.robotic.R;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    private HomeViewModel homeViewModel;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container,Bundle savedInstanceState) {

        homeViewModel =
                ViewModelProviders.of((Fragment) this).get(HomeViewModel.class);
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        final TextView textView = root.findViewById(R.id.text_home);
        final ListView listview1 = (ListView) root.findViewById(R.id.listview1);
        ArrayList<Placas> placas = adicionarPlacas();
       // ArrayAdapter adapter = new ArrayAdapter(this,adicionarPlacas());

        //listview1.setAdapter(adapter);


        /*
        ArrayAdapter adapter = new PlacasAdapter (this,adicionarPlacas());
        listview1.setAdapter( adapter );

        homeViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });

         */


        return root;
    }

    private ArrayList<Placas> adicionarPlacas () {
        ArrayList<Placas> placas = new ArrayList<Placas>();

        new Placas("ESP01",
                "A1:S3", "ON");
        Placas e;

        e = new Placas("ESP12",
                "A1:B2", "ON");
        placas.add(e);
        e = new Placas("ESP",
                "A1:BG:AS", "OFF");
        placas.add(e);
        e = new Placas("ESP4",
                "A2:A4:DS", "ON");
        placas.add(e);
        e = new Placas("ESP5",
                "A3:S3", "OFF");
        placas.add(e);
        e = new Placas("ESP6",
                "A2:DE:C5", "ON");
        placas.add(e);
        e = new Placas("ESP7",
                "A2:DE:C5", "ON");
        placas.add(e);
        e = new Placas("ESP8",
                "A2:DE:C5", "ON");
        placas.add(e);
        e = new Placas("ESP9",
                "A2:DE:C5", "ON");
        placas.add(e);
        e = new Placas("ESP10",
                "A2:DE:C5", "OFF");
        placas.add(e);
        e = new Placas("ESP11",
                "A2:DE:C5", "OFF");
        placas.add(e);
        return placas;
    }


    public Object getSystemService(String layoutInflaterService) {
        return layoutInflaterService;
    }
}
