package js.company;

import java.util.Scanner;
import java.lang.String;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double wynik;

        String wyrazenie = null;
        String operacja = null;
        String liczba1 = null;
        String liczba2 = null;
        double pierwszaLiczba = 0;
        double drugaLiczba = 0;
        boolean isEqual = false;
        boolean isEqual1 = false;

        boolean stop = false;
        while (!stop) {
            wyrazenie = scanner.nextLine();

            if (wyrazenie.equals("exit"))
                break;

           operacja = wyrazenie.substring(0, wyrazenie.indexOf(" "));
           liczba1 = wyrazenie.substring(wyrazenie.indexOf(" ") + 1, wyrazenie.indexOf(" ", wyrazenie.indexOf(" ") + 1));
           liczba2 = wyrazenie.substring(wyrazenie.indexOf(" ", wyrazenie.indexOf(" ") + 1) + 1);



            isEqual = "".equals(liczba1);
            isEqual1 = "".equals(liczba2);

            if (isEqual || isEqual1) {
                System.out.println("Brak danych");
                stop = true;
                continue;
            }


            pierwszaLiczba = Integer.parseInt(liczba1);
            drugaLiczba = Integer.parseInt(liczba2);


            System.out.println(operacja);
            System.out.println(pierwszaLiczba);
            System.out.println(drugaLiczba);

            switch (operacja) {
                case "+"://adding
                    wynik = pierwszaLiczba + drugaLiczba;
                    System.out.println(pierwszaLiczba + " + " + drugaLiczba + " = " + wynik);
                    break;
                case "-"://subtracting
                    wynik = pierwszaLiczba - drugaLiczba;
                    System.out.println(pierwszaLiczba + " - " + drugaLiczba + " = " + wynik);
                    break;
                case "/"://dividing
                    if (drugaLiczba == 0) {
                        System.out.println("operacja nie dozwolona");
                        stop = true;
                        break;
                    }
                    wynik = pierwszaLiczba / drugaLiczba;
                    System.out.println(pierwszaLiczba + " / " + drugaLiczba + " = " + wynik);
                    break;
                case "*"://multiplying
                    wynik = pierwszaLiczba * drugaLiczba;
                    System.out.println(pierwszaLiczba + " * " + drugaLiczba + " = " + wynik);
                    break;
                case "src"://square root with exponent
                    if (pierwszaLiczba <= 0) {
                        System.out.println("operacja nie dozwolona");
                        stop = true;
                        break;
                    }
                    wynik = Math.pow(pierwszaLiczba, 1 / drugaLiczba);
                    System.out.println("SRC od liczby " + pierwszaLiczba + " z wykładnikiem " + drugaLiczba + " = " + wynik);
                    break;
                case "pow"://power
                    wynik = Math.pow(pierwszaLiczba, drugaLiczba);
                    System.out.println("POW od liczby " + pierwszaLiczba + " z wykładnikiem " + drugaLiczba + " = " + wynik);
                    break;
                case "mod"://modulo
                    wynik = pierwszaLiczba % drugaLiczba;
                    System.out.println(pierwszaLiczba + " % " + drugaLiczba + " = " + wynik);
                    break;
                case "div"://a fixed-point number dividing
                    wynik = (int)(pierwszaLiczba/drugaLiczba);
                    System.out.println("DIV od liczby " + pierwszaLiczba + " z wykładnikiem " + drugaLiczba + " = " + wynik);
                    break;
                case "log"://logarithm
                    double wynik1 = Math.log(pierwszaLiczba);
                    double wynik2 = Math.log(drugaLiczba);

                    System.out.println("logarytm naturalny z " + pierwszaLiczba + " to " + wynik1 + " a logarytm naturalny z " + drugaLiczba + " to: " + wynik2);
                    break;
                default:
                    stop = true;
                    break;

            }

        }
    }
}