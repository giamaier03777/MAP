import java.util.ArrayList;
import java.util.Collections;

public class Operationen {

    // Ub 1.
    // returneaza toate punctajele mai mici de 40
    public static ArrayList<Integer> notEnough(ArrayList<Integer> noten) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int note : noten) {
            if (note < 0 || note > 100) {
                throw new IllegalArgumentException("Ungueltiges Wert!");
            } else {
                if (note < 40) {
                    arrayList.add(note);
                }
            }
        }
        return arrayList;
    }

    // Ub 2.
    // calculeaza media notelor
    public static float durchschnitt(ArrayList<Integer> grades) {
        int sum = 0;
        for (int note : grades) {
            if (note >= 0 && note <= 100) {
                sum += note;
            }
        }
        return (float) sum / grades.size();

    }

    // Ub 3.
    // recalculeaza notele in functie de regulile de rotunjire
    public static ArrayList<Integer> recalculateGrades(ArrayList<Integer> noten) {
        for (int note : noten) {
            if (note < 0 || note > 100) {
                throw new IllegalArgumentException("Ungueltiges Wert!");
            }
        }
        for (int i = 0; i < noten.size(); i++) {
            int grade = noten.get(i);
            if (grade > 38) {
                int first = grade;
                while (first % 5 != 0) {
                    first++;
                }
                if (grade - first < 3) {
                    noten.set(i, first); //se schimba nota pe pozitia respectiva
                }

            }
        }
        return noten;
    }

    // Ub 4.
    // afisare nota maxima dupa recalculare
    public static int maxAbgerundeteNote(ArrayList<Integer> grades) {
        ArrayList<Integer> newGrades = new ArrayList<>();
        newGrades = recalculateGrades(grades);
        return Collections.max(newGrades);
    }
}