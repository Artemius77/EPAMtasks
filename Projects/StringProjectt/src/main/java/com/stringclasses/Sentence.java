package com.stringclasses;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sentence {


    private List<Word> words =  new ArrayList<>();
    private List<Punctuation> punct = new ArrayList<>();


    public Sentence(String sentence) {
        setSentense(sentence);
    }

    public Sentence(){}

    /**Setter*/
    public void setSentense(String str) {
        String[] sentence = str.split("\\b");
        for (String part : sentence) {
            if (part.matches("\\w+")) words.add(new Word(part));
            else{
                punct.add(new Punctuation(part.charAt(0)));
            }
        }

    }

    public List<Word> getWords() {
        return words;
    }

    public List<Punctuation> getPunct() {
        return punct;
    }



    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        int i = 0;
        for (Word word :
                words) {
            result.append(word);
            if (punct.get(i) != null)
                result.append(punct.get(i++));
        }
        return result.toString();
    }

    /*public static void main(String[] args) {
        Sentence sentence = new Sentence();
        sentence.setSentense("A man, a plan, a canal - Panama!");
        System.out.println(sentence.getWords());
        for (Punctuation punct: sentence.getPunct()
             ) {
            System.out.println("punct: " + punct.getPunctuation());
        }
    }*/
}
