package com.example.king_.regularizacin;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class activitymain extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activitymain);


        Button inciButton = (Button) findViewById(R.id.incidente);
        inciButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent incidente = new Intent(activitymain.this,ActivityIncidente.class);
                startActivity(incidente);

            }
        });


        Button reporteButton = (Button)findViewById(R.id.reporte);
        reporteButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent reporte = new Intent(activitymain.this,ActivityReporte.class);
                startActivity(reporte);
            }
        });

        Button llegadaButton = (Button)findViewById(R.id.llegada);
        llegadaButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent llegada = new Intent(activitymain.this,activityLlegada.class);
                startActivity(llegada);




            }
        });
    }
}
