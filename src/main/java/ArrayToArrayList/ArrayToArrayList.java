package ArrayToArrayList;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {
    public static void main(String[] args) {
        Integer[] array = new Integer[5];
        Arrays.fill(array,5);
        ArrayList<Integer> list = toArrayList(array);
        for (Integer item: list){
            System.out.println(item);
        }
    }
    static <T> ArrayList<T> toArrayList(T[] array){
         ArrayList<T> arrayList = new ArrayList<>(Arrays.asList(array));
         return arrayList;
    }
}
