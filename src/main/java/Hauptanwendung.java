import java.io.PrintStream;
import java.util.Arrays;

public class Hauptanwendung {
    public static void main(String[] args) {
        /*
         * 1
         * int i = 5;
         * String str1 = "Hallo";
         * String str2 = "Hallo";
         * String str3 = str2;
         * str2 = "Hallo Welt";
         * 
         * double[] arrDoubles = new double[5];
         * 
         * String[] strings = {"World", "Hello", " "};
         * System.out.printf("%s%s%s!", strings[1], strings[2], strings[0]);
         * String text = "JAVA ist cool";
         * 
         * System.out.println();
         * System.out.println(text.toLowerCase().toCharArray()[2]);
         * 
         * String[] students = new String[5];
         * 
         * System.out.println("Ende");
         */

        PrintStream o = System.out;

        String[][] studens = new String[1][4];

        studens[0][0] = "Peter";
        studens[0][1] = "Lustig";
        studens[0][2] = "24.12.2001";
        studens[0][3] = "FSWI-1";

        studens = MeineMethoden.addOneEmptyItem(studens);

        studens[1][0] = "Petra";
        studens[1][1] = "Lustig";
        studens[1][2] = "01.02.2000";
        studens[1][3] = "FSWI-1";

        studens = MeineMethoden.addOneEmptyItem(studens);

        studens[2][0] = "Max";
        studens[2][1] = "Musterman";
        studens[2][2] = "12.07.2001";
        studens[2][3] = "FSWI-1";

        String[] names = MeineMethoden.getNamesArray();

        o.println(Arrays.deepToString(names));

        names = MeineMethoden.addXEmptyItem(names, 1);

        names[3] = "Paulus";

        o.println(Arrays.deepToString(names));
        o.println(Arrays.deepToString(studens));
        o.println("ENDE");

        for (int i = 0; i < studens.length; i++) {
            for (int ii = 0; ii < studens[i].length; ii++) {
                o.println(studens[i][ii]);
            }
        }

        MeineMethoden.aufgabenFehler();
    }
}