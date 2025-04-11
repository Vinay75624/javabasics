package conditions;
public class largeofthree {
    public static void main(String[] args) {
        int a=1,b=3,c=6;

        if((a>=b) && (a >=c)){
            System.out.println(" a is largest");

        }
        else if (b>=c){
            System.out.println("largest is b");
        }
        else{
            System.out.println("largest is c");
        }
    }
    
}