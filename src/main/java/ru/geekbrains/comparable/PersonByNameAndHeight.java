package ru.geekbrains.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class PersonByNameAndHeight implements Comparable<PersonByNameAndHeight> {
    private String name;
    private int age;
    private int weight;
    private int height;

    public PersonByNameAndHeight(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "PersonByNameAndHeight {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(PersonByNameAndHeight o) {
        if (this.name.compareTo(o.name) == 0) {
            if (this.height > o.height) return 1;
            else if (this.height == o.height) return 0;
            else return -1;
        }
        return this.name.compareTo(o.name);
    }

    public static void main(String[] args) {
        ArrayList<PersonByNameAndHeight> peoples = new ArrayList<>();
        peoples.add(new PersonByNameAndHeight("Олег", 20, 100, 190));
        peoples.add(new PersonByNameAndHeight("Даша", 25, 55, 165));
        peoples.add(new PersonByNameAndHeight("Даша", 18, 55, 164));
        peoples.add(new PersonByNameAndHeight("Даша", 40, 55, 167));
        peoples.add(new PersonByNameAndHeight("Маша", 28, 52, 168));
        peoples.add(new PersonByNameAndHeight("Вася", 18, 90, 178));
        peoples.add(new PersonByNameAndHeight("Вася", 35, 90, 176));
        Collections.sort(peoples);
        for (PersonByNameAndHeight people : peoples) {
            System.out.println(people);
        }
    }
}
