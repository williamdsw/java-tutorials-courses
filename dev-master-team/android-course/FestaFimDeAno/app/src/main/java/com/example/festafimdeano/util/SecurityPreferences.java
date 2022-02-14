package com.example.festafimdeano.util;

import android.content.Context;
import android.content.SharedPreferences;

public class SecurityPreferences
{
    /* Instancia da classe */
    private final SharedPreferences mSharedPreferences;

    public SecurityPreferences (Context context)
    {
        /* Passa o nome do arquivo e a forma de leitura */
        this.mSharedPreferences = context.getSharedPreferences ("FimDeAno", Context.MODE_PRIVATE);
    }

    /**
     * Armazena um valor
     * @param key
     * @param value
     */
    public void storeString (String key, String value)
    {
        this.mSharedPreferences.edit ().putString (key, value).apply ();
    }

    /**
     * Recupera um valor
     * @param key
     * @return
     */
    public String getStoredString (String key)
    {
        return this.mSharedPreferences.getString (key, "");
    }
}
