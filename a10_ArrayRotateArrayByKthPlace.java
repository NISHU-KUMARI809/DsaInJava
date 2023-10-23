public class a10_ArrayRotateArrayByKthPlace {
    static void rotate(int a[]){
        int j=a[0];
        for(int i=1;i<a.length;i++){
            a[i-1]=a[i];
        }
        a[a.length-1]=j;
    }
    static void  rotateArray(int a[],int k){
         k=k%a.length; // k represent rotation ki kitne no of time rotate krna h 
         if(k<0){
            k=k+a.length;
         }
         for(int i=1;i<=k;i++){
            rotate(a);
         }
    }

    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        System.out.println("Array before Rotation:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
        rotateArray(a,3);
        System.out.println("\nArray After Rotation:");
        for(int i=0;i<a.length;i++){
            System.out.print(a[i]+" ");
        }
    }
    
}
