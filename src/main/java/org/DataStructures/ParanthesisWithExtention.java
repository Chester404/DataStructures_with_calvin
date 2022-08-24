package org.DataStructures;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class ParanthesisWithExtention {
    static HashMap<Character,Integer> result= new HashMap();
    static Integer count=0;
    static Character openBrace='(', closeBrace=')';
    static void noAlphabets(String input){
        //isolate characters from non characters using replaceAll([a-z][0-9], "")
     String onlyCharacters = input.replaceAll("[a-z][0-9]","");        //save remaining chars into ArrayList
        bracesMap(onlyCharacters);
    }

    static void bracesMap(String onlyChars){
        for(Character a: onlyChars.toCharArray()){
            if(a == openBrace){
                if(result.get(a)== null){
                    result.put(a, count++);
                }else {
                    result.replace(a,result.get(a),(result.get(a)+1));
                }
//             result.put(a,count++);
            } else if (a == closeBrace) {
                if(result.get(a)== null){
                    result.put(a, count++);
                }else {
                    result.replace(a,result.get(a),(result.get(a)+1));
                }
            }
        }
        isBalanced(result);
    }

    //boolean isBalancedParenthesis(HashMap input)
    static boolean isBalanced(HashMap<Character,Integer> input){
        if(input.get(openBrace)!= input.get(closeBrace)){
            return false;
        }else{
            return true;
        }
    }

    //var openBracket='(', closeBracket=')'
    //foreach(input.toArray){if char == map.add(openBracket(++))else map.add(closeBracket(++))}
    //edgeCase if openbacket.value != closeBracket.value return false
    //

    public class ParenthesisCombo{
        static Set<String> possibleCombinations(int n){
            String stater ="()";
            Set<String> result = new HashSet<>();
            result.add(stater);
            if(n==1)return result;
            else{
                for(String s: result){
                    for(int i=0; i< s.length(); i++){
                        String result2 = s.substring(0,i) + stater + s.substring(i);
                        result.add(result2);
                    }
                }
                return possibleCombinations(n-1);
            }

        }

    }

    public static void main(String[] args) {
        System.out.println();
    }



}


