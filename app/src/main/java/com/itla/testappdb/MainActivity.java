package com.itla.testappdb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.itla.testappdb.entidades.Estudiante;
import com.itla.testappdb.repositorio.EstudianteRepositorio;
import com.itla.testappdb.repositorio.EstudianteRepositorioDblmpl;

public class MainActivity extends AppCompatActivity {

    EstudianteRepositorio estudianteRepositorio;
    Button guardar;
    Button cancelar;
    EditText nombre;
    EditText matricula;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        guardar = (Button) findViewById(R.id.btnguardar);
        cancelar = (Button) findViewById(R.id.btncancelar);
        nombre = (EditText) findViewById(R.id.nombreEd)
        matricula = (EditText) findViewById(R.id.matriEd);

        estudianteRepositorio = new EstudianteRepositorioDblmpl(this.getBaseContext());

        Estudiante est1 = new Estudiante();
        est1.setNombre("juan sito sport");
        est1.setMatricula("MAT01");

        estudianteRepositorio.crear(est1);

        Estudiante est2 = new Estudiante();
        est2.setNombre("juan sito roma");
        est2.setMatricula("MAT02");
        estudianteRepositorio.crear(est2);

        guardar.setOnClickListener(new View.OnClickListener()
        );

    }



}
