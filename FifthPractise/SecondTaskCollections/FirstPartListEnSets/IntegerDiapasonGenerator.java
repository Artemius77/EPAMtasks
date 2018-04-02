package FifthPractise.SecondTaskCollections.FirstPartListEnSets;

import java.util.concurrent.ThreadLocalRandom;

public class IntegerDiapasonGenerator implements Generator<Integer> {

    private int from;
    private int to = 10;

    public IntegerDiapasonGenerator(int from, int to) {
        this.from = from;
        this.to = to;
    }

    public IntegerDiapasonGenerator() {
    }


    public int getDiapason(){
        return to - from;
    }

    @Override
    public Integer next() {
        return ThreadLocalRandom.current().nextInt(from, to + 1);
    }
}
