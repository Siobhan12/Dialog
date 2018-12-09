package com.siobcode.dialog;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.support.annotation.NonNull;
import android.support.v4.app.DialogFragment;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Button DAlerta;
    Button DConfirmacion;
    private Button btnDialogAlerta;
    private Button btnDialogConfirmacion;
    private Button btnDialogSeleccion;
    private Button btnDialogSeleccionCheckBox;
    private Button btnDialogSeleccionRadioButton;
    private Button btnDialogPersonalizado;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        OyenteClic objDetectaClic = new OyenteClic();

        btnDialogAlerta = (Button)findViewById(R.id.btnDialogAlerta);
        btnDialogAlerta.setOnClickListener(objDetectaClic);

        btnDialogConfirmacion = (Button)findViewById(R.id.btnDialogConfirmacion);
        btnDialogConfirmacion.setOnClickListener(objDetectaClic);

        btnDialogSeleccion = (Button)findViewById(R.id.btnDialogSeleccion);
        btnDialogSeleccion.setOnClickListener(objDetectaClic);

        btnDialogSeleccionCheckBox = (Button)findViewById(R.id.btnDialogSeleccionCheckBox);
        btnDialogSeleccionCheckBox.setOnClickListener(objDetectaClic);

        btnDialogSeleccionRadioButton = (Button)findViewById(R.id.btnDialogSeleccionRadioButton);
        btnDialogSeleccionRadioButton.setOnClickListener(objDetectaClic);

        btnDialogPersonalizado = (Button)findViewById(R.id.btnDialogPersonalizado);
        btnDialogPersonalizado.setOnClickListener(objDetectaClic);
    }

    class OyenteClic implements View.OnClickListener {
        @Override
        public void onClick(View v) {
            FragmentManager fragmentManager = getSupportFragmentManager();
            DialogFragment Dialog;

            switch (v.getId()){
                case R.id.btnDialogAlerta:
                    Dialog = new DialogoAlerta();
                    Dialog.show(fragmentManager, "tagAlerta");
                    Toast.makeText(MainActivity.this, "Dialog Alerta", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btnDialogConfirmacion:
                    Dialog= new DialogoConfirmacion();
                    Dialog.show(fragmentManager, "tagConfirmacion");
                    Toast.makeText(MainActivity.this, "Dialog Confirmación", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btnDialogSeleccion:
                    Dialog= new DialogoSeleccion();
                    Dialog.show(fragmentManager, "tagSeleccion");
                    Toast.makeText(MainActivity.this, "Dialog Seleccion", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btnDialogSeleccionCheckBox:
                    Dialog= new DialogSeleccionCheckBox();
                    Dialog.show(fragmentManager, "tagSeleccionCheckBox");
                    Toast.makeText(MainActivity.this, "Dialog Seleccion Check Box" , Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btnDialogSeleccionRadioButton:
                    Dialog= new DialogSeleccionRadioButton();
                    Dialog.show(fragmentManager, "tagSeleccionRadioButton");
                    Toast.makeText(MainActivity.this, "Dialog Seleccion Radio Button", Toast.LENGTH_SHORT).show();
                    break;
                case R.id.btnDialogPersonalizado:
                    Dialog= new DialogPersonalizado();
                    Dialog.show(fragmentManager, "tagPersonalizado");
                    Toast.makeText(MainActivity.this, "Dialog Personalizado", Toast.LENGTH_SHORT).show();
                    break;

            }

        }
    }//OyenteClick

}