import java.sql.Array;
import java.util.Arrays;

/**
 * Created by Mahima on 11/11/2016.
 */
public class CountPair {

    void countUptoFifty(int[] arr) {
        Arrays.sort(arr);
        int len = arr.length;
        int count =0;
        for (int i = 0; i < len; i++) {
             for (int j = i + 1; j < len; j++) {
                       int sum = arr[i] + arr[j];
                        if(sum == 50)
                        {
                            System.out.println("Pair: " + arr[i] + "," + arr[j]);
                            count++;


                        }

                }
            }

        System.out.println("Number of pairs: " + count);
    }
    public static void main(String args[])
    {

       CountPair cp = new CountPair();
        int[] arr = {-9, -26, 28, -18, -27, 52, 60, 8, 35, 40,
                49, 48, 21, -18, 36, -41, -87, -69, -27, 1, -1,
                28, -52, 81, -98, -44, 47, -96, -41, 96, -7, 27,
                -4, 75, 13, -69, -18, 66, 61, 64, 57, -65, -24, 57,
                -75, -53, -80, 37, -59, 64, -85, -50, 37, 88, -82,
                -87, 29, 57, -7, 99, 32, 24, -18, -84, 93, 55, 66,
                -40, 6, 43, -20, 24, -12, 31, 59, 8, -56, 6, 91, 59,
                92, -12, 50, 13, 62, 85, -5, 57, -16, 93, 37, -31,
                25, 57, -31, 29, -76, -3, 65, 18};

        cp.countUptoFifty(arr);
    }
}
