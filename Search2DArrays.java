import java.util.Arrays;
import java.util.Scanner;

public class Search2DArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[][] arr = new int[2][2];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        int key=4;
        int[] ans= search(arr,key);
        System.out.println(Arrays.toString(ans));
    }
    static int[] search(int[][] arr,int key){
        for(int r=0;r<arr.length;r++){
            for(int c=0;c<arr[r].length;c++){
                if(key==arr[r][c]){
                    return new int[]{r,c};
                }
            }
        }
        return new int[]{-1,-1};
    }
}
