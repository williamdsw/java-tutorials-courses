package com.example.conversormoedas;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    /* Classe privada que armazena os elementos da Activity */
    private static class ViewHolder
    {
        EditText editValue;
        TextView textDollar;
        TextView textEuro;
        Button buttonCalculate;
    }

    /* Nova instancia */
    private ViewHolder mViewHolder = new ViewHolder ();

    @Override
    public void onClick (View view)
    {
        int id = view.getId ();

        /* Logica do botao */
        if (id == R.id.button_calculate)
        {
            /* Pegando valores e calculando */
            Double value = Double.valueOf (this.mViewHolder.editValue.getText ().toString ());
            Double dollar = value * 3.95;
            Double euro = value * 4.42;

            /* Passando para TextViews */
            this.mViewHolder.textDollar.setText (String.format ("%.2f", dollar));
            this.mViewHolder.textEuro.setText (String.format ("%.2f", euro));
        }
    }

    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        /* Passando a referencia dos objetos para a classe */
        this.mViewHolder.editValue = findViewById (R.id.edit_value);
        this.mViewHolder.textDollar = findViewById (R.id.text_dollar);
        this.mViewHolder.textEuro = findViewById (R.id.text_euro);
        this.mViewHolder.buttonCalculate = findViewById (R.id.button_calculate);

        /* Passando a propria implementacao */
        this.mViewHolder.buttonCalculate.setOnClickListener (this);

        this.clearValues ();
    }

    private void clearValues ()
    {
        this.mViewHolder.textDollar.setText ("");
        this.mViewHolder.textEuro.setText ("");
    }
}
