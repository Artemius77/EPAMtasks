package FifthPractise.SecondTaskCollections.FirstPartListEnSets;

import java.util.*;

public class CollectionGenerator<T> extends ArrayList<T> {


    public CollectionGenerator(Generator<T> gen, int size) {
        for (int i = 0; i < size; i++) {
            add(gen.next());
        }

    }


    public static <T> CollectionGenerator<T> createList(Generator<T> generator, int size) {
        return new CollectionGenerator<>(generator, size);
    }

    public static <T> HashSet<T> createSet(Generator<T> generator, int size) {
        return new HashSet<>(createList(generator, size));
    }


    @SuppressWarnings("unchecked")
    public static <T> HashSet<T> createSet(IntegerDiapasonGenerator generator, int size)  {
        if (generator.getDiapason() < size) System.out.println("Extra add operations detected!");

        return new HashSet<>(CollectionGenerator.createList((Generator<T>) generator, size));
    }
}




