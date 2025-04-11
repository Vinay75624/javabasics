package conditions;

import java.util.*;
public class incom_ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("enter your income: ");
        int income = sc.nextInt();

        if(income < 500000){
            System.out.println("no tax applicable");
        }
        else if(income >= 500000 && income < 1000000){
            System.out.println("20% tax will be applied");
        }
        else{
            System.out.println("30% tax will be applicable");

        }

    }
    
}
