import java.util.ArrayList;
import java.util.Arrays;

public class Midterm_1B {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(14);
        list.add(24);
        list.add(14);

        ArrayList<Integer> newList = removeDuplicates(list);
        System.out.print(newList);
        System.out.println();

        String[] names = {"bob", "susan", "bob"};
        ArrayList<String> stringList = new ArrayList<>(Arrays.asList(names));
        stringList = removeDuplicates(stringList);
        System.out.print(stringList);
        System.out.println();
    }

    public static <E> ArrayList<E> removeDuplicates(ArrayList<E> list)
    {
        ArrayList<E> result = new ArrayList<>();

        for (int i = 0; i < list.size(); i++)
        {
            result.add(i, list.get(i));
        }

        for (int i = result.size() - 1; i >= 0; i--) {
            for (int j = 0; j < result.size(); j++) {
                if (result.get(j) == (result.get(i)) && i != j) {
                    result.remove(i);
                    break;
                }
            }
        }
        return result;
    }
}

