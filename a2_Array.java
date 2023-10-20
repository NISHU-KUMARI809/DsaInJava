public class a2_Array {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
        int SecondLargest=max;
        int a[]={12,23,45,67,78};
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                SecondLargest=max;
                max=a[i];
            }
            else{
                if(a[i]>SecondLargest & a[i]<max){
                    SecondLargest=a[i];
                }
            }
        }
        System.out.println(SecondLargest);

    }
    
}
