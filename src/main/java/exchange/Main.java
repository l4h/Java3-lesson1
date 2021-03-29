package exchange;

public class Main {
    public static void main(String[] args) {
        Integer[] array;
        array = new Integer []{1,2,3,4,5};

        exchangeElemets(array,1,3);
        for (Integer i:array ) {
            System.out.print("["+i+"],");

        }
    }

    static void exchangeElemets(Object[] array, int firstIndex, int secondIndex) {
        if (array.length >= firstIndex && array.length >= secondIndex){
            Object temp = array[firstIndex-1];
            array[firstIndex-1]=array[secondIndex-1];
            array[secondIndex-1]=temp;
        }
    }
}
