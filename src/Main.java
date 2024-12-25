import java.sql.Array;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("ДЗ \"Массивы\"\n");

        //Задача 1
        int[] intArray = new int[3];
        for (int i = 0; i < intArray.length; i++) {
            intArray[i] = i + 1;
        }
        double[] doubleArray = {1.57, 7.654, 9.986};
        String[] stringArray = {"раз", "два", "три", "четыре", "пять"};

        //Задача 2
        System.out.println("Задача 1 и 2");
        for (int i = 0; i < intArray.length - 1; i++) {
            System.out.print(intArray[i] + ", ");
        }
        System.out.println(intArray[intArray.length - 1]);

        for (int i = 0; i < doubleArray.length - 1; i++) {
            System.out.print(doubleArray[i] + ", ");
        }
        System.out.println(doubleArray[doubleArray.length - 1]);

        for (int i = 0; i < stringArray.length; i++) {
            if (i == stringArray.length - 1) {
                System.out.println(stringArray[i] + "\n");
                break;
            }
            System.out.print(stringArray[i] + ", ");
        }

        //Задача 3
        System.out.println("Задача 3");
        for (int i = intArray.length - 1; i > 0; i--) {
            System.out.print(intArray[i] + ", ");
        }
        System.out.println(intArray[0]);

        for (int i = doubleArray.length - 1; i > 0; i--) {
            System.out.print(doubleArray[i] + ", ");
        }
        System.out.println(doubleArray[0]);

        for (int i = stringArray.length - 1; i >= 0; i--) {
            if (i == 0) {
                System.out.println(stringArray[i] + "\n");
                break;
            }
            System.out.print(stringArray[i] + ", ");
        }

        //Задача 4
        System.out.println("Задача 4");
        for (int i = 0; i < intArray.length; i++) {
            if (intArray[i] % 2 != 0) {
                intArray[i] = intArray[i] + 1;
            }
        }
        System.out.println(Arrays.toString(intArray));
    }
}