package com.mphasis.main.cui;

import java.util.Optional;
import java.util.stream.Stream;

public class Q1 {

    public static void main(String[] args) {

        Stream<String> nameStream = Stream.of("mohan","john","vaibhav","amit");
        Stream<String> nameStartJ = nameStream.map(
                (s) ->
                {
                    System.out.println("Map: "+s);
                    return s.toUpperCase();

                })
                .filter(
                        (s) ->
                        {
                            System.out.println("Filter: "+s);
                            return s.startsWith("J");
                        }
                );

        Optional<String> findAny = nameStartJ.findAny();
        System.out.println("Final output: "+findAny.get());
    }
}
