import java.util.*;
public class TwoD_Array {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //int[][] arr = {{1, 2, 3}, {9, 8, 7, 6}};
        //System.out.println(Arrays.toString(arr));
        int[][] ary = new int[2][2];
        for (int i = 0; i < ary.length; i++) {
            for (int j = 0; j < ary[i].length; j++) {
                ary[i][j] = sc.nextInt();
            }
        }
      for(int i = 0; i < ary.length; i++) {
           // for (int j = 0; j < ary[i].length; j++) {
             //   System.out.print(ary[i][j]);
            System.out.println(Arrays.toString(ary[i]));
            }
        }
    }
