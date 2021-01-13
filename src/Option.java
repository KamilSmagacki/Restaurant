import java.util.Scanner;

public class Option {
    static void chooseOption(Scanner sc, Order order) {
        Dish danie = new Dish();
        int numerDania;
        System.out.println("Zamów wybrane potrawy, wymieniając ich numery po przecinku: ");
        String potrawy = sc.nextLine();
        String[] iloscPotraw = potrawy.split(", ");
        for (String s : iloscPotraw) {
            numerDania = Integer.parseInt(s);
            danie.cena = Offer.prices[numerDania - 1];
            danie.nazwaDania = Offer.names[numerDania - 1];
            danie.id = numerDania;
            order.dodajDoZamowienia(danie);
        }
    }
}
