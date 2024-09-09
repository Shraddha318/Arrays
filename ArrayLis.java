import java.util.ArrayList;
import java.util.Scanner;
public class ArrayLis{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        ArrayList<Integer> list=new ArrayList<>(10);
        list.add(1);
        list.add(2);
        list.add(3);
        list.get(0);
        System.out.println(list);
        list.set(0,9);
        list.remove(0);
        //input
        for(int i=0;i<5;i++){
            list.add(sc.nextInt());
        }
        //get item at any index
        for(int i=0;i<5;i++){
            System.out.println(list.get(i));
        }
        System.out.println(list);
    }
}
