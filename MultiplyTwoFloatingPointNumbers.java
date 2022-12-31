import java.security.spec.RSAOtherPrimeInfo;
import java.util.*;
public class MultiplyTwoFloatingPointNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the first number");
        float a = sc.nextFloat();
        System.out.println("enter the second number");
        float b = sc.nextFloat();
        float result = a*b;
        System.out.println("The multiplication the two floating point numbers are "+result);
    }
}
