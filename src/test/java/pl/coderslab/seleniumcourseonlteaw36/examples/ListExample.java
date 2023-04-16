package pl.coderslab.seleniumcourseonlteaw36.examples;

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        String[] tab = {"ala", "ma", "kota"};
        String s0 = tab[0];

        List<String> list = new ArrayList<>();
        list.add("ala");
        list.add("ma");
        list.add("kota");
    }
}
