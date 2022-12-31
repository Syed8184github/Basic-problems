import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        int s=0;
        int c,r;
        c=n;
        while(n>0){
            r=n%10;
            s=s*10+r;
            n=n/10;

        }
        if(c==s)
        System.out.println("Palindrome");
        else
        System.out.println("Not palindrome");
       
    }
    
}
