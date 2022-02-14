package br.com.oo.CAP_14;

/**
 * @author William
 */
public class ExemploStringBuffer {
    public static void main(String[] args) {
        testaStringBuffer();
    }

    private static void testaStringBuffer() {
        // StringBuffer é uma classe dedicada para modificar Strings
        StringBuffer a = new StringBuffer();
        StringBuffer b = new StringBuffer("Bill");
        StringBuffer c = new StringBuffer(50);

        // capacity () = retorna a capacidade da String (default e 16)
        // !!!! NAO E O COMPRIMEIRO (LENGTH)

        System.out.printf("a capacity = %d \n", a.capacity());
        System.out.printf("b capacity = %d \n", b.capacity());
        System.out.printf("c capacity = %d \n", c.capacity());

        // append () = concatena com outro valor de qualquer tipo de dado
        StringBuffer nome = new StringBuffer("Trevor ");
        nome.append("Reznik");
        System.out.println(nome);

        // insert () = insere um valor de qualquer tipo em um indice informado
        nome = new StringBuffer("Trev");
        nome.insert(1, 'r');
        System.out.println(nome);

        // delete (index inicial, index final)
        // Exclui o conteudo entre o index inicial e o index final
        nome = new StringBuffer("Trevor Reznik");
        nome.delete(1, 6);
        System.out.println(nome);

        // deleteCharAt (index) = exclui um char pelo index informado
        nome = new StringBuffer("Trevor");
        nome.deleteCharAt(3);
        System.out.println(nome);

        // replace (index inicial, index final)
        // Substitui um conteudo baseado no index inicial ate o final
        nome = new StringBuffer("Trevor");
        nome.replace(1, 5, "ront");
        System.out.println(nome);
    }
}