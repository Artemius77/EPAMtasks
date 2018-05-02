package com.stringclasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Word {


    private List<Letter> word =  new ArrayList<>();;

    public Word(){
    }

    public Word(String s) {
        for (int i = 0; i < s.length(); i++)
            word.add(new Letter(s.charAt(i)));
    }


    /** Getter*/
    public List<Letter> getWord() {  // метод, що повертає слово,конвертоване у строку
        return word;
    }

    /** Setter*/
    public void setWord(String str) {
        word.clear();
        for (int i = 0; i < str.length(); i++)
            word.add( new Letter(str.charAt(i)));
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Letter aWord : word) result.append(aWord.getLetter());
        return result.toString();
    }


    /*public static void main(String[] args) {
        Word word = new Word();
        word.setWord("jjjjjces");
        word.setWord("34534fasd");
        word.setWord("f24");
        System.out.println(word.getWord());

        Word word1 = new Word("anotheronw");
        System.out.println(word1);
        word1 = new Word("mama");
        System.out.println(word1);
        word1.setWord("papa");
        System.out.println(word1);
    }*/
}
