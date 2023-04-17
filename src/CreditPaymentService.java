public class CreditPaymentService {
    public int calculate(int credit, double percent, int year) {
        double monthlyPercent = percent / 1200;
        double sumMonths = year * 12;
        double monthlyPay = credit * monthlyPercent / (1 - Math.pow(1 + monthlyPercent, -sumMonths));
        int monthlyPayInt = (int) monthlyPay;
        return monthlyPayInt;
    }
}

