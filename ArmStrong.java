import java.util.*;
public class ArmStrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number:");
        int n = sc.nextInt();
        int count =0;
        int c = n;
        while(n>0){
            int rem=n%10;
            count=(rem*rem*rem)+count;
            n=n/10;

        }
        if(c==count){
            System.out.println("Armstrong Number");
        }else{
            System.out.println("Not Armstrong");
        }
    }
}
