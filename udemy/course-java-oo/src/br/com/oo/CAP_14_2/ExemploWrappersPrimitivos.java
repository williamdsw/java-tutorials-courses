package br.com.oo.CAP_14_2;

/**
 * @author William
 */
public class ExemploWrappersPrimitivos {
    public static void main(String[] args) {
        exibePrimitivos();
        exibeWrappers();
    }

    // Wrapper e um tipo de classe que pega um tipo primitivo
    // e "define" algumas funcionalidades para ele
    private static void exibeWrappers() {
        Integer wrapperInteger = 1;
        Float wrapperFloat = 1.1F;
        Double wrapperDouble = 1.2;
        Boolean wrapperBoolean = true;
        Byte wrapperByte = 2;
        Long wrapperLong = 3L;
        Short wrapperShort = 4;
        Character wrapperCharacter = 'c';

        // Exibe
        StringBuilder informacoes = new StringBuilder();
        informacoes.append("\n\nValor do wrapper integer: ").append(wrapperInteger);
        informacoes.append("\nValor do wrapper float: ").append(wrapperFloat);
        informacoes.append("\nValor do wrapper double: ").append(wrapperDouble);
        informacoes.append("\nValor do wrapper boolean : ").append(wrapperBoolean);
        informacoes.append("\nValor do wrapper byte: ").append(wrapperByte);
        informacoes.append("\nValor do wrapper long: ").append(wrapperLong);
        informacoes.append("\nValor do wrapper short: ").append(wrapperShort);
        informacoes.append("\nValor do wrapper char: ").append(wrapperCharacter);
        informacoes.append("\n\nValor do wrapper integer convertido para Int: ").append(wrapperInteger.intValue());
        informacoes.append("\nValor do wrapper integer convertido para Float: ").append(wrapperInteger.floatValue());
        informacoes.append("\nValor do wrapper integer convertido para Double: ").append(wrapperInteger.doubleValue());
        informacoes.append("\nValor do wrapper integer convertido para Byte: ").append(wrapperInteger.byteValue());
        informacoes.append("\nValor do wrapper integer convertido para Long: ").append(wrapperInteger.longValue());
        informacoes.append("\nValor do wrapper integer convertido para Short: ").append(wrapperInteger.shortValue());
        System.out.println(informacoes);
    }

    private static void exibePrimitivos() {
        int primitivoInt = 1;
        float primitivoFloat = 1.1F;
        double primitivoDouble = 1.2;
        boolean primitivoBoolean = false;
        byte primitivoByte = 2;
        long primitivoLong = 3L;
        short primitivoShort = 4;
        char primitivoChar = 'c';

        // Exibe
        StringBuilder informacoes = new StringBuilder();
        informacoes.append("\n\nValor do primitivo integer: ").append(primitivoInt);
        informacoes.append("\nValor do primitivo float: ").append(primitivoFloat);
        informacoes.append("\nValor do primitivo double: ").append(primitivoDouble);
        informacoes.append("\nValor do primitivo boolean : ").append(primitivoBoolean);
        informacoes.append("\nValor do primitivo byte: ").append(primitivoByte);
        informacoes.append("\nValor do primitivo long: ").append(primitivoLong);
        informacoes.append("\nValor do primitivo short: ").append(primitivoShort);
        informacoes.append("\nValor do primitivo char: ").append(primitivoChar);
        System.out.println(informacoes);
    }
}
