import java.util.Scanner;

public class Option {
    static void chooseOption(Scanner sc, Order order) {
        Dish danie = new Dish();
        int numerDania;
        System.out.println("Zamów wybrane potrawy, wymieniając ich numery po przecinku: ");
        String potrawy = sc.nextLine();
        String[] iloscPotraw = potrawy.split(",");
        for (String s : iloscPotraw) {
            numerDania = Integer.parseInt(s);
            if (numerDania == 1) {
                danie.cena = 24.99;
                danie.id = 1;
                danie.nazwaDania = "Pizza Margharita";
                order.dodajDoZamowienia(danie);
            } else if (numerDania == 2) {
                danie.cena = 29.99;
                danie.id = 2;
                danie.nazwaDania = "Pizza Mafioso";
                order.dodajDoZamowienia(danie);
            } else if (numerDania == 3) {
                danie.cena = 31.99;
                danie.id = 3;
                danie.nazwaDania = "Spaghetti Bolognese";
                order.dodajDoZamowienia(danie);
            } else if (numerDania == 4) {
                danie.cena = 26.99;
                danie.id = 4;
                danie.nazwaDania = "Spaghetti Carbonara";
                order.dodajDoZamowienia(danie);
            } else if (numerDania == 5) {
                danie.cena = 24.99;
                danie.id = 5;
                danie.nazwaDania = "Lasagne";
                order.dodajDoZamowienia(danie);
            } else if (numerDania == 6) {
                danie.cena = 16.99;
                danie.id = 6;
                danie.nazwaDania = "Gazpacho";
                order.dodajDoZamowienia(danie);
            } else if (numerDania == 7) {
                danie.cena = 29.99;
                danie.id = 7;
                danie.nazwaDania = "Cannelloni ze szpinakiem";
                order.dodajDoZamowienia(danie);
            } else if (numerDania == 8) {
                danie.cena = 13.99;
                danie.id = 8;
                danie.nazwaDania = "Bruschetta";
                order.dodajDoZamowienia(danie);
            } else if (numerDania == 9) {
                danie.cena = 19.99;
                danie.id = 9;
                danie.nazwaDania = "Tiramisu";
                order.dodajDoZamowienia(danie);
            } else if (numerDania == 10) {
                danie.cena = 19.99;
                danie.id = 10;
                danie.nazwaDania = "Panna Cotta";
                order.dodajDoZamowienia(danie);
            } else {
                System.out.println("Nie mamy dania o takim id");
            }
        }
    }
}
