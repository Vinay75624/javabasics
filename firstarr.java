package arr;
import java.util.*;
public class firstarr {
    public static void main(String[] args) {
        int marks[]= new int[50];

        Scanner sc= new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();
        System.out.println();

        System.out.println(marks[0]);
        System.out.println(marks[1]);
        System.out.println(marks[2]);
        System.out.println();
        marks[0]=marks[0] + 3;
        System.out.println(marks[0]);

        System.out.println("array length: "+ marks.length);
    }
    
}
