package org.example;

public class Person {
    private int age;
    private String name;

    public Person(String name, int age) {
        if (age < 0 || age > 100) {
            throw new InvalidAgeException("Wiek nie może być mniejszy niż 0 i większy niż 100");
        }
        this.age = age;
        this.name = name;
    }

    public Person(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age < 0 || age > 100) {
            throw new InvalidAgeException("Wiek nie może być mniejszy niż 0 i większy niż 100");
        }
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
