package org.pursuit;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Algorithms implements DataStructures {

    @Override
    public char[] stringToCharArray(String word){
        char[] myCharacters = new char[word.length()];
        return myCharacters;
    }

    public ArrayList<Integer> multiplicationTableList(int number){
        ArrayList<Integer> newArrayList = new ArrayList<>();
        for(int i = 1; i <= 10; i++){
            newArrayList.add(i * number);
        }
        return newArrayList;
    }

    public HashMap<String, Integer> wordLength(String[] wordArray){
        HashMap<String, Integer> newHashMap = new HashMap<>();

       for(String i : wordArray){
           newHashMap.put(i, wordArray.length);
       }
        return newHashMap;
    }

    public HashSet<Character> uniqueCharacters(String word){
        HashSet<Character> newHashSet = new HashSet<>();

       for(char i = 0; i < word.length(); i++){
           newHashSet.add(i);
       }
       return newHashSet;
    }
}

