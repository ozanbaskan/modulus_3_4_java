import java.util.Scanner;

public class Modulus {

    public static void main(String[] args) {
        int number, sum, count;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter a number: ");
        number = s.nextInt();
        count = 0;
        sum = 0;
        for (int i = 12; i <= number; i = i + 12)
        {
            count++;
            sum += i;
        }
        if (count == 0)
        {
            System.out.print(0);
        }
        else
        {
            System.out.print(sum / count);
        }
    }



}
