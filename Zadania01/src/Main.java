//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.Scanner;

void main() {
    //zad1
    System.out.println("Ania");
    System.out.println("Bartek");
    System.out.println("Kasia");

    //zad2
    String imie = "Bartosz";
    int rokUrodzenia = 2010;
    double liczba = 0.66;

    //zad 3
    int obecnyRok = 2026;
    int wiek = obecnyRok - rokUrodzenia;
    System.out.println("Mam na imię " + imie + ", mam " + wiek + " lat.");

    //zad 4
    Scanner konwersja = new Scanner(System.in);

    System.out.print("podaj temperature w stopniach celsjusza: ");
    double stopnie = konwersja.nextDouble();

    double fahrenheit = 1.8 * stopnie + 32.0;

    System.out.println("Temperatura w fahrenheitach: " + fahrenheit);

    //zad 5
    Scanner trojkat  = new Scanner(System.in);



}

