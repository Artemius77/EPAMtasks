package FifthPractise.SecondTaskCollections.FirstPartListEnSets;

import java.util.Random;

public class IntegerGenerator implements Generator<Integer> {

    private int size = 10000;

    Random random = new Random(47);

    public IntegerGenerator(int size) {
        this.size = size;
    }

    public IntegerGenerator() {
    }

    @Override
    public Integer next() {
        return random.nextInt(size);
    }

    
}

//return ThreadLocalRandom.current().nextInt(from, to + 1);