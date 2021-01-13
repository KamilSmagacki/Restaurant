import java.util.ArrayList;
import java.util.List;

public class Order {
    private final List<Dish> zamowioneDania;

    Order() {
        this.zamowioneDania = new ArrayList<>();
    }

    List<Dish> getZamowioneDania() {
        return zamowioneDania;
    }

    void dodajDoZamowienia(Dish danie) {
        zamowioneDania.add(danie);
    }
}
