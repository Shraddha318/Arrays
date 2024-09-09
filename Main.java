import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] marks=new int[100];
        //int n=sc.nextInt();
        for(int i=0;i< n;i++){
           marks[i]=sc.nextInt();
        }
        System.out.print(Arrays.toString(marks));
    }
}
/* Array indices start from 0, and accessing elements is done using these indices.
* "null" is a special literal in Java representing the absence of a value and is
 commonly used for uninitialized reference variables.
* 2D arrays in Java can be visualized as arrays of arrays, where each individual
 index holds a reference to an array.
* You can iterate through array elements using a traditional for loop, an enhanced
 for-each loop, or utilize the `Arrays.toString()` method for simple printing.
* Java passes array references to functions by value, allowing functions to modify
 the original array data.
*/