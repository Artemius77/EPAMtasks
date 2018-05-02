package com.main;

import com.stringclasses.Text;
import com.stringclasses.Word;

import java.util.List;

public class TextHandler {

    private Text text;

    public TextHandler(Text text) {
        this.text = text;
    }

    public void replaceWords(int sentencesIndex, int wordLength, String word) {
      List<Word> sent = text.getText().get(sentencesIndex).getWords();
        for (int i = 0; i < sent.size(); i++) {
            if (sent.get(i).getWord().size() == wordLength )
                sent.set(i,new Word(word));
        }
    }

    public Text getText() {
        return text;
    }

    public void setText(Text text) {
        this.text = text;
    }

    /*public static void main(String[] args) {
        TextHandler textHandler = new TextHandler(new Text("This is a test. This is a T.L.A.   " +
                " test. Now    with a Dr. in it."));
        textHandler.replaceWords(0,1,"not a");
        System.out.println(textHandler.getText());
    }*/
}
