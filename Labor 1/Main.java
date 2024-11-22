import java.util.ArrayList;

public class Main {
    public static void problem1() {
        ArrayList<Integer> grades = new ArrayList<>();
        grades.add(32);
        grades.add(37);
        grades.add(39);
        grades.add(54);
        grades.add(61);
        grades.add(75);
        grades.add(100);
//        grades.add(101);
        grades.add(98);
        grades.add(90);

        System.out.println("Aufgabe 1");
        System.out.println("Ub 1: " + Operationen.notEnough(grades));
        System.out.println("Ub 2: " + Operationen.durchschnitt(grades));
        System.out.println("Ub 3: " + Operationen.recalculateGrades(grades));
        System.out.println("Ub 4: " + Operationen.maxAbgerundeteNote(grades));
        System.out.println();
    }

    public static void problem2() {
        ArrayList<Integer> zahlen = new ArrayList<>();
        zahlen.add(150);
        zahlen.add(37);
        zahlen.add(391);
        zahlen.add(544);
        zahlen.add(1);
        zahlen.add(7);
        zahlen.add(10);
        zahlen.add(91);
        zahlen.add(90);

        System.out.println("Ub 1: " + Zahlen.findeMax(zahlen));
        System.out.println("Ub 2: " + Zahlen.findeMin(zahlen));
        System.out.println("Ub 3: " + Zahlen.findeMaxSummeVonMinusEins(zahlen));
        System.out.println("Ub 4: " + Zahlen.findeMinSummeVonMinusEins(zahlen));
        System.out.println();
    }

    public static void problem3() {
        int[] zahl1 = {5, 7, 9, 2};
        int[] zahl2 = {3, 5, 6, 1};

        MathematischeOperationen operationen = new MathematischeOperationen(zahl1, zahl2);

        int[] sum = operationen.sameLengthNumbersSum();
        System.out.print("Summe: ");
        ergebnis(sum);

        int[] difference = operationen.sameLengthNumbersDifference();
        System.out.print("Differenz: ");
        ergebnis(difference);

        int[] multiplication = operationen.einzigeZifferMultiplikation(3);
        System.out.print("Multiplikation mit 3: ");
        ergebnis(multiplication);

        int[] division = operationen.singleDigitNumberDivision(2);
        System.out.print("Division durch 2: ");
        ergebnis(division);
    }

    public static void ergebnis(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i < array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        problem1();
        problem2();
        problem3();

    }
}


