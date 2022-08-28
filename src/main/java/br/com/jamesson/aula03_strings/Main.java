package br.com.jamesson.aula03_strings;

import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // Java 7
        String str = "Hello \n" + "World";

        // Java 15

        String blank = "";
        // novos metodos
        System.out.println(blank.isBlank());

        String multiline = """
                            Hello
                            World
                            """;

        System.out.println(multiline);

        // trabalhar com as linhas
        Stream<String> lines = multiline.lines().map(i -> i + "@@");
        lines.forEach(System.out::println);

    }

}
