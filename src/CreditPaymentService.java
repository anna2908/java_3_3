public class CreditPaymentService {
    public int calculate(int sum, int year, double percent) {
        double m = percent / 100 / 12;
        int n = 12 * year;
        double k = m * Math.pow(1 + m, n) / (Math.pow(1 + m, n) - 1);
        return (int) (sum * k);
    }
}