import java.util.Scanner;

public class Console {
    private static Scanner in = new Scanner(System.in);

    public static double readNumber(String prompt){
        return in.nextDouble();
    }

    public static double readNumber(String prompt, double min, double max) {

        double value;
        while (true){
            System.out.print(prompt);
            value = in.nextDouble();
            if (min<=value && value<=max)
                break;
            System.out.println("Enter a value between" + min +"and" + max);
        }
        return value;
    }
}
