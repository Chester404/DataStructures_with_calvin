package org.DataStructures;

import java.util.ArrayList;

public class SentimentAnalysis {
    //input string and return string Negative, Neutral or Positive
    // list of bad words [bad, ugly, terrible, awful, stupid, mad, angry, sad]
    static String[] badWords= {"bad", "ugly", "terrible", "awful", "stupid", "mad", "angry", "sad"};
    enum Result {NEGATIVE, NEUTRAL, POSITIVE}
    static ArrayList<String> inputList = new ArrayList<>();
    public static String  sentimental(String input){
        int badWordCount=0;
        double percentage =0;

        // take input and split into array of words
        String[] inputArray = input.toLowerCase().replaceAll("[^a-z ]","").split(" ");

        // put arrayWords into HashList
        for(String a : inputArray){
            if(a.length() >2){
                inputList.add(a);
            }
        }

        // edge cases shorter than 3 words | if inputlist.empty | if inputlIst = null | all negative | all positive
//        if(inputArray.length < 3){
//            return "Invalid Input";
//        }
        // int badWords = if(arrayWord[index] = badWord) badWords +1;
        for(String a: badWords){
            if(inputList.contains(a)){
                badWordCount++; // can do this in Java Streams
            }
        }
        // percentage = (badWords / arrayWord.count) * 100
        percentage = (badWordCount/(inputList.size()*1.0)) * 100;

        // if(percentage <=5){return Positive} elseIf(5 <= percentage < 20){return Neutral} else return Negative
        if(percentage <= 5){
            return Result.POSITIVE.name();
        } else if (percentage >5 && percentage <20) {
            return Result.NEUTRAL.name();
        }else{
            return Result.NEGATIVE.name();
        }
        //return Result.NEGATIVE.toString();
        //return String.valueOf(Result.NEGATIVE);
    }


    public static void main(String[] args) {
        String letsTry = "";
        System.out.println(sentimental(letsTry));
    }
}
