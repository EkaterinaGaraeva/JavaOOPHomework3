//Написать итератор, который будет выдавать N случайных целых чисел

package ru.geekbrains;

import java.util.Iterator;
import java.util.Random;

public class RandomNumberIterator implements Iterable<Integer> {
    private final int number;

    public RandomNumberIterator(int number) {
        this.number = number;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<Integer>() {
            int counter = 0;
            @Override
            public boolean hasNext() {
                return counter < number;
            }

            @Override
            public Integer next() {
                Random rnd = new Random();
                int randomNumber = rnd.nextInt(100);
                counter++;
                return randomNumber;
            }
        };
    }

    public static void main(String[] args) {
        RandomNumberIterator iterator = new RandomNumberIterator(5);
        for (Integer integer : iterator) {
            System.out.println(integer);
        }
    }
}
