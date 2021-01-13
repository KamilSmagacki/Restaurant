import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in);
            Order order = new Order();
            Menu.wyswietlMenu();
            Option.chooseOption(sc, order);
            Bill.getBill(order);
        } catch (InputMismatchException e) {
            System.out.println("Mozna wpisac tylko cyfry!");
        }
    }
}

