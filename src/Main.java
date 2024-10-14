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

        System.out.println("Ub 1: " + Operationen.notEnough(grades));
        System.out.println("Ub 2: " + Operationen.durchschnitt(grades));
        System.out.println("Ub 3: " + Operationen.recalculateGrades(grades));
        System.out.println("Ub 4: " + Operationen.maxAbgerundeteNote(grades));
    }

    public static void main(String[] args) {
        problem1();
    }
}

