package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Student {
    String generateFilename() {
        return favoriteFruit+".txt";
    }
    String favoriteFruit;
    Student(String favoriteFruit) {
        this.favoriteFruit = favoriteFruit;
    }
}
