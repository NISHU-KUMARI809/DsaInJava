public class a3_Array {
 public static void main(String[] args) {
    int a[]=new int[5];
    for(int i=0;i<5;i++){
        a[0]=20;
        a[1]=30;
        a[2]=70;
        a[3]=60;
        a[4]=90;
    }
    for(int i=0;i<5;i++){
        System.out.println(a[i]);
    }
    System.out.println("");
    for(int i=0;i<5;i++){
        a[0]=30;
    }
    for(int i=0;i<a.length+1;i++){
        System.out.println(a[i]);
    }

    
 }   
}
