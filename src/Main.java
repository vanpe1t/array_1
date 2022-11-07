import java.sql.Array;
import java.util.Arrays;
import java.util.Random;

public class Main {
    public static void main(String[] args) {

        System.out.println("Задача 1.1");

        int[] myIntArray = new int[3];

        for (int i = 0; i < 3; i++) {
            myIntArray[i] = i + 1;
        }

        System.out.println();
        System.out.println("Задача 1.2");

        double[] myDoubleArray = {1.57, 7.654, 9.986};

        System.out.println();
        System.out.println("Задача 1.3");

        Random rnd = new Random();
        int size = rnd.nextInt(100);
        int[] randomArray = new int[size];

        for (int i = 0; i < size; i++) {
            randomArray[i] = rnd.nextInt(10);
        }

        System.out.println();
        System.out.println("Задача 2.1");

        for (int i = 0; i < myIntArray.length; i++) {
            System.out.print(myIntArray[i]);
            if (i < myIntArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < myDoubleArray.length; i++) {
            System.out.print(myDoubleArray[i]);
            if (i < myDoubleArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < randomArray.length; i++) {
            System.out.print(randomArray[i]);
            if (i < randomArray.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println("Задача 3.1");

        for (int i = 0; i < myIntArray.length; i++) {
            System.out.print(myIntArray[myIntArray.length - i - 1]);
            if (i < myIntArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < myDoubleArray.length; i++) {
            System.out.print(myDoubleArray[myDoubleArray.length - i - 1]);
            if (i < myDoubleArray.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int i = 0; i < randomArray.length; i++) {
            System.out.print(randomArray[randomArray.length - i -1]);
            if (i < randomArray.length - 1) {
                System.out.print(", ");
            }
        }

        System.out.println();
        System.out.println("Задача 4.1");

        for (int i = 0; i < randomArray.length; i++) {
            if (randomArray[i] % 2 != 0) {
                randomArray[i] += 1;
            }
        }

        for (int i = 0; i < randomArray.length; i++) {
            System.out.print(randomArray[i]);
            if (i < randomArray.length - 1) {
                System.out.print(", ");
            }
        }

    }
}