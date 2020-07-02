package com.example.alertdialog;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirDialog(View view){
        //intanciar
        AlertDialog.Builder dialog = new AlertDialog.Builder( this );

        //configurar
        dialog.setTitle("Titulo da Dialog");
        dialog.setMessage("Mensagem da Dialog");

        //configurar cancelamento
        dialog.setCancelable(false);

        //configurar icone
        dialog.setIcon( android.R.drawable.ic_btn_speak_now );

        //configurar acoes SIM e NAO
        dialog.setPositiveButton("Sim", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(
                        getApplicationContext(),
                        "Executar ação SIM",
                        Toast.LENGTH_LONG
                ).show();
            }
        });
        dialog.setNegativeButton("Nao", new DialogInterface.OnClickListener() {
            @Override
            public void onClick(DialogInterface dialog, int which) {
                Toast.makeText(
                        getApplicationContext(),
                        "Executar ação NAO",
                        Toast.LENGTH_LONG
                ).show();
            }
        });


        //criar a exibir
        dialog.create();
        dialog.show();

    }
}