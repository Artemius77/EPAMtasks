package ThirdPractise.FirstTask.abstracts;

import java.util.*;

public abstract class MyOwnEnum<E extends MyOwnEnum<E>> implements Comparable<E> {

    private static int ordinal;
    private final String name;
  //  private final int ordinal;

  //  private static   List<MyOwnEnum> values = new ArrayList<>();
    private static Map<MyOwnEnum, Integer> map = new LinkedHashMap<>();

    public MyOwnEnum(String name)  {
        this.name = name;
   //     values.add(this);
        map.put(this, ordinal++);
    }

    public final int ordinal() {
        return map.get(this);
    }

    public final String name() {
        return name;
    }

    public static MyOwnEnum[] values() {
        /*MyOwnEnum[] arr = new MyOwnEnum[values.size()];
        values.toArray(arr);
        return arr;*/
        MyOwnEnum[] arr = new MyOwnEnum[map.size()];
        map.keySet().toArray(arr);
        return arr;
    }

    public static MyOwnEnum valueOf(String name) {
        if (name == null)
            throw new NullPointerException("Name is null");

        for (Map.Entry<MyOwnEnum,Integer> pair: map.entrySet()
             ) {
            if (pair.getKey().name.equals(name)) return pair.getKey();
        }
        throw new IllegalArgumentException(
                "No enum constant " + name);
    }


    public final int compareTo(E o) {
        MyOwnEnum<?> other = o;
        MyOwnEnum<E> self = this;
        if (self.getClass() != other.getClass())
            throw new ClassCastException();

        return map.get(self) - map.get(other);
    }

    @Override
    public String toString() {
        return name;
    }

}


