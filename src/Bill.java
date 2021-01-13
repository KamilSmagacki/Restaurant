public class Bill {
    static void getBill(Order order) {
        double ostatecznaCena = PaymentService.obliczCeneOstateczna(order.getZamowioneDania());
        double kosztObslugi = PaymentService.obliczKosztObslugi(ostatecznaCena);
        double kosztDan = PaymentService.obliczKosztDan(ostatecznaCena, kosztObslugi);

        System.out.println("Do zapłaty: " + ostatecznaCena + "zł" + "," + " w tym:");
        System.out.println("Koszt dań: " + kosztDan);
        System.out.println("Koszt Obługi: " + kosztObslugi);
    }
}
