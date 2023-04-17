public class Main {
    public static void main(String[] args) {
        CreditPaymentService service = new CreditPaymentService();

        int monthlyPayOneYear = service.calculate(1_000_000, 9.99, 1);
        System.out.println("Ежемесячный платёж " + monthlyPayOneYear + " руб.");

        int monthlyPayTwoYear = service.calculate(1_000_000, 9.99, 2);
        System.out.println("Ежемесячный платёж " + monthlyPayTwoYear + " руб.");

        int monthlyPayThreeYear = service.calculate(1_000_000, 9.99, 3);
        System.out.println("Ежемесячный платёж " + monthlyPayThreeYear + " руб.");
    }
}
