package functions;

public class overload {
    public static int sum(int a,int b){
        return a+b;
    }
    public static float sum(float a,float b){
        return a+b;
    }
    public static int sum(int a,int b,int c){
        return a+b+c;
    }

    public static void main(String[] args) {
        System.out.println(sum(4,6));
        System.out.println(sum(3.2f,4.0f));
        System.out.println(sum(2,4,6));
    }

    
}
