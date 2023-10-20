public class a5_ArraySecondLargestValue {
    public static void main(String[] args) {
        int max=Integer.MIN_VALUE;
        int sec_largest=max;
        int a[]={12,13,14,11,22,31,45,67,89};
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                sec_largest=max;
                max=a[i];
            }else if(a[i]>sec_largest && a[i]<max){
                sec_largest=a[i];
            }
        }
        System.out.println("Second largest:");
        System.out.println(sec_largest);
    }
}
