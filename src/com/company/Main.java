package com.company;

import java.awt.event.ItemEvent;
import java.util.*;


public class Main {

    public static void main(String[] args) {

        Person p1 = new Person("Matthew", "Tuck", Gender.MALE);
        Person p2 = new Person("Michael", "Paget", Gender.MALE);
        Person p3 = new Person("Whitney", "Houston", Gender.FEMALE);
        Person p4 = new Person("Jason", "Bowld", Gender.MALE);
        Person p5 = new Person("Avril", "Lavigne", Gender.FEMALE);
        Person p6 = new Person("Avril", "Lavigne", Gender.FEMALE);
        Person p7 = new Person("Jason", "Bowld", Gender.MALE);

        List<Person> personlist = new ArrayList<>(Arrays.asList(p1, p2, p3, p4, p5));
        outputCollection(personlist);

        Set<Person> personSet = new HashSet<>(Arrays.asList(p3, p4, p5, p6, p7));
        outputCollection(personSet);

        Map<Integer, Person> personMap = new HashMap<>();
        personMap.put(1, p1);
        personMap.put(2, p2);
        personMap.put(3, p3);
        personMap.put(4, p4);
        personMap.put(5, p5);
        outputCollection(personMap);
    }

    private static <T> void outputCollection(List<T> personlist) {
        System.out.println();

        for (T i : personlist) {
            System.out.println(i);
        }
        System.out.println("Всего элементов " + personlist.size());
        System.out.println();
    }

    private static <T> void outputCollection(Set<T> personlist) {
        System.out.println();

        for (T i : personlist) {
            System.out.println(i);
        }
        System.out.println("Всего элементов " + personlist.size());
        System.out.println();
    }

    private static <E, T> void outputCollection(Map<E, T> personlist) {
        System.out.println();

//        for (int i = 0; i < personlist.size(); i++) {
    for (E i: personlist.keySet()){
        System.out.println("key: " + i + "   " + personlist.get(i));
        }

        System.out.println("Всего элементов " + personlist.size());
        System.out.println();
    }


}