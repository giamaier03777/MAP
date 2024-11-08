public class MathematischeOperationen {
    public int[] nr1;   //primul numar
    public int[] nr2;   //al doilea numar

    public MathematischeOperationen(int zahl1, int zahl2) {

        int lange1 = 0; //lungimea primului nr
        int lange2 = 0; //lungimea nr 2
        int copyZahl1 = zahl1;
        int copyZahl2 = zahl2;

        //calculare lungime nr 1 si 2
        while (copyZahl1 != 0) {
            lange1++;
            copyZahl1 = copyZahl1 / 10;
        }
        while (copyZahl2 != 0) {
            lange2++;
            copyZahl2 = copyZahl2 / 10;
        }
        if (zahl2 == 0) {
            lange2 = 1; //pt ca 0 are o sg cifra
        }
        nr1 = new int[lange1];
        nr2 = new int[lange2];
        copyZahl1 = zahl1;
        copyZahl2 = zahl2;

        lange1--;
        lange2--;

        while (copyZahl1 != 0) {
            nr1[lange1] = copyZahl1 % 10;
            copyZahl1 = copyZahl1 / 10;
            lange1--;
        }

        while (copyZahl2 != 0) {
            nr2[lange2] = copyZahl2 % 10;
            copyZahl2 = copyZahl2 / 10;
            lange2--;
        }
        if (zahl2 == 0)
            nr2[0] = 0;

    }

    //afisare nr ca array de cifre
    public void printZahlen() {
        System.out.println("Zahl 1:");
        for (int j : nr1) System.out.print(j + " ");
        System.out.println();
        System.out.println("Zahl 2:");
        for (int j : nr2) System.out.print(j + " ");
    }

    //calculeaxa suma sumerelor
    public int[] berechnungSumme() {
        if (nr1.length != nr2.length)
            throw new IllegalArgumentException("Numbers must have the same length");
        int[] ergebnis = new int[nr1.length + 1];   //array pt suma
        int aux = 0;

        for (int i = nr1.length - 1; i >= 0; i--) {
            int zifferZahl1 = nr1[i];   //cifra curenta
            int zifferZahl2 = nr2[i];

            int sum = zifferZahl1 + zifferZahl2 + aux; //adunam cifrele
            ergebnis[i + 1] = sum % 10;
            aux = sum / 10; //pt urm. iteratie
        }

        if (aux > 0) {
            ergebnis[0] = aux;
        } else {
            int[] schlussErgebnis = new int[nr1.length];    //fiind prima cifra 0
            System.arraycopy(ergebnis, 1, schlussErgebnis, 0, nr1.length); //copiem array-ul de la poz[1] care devine [0]
            return schlussErgebnis;

        }
        return ergebnis;

    }

    //    Ub. 2
    //calculeaza diferenta dintre 2 numere
    public int[] berechneDifferenz() {
        if (nr1.length != nr2.length)
            throw new IllegalArgumentException("Die Zahlen sollen die gleiche Lange haben!");

        int[] ergebnis = new int[nr1.length];
        int aux = 0;

        for (int i = nr1.length - 1; i >= 0; i--) {
            int differenz = nr1[i] - nr2[i] - aux;

            if (differenz < 0) {
                differenz += 10;
                aux = 1;
            } else {
                aux = 0;
            }

            ergebnis[i] = differenz;
        }

        //eliminam eventuale 0-uri
        int index = 0;
        while (index < ergebnis.length && ergebnis[index] == 0) {
            index++;
        }

        //daca rez = 0, returnam doar cifra 0
        if (index == ergebnis.length) {
            return new int[]{0};
        }

        int[] schlussErgebnis = new int[nr1.length - index];
        System.arraycopy(ergebnis, index, schlussErgebnis, 0, nr1.length - index);
        return schlussErgebnis;

    }

    //    Ub. 3
    //inmulteste primul nr cu un nr format dintr-o cifra
    public int[] multiplikation() {
        if (nr2.length != 1)
            throw new IllegalArgumentException("Die zweite Zahl soll eine Ziffer haben!");
        int koeffizient = nr2[0];
        if (koeffizient == 0 || nr1[0] == 0)
            return new int[]{0}; //*0 = 0

        int[] ergebnis = new int[nr1.length + 1];
        int aux = 0;

        for (int i = nr1.length - 1; i >= 0; i--) {
            int produkt = (nr1[i] * koeffizient) + aux;
            ergebnis[i + 1] = produkt % 10;
            aux = produkt / 10;
        }


        ergebnis[0] = aux;


        int startIndex = 0;
        while (startIndex < ergebnis.length - 1 && ergebnis[startIndex] == 0) {
            startIndex++;
        }

        if (startIndex == ergebnis.length - 1) {
            return new int[]{0};
        }

        int[] schlussErgebniss = new int[ergebnis.length - startIndex];
        System.arraycopy(ergebnis, startIndex, schlussErgebniss, 0, schlussErgebniss.length);
        return schlussErgebniss;

    }

    //    Ub. 4
    //imparte primul nr cu un nr format dintr-o cifra
    public int[] division() {
        if (nr2[0] == 0)
            throw new ArithmeticException("Man kann durch 0 nicht teilen");
        if (nr2.length != 1)
            throw new IllegalArgumentException("Die zweite Zahl soll eine Ziffer haben!");

        int divisor = nr2[0];
        int[] ergebnis = new int[nr1.length];
        int geblieben = 0;

        for (int i = 0; i < nr1.length; i++) {
            int currentZiffer = nr1[i] + geblieben * 10;
            ergebnis[i] = currentZiffer / divisor;
            geblieben = currentZiffer % divisor;
        }

        int startIndex = 0;

        while (startIndex < ergebnis.length && ergebnis[startIndex] == 0) {
            startIndex++;
        }

        if (startIndex == ergebnis.length) {
            return new int[]{0};
        }

        int[] schlussErgebnis = new int[ergebnis.length - startIndex];
        System.arraycopy(ergebnis, startIndex, schlussErgebnis, 0, schlussErgebnis.length);

        return schlussErgebnis;
    }

}

