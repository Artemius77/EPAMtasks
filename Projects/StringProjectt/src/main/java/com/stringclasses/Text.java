package com.stringclasses;

import java.text.BreakIterator;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

public class Text {

    private List<Sentence> text = new ArrayList<>();

    /** Constructor of Text
     */

    public Text(String text) {
        setText(text);
    }

    public Text(){}
    /** Setter
     */

    public void setText(String str) {
        str = str.trim().replaceAll(" +|\t", " ");
        BreakIterator iterator = BreakIterator.getSentenceInstance(Locale.US);
        iterator.setText(str);
        int start = iterator.first();
        for (int end = iterator.next(); end != BreakIterator.DONE; start = end, end = iterator.next()) {
            text.add(new Sentence(str.substring(start,end)));
        }
    }

    public List<Sentence> getText() {
        return text;
    }


    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (Sentence sentence:
             text) {
            result.append(sentence);
        }
        return result.toString();
    }

    /*public static void main(String[] args) {
        Text text = new Text("This is a test. This is a T.L.A.    test. Now    with a Dr. in it.");
        for (Sentence sent :
                text.getText()) {
            System.out.println(sent);
            System.out.println(sent.getWords().get(0).getWord().get(0).getLetter());
            System.out.println(sent.getPunct());
        }
    }*/

}
