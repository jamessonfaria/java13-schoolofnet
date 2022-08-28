package br.com.jamesson.aula02_helper_methods_collection;

import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class Main {

    public static void main(String[] args) {

        // Java 8
        Set<String> listSet = new HashSet<>();
        listSet.add("ADSADA");
        listSet.add("adadadassad");
        listSet.add("adad");

        // Java 9+ - Method Helper
        Set<String> listSet2 = Set.of("A1", "A2", "A3");

        // iterate no stream
        Stream.iterate(2, number -> number * 2)
                .limit(40)
                .forEach(System.out::println);



    }

}
