import java.lang.Math;

public class PiSeries {
    public static void main(String[] args) {
        for(int k = 1; k < 10000; k++) {
            System.out.println(Math.pow(-1.0, k + 1.0) / (2.0 * k - 1.0));
        }
    }
}
