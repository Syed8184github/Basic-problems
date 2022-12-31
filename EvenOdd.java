import java.util.*;
public class EvenOdd {
    public static void evenOddFunction(int n){
        if(n%2==0){
            System.out.println("Even number");
        }else{
            System.out.println("odd number");
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        evenOddFunction(n);
    }
}
