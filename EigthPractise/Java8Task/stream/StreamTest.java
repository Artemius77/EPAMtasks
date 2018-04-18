package EigthPractise.Java8Task.stream;

import java.util.Arrays;
import java.util.Collection;

public class StreamTest {


    public static void main(String[] args) {
        //task1
      //  System.out.println(Stream.iterate(10,n -> n+10).limit(10).map(x -> x/2).collect(Collectors.toList()));
        //task2
        Collection<Person> persons = Arrays.asList(
                new Person("Drake", 16, Sex.MAN),
                new Person("Josh", 23, Sex.MAN),
                new Person("Elena", 42, Sex.WOMAN),
                new Person("Ivan", 69, Sex.MAN),
                new Person("Kate", 18, Sex.WOMAN),
                new Person("Nicole", 28, Sex.WOMAN)
        );
        //mans
        persons.stream().filter(x -> x.getSex().equals(Sex.MAN)).forEach(System.out::println);
        //avrg women age
        System.out.println(persons.stream().filter(x -> x.getSex().equals(Sex.WOMAN)).mapToInt(Person::getAge).
              average().getAsDouble());

    }



    private static class Person {
        private String name;
        private int age;
        private Sex sex;


        public Person(String name, int age, Sex sex) {
            this.name = name;
            this.age = age;
            this.sex = sex;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public Sex getSex() {
            return sex;
        }

        public void setSex(Sex sex) {
            this.sex = sex;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", sex=" + sex +
                    '}';
        }
    }

    private enum Sex {
        MAN,
        WOMAN
    }
}
