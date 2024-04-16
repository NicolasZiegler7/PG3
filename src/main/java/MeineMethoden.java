import java.io.IOException;
import java.io.PrintStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import javax.swing.JOptionPane;

public class MeineMethoden {
    public static int getSumme(int a, int b, PrintStream o) {
        int summe = a + b;
        return summe;
    }

    public static String[] getNamesArray() {
        return new String[] { "Müller", "Meier", "Huber" };
    }

    public static String[] addXEmptyItem(String[] studentsFromMain, int index) {

        String[] lokalBuf = new String[studentsFromMain.length + index];

        System.arraycopy(studentsFromMain, 0, lokalBuf, 0, studentsFromMain.length);

        return lokalBuf;
    }

    public static String[][] addOneEmptyItem(String[][] studentsFromMain) {

        if (studentsFromMain != null) {

            String[][] lokalBuf = new String[studentsFromMain.length + 1][studentsFromMain[0].length];

            System.arraycopy(studentsFromMain, 0, lokalBuf, 0, studentsFromMain.length);

            return lokalBuf;
        } else {
            return null;
        }
    }

    static void aufgabenSchleifen() {
        for (int i = 0; i < 100; i++) {
            System.out.print("Item " + (i + 1) + " ");
        }

        System.out.println();

        while (true) {
            break;
        }

        System.out.println();

        int[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

        for (int i = numbers.length; i > 0; i--) {
            System.out.println((i - 1));
        }

        System.out.println();

        for (int i = (numbers.length - 1); i >= 0; i = i - 2) {
            System.out.println(i);
        }

        System.out.println("- - - -");

        for (int i = numbers.length; i > 0; i--) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(numbers[i - 1]);
        }

        System.out.println("\n- - - -");

        for (int i = numbers.length; i > 0; i--) {
            if (!(i % 2 == 0)) {
                continue;
            }
            System.out.print(numbers[i - 1]);
        }

        System.out.println("\n- - - -");

        for (int i : numbers) {
            i = i * 2;
            System.out.print(i);
        }

    }

    static void aufgabenFehler() {

        System.out.println("- - - -");
        try {
            int index = 5;
            double[] numbers = { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };
            System.out.println(numbers[index]);
        } catch (Exception e) {
            e.printStackTrace();
        }

        try {
            String zahlAlsZeichen = "123";
            int zahlAusZeichen = Integer.parseInt(zahlAlsZeichen);
        } catch (Exception e) {
            e.printStackTrace();
        }
        try {
            String eingabe = JOptionPane.showInputDialog("Gib was ein?");
            System.out.println(eingabe.contains("Hallo"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    public static String[][] findAll() {
        Path filePath = Paths
                .get("/Users/student-sbs/Library/CloudStorage/OneDrive-sbs-herzogenaurach.de/PG3/daten/studenten.csv");
        try {
            String content = Files.readString(filePath);
            String[] lines = content.split("\n");

            String[][] lokBuf = new String[0][0];
            if (lines.length > 0) {
                lokBuf = new String[lines.length][4];

                for (int i = 0; i < lines.length; i++) {
                    String[] elements = lines[i].split(",");
                    lokBuf[i] = elements;

                }

                return lokBuf;
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }

}
