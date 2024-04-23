package models;

public class Student {
  public String vorname;
  public String nachname;
  public String geburtsdatum;
  public String klasse;

  public Student(String vorname, String nachname, String geburtsdatum, String klasse) {
    this.vorname = vorname;
    this.nachname = nachname;
    this.geburtsdatum = geburtsdatum;
    this.klasse = klasse;


  }

  public Student() {

  }
}
