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
        System.out.println("Aufgabe 2");
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

    public static void problem3() {
        System.out.println("\nAufgabe 3");
        MathematischeOperationen operations = new MathematischeOperationen(130000000, 870000000);
        operations.printZahlen();
        System.out.println("Sum: ");
        for (int i = 0; i < operations.berechnungSumme().length; i++)
            System.out.print(operations.berechnungSumme()[i] + " ");

        MathematischeOperationen operations2 = new MathematischeOperationen(830000000, 540000000);
        System.out.println("\nDifference: ");
        for (int i = 0; i < operations2.berechneDifferenz().length; i++)
            System.out.print(operations2.berechneDifferenz()[i] + " ");

        MathematischeOperationen operations3 = new MathematischeOperationen(236000000, 2);
        System.out.println("\nMultiplication: ");
        for (int i = 0; i < operations3.multiplikation().length; i++)
            System.out.print(operations3.multiplikation()[i] + " ");

        MathematischeOperationen operations4 = new MathematischeOperationen(236000000, 2);
        System.out.println("\nDivision: ");
        for (int i = 0; i < operations4.division().length; i++)
            System.out.print(operations4.division()[i] + " ");
    }

    public static void problem4() {
        System.out.println("\n\nAufgabe 4");
        int[] tastaturen = {40, 35, 70, 15, 45};
        int[] usbLaufwerke = {20, 15, 40, 15};

        System.out.println("Billigste Tastatur: " + ElektronikLaden.billigsteTastatur(tastaturen));

        System.out.println("Teuerster Gegenstand: " + ElektronikLaden.teuersterGegenstand(tastaturen, usbLaufwerke));

        int[] usbPreise = {15, 45, 20};
        System.out.println("Teuerstes USB innerhalb des Budgets (30): " + ElektronikLaden.teuerstesUsbInnerhalbBudget(usbPreise, 30));

        int[] tastaturen2 = {40, 50, 60};
        int[] usbLaufwerke2 = {8, 12};
        System.out.println("Maximaler Ausgabebetrag bei Budget 60: " + ElektronikLaden.maximalerAusgabebetrag(60, tastaturen2, usbLaufwerke2));

        int[] tastaturen3 = {60};
        int[] usbLaufwerke3 = {8, 12};
        System.out.println("Maximaler Ausgabebetrag bei Budget 60: " + ElektronikLaden.maximalerAusgabebetrag(60, tastaturen3, usbLaufwerke3));
    }

    public static void main(String[] args) {
        problem1();
        problem2();
        problem3();
        problem4();
    }
}


