package com.example.popup;

import android.app.FragmentManager;
import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class popup extends DialogFragment  implements View.OnClickListener {
    View view;
    EditText et;
    Button bsearch;
    Button bcancel;
    TextView tvresult;
    @Override
    public View onCreateView (LayoutInflater inflater, ViewGroup container, Bundle savedInstanceCreate) {
    view=inflater.inflate(R.layout.popup,container,false);
        et=view.findViewById(R.id.etname);
        bsearch= view.findViewById(R.id.recherche);
        bcancel= view.findViewById(R.id.quitter);
        tvresult = view.findViewById(R.id.tvresultat);
        getDialog().setTitle("Entrer le nom de votre phone svp!");
        bsearch.setOnClickListener(this);
        bcancel.setOnClickListener(this);
        return view;
    }
    @Override
    public void onClick(View view) {
        Button bu =(Button) view;
        if (bu.getText().toString().equals("Recherche")){
            if (et.getText().toString().equals("Wiko")){
              tvresult.setText("Résultat trouvé avec succès");
            }
            else {
                tvresult.setText("Résultat non trouvé");
            }
        }
        else {
            this.dismiss();
        }

    }

}
