public class ElektronikLaden {
    public static int billigsteTastatur(int[] tastaturen) {
        int billigste = tastaturen[0];
        for (int i = 1; i < tastaturen.length; i++) {
            if (tastaturen[i] < billigste) {
                billigste = tastaturen[i];
            }
        }
        return billigste;
    }

    //    Ub. 2
    public static int teuersterGegenstand(int[] tastaturen, int[] usbLaufwerke) {
        int teuersteTastatur = tastaturen[0];
        int teuerstesUSB = usbLaufwerke[0];

        for (int t : tastaturen) {
            if (t > teuersteTastatur) {
                teuersteTastatur = t;
            }
        }

        for (int usb : usbLaufwerke) {
            if (usb > teuerstesUSB) {
                teuerstesUSB = usb;
            }
        }

        return Math.max(teuersteTastatur, teuerstesUSB);
    }

    //    Ub. 3
    public static int teuerstesUsbInnerhalbBudget(int[] usbLaufwerke, int budget) {
        int teuerstesUSB = -1;
        for (int usb : usbLaufwerke) {
            if (usb <= budget && usb > teuerstesUSB) {
                teuerstesUSB = usb;
            }
        }
        return teuerstesUSB;
    }

    //    Ub. 4
    public static int maximalerAusgabebetrag(int budget, int[] tastaturen, int[] usbLaufwerke) {
        int maximaleSumme = -1;

        for (int tastatur : tastaturen) {
            for (int usb : usbLaufwerke) {
                int gesamtPreis = tastatur + usb;
                if (gesamtPreis <= budget && gesamtPreis > maximaleSumme) {
                    maximaleSumme = gesamtPreis;
                }
            }
        }

        return maximaleSumme;
    }
}
