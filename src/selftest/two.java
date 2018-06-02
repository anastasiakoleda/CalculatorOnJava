package selftest;

public class two {
    public static void main (String[] args) {
        System.out.println(summaRuut(5.5, -5.8));
    }

    public static double summaRuut (double a, double b) {
       double sum = a + b;
       return Math.abs(sum);
    }
}
