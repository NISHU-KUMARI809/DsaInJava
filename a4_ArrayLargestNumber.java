public class a4_ArrayLargestNumber {
    public static void main(String[] args) {
        int a[]={12,13,45,67,1};
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                max=a[i];
            }
        }
        System.out.println("Max number is:");
            System.out.println(max);

    }
    
}
