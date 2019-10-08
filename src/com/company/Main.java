package com.company;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
     List<Integer>events=  Arrays.asList(scanner.nextLine()
        .split(", "))
                .stream()
                .map(s->Integer.parseInt(s))
       .filter(e->e%2==0).collect(Collectors.toList());

List<String>toPrint = events.stream()
        .map(n->n.toString()).collect(Collectors.toList());

String evenString = String.join(", ",toPrint);
        System.out.println(evenString);

        events = events
                .stream()
                .sorted((a,b)->a.compareTo(b))
                .collect(Collectors.toList());
        toPrint.clear();
        for (Integer s: events
             ) toPrint.add(s.toString()); {

        }
        evenString=String.join(", ",toPrint);
        System.out.println(evenString);

    }
}
