package com.example.enriqueramirez.lcd7segmentos;

import android.app.Activity;
import android.view.View;
import android.widget.Button;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends Activity {

    Button btnUno, btnCero, btnBorrar;
    TextView datoP, a1,a2,a3,a4,a5,a6,a7;
    String mostrar;

    String vacio = " ";
    String vector[] = {"_","|","|","_","|","|","_"};
    int cont=0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnUno = (Button)findViewById(R.id.Uno);
        btnCero = (Button)findViewById(R.id.Cero);
        btnBorrar = (Button)findViewById(R.id.borrar);
        datoP = (TextView)findViewById(R.id.datos);
        a1 = (TextView)findViewById(R.id.a);
        a2 = (TextView)findViewById(R.id.b);
        a3 = (TextView)findViewById(R.id.c);
        a4 = (TextView)findViewById(R.id.d);
        a5 = (TextView)findViewById(R.id.e);
        a6 = (TextView)findViewById(R.id.f);
        a7 = (TextView)findViewById(R.id.g);

            btnUno.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {

                        mostrar = datoP.getText().toString();
                        mostrar = mostrar + "1";
                        datoP.setText(mostrar);

                        if(cont ==0)
                        {
                            a1.setText(vector[0]);

                        }
                        else if(cont== 1)
                        {
                            a2.setText(vector[1]);
                        }
                        else if(cont ==2)
                        {
                            a3.setText(vector[2]);
                        }
                        else if(cont ==3)
                        {
                            a4.setText(vector[3]);
                        }
                        else if(cont ==4)
                        {
                            a5.setText(vector[4]);
                        }
                        else if(cont ==5)
                        {
                            a6.setText(vector[5]);
                        }
                        else if(cont ==6)
                        {
                            a7.setText(vector[6]);
                        }
                        cont++;
                }
            });
            btnCero.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    mostrar = datoP.getText().toString();
                    mostrar = mostrar + "0";
                    datoP.setText(mostrar);
                    if(cont ==0)
                    {
                        a1.setText(vacio);

                    }
                    else if(cont== 1)
                    {
                        a2.setText(vacio);
                    }
                    else if(cont ==2)
                    {
                        a3.setText(vacio);
                    }
                    else if(cont ==3)
                    {
                        a4.setText(vacio);
                    }
                    else if(cont ==4)
                    {
                        a5.setText(vacio);
                    }
                    else if(cont ==5)
                    {
                        a6.setText(vacio);
                    }
                    else if(cont ==6)
                    {
                        a7.setText(vacio);
                    }
                    cont++;
                }
            });
            btnBorrar.setOnClickListener(new View.OnClickListener() {
                public void onClick(View v) {
                    mostrar = " ";
                    datoP.setText(mostrar);
                    a1.setText(mostrar);
                    a2.setText(mostrar);
                    a3.setText(mostrar);
                    a4.setText(mostrar);
                    a5.setText(mostrar);
                    a6.setText(mostrar);
                    a7.setText(mostrar);
                    cont=0;
                }
            });
    }
}
