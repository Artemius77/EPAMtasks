package FifthPractise.SecondTaskCollections.SecondPartMap;

public class Start {


    public static void main(String[] args) {
        Translater dictionary = new Translater();

        dictionary.addPair("strings","строки");
        dictionary.addPair("world","мир");

        System.out.println(dictionary.translateSentences("Hello World"));
    }
}
