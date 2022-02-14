package br.com.oo.CAP_14;

/**
 * @author William
 */
public class ExemploMetodosString {
    public static void main(String[] args) {
        testaMetodosString("Metallica");
        testaOutrosMetodosString("Megadeth");
    }

    private static void testaMetodosString(String nome) {
        System.out.printf("Nome: %s \n", nome);

        // toUpperCase () = Modifica para maiusculo
        nome = nome.toUpperCase();
        System.out.printf("Maiúsculo: %s \n", nome);

        // toLowerCase () = Modifica para minusculo
        nome = nome.toLowerCase();
        System.out.printf("Maiúsculo: %s \n", nome);

        // equalsIgnoreCase () = Compara duas Strings ignorando o case
        if (nome.equalsIgnoreCase("METALLICA")) {
            System.out.printf(" %s tem o mesmo significado que METALLICA ignorando o case \n", nome);
        } else {
            System.out.println("São valores diferentes");
        }

        // length () = numero de caracteres da String
        int tamanho = nome.length();
        System.out.printf("A palavra %s contem %d caracteres. \n", nome, tamanho);

        // charAt (index) = pega o caractere no indice informado
        char sextoCaractere = nome.charAt(5);
        System.out.printf("Sexto caractere da palavra %s no indice 5 = %c \n", nome, sextoCaractere);

        // startsWith () = Verifica se a string começa com tal substring informada
        nome = "Metallica";
        if (nome.startsWith("Metal")) {
            System.out.println("Metallica começa com Metal!");
        } else {
            System.out.println("Metallica não começa com Metal!");
        }

        // endsWith () = Verifica se a string termina com tal substring informada
        if (nome.endsWith("lica")) {
            System.out.println("Metallica termina com lica!");
        } else {
            System.out.println("Metallica não termina com lica!");
        }
    }

    private static void testaOutrosMetodosString(String nome) {
        // compareTo () = Compara duas Strings e retorna um inteiro
        String outroNome = "Metallica";
        System.out.printf("%s é igual a %s ? %s \n", nome, outroNome, (nome.compareTo(outroNome) == 1 ? "Sim" : "Não"));

        // indexOf (String) = retorna o indice da primeira ocorrencia do char ou String
        // informado
        String alfabeto = "abcdefghijklmnopqrstuvwyz";
        System.out.printf("A letra 'm' está localizada no indice %d do alfabeto. \n", alfabeto.indexOf('m'));

        // lastIndexOf () = retorna o indice da ultima ocorrencia do char ou String
        // informado
        String fruta = "Banana";
        System.out.printf("O último indice da letra 'n' na palavra %s está no valor %d \n", fruta,
                fruta.lastIndexOf('n'));

        // replace () = substitui todas ocorrencias de um char ou string informado pelo
        // segundo char ou string informado
        System.out.printf("Nome atual = %s \n", nome);
        nome = nome.replace('e', 'i');
        System.out.printf("Nome depois do replace () = %s \n", nome);

        // Substring () = pega uma string a partir de um indice informado podendo ter ou
        // não outro indice de fim
        String musica = "Symphony of Destruction";
        System.out.printf("Substring do apartir do indice 7 da musica %s = %s \n", musica, musica.substring(7));
        System.out.printf("Substring do apartir do indice 7 ate o indice 11 da musica %s = %s \n", musica,
                musica.substring(7, 11));

        // concat () = concatena duas strings
        System.out.println("Megadeth".concat(" is the best band"));
    }
}