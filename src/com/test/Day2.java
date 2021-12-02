package com.test;

import org.w3c.dom.html.HTMLObjectElement;

import java.io.File;
import java.util.Locale;

public class Day2 extends Challenge{

    public Day2(File data) {
        super(data);
    }

    @Override
    public void run() {
        int depthY = 0;
        int horizontalX = 0;
        int aim = 0;
        String [] tempStorage;

        for (String s : getLines()){
            tempStorage = s.split(" ");

            switch (tempStorage[0].toUpperCase()){

                case "FORWARD":
                    horizontalX += Integer.parseInt(tempStorage[1]);
                    break;

                case "UP":
                    depthY =  depthY - Integer.parseInt(tempStorage[1]);
                    break;

                case "DOWN":
                    depthY += Integer.parseInt(tempStorage[1]);
                    break;

            }
        }
        System.out.println("Day 2 Challenge 1");
        System.out.println("------");
        System.out.println("Depth: " + depthY);
        System.out.println("Horizontal: " + horizontalX);
        System.out.println("Multiplied: " + depthY*horizontalX);



        //Day2:
        depthY = 0;
        horizontalX = 0;
        for (String s : getLines()){
            tempStorage = s.split(" ");

            switch (tempStorage[0].toUpperCase()){

                case "FORWARD":
                    horizontalX += Integer.parseInt(tempStorage[1]);
                    depthY += aim * Integer.parseInt(tempStorage[1]);
                    break;

                case "UP":
                    aim -= Integer.parseInt(tempStorage[1]);
                    break;

                case "DOWN":
                    aim += Integer.parseInt(tempStorage[1]);
                    break;

            }
        }

        System.out.println("------");
        System.out.println("Challenge 2");
        System.out.println("Depth: " + depthY);
        System.out.println("Horizontal: " + horizontalX);
        System.out.println("Aim: " + aim);
        System.out.println("Multiplied: " + depthY*horizontalX);

    }
}
