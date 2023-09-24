package org.example;

import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        Person person0 = new Person("Krzyś");

        /*try {
            Person person1 = new Person("Jan", 103);
        } catch (InvalidAgeException e) {
            System.out.println("Złapano wyjątek: " + e.getMessage());
        }*/

        Person person2 = new Person("Zbyszek", 35);
        Person person3 = new Person("Marysia", 65);
        Person person4 = new Person("Kacper", 22);

        List<Person> personList = List.of(person2, person3, person4);

        System.out.println("Lista 1:" + personList);

        Set<Person> personSet2 = Set.of(person2, person3, person4);

        System.out.println("Set 1:" + personSet2);

        Map<Integer, Person> personMap = Map.of(2, person2, 3, person3, 4, person4);

        System.out.println("Map 3:" + personMap);

        //średnia wieku
        List<Integer> ageList = personList.stream()
                .map(Person::getAge).collect(Collectors.toList());

        System.out.println(ageList);

        int result = ageList.stream()
                .reduce(0, Integer::sum);

        System.out.println("Suma wieku: " + result);

        double srednia = (double) result / ageList.size();

        System.out.println(srednia);

        //same imiona
        List<String> nameList = personList.stream()
                .map(Person::getName).collect(Collectors.toList());

        System.out.println(nameList);

        //powyżej 25
        List<Person> over25List = personList.stream()
                .filter(p -> p.getAge() > 25).collect(Collectors.toList());

        System.out.println(over25List);

        //alfabetycznie
        List<String> sortedList = nameList.stream()
                .sorted()
                .collect(Collectors.toList());

        System.out.println(sortedList);

        //forEach
        List<Person> forEachList = personList;
        forEachList.stream().forEach(System.out::println);

        //minmax
        Person minAge = personList.stream().min((p1,p2) -> Integer.compare(p1.getAge(), p2.getAge()))
                .orElse(new Person("brak", 0));
        Person maxAge = personList.stream().max((p1,p2) -> Integer.compare(p1.getAge(), p2.getAge()))
                .orElse(new Person("brak", 0));

        System.out.println("Min: " + minAge + " Max: " + maxAge);

    }


}