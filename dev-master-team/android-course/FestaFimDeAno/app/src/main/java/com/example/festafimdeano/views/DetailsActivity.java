package com.example.festafimdeano.views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;

import com.example.festafimdeano.R;
import com.example.festafimdeano.constants.FimDeAnoConstants;
import com.example.festafimdeano.util.SecurityPreferences;

public class DetailsActivity extends AppCompatActivity implements View.OnClickListener
{
    /* Holder de elementos */
    private static class ViewHolder
    {
        CheckBox checkParticipate;
    }

    /* Instancias */
    private ViewHolder mViewHolder = new ViewHolder ();
    private SecurityPreferences mSecurityPreferences;

    @Override
    public void onClick (View view)
    {
        int id = view.getId ();

        if (id == R.id.check_participate)
        {
            /* Pega valor com base no Check */
            String value = (this.mViewHolder.checkParticipate.isChecked () ? FimDeAnoConstants.CONFIRMED_WILL_GO : FimDeAnoConstants.CONFIRMED_WONT_GO);

            /* Armazena  */
            this.mSecurityPreferences.storeString (FimDeAnoConstants.PRESENCE, value);;
        }
    }

    @Override
    protected void onCreate (Bundle savedInstanceState)
    {
        super.onCreate (savedInstanceState);
        setContentView (R.layout.activity_details);

        /* Elemento do Holder */
        this.mViewHolder.checkParticipate = findViewById (R.id.check_participate);
        this.mViewHolder.checkParticipate.setOnClickListener (this);

        /* Instancia */
        this.mSecurityPreferences = new SecurityPreferences (this);

        /* Esconde barra de titulo e mostra icone */
        getSupportActionBar ().setDisplayShowTitleEnabled (false);
        getSupportActionBar ().setDisplayShowHomeEnabled (true);
        getSupportActionBar ().setIcon(R.mipmap.ic_launcher);

        this.loadDataFromActivity ();
    }

    /**
     * Verifica valor armazenado e seta o checkbox
     */
    private void loadDataFromActivity ()
    {
        /* Pega valores enviado pelo intent.putExtra () */
        Bundle extras = getIntent ().getExtras ();

        /* Verificacoes */
        if (extras != null)
        {
            String presence = extras.getString (FimDeAnoConstants.PRESENCE);

            if (presence.equals (FimDeAnoConstants.CONFIRMED_WILL_GO))
            {
                this.mViewHolder.checkParticipate.setChecked (true);
            }
            else
            {
                this.mViewHolder.checkParticipate.setChecked (false);
            }
        }
    }
}
