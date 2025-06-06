import java.util.Scanner;

public class Sumoftwo {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First number");
        int a = sc.nextInt();

        System.out.println("Enter the Second number");
        int b = sc.nextInt();
        int sum = a + b;
        System.out.println("The Sum of a & b is : "+sum);

    }
    
}
