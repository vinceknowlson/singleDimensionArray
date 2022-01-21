package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // Random random = new Random();
        //   int[] favouriteNumbers = new int[10];

        //  for (int i = 0; i < favouriteNumbers.length; i++) {
        //     favouriteNumbers[i] = random.nextInt(500);
        //    System.out.println(favouriteNumbers[i]);

        char[] vowels = {'u', 'o', 'i', 'e', 'a'};
        char[] consonants = new char[21];
        int newChar = 0;
        boolean found;
        for (char i = 'a'; i <= 'z'; i++) {
            found = false;
            for (int j = 0; j < vowels.length; j++) {
                if (vowels[j] == i) {
                    found = true;
                    break;
                }
            }
            if (!found) {
                consonants[newChar] = i;
                newChar++;
            }
        }
        Arrays.sort(vowels);
        System.out.println(Arrays.toString(vowels));
        System.out.println(Arrays.toString(consonants));
    }
}

