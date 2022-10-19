package ru.geekbrains.comparable;

import java.util.ArrayList;
import java.util.Collections;

public class PersonByWeightAndHeight implements Comparable<PersonByWeightAndHeight> {
    private String name;
    private int age;
    private int weight;
    private int height;

    public PersonByWeightAndHeight(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "PersonByWeightAndHeight {" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }


    @Override
    public int compareTo(PersonByWeightAndHeight o) {
        if (this.weight > o.weight) return 1;
        else if (this.weight == o.weight) {
            if (this.height > o.height) return 1;
            else if (this.height == o.height) return 0;
            else return -1;
        }
        else return -1;
    }

    public static void main(String[] args) {
        ArrayList<PersonByWeightAndHeight> peoples = new ArrayList<>();
        peoples.add(new PersonByWeightAndHeight("Олег", 20, 100, 190));
        peoples.add(new PersonByWeightAndHeight("Даша", 25, 55, 165));
        peoples.add(new PersonByWeightAndHeight("Даша", 18, 55, 164));
        peoples.add(new PersonByWeightAndHeight("Даша", 40, 55, 167));
        peoples.add(new PersonByWeightAndHeight("Маша", 28, 52, 168));
        peoples.add(new PersonByWeightAndHeight("Вася", 18, 90, 178));
        peoples.add(new PersonByWeightAndHeight("Вася", 35, 90, 176));
        Collections.sort(peoples);
        for (PersonByWeightAndHeight people : peoples) {
            System.out.println(people);
        }
    }
}
