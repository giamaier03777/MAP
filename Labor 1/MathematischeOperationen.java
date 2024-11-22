public class MathematischeOperationen {
    private int[] zahl1;
    private int[] zahl2;

    public MathematischeOperationen(int[] zahl1, int[] zahl2) {
        this.zahl1 = zahl1;
        this.zahl2 = zahl2;
    }

    public int[] sameLengthNumbersSum() {
        int[] sum = new int[zahl1.length + 1];
        int carry = 0;

        if (zahl1.length == zahl2.length) {
            for (int i = 0; i < zahl1.length; i++) {
                int ziffer1 = (i < zahl1.length) ? zahl1[zahl1.length - 1 - i] : 0;
                int ziffer2 = (i < zahl2.length) ? zahl2[zahl2.length - 1 - i] : 0;

                int zifferSum = ziffer1 + ziffer2 + carry;
                carry = zifferSum / 10;
                sum[zahl1.length - i] = zifferSum % 10;

            }
            sum[0] = carry;

        } else {
            System.out.println("Die Zahlen sollen die gleiche Lange haben");
            return null;
        }
        return sum;

    }

    // Calculates the sum between the numbers that have the same number of digits
    public int[] sameLengthNumbersDifference() {
        int[] diff = new int[zahl1.length];
        int carry = 0;

        if (zahl1.length == zahl2.length) {
            for (int i = zahl1.length - 1; i >= 0; i--) {
                int ziffer1 = zahl1[i];
                int ziffer2 = zahl2[i];

                int verschZiffer = ziffer1 - ziffer2 - carry;
                if (verschZiffer < 0) {
                    verschZiffer += 10;
                    carry = 1;
                } else {
                    carry = 0;
                }
                diff[i] = verschZiffer;
            }
        } else {
            System.out.println("Die Zahlen mussen die gleiche Lange haben");
            return null;
        }
        return diff;
    }

    // Calculate the multiplication between a big number and a single digit number
    public int[] einzigeZifferMultiplikation(int n) {
        int[] mul = new int[zahl1.length + 1];
        int carry = 0;

        for (int i = zahl1.length - 1; i >= 0; i--) {
            int ziffer = zahl1[i];
            int zifferMul = ziffer * n + carry;
            carry = zifferMul / 10;
            mul[i + 1] = zifferMul % 10;
        }
        mul[0] = carry;

        return mul;
    }

    // Calculate the division between a big number and a single digit number
    public int[] singleDigitNumberDivision(int n) {
        int[] div = new int[zahl1.length];
        int carry = 0;

        if(n != 0) {
            for(int i = 0; i < zahl1.length; i++) {
                int ziffer = zahl1[i];
                int zifferDiv = ziffer + carry * 10;
                carry = zifferDiv % n;
                div[i] = zifferDiv / n;
            }
        } else {
            System.out.println("Die Division mit 0 ist ungultig!");
            return null;
        }
        return div;
    }
}