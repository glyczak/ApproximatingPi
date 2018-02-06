import java.lang.Math;

class ApproximatingPi {
    public static void main(String args[]) {
        System.out.println(Math.PI);
        System.out.println(wellsBeckmann(13));
    }

    // This is an answer to the first problem.
    public static double gammaFunction(int max) {
        double pi = 1;
        for(int i = 2; i <= max; i++) {
            pi += Math.pow(i, -2);
        }
        return Math.sqrt(6 * pi);
    }

    // This is an answer to the second problem.
    public static double bbpFormula(int max) {
        double pi = 0;
        for(float n = 0; n <= max; n++) {
            pi += Math.pow(16, -n) * ((4 / (8 * n + 1)) - (2 / (8 * n + 4)) - (1 / (8 * n + 5)) - (1 / (8 * n + 6)));
        }
        return pi;
    }

    // These two functions together are an answer to the third problem.
    public static double wellsBeckmann(int n) {
        return Math.pow(2.0, n + 1.0) * Math.sqrt(2.0 - radicalIterator(n));
    }

    public static double radicalIterator(int i) {
        return (i == 1) ? Math.sqrt(2.0) : Math.sqrt(2.0 + radicalIterator(i - 1));
    }
}
