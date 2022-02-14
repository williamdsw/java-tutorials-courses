package com.example.festafimdeano.views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.festafimdeano.R;
import com.example.festafimdeano.constants.FimDeAnoConstants;
import com.example.festafimdeano.util.SecurityPreferences;

import java.text.SimpleDateFormat;
import java.util.Calendar;

public class MainActivity extends AppCompatActivity implements View.OnClickListener
{
    /* Holder de elementos */
    private static class ViewHolder
    {
        TextView textToday;
        TextView textDaysLeft;
        Button buttonConfirm;
    }

    /* Instancia */
    private ViewHolder mViewHolder = new ViewHolder ();
    private SecurityPreferences mSecurityPreferences;
    private static final SimpleDateFormat SIMPLE_DATE_FORMAT = new SimpleDateFormat ("dd/MM/yyyy");

    @Override
    public void onClick (View view)
    {
        int id = view.getId ();

        /* Logica de navegacao */
        if (id == R.id.button_confirm)
        {
            String presence = this.mSecurityPreferences.getStoredString (FimDeAnoConstants.PRESENCE);

            /* Cria uma referencia a proxima Activity a ser chamada */
            Intent intent = new Intent (this, DetailsActivity.class);

            /* Passa valor */
            intent.putExtra (FimDeAnoConstants.PRESENCE, presence);

            /* Chama proxima pagina */
            startActivity (intent);
        }
    }


    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_main);

        /* Passa elementos */
        this.mViewHolder.textToday = findViewById (R.id.text_today);
        this.mViewHolder.textDaysLeft = findViewById (R.id.text_days_left);
        this.mViewHolder.buttonConfirm = findViewById (R.id.button_confirm);

        /* Passa evento */
        this.mViewHolder.buttonConfirm.setOnClickListener (this);

        /* Instancia */
        this.mSecurityPreferences = new SecurityPreferences (this);

        /* Campos de data */
        this.mViewHolder.textToday.setText (SIMPLE_DATE_FORMAT.format (Calendar.getInstance().getTime ()));
        String daysLeft = String.format ("%s %s", String.valueOf (getDaysLeftToEndOfYear ()), getString (R.string.dias));
        this.mViewHolder.textDaysLeft.setText (daysLeft);

        /* Esconde barra de titulo e mostra icone */
        getSupportActionBar ().setDisplayShowTitleEnabled (false);
        getSupportActionBar ().setDisplayShowHomeEnabled (true);
        getSupportActionBar ().setIcon(R.mipmap.ic_launcher);
    }

    /* Quando esta pronto */
    @Override
    protected void onStart ()
    {
        super.onStart();
    }

    /* Pronta para receber eventos */
    @Override
    protected void onResume ()
    {
        super.onResume();
        this.verifyPresence ();
    }

    /* Quando a activity nao esta ativa */
    @Override
    protected void onPause ()
    {
        super.onPause();
    }

    /* Quando a activity esta parada */
    @Override
    protected void onStop ()
    {
        super.onStop();
    }

    /* Quando a activity e desalocada da memoria */
    @Override
    protected void onDestroy ()
    {
        super.onDestroy();
    }

    /**
     * Veririca presenca
     */
    private void verifyPresence ()
    {
        /* Valor armazenado */
        String presence = this.mSecurityPreferences.getStoredString (FimDeAnoConstants.PRESENCE);

        /* Verificacoes */
        if (presence.isEmpty ())
        {
            this.mViewHolder.buttonConfirm.setText (R.string.nao_confirmado);
        }
        else if (presence.equals (FimDeAnoConstants.CONFIRMED_WILL_GO))
        {
            this.mViewHolder.buttonConfirm.setText (R.string.sim);
        }
        else if (presence.equals (FimDeAnoConstants.CONFIRMED_WONT_GO))
        {
            this.mViewHolder.buttonConfirm.setText (R.string.nao);
        }
    }

    private int getDaysLeftToEndOfYear ()
    {
        /* Instancias Calendar */
        Calendar calendarToday = Calendar.getInstance ();
        Calendar calendarLastDay = Calendar.getInstance ();

        /* Valores */
        int today = calendarToday.get (Calendar.DAY_OF_YEAR);
        int dayDecember31 = calendarLastDay.getActualMaximum (Calendar.DAY_OF_YEAR);

        return dayDecember31 - today;
    }
}
