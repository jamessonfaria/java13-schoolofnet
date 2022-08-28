package br.com.jamesson.aula04_codicao_switch;

public class Main {

    public static void main(String[] args) throws Exception {

        Integer status = 1;

        // Java 8
        Integer n = switch (status) {
            case 1:
                System.out.println("Numero 1");
                yield 1;
            case 2:
                System.out.println("Numero 2");
                yield 2;
            default:
                throw new Exception("Numero invalido.");
        };
        System.out.println(n);

        // Java 13+
        Integer n2 = switch (status) {
            case 1, 2, 3 -> {
                System.out.println("Numeros");
                yield 1000;
            }
            default -> throw new Exception("Numero Invalido");
        };
        System.out.println(n2);

    }

}
