package sda;

import java.util.Arrays;
import java.util.Random;

import static sda.CountingSort.sort;

public class App {
    public static void main( String[] args ) {

        // zadanie 1: Zaimplementuj algorytm który posortuje rosnąco 3 liczby = 5, 2, 0.
//        int [] unsorted = {5, 2, 0};
//        System.out.println("Nieposortowana: " + Arrays.toString(unsorted));
//
//        int [] sorted = sort(unsorted);
//        System.out.println("Posortowana: " + Arrays.toString(sort(unsorted)));

//zadanie 2: Popraw algorytm aby posortował rosnąco 15 losowych wartości z zakresu 0-99.

      Random random = new Random();
      int [] liczby = new int[15];
      for (int i = 0; i < 15; i++) {
         liczby[i] = random.nextInt(99);
      }
        System.out.println(Arrays.toString(sort(liczby)));
    }

        //zadanie 3: .Dodaj metodę która przyjmie dowolną liczbę wartości typu Integer
        // a następnie zwróci posortowaną listę przekazanych elementów.


    }

