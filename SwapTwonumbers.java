import java.util.*;
public class SwapTwonumbers {
    public static void swapFunction(int a,int b){
        int temp = a;
        a = b;
        b=temp;
        System.out.println("The value of a after swapping is"+" "+a+" and value of b is "+b);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        swapFunction(a,b);
    }
}
