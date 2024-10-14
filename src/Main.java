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
    }
    public static void main(String[] args) {
        problem1();
        problem2();
    }
}


