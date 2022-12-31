import java.util.*;
public class SearchElementInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter how many elements in the array");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]= sc.nextInt();
        }
        System.out.println("Enter the element do you wantt to search in the array");
        int x = sc.nextInt();
        for(int i =0;i< arr.length;i++){
            if(arr[i]==x)
                System.out.println("The element found ");
                break;
        }

    }
}
