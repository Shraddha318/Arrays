import java.util.*;
public class LinearSearch {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the elements in array:");
        int[] arr=new int[100];
        for(int i=0;i<5;i++){
            arr[i]=sc.nextInt();
        }
        System.out.println("Enter the element to be searched:");
        int key=sc.nextInt();
        System.out.println(search(arr,key));
    }
    static int search(int arr[],int key){
        for(int i=0;i< arr.length;i++){
            if(arr[i]==key){
                //System.out.println("Element is present at index "+i);
                return i;
            }
        }
        return -1;
    }
}
