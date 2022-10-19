package ru.geekbrains.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class PersonByAge implements Comparable<PersonByAge> {
    private String name;
    private int age;
    private int weight;
    private int height;

    public PersonByAge(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "PersonByAge {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(PersonByAge o) {
        if (this.age > o.age) return 1;
        else if (this.age == o.age) return 0;
        else return -1;
    }

    public static void main(String[] args) {
        ArrayList<PersonByAge> peoples = new ArrayList<>();
        peoples.add(new PersonByAge("Олег", 20, 100, 190));
        peoples.add(new PersonByAge("Даша", 25, 55, 165));
        peoples.add(new PersonByAge("Даша", 18, 51, 164));
        peoples.add(new PersonByAge("Даша", 40, 60, 167));
        peoples.add(new PersonByAge("Маша", 28, 52, 168));
        peoples.add(new PersonByAge("Вася", 18, 90, 176));
        peoples.add(new PersonByAge("Вася", 35, 95, 178));
        Collections.sort(peoples);
        for (PersonByAge people : peoples) {
            System.out.println(people);
        }
    }
}
