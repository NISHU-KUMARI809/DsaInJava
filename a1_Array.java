//Java Program to Find Largest Element in an Array
import java.lang.Math;
public class a1_Array {
    public static void main(String[] args) {
        int a[]={1,2,3,4,45,55,65,33};
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println(max);
    }  
}
