import java.lang.Math;

public class OtherApproximations {

    // Attempting to calculate the accuracy of approximating ln(2) with increasing iterations.
    
    public static void main(String[] args) {
        double ln2 = Math.log(2);
        double results[][] = new double[4][3];
        //double slopes[] = new double[results.length - 1];
        for(int i = 0; i < results.length; i++) {
            results[i][2] = i; //Math.pow(10, i);
            results[i][0] = mercatorSeries((int)results[i][2]);
            results[i][1] = Math.abs(ln2 - results[i][0]) / ln2;
        }
        for(int i = 0; i < results.length - 1; i++) {
            System.out.println((results[i + 1][1] - results[i][1])/(results[i + 1][2] - results[i][2]));
        }
        //System.out.println(mercatorSeries(10000));
    }

    public static double mercatorSeries(int i) {
        double j = 0;
        for(int k = 1; k <= i; k++) {
            j += Math.pow(-1, k - 1) / k;
        }
        return j;
    }
}
