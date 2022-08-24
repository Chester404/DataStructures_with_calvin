package org.DataStructures;

import java.util.Arrays;

public class Five_consecutive {
    /*
    *As part of an anti-fraud initiative, a bank is finding the 5 consecutive transactions which provide the largest
    * sum, when analysing monthly spend.

Payments are input as a stream of numbers separated via a -

input: 1-2-3-4-5-6-7-8-9-2
processing: 5 + 6 + 7 + 8 + 9
output: 35

input: 9-0-1-2-8-5-8-8-1-1
processing: 2 + 8 + 5 + 8 + 8
output: 31
```

Can you write  the program which can analyse someone’s transactions, and return the sum of the 5 highest
* consecutive payments?
    * */


    /* 1,2,3,4,5||,6,7,8,9
    * variable size =input.size
    * start, sum = 0;
    * finish = 4;
    * do{
    * for(int i=start; i<= input[finish], i++;){
    * sum += input[i];
    * }
    * start++;
    * finish++;
    * while(finish<= input.length-1)
    * }
    * */

    public static int consecutive(String input){

        int start=0, sum =0;
        int finish = 4;
        int counter = 0;
        String[] refactored = input.split("-");
        int sizeOfInput = refactored.length;
        int[] resultingArr = new int[sizeOfInput-5];
        int[] integerInput= new int[sizeOfInput];

        for(String i : refactored){
            integerInput[counter]= Integer.parseInt(i);
            counter++;
        }

        do{
            // 1 2 3 4 5 6
            for(int i=start; i<=finish; i++ ){
                resultingArr[sum] += integerInput[i];
            }
            start++;
            finish++;
            sum++;
        }while(finish <= sizeOfInput-1);

        return  Arrays.stream(resultingArr).max().getAsInt();
    }

    public static void main(String[] args) {
        String input = "9-0-1-2-8-5-8-8-1-1";
        System.out.println(consecutive(input));
    }
}
