import java.util.*;
public class GreatestAmongThreeNumbers {
    public static void biggestNumber(int a,int b,int c){
        if(a>b && a>c){
            System.out.println("a is greater");
        }else if(b>a && b>c){
            System.out.println("b is greater");
        }else {
            System.out.println("c is greater");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the first number:");
        int a = sc.nextInt();
        System.out.print("Enter the second number:");
        int b = sc.nextInt();
        System.out.print("Enter the third number:");
        int c = sc.nextInt();
        biggestNumber(a,b,c);
    }
}
