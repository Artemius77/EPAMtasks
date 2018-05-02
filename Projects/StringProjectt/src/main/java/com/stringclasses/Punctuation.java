package com.stringclasses;

public class Punctuation {
    /**
     * @param punctuation
     * symbol of punctuation
     */
    private char punctuation;

    /**Constructor of symbol of punctuation */
    public Punctuation(char inPunctuation) {
        setPunctuation(inPunctuation);
    }

    /** Getter*/
    public char getPunctuation() {
        return punctuation;
    }

    /** Setter*/
    public void setPunctuation(char inPunctuation) {
        punctuation = inPunctuation ;
    }

    @Override
    public String toString() {
        return  "" +  punctuation ;
    }

}
