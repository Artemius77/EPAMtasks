package com.stringclasses;

public class Letter {
    /**
     * @param letter
     * symbol of letter
     */
    private char letter;

    /**Constructor of Letter*/
    public Letter(char inLetter) {
        setLetter(inLetter);
    }

    /** Getter*/
    public char getLetter() {
        return letter;
    }

    /** Setter*/
    public void setLetter(char inLetter) {
        letter = inLetter;
    }

}
