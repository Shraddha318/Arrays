import java.util.Scanner;

public class MinValue {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements in array:");
        //int[] arr=new int[100];
       // for(int i=0;i<5;i++){
         //   arr[i]=sc.nextInt();
       // }
        int[] arr={9,8,7};
        System.out.println(min(arr));
        }
    static int min(int[] arr) {
        int minim=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]<minim){
                minim=arr[i];
            }
        }
        return minim;
    }
}
