public class a13_ArraySecondMaxNumb {
    public static void main(String[] args) {
        int max=0;
        int secno=max;
        int a[]={12,23,11,13,14,16};
        for(int i=0;i<a.length;i++){
            if(a[i]>max){
                secno=max;
                max=a[i];
            }
            if(a[i]>secno && a[i]<max){
                secno=a[i];
            }
        }
        System.out.println(secno);
    }
    
}
