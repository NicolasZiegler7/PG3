package daten;
import java.io.Console;
import java.lang.reflect.Array;
import java.util.Random;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;

public class Übungen {
    /*
     * 3
     * public static void textOutput() {
     * System.out.println("HalloWelt");
     * }
     * 
     * // Ü2
     * public static void textOutput(String text) {
     * System.out.println("Hallo" + text);
     * }
     * 
     * // Ü3
     * public static void add(Integer number1, Integer number2) {
     * System.out.println(number1 + number2);
     * }
     * 
     * // Ü4
     * public static int adding(int number1, int number2) {
     * return number1 + number2;
     * }
     */

    /*
     * 8
     * public static void setParkingspace(LocalDateTime[] time, String[]
     * parkingLotList, LocalDateTime startTime) {
     * Console console = System.console();
     * 
     * Integer parkingNumber =
     * Integer.parseInt(console.readLine("Bitte geben sie Ihre Parkplatznummer an: "
     * ));
     * if (parkingNumber < 1 || parkingNumber > 6) {
     * parkingNumber = Integer.parseInt(console.
     * readLine("   ERROR: Bitte geben sie eine gültige Parkplatznummer (1-6) an: ")
     * );
     * }
     * else if (parkingLotList[parkingNumber - 1] != null) {
     * parkingNumber = Integer.parseInt(console.
     * readLine("    Ihre angegebene Parkplatznummer ist schon vergeben. Bitte geben sie eine verfügbare Parkpatznummer (1-6) an: "
     * ));
     * }
     * String licensePlate =
     * console.readLine("Bitte geben sie Ihr Kennzeichen an: ");
     * parkingLotList[parkingNumber - 1] = licensePlate;
     * time[parkingNumber - 1] = startTime;
     * System.out.println("Parkplatz " + Arrays.deepToString(parkingLotList));
     * System.out.println("Parkzeit: " + Arrays.deepToString(time));
     * 
     * }
     * 
     * public static void freeParkingspace(LocalDateTime[] time, String[]
     * parkingLotList, LocalDateTime endTime, LocalDateTime startTime) {
     * Console console = System.console();
     * 
     * String choiseOptions = console.
     * readLine("Wenn Sie sich mit ihrer Parkplatznummer austragen wollen dann schreiben Sie bitte 'P', wenn Sie sich mit ihrer Kennzeichennummer austragen wollen dann schreiben Sie bitte 'K': "
     * );
     * if (choiseOptions.equals("P") || choiseOptions.equals("p")) {
     * Integer parkingNumber =
     * Integer.parseInt(console.readLine("Was ist ihre Parkplatznummer?: "));
     * if (parkingNumber < 1 || parkingNumber > 6) {
     * parkingNumber = Integer.parseInt(console.
     * readLine("   ERROR: Bitte geben sie eine gültige Parkplatznummer (1-6) an: ")
     * );
     * }
     * else if (parkingLotList[parkingNumber - 1] == null) {
     * parkingNumber = Integer.parseInt(console.
     * readLine("   Ihre angegebene Parkplatznummer ist nicht belegt. Bitte geben sie eine belegte Parkpatznummer (1-6) an: "
     * ));
     * }
     * 
     * startTime = time[parkingNumber - 1];
     * Duration delta = Duration.between(startTime, endTime);
     * 
     * parkingLotList[parkingNumber - 1] = null;
     * time[parkingNumber - 1] = null;
     * 
     * System.out.println("Parkplatz " + Arrays.deepToString(parkingLotList));
     * System.out.println("Parkzeit: " + Arrays.deepToString(time));
     * System.out.println("Sie haben " + delta + " geparkt.");
     * }
     * else if (choiseOptions.equals("K") || choiseOptions.equals("k")) {
     * String licensePlate =
     * console.readLine("Bitte geben sie Ihr Kennzeichen an: ");
     * boolean found = false;
     * while (true) {
     * for (int i = 0; i < parkingLotList.length; i++) {
     * if (licensePlate.equals(parkingLotList[i])) {
     * found = true;
     * startTime = time[i];
     * Duration delta = Duration.between(startTime, endTime);
     * parkingLotList[i] = null;
     * time[i] = null;
     * break;
     * }
     * }
     * 
     * if (!found) {
     * licensePlate =
     * console.readLine("ERROR: Bitte geben Sie ein vorhandenes Kennzeichen an. ");
     * }
     * if (found) {
     * System.out.println("Parkplatz " + Arrays.deepToString(parkingLotList));
     * System.out.println("Parkzeit: " + Arrays.deepToString(time));
     * break;
     * }
     * }
     * 
     * }
     * }
     */

