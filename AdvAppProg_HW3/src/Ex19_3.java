import java.util.ArrayList;
import java.util.Collection;
import java.lang.Math;

public class Ex19_3 {
    public static void main(String[] args) {
        //integer section
        ArrayList<Integer> originalList = new ArrayList<Integer>();
        for (int i = 0; i < 100; i++)
        {
            originalList.add(i, ((int)(Math.random()*10)));
        }
        System.out.println("Original Array: ");
        for (int i = 0; i < 4; i++) //display in 25x4 grid
        {
            for (int j = 0; j < 25; j++)
            {
                System.out.print(originalList.get((i*25)+j) + "  ");
            }
            System.out.println();
        }
        ArrayList<Integer> newList = removeDuplicates(originalList);
        System.out.println("Array with duplicates removed: ");
        for (int i = 0; i < newList.size(); i++)
        {
            System.out.print(newList.get(i) + "  ");
        }

        //char section
        ArrayList<Character> charList = new ArrayList<>();
        for (int i = 0; i < 100; i++)
        {
            charList.add(i, (char)((int)((Math.random()*26)+97))); //select random ascii value of a lowercase letter
        }
        System.out.println("\nOriginal Char Array: ");
        for (int i = 0; i < 4; i++) //display in 25x4 grid
        {
            for (int j = 0; j < 25; j++)
            {
                System.out.print((charList.get((i*25)+j)) + "  ");
            }
            System.out.println();
        }
        ArrayList<Character> newCharList = removeDuplicates(charList);
        System.out.println("Array with duplicates removed: ");
        for (int i = 0; i < newCharList.size(); i++)
        {
            System.out.print(newCharList.get(i) + "  ");
        }
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
    {
        ArrayList<E> newList = new ArrayList<>();

        for (int i = 0; i < 100; i++)
        {
            newList.add(i, list.get(i));
        }

        for (int i = newList.size() - 1; i >= 0; i--) {
            for (int j = 0; j < newList.size(); j++) {
                if (newList.get(j) == (newList.get(i)) == true && i != j) {
                    newList.remove(i);
                    break;
                }
            }
        }
        return newList;
    }
}
