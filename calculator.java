
import java.util.*;
class calculator{

    static int addition(int x,int y){
        return x+y;
        
    }
    static void subtraction(int x,int y){
        System.out.println("Subtraction="+(x-y));
    }
    static void multiply(int x,int y){
        System.out.println("Multiplication="+(x*y));
    }
    public static void main(String args[]){
        int a,b;
        Scanner var1 = new Scanner(System.in);
        System.out.println("Enter Value A:");
        a = var1.nextInt();

        Scanner var2 = new Scanner(System.in);
        System.out.println("Enter Value B:");
        b = var2.nextInt();

        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Value:\n 1) Addition \n 2) Subtraction \n 3) Multiplication");
        int c = input.nextInt();

        if (c==1){
            System.out.println(addition(a,b));
        }
        else if (c==2){
            subtraction(a,b);
        }
        else if (c==3){
            multiply(a,b);
        }
        else{
            System.out.println("This is an Invalid Operation ");
        }




        
    }
    }