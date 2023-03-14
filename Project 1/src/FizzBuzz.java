import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        System.out.print("Enter a Number: ");
        int number = in.nextInt();

        if (number % 15 == 0)
            System.out.println("FizzBuzz");
        else if (number % 5==0)
            System.out.println("Fizz");
        else if (number % 3==0)
            System.out.println("Buzz");
        else
            System.out.println(number);
        in.close();
    }
}
