import java.util.Arrays;

public class ArraySwap {
    public static void main(String[] args) {
        int[] arr={1,2,34,4,5};
        swap(arr,1,2);
        System.out.println(Arrays.toString(arr));
        reverse(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void swap(int arr[],int i1,int i2){
        int temp=arr[i1];
        arr[i1]=arr[i2];
        arr[i2]=temp;
    }
    static void reverse(int[] arr){
        int start=0;
        int end=arr.length-1;
        for(int i=0;i<arr.length;i++){
            if(start<end){
                swap(arr,start,end);
                start++;
                end--;
            }
            else if(start==end){
                swap(arr,start,end);
            }
        }
    }
}
