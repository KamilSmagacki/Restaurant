import java.util.List;

public class PaymentService {
    static double obliczKosztObslugi(double ostatecznaCena) {
        if (ostatecznaCena < 100) {
            return (ostatecznaCena / 100) * 10;
        } else if (ostatecznaCena >= 100) {
            return (ostatecznaCena / 100) * 15;
        } else
            return 0;
    }

    static double obliczKosztDan(double ostatecznaCena, double kosztObslugi) {
        return ostatecznaCena - kosztObslugi;
    }

    static double obliczCeneOstateczna(List<Dish> dania) {
        double ostatecznaCena = 0;
        for (Dish dish : dania) {
            ostatecznaCena = ostatecznaCena + dish.cena;
        }
        return ostatecznaCena;
    }
}
