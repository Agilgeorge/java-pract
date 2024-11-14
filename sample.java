import java.util.*;
/**
 * sample
 */
public class sample {

    public static int call(String s,int n){
        int diff=0;
        switch(s){
            case "mon":
                diff=6;
                break;
            case "tue":
                diff=5;
                break; 
            case "wed":
                diff=4;
                break;
            case "thur":
                diff=3;
                break; 
            case "fri":
                diff=2;
                break; 
            case "sat":
                diff=1;
                break;
            case "sun":
                diff=0;
                break;  
            default:
                break;
        }
        int count=0;
        if(n<diff){
            return count;
        }
        count++;

        int rem=n-diff;
        int sun=rem%7;
        return count+sun;

    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int n=sc.nextInt();
        int sun=call(s,n);
        System.out.println(sun);
    }
}