package br.com.oo.CAP_15;

import br.com.oo.CAP_03.Filme;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/**
 * @author William
 */
public class ExemploMap {
    public static void main(String[] args) {
        testaMap();
    }

    private static void testaMap() {
        int codigo = 1;

        // Dados
        Filme rambo = new Filme();
        rambo.setCodigo(codigo);
        rambo.setNome("RAMBO - Preparado para Matar");
        rambo.setValor(19.90);

        Filme cobra = new Filme();
        cobra.setCodigo(++codigo);
        cobra.setNome("Stallone Cobra");
        cobra.setValor(15);

        Filme tangoCash = new Filme();
        tangoCash.setCodigo(++codigo);
        tangoCash.setNome("Tango & Cash");
        tangoCash.setValor(30.55);

        // Valores chave-valor para um Map
        Map<String, Filme> treeMap = new TreeMap<>();
        treeMap.put("Rambo", rambo);
        treeMap.put("Cobra", cobra);
        treeMap.put("Tango", tangoCash);

        // Funcoes
        System.out.printf("Valor da chave 'Rambo': %s \n", treeMap.get("Rambo"));

        // TreeMap ordena as chaves por ordem alfabetica
        System.out.println(" ===== ITERANDO PELO TREEMAP ===== ");
        Set<String> chaves = treeMap.keySet();
        chaves.forEach((String chave) -> {
            System.out.printf("Chave: %s, Valor: %s \n", chave, treeMap.get(chave).getNome());
        });

        Collection<Filme> valores = treeMap.values();
        valores.forEach((filme) -> {
            System.out.println(filme.toString());
        });
    }
}