import java.util.ArrayList;

public class Zahlen {

    // Ub 1
    public static int findeMax(ArrayList<Integer> zahlen) {
        if (zahlen.isEmpty())
            throw new IllegalArgumentException("Array ist leer");

        int max = zahlen.getFirst();

        for (int zahl : zahlen) {
            max = Math.max(zahl, max);
        }

        return max;
    }

    // Ub 2
    public static int findeMin(ArrayList<Integer> zahlen) {
        if (zahlen.isEmpty())
            throw new IllegalArgumentException("Array ist leer");

        int min = zahlen.getFirst();

        for (int zahl : zahlen) {
            min = Math.min(zahl, min);
        }

        return min;
    }

    // Ub 3
    public static int findeMaxSummeVonMinusEins(ArrayList<Integer> zahlen) {
        if (zahlen.isEmpty())
            throw new IllegalArgumentException("Array is empty");

        int sum = 0;
        int min = zahlen.getFirst();

        for (int zahl : zahlen) {
            min = Math.min(zahl, min);
            sum += zahl;
        }

        return sum - min;
    }

    // Ub 4
    public static int findeMinSummeVonMinusEins(ArrayList<Integer> zahlen) {
        if (zahlen.isEmpty())
            throw new IllegalArgumentException("Array ist leer");

        int sum = 0;
        int max = zahlen.getFirst();

        for (int zahl : zahlen) {
            max = Math.max(zahl, max);
            sum += zahl;
        }

        return sum - max;
    }
}