package arr;
import java.util.*;
public class linears {
    public static int linsearch(int numbers[],int key){
        for(int i=0;i<numbers.length;i++){
            if(numbers[i]==key){
                return i;
            }
        }
        return -1;

    }


    
    public static void main(String[] args) {
        int numbers[]={2,4,6,8,9,10,14};
        int key = 10;
    }                       
    
}
