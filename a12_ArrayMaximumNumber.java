import java.util.Scanner;
public class a12_ArrayMaximumNumber {
    public static void main(String[] args) {
        int max=0;
        int a[]={12,23,56,78,45,32};
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);  
    }
    
}
