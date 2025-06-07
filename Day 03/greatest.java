import java.util.Scanner;
public class greatest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first number: ");
        int a = sc.nextInt();

        int b = sc.nextInt();
        System.out.println("Enter the second number: ");
        if(a > b){
        System.out.println("a is greatest number");
    }
        else{
            System.out.println("b is greatest number");
            }

        }
    }
