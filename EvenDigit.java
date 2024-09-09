public class EvenDigit {
    public static void main(String[] args) {
        int[] arr={12,123,1234,3455};
        System.out.println(evendigit(arr));
    }
    static int evendigit(int[] arr){
        int count=0;
        for(int i:arr){
            if(even(i)>0){
                count++;
            }
        }
        return count;
    }
    static int digits(int num){
        int count=0;
        while(num>0){
            count++;
            num=num/10;
        }
        return count;
    }
    static int even(int num){
       int numofdigits= digits(num);
        if(numofdigits%2==0){
            return 1;
        }
        return -1;
    }
}
//Shortcut to find number of digits=Math.log(10)+1