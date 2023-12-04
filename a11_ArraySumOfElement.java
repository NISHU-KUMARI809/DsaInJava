import java.util.Scanner;
public class a11_ArraySumOfElement {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int sum=0;
        System.out.println("Enter the size of array:");
        int n=sc.nextInt();
        int[]a=new int[n];
        System.out.println("Enter the value:");
        for(int i=0;i<n;i++){
            a[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            System.out.println(a[i]);
            sum=sum+a[i];
        }
        System.out.println(sum);
        
    }
    
}
