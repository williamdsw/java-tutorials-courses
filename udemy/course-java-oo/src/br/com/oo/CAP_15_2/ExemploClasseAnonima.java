package br.com.oo.CAP_15_2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

/**
 * @author William
 */
public class ExemploClasseAnonima {
    public static void main(String[] args) {
        testaClasseAnonima();
    }

    private static void testaClasseAnonima() {
        // Instancias
        ClubeDeFutebol saoPaulo = new ClubeDeFutebol("São Paulo", 50);
        ClubeDeFutebol corinthians = new ClubeDeFutebol("Corinthians", 49);
        ClubeDeFutebol palmeiras = new ClubeDeFutebol("Palmeiras", 47);
        ClubeDeFutebol santos = new ClubeDeFutebol("Santos", 49);

        // Lista com valores
        List<ClubeDeFutebol> clubes = new ArrayList<>();
        clubes.add(saoPaulo);
        clubes.add(corinthians);
        clubes.add(palmeiras);
        clubes.add(santos);

        // Implementa classe anonima (TEM QUE SOBRESCREVER O UNICO METODO DA INTERFACE)
        Comparator<ClubeDeFutebol> comparator = (ClubeDeFutebol primeiro, ClubeDeFutebol segundo) -> {
            if (primeiro.getNumeroDePontos() > segundo.getNumeroDePontos()) {
                return -1;
            }
            if (primeiro.getNumeroDePontos() < segundo.getNumeroDePontos()) {
                return 1;
            } else {
                return 0;
            }
        };

        // Ordena lista
        Collections.sort(clubes, comparator);

        // Itera valores
        Iterator<ClubeDeFutebol> iterador = clubes.iterator();
        while (iterador.hasNext()) {
            ClubeDeFutebol clube = iterador.next();
            System.out.printf("%s -- %d pts \n", clube.getNome(), clube.getNumeroDePontos());
        }
    }
}