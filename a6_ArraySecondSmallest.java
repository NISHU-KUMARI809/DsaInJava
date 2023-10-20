public class a6_ArraySecondSmallest {
    public static void main(String[] args) {
        int smallest=Integer.MAX_VALUE;
        int sec_Smallest=smallest;
        int a[]={12,13,11,122,134,567,1};
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]);
        }
        for(int i=0;i<a.length;i++){
            if(a[i]<smallest){
                sec_Smallest=smallest;
                smallest=a[i];
            }
            else if(a[i]<sec_Smallest && a[i]<smallest){
                sec_Smallest=a[i];
            }
        }
        System.out.println("second largest is:"+sec_Smallest);
    }
    
}
