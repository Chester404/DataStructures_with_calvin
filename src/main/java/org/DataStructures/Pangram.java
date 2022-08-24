package org.DataStructures;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;

public class Pangram {
    public static boolean isPangram(String input) {
//        if (input.isEmpty() || input=="") {
//            return false;
//        }
        String lowerCase_noSpace_Input = input.replaceAll(" ", "").toLowerCase();
        // String lowerCase_noSpace_Input = input.replaceAll("[^a-z]", "").toLowerCase();
        // check size of the returned result of removing anything not a-z then return true if = 26 else false
        String validPangram = "abcdefghijklmnopqrstuvwxyz";
        Boolean result = true;
        //var input_split = lowerCase_noSpace_Input.split("");
        //HashSet<String> inputSet = new HashSet<>(Arrays.asList(input_split));
        HashSet<Character> inputSet = new HashSet<>();

        //inputSet.addAll(lowerCase_noSpace_Input.toCharArray());
        for(Character a: lowerCase_noSpace_Input.toCharArray()){
            inputSet.add(a);
        }
        if (inputSet.size() < 26) {
            return false;
        }

        for(Character a: validPangram.toCharArray() ){
            if(!inputSet.contains(a)){
                return false;
            }
        }

        return result;
    }

    /* A pangram is a sentence which contains each letter of the alphabet at least once. Any other characters
    should be ignored. Write a function that returns whether a given sentence is a pangram*/
    public static void main(String[] args) {
//        var nm = "abnjckof";
//        var lk = nm.split("");
//        System.out.println(lk);
        String thisString = " The Quick Brown Fox Jumped Over The Lazy Dog!";
        System.out.println(thisString + " is a Pangram = " + isPangram(thisString));
    }
}
