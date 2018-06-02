package selftest;

public class one {
    public static void main (String[] args) {
        System.out.println (result (new double[]{8.0, 2.0, 8.0, 5.0, 1.0}));
        // YOUR TESTS HERE
    }

    public static double result (double[] marks) {
        double max = marks[0];
        int sum = 0;
        int r = 0;
        double av = 0;
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] > max) {
                max = marks[i];
            }
        }
        double min = marks[0];
        for (int i = 0; i < marks.length; i++) {
            if (marks[i] < min) {
                min = marks[i];
            }
        }
        for (int i = 0; i < marks.length; i ++){
            if (marks[i]!=max && marks[i]!=min){
              sum += marks[i];
              av = sum/(marks.length - 2);
            }
        }
        return av;


    }
}
