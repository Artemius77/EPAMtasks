package EigthPractise.ReflectionTask;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class UnaryOperation {
    private double x;

    public UnaryOperation(){}

    public UnaryOperation(double x){
        this.x = x;
    }

    public void increment(){
        x++;
    }

    public void decrement(){
        x--;
    }

    public void changeSign(){
        x = -x;
    }

    @Override
    public String toString() {
        return "UnaryOperation{" +
                "x=" + x +
                '}';
    }

}
 class Test {


     public static void main(String[] args) throws IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {

         UnaryOperation object1 = UnaryOperation.class.getConstructor(double.class).newInstance(5);
         System.out.println(object1);

         for (Field field : object1.getClass().getDeclaredFields()) {
             field.setAccessible(true);

             System.out.println(field.getName() + "=" + field.get(object1));

             field.set(object1,2);
             System.out.println(field.getName() + "=" + field.get(object1));

             object1.getClass().getMethod("increment").invoke(object1);
             System.out.println(field.getName() + "=" + field.get(object1));

         }
     }
 }