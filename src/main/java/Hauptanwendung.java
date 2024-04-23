import java.util.Arrays;

import models.Student;

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
         * System.out.println("Ende")
         * 
         * String[][] studens = MeineMethoden.findAll()
         * for (int i = 0; i < studens.length; i++) {
         * for (int ii = 0; ii < studens[i].length; ii++) {
         * o.println(studens[i][ii]);
         * }
         * }
         */

        Student student = new Student(
            "Peter",
            "Lustig",
            "24.12.2000",
            "FSWI-1");
        System.out.println(String.format("%s,%s,%s,%s",
            student.getVorname(),
            student.getNachname(),
            student.getGeburtsdatum(),
            student.getKlasse()));
    }

}
