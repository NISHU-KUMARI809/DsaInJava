public class a9_ArrayRotateArrayByOnePlace {
    static void rotate(int[]a){
        int j=a[0];
        for(int i=1;i<a.length;i++){
            a[i-1]=a[i];
        }
        a[a.length-1]=j;
    }
    public static void main(String[] args) {
        System.out.println("\nBefore Rotation:");
        int a[]={1,2,3,4,5,6,7};
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        rotate(a);
        System.out.println("\nAfter rotation:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
