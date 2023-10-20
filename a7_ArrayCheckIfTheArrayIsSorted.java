public class a7_ArrayCheckIfTheArrayIsSorted {
    static boolean isSorted(int []a){
        int n=a.length;
        for(int i=0;i<n-1;i++){
            if(a[i]>a[i+1]){
                return false;
            }
        }
        return true;

    }
    
    public static void main(String[] args) {
        int a[]={12,20,23,34,78};
        boolean isSort=isSorted(a);
        if(isSort){
            System.out.println("The array  is sorted");
        }
        else{
            System.out.println("Not sorted");
        }

    }   
}
