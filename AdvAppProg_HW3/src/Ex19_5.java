import java.util.ArrayList;
import java.util.Collection;
import java.lang.Math;

public class Ex19_5 {
    public static void main(String[] args) {
        //integer section
        Integer[] numList = new Integer[100];
        for (int i = 0; i < 100; i++)
        {
            numList[i] = ((int)(Math.random()*10001));
        }
        System.out.println("Int Array: ");
        for (int i = 0; i < 4; i++) //display in 25x4 grid
        {
            for (int j = 0; j < 25; j++)
            {
                System.out.print(numList[(i*25)+j] + "  ");
            }
            System.out.println();
        }
        System.out.println("Max Int: " + max(numList));

        //double section
        Double[] doubleList = new Double[100];
        for (int i = 0; i < 100; i++)
        {
            doubleList[i] = Math.random();
        }
        System.out.println("\nDouble Array: ");
        for (int i = 0; i < 5; i++) //display in 20x5 grid
        {
            for (int j = 0; j < 20; j++)
            {
                System.out.print(doubleList[(i*10)+j] + "  ");
            }
            System.out.println();
        }
        System.out.println("Max Double: " + max(doubleList));
    }
    public static <E extends Comparable<E>> E max(E[] list)
    {
        E maxElement = list[0];
        for (int i = 0; i < list.length; i++)
        {
            if (maxElement.compareTo(list[i]) < 0)
                maxElement = list[i];
        }
        return maxElement;
    }
}
