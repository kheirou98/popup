package com.example.popup;


import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
     TextView txt;
     Context context;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buclick(View view) {
        FragmentTransaction manager =getSupportFragmentManager().beginTransaction();
        popup popupclass= new popup();
        popupclass.show(manager,null);

    }

    public void buconfirm(View view) {
       txt = findViewById(R.id.textView);
        AlertDialog.Builder builder=new AlertDialog.Builder(this);
        builder.setMessage("Etes vous sur de supprimer le msg?")
                .setIcon(R.drawable.ic_launcher_background).
                setTitle("Supprimer la confirmation").setPositiveButton
                ("Oui", new DialogInterface.OnClickListener()
                {public void onClick(DialogInterface dialog, int id){
                    txt.setText("");}
        }).setNegativeButton("Non",
               new DialogInterface.OnClickListener(){public void onClick(DialogInterface dialog, int id){}}).show();
        context=this;
    }
}
