package com.test;

import java.io.File;

public class Main {

    public static void main(String[] args) {


        //Day1
        File file = new File("src/com/resources/day1_1.txt");
        Day1 day1 = new Day1(file);
        day1.run();


        //Day2
        file = new File("src/com/resources/day2_git.txt");
        Day2 day2 = new Day2(file);
        day2.run();

    }
}
