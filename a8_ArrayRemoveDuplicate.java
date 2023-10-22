public class a8_ArrayRemoveDuplicate {
   static int removeduplicate(int []arr){
        int j=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[j]!=arr[i]){
                j++;
                arr[j]=arr[i];
            }
        }
        return j+1;
    }
    public static void main(String[] args) {
        System.out.println("BEfore removing duplicates:");
        int arr[]={1,2,2,3,3,4,4,5,5,6};
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        int r=removeduplicate(arr);
        System.out.println("\nAfter removing duplicates:");
        for(int i=0;i<r;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
