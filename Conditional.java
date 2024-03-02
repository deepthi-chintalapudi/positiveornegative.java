import java.util.Scanner;
public class Conditional {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("Enter the input value:");
        int a=in.nextInt();
        if(a>0){
            System.out.println("Positive");
        }
        else if(a<0){
            System.out.println("Negative");
        }
        else{
            System.out.println("Zero");
        }
    }
}
