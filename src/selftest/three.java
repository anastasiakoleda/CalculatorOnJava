package selftest;

public class three {
    public static void main (String[] args) {
        System.out.println (negElArv (new int[]{5, -8, 9, -20}));

    }

    public static int negElArv (int[] m) {
        int number = 0;
        for (int i = 0; i < m.length; i++){
            if (m[i] < 0){
                number++;
            }
        }
        return number;
    }
}


    Write a method in Java to find the array of sums of columns of a given matrix of integers m (j-th element of the answer is the sum of elements of the j-th column in the matrix). Rows of m might be of different length.
public static void main(String[] args) {
        int[] res = veeruSummad (new int[][] { {1,2,3}, {4,5,6} }); // {5, 7, 9}
        // YOUR TESTS HERE
        }

public static int[] veeruSummad(int[][] m) {
        // TODO!!!    YOUR PROGRAM HERE
        return null;
        }
