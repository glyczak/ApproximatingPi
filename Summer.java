import java.util.Scanner;
import java.lang.Double;

public class Summer {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double sum = 0.0;
        while(s.hasNextLine()) {
            sum += Double.parseDouble(s.nextLine());
        }
        s.close();
        System.out.println(4 * sum);
    }
}
