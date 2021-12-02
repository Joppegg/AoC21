package com.test;

import java.io.File;

public class Day1 extends Challenge{

    public Day1(File data) {
        super(data);
    }

    @Override
    public void run() {
        int total = 0;
        int prevDepthToCompare = 0;

        for (String s : getLines()){
            total +=  Integer.parseInt(s) > prevDepthToCompare ?  1 : 0;
            prevDepthToCompare = Integer.parseInt(s);
        }
        System.out.print("Challenge 1: ");
        System.out.println(total-1);

        int i = 0;

        int numberOfTimes = 0;
        int prevSum = getSum(getLines().get(0), getLines().get(1), getLines().get(2));
        int compareSum;

        while (i < (getLines().size())-3){

            compareSum = getSum(getLines().get(i+1), getLines().get(i+2), getLines().get(i+3));
            if (compareSum > prevSum){
                numberOfTimes++;

            }
            prevSum=compareSum;
            i++;
        }


        System.out.print("Challenge 2: ");
        System.out.println(numberOfTimes);

    }

    private int getSum(String... stringToConvert){
        int totalSum = 0;
        for (String s : stringToConvert){
            totalSum+= Integer.parseInt(s);
        }

        return totalSum;
    }
}
