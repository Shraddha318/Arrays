public class AdditioninRowMajor {
    public static void main(String[] args) {
       int[][] arr={
               {1,2,3},
               {2,3,4},
               {4,3,1}
       };
        System.out.println(sum(arr));

    }
    static int sum(int[][] arr){
       int max=0;

        for(int i=0;i<arr.length;i++){
            int s=0;
            for(int j=0;j<arr[i].length;j++){
            s=s+arr[i][j];
        }
        if(s>max){
        max=s;
        }
        }
        return max;
    }
}