    /*
     * 9
     * public static void placeItem(ArrayList<String> conveyorBeltArray,
     * ArrayList<String> typeOfGummyBearPackArray) {
     * conveyorBeltArray.addFirst(typeOfGummyBearPackArray.getFirst());
     * typeOfGummyBearPackArray.add(typeOfGummyBearPackArray.removeFirst());
     * }
     * 
     * public static void dropItem(ArrayList<String> conveyorBeltArray) {
     * conveyorBeltArray.addFirst(null);
     * if (conveyorBeltArray.getLast() != null) {
     * System.out.println("-> Rotation: " + conveyorBeltArray.getLast() +
     * " in den Karton gefallen.");
     * }
     * else {
     * System.out.println("-> Rotation: Keine Packung in den Karton gefallen.");
     * }
     * conveyorBeltArray.removeLast();
     * }
     */

    public static boolean checkUsernameAndPassword(Dictionary<String, String> dict) {
        Console console = System.console();
        String username = console.readLine("Benutzername: ");
        String password = console.readLine("Passwort: ");

        if (password.equals(dict.get(username))) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        /*
         * 1
         * String beginning_of_greeting = "Hallo";
         * String compliment = "du bist der größte!";
         * String humiliation = "du bist nicht der größte!";
         * 
         * Console console = System.console();
         * String prename = console.readLine("Bitte geben Sie ihren Vornamen ein: ");
         * String lastname = console.readLine("Bitte geben Sie ihren Nachnamen ein: ");
         * 
         * for (int i = 0; i < 20; i++) {
         * System.out.print("-");
         * }
         * System.out.println();
         * 
         * System.out.print(beginning_of_greeting + " " + prename + " " + lastname);
         * 
         * if (lastname.equals("Ziegler")) {
         * System.out.println(" " + compliment);
         * }
         * else {
         * System.out.println(" " + humiliation);
         * }
         * 
         * for (int j = 0; j < 20; j++) {
         * System.out.print("-");
         * }
         * System.out.println();
         * 
         * String newName = console.readLine("Schreibe einen neuen Namen: ");
         * int age = Integer.parseInt(console.readLine("Schreibe ein Aler: "));
         * 
         * for (int k = 0;k < age; k++) {
         * System.out.println(newName);
         * }
         */

        /*
         * 2
         * Console console = System.console();
         * 
         * float var1 = Float.parseFloat(console.readLine("Geben Sie Zahl 1 ein: "));
         * float var2 = Float.parseFloat(console.readLine("Geben Sie Zahl 2 ein: "));
         * 
         * float result = var1 * var2;
         * 
         * System.out.print("Dein ergibniss lautet: " + " " + result);
         */

        /*
         * 3
         * // Ü1
         * textOutput();
         * 
         * // Ü2
         * textOutput(" Peter");
         * 
         * // Ü3
         * add(1, 4);
         * 
         * // Ü4
         * int result = adding(1, 6);
         * System.out.println(result);
         */

        /*
         * 4
         * Random random = new Random();
         * 
         * int number_of_the_programmer = random.nextInt(100);
         * 
         * Console console = System.console();
         * 
         * 
         * 
         * while (true) {
         * int number =
         * Integer.parseInt(console.readLine("Erraten Sie meine Zahl zwischen 0-100: "))
         * ;
         * if (number >= 0 && number <= 100) {
         * if (number == number_of_the_programmer) {
         * System.out.println("Die geratene Zahl" + " " + number + " " +
         * "ist korrekt!");
         * break;
         * }
         * else {
         * if (number < number_of_the_programmer) {
         * System.out.println("Zu klein!");
         * }
         * else {
         * if (number > number_of_the_programmer) {
         * System.out.println("Zu Groß!");
         * }
         * }
         * }
         * }
         * else {
         * if (number < 0) {
         * System.out.println("Ihre Eingabe ist unter 0");
         * }
         * else {
         * if (number > 100) {
         * System.out.println("Ihre Eingabe ist über 100");
         * }
         * }
         * }
         * 
         * }
         * 
         * 
         * int n = 0;
         * 
         * while (true) {
         * int workingInMin = Integer.parseInt(console.
         * readLine("Bitte geben Sie die Arbeitszeit für die Aufgabe ein: "));
         * String workDescription =
         * console.readLine("Bitte geben Sie eine Arbeitsbeschreibung an: ");
         * System.out.println(workDescription + " (" + workingInMin + " min)");
         * n = n + workingInMin;
         * if (n > 560) {
         * System.out.println("Feierabend!");
         * System.out.println("Sie haben " + (n - 560) + " min mehr gearbeitet");
         * for (int l = 0; l < 25; l++) {
         * System.out.print("-");
         * }
         * break;
         * }
         * }
         */

        /*
         * 5
         * Console console = System.console();
         * 
         * int workingTimePerWeek = 0;
         * int workWeek = 0;
         * 
         * while (workWeek < 5) {
         * int workingTime = 0;
         * 
         * while (workingTime < 560) {
         * 
         * String task = console.readLine("Welche Aufgabe wurde bearbeitet? ");
         * int taskTimeInMin = Integer.parseInt(console.
         * readLine("Wie lange haben Sie für die Aufgabe benötigt? "));
         * System.out.println(task + " (" + taskTimeInMin + " min)");
         * for (int j = 0; j < 25; j++) {
         * System.out.print("-");
         * }
         * System.out.println();
         * workingTime += taskTimeInMin;
         * }
         * 
         * System.out.println("Feierabent!");
         * 
         * int spareTime = workingTime - 560;
         * 
         * workingTimePerWeek += spareTime;
         * 
         * for (int p = 0; p < 25; p++) {
         * System.out.print("-");
         * }
         * 
         * System.out.println("Sie haben " + spareTime + " Minuten mehr gearbeitet.");
         * 
         * workWeek += 1;
         * }
         * 
         * for (int a = 0; a < 25; a++) {
         * System.out.print("-");
         * }
         * 
         * int minutes = workingTimePerWeek % 60;
         * int hours = workingTimePerWeek / 60;
         * 
         * System.out.println("Sie haben diese Woche " + hours + " Stunden und " +
         * minutes + " Minuten mehr gearbeitet.");
         */

        /*
         * 6
         * Console console = System.console();
         * 
         * ArrayList<String> listOfNames = new ArrayList<String>();
         * 
         * String[] fruits = {"Bannane", "Apfel", "Pfirsich", "Drachenfrucht",
         * "Wassermelone", "Himbeeren", "Birne"};
         * 
         * String[] subarray = Arrays.copyOfRange(fruits, 3, 6);
         * 
         * List<String> listFruitsSubarray = Arrays.asList(subarray);
         * 
         * List<String> listFruits = Arrays.asList(fruits);
         * 
         * while (true) {
         * String name = console.readLine("Geben Sie einen Namen ein: ");
         * 
         * if (name.equals("+++")) {
         * break;
         * }
         * else {
         * listOfNames.add(name);
         * }
         * 
         * }
         * 
         * System.out.println(listOfNames);
         * 
         * System.out.println(listFruitsSubarray);
         * System.out.println(listFruits);
         */

        /*
         * 7
         * Console console = System.console();
         * 
         * String[] boys = {"Hans", "Peter", "Franz"};
         * String[] girls = {"Julia", "Michaela", "Franziska"};
         * 
         * List<String> listBoys = Arrays.asList(boys);
         * List<String> listGirls = Arrays.asList(girls);
         * 
         * ArrayList<String> deletedStudent = new ArrayList<>();
         * 
         * ArrayList<String> listStudents = new ArrayList<>();
         * listStudents.addAll(listGirls);
         * listStudents.addAll(listBoys);
         * 
         * String terminator = "---";
         * 
         * while (true) {
         * String searchedStudentName =
         * console.readLine("Gib einen Schühlernamen ein: ");
         * if (listStudents.contains(searchedStudentName)) {
         * for (int a = 0; a < 25; a++) {
         * System.out.print("-");
         * }
         * System.out.println();
         * deletedStudent.add(searchedStudentName);
         * listStudents.remove(searchedStudentName);
         * System.out.println("Der Name: " + searchedStudentName +
         * " wurde aus der Liste entfernt.");
         * }
         * else {
         * if (searchedStudentName.equals(terminator)) {
         * break;
         * }
         * else {
         * for (int b = 0; b < 25; b++) {
         * System.out.print("-");
         * }
         * System.out.println();
         * System.out.println("Der Schüler ist nicht in der Liste vorhanden.");
         * }
         * }
         * }
         * 
         * System.out.println(listStudents);
         * System.out.println("Die neue Liste lautet: " + listStudents + " = " +
         * listStudents.size());
         * for (int c = 0; c < 25; c++) {
         * System.out.print("-");
         * }
         * System.out.println();
         * System.out.println("Liste der gelöschten Schüler: " + "= " +
         * deletedStudent.size());
         */

        /*
         * 8
         * String[] parkingLotList = new String[6];
         * LocalDateTime[] parkingtime = new LocalDateTime[6];
         * 
         * LocalDateTime startTime = LocalDateTime.now();
         * LocalDateTime endTime = LocalDateTime.now();
         * 
         * 
         * setParkingspace(parkingtime, parkingLotList, startTime);
         * freeParkingspace(parkingtime, parkingLotList, endTime, startTime);
         */

        /*
         * 9
         * String[] conveyorBeltList = {null, null, null, null, null, null, null, null,
         * null, null};
         * ArrayList<String> conveyorBeltArray = new
         * ArrayList<>(Arrays.asList(conveyorBeltList));
         * String[] typeOfGummyBearPackList = {"Sauer", "Kirche", "Waldmeister", "",
         * "Cola-Flaschen", "Lakritze", "Bunte-Mischung", ""};
         * ArrayList<String> typeOfGummyBearPackArray = new
         * ArrayList<>(Arrays.asList(typeOfGummyBearPackList));
         * 
         * System.out.println(conveyorBeltArray);
         * dropItem(conveyorBeltArray);
         * for (int e = 0; e < 25; e++) {
         * System.out.print("-");
         * }
         * System.out.println();
         * 
         * int n = 0;
         * 
         * while (n < 15) {
         * placeItem(conveyorBeltArray, typeOfGummyBearPackArray);
         * System.out.println("Beladung: " + conveyorBeltArray);
         * dropItem(conveyorBeltArray);
         * System.out.println("Endzustand: " + conveyorBeltArray);
         * for (int f = 0; f < 25; f++) {
         * System.out.print("-");
         * }
         * System.out.println();
         * 
         * n += 1;
         * }
         */

        Dictionary<String, String> dict = new Hashtable<>();
        dict.put("hans", "abc");
        dict.put("123", "Hans");
        dict.put("root", "23ffeg@r2!3ed");

        System.out.println(dict);

        while (true) {
            if (checkUsernameAndPassword(dict)) {
                System.out.println();
                break;
            }
        }

    }
}