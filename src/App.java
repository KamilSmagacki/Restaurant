import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Order order = new Order();
            Menu.wyswietlMenu();
            Option.chooseOption(sc, order);
            Bill.getBill(order);
        }catch (NumberFormatException e) {
            System.out.println("Nie wpisuj głupot");
        }
    }
}

