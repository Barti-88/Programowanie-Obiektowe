//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
void main() {
//        //zad 1
//        Scanner scanner = new Scanner((System.in));
//        System.out.println("Wpisz dowolna liczbę aby sprawdzić czy jest podzielna przez 3");
//
//        int liczba = scanner.nextInt();
//
//        if (liczba % 3 == 0) {
//            System.out.println("Liczba jest podzielna przez 3");
//        } else {
//            System.out.println("Liczba nie jest podzielna przez 3");
//        }
        //zad 2
        System.out.println("Podaj pierwsza liczbe");
        Scanner trojkat = new Scanner(System.in);
        int a = trojkat.nextInt();

        System.out.println("Podaj druga liczbe");
        int b = trojkat.nextInt();

        System.out.println("Podaj trzecia liczbe");
        int c = trojkat.nextInt();

        if (a + b > c && a + c > b && b + c > a) {
                System.out.println("Mozna zbudowac trojkat.");
        } else {
                System.out.println("Nie mozna zbudowac trojkata.");
        }

        //zad 3
        Scanner scanner = new Scanner(System.in);

        System.out.print("Podaj pierwszą liczbę: ");
        double d = scanner.nextDouble();

        System.out.print("Podaj drugą liczbę: ");
        double f = scanner.nextDouble();

        if (d > f) {
                System.out.println("Największa liczba to: " + d);
        } else if (f > d) {
                System.out.println("Największa liczba to: " + f);
        } else {
                System.out.println("Liczby są równe: " + d);
        }
}


