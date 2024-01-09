import java.util.Scanner;
public class Calcuolatoradd { 
    public static void main(String[] args) {
        System.out.println(" 1-addition 2-substraction 3-multiplication 4-division ");
        Scanner sc =new Scanner(System.in);
        System.out.println("CHOOSE OPERAT0R:");
        int operator= sc.nextInt();
        System.out.println("enter the value of a");
        int a=sc.nextInt();
        System.out.println("enter the value of b");
        int b=sc.nextInt();
        int c=0;

        switch(operator){
            case 1:{
                System.out.println("addition");
                c=a+b;
                break;
            }
            case 2:{
                System.out.println("substraction");
                c=a-b;
                break;
            }
            case 3:{
                System.out.println("multiplication");
                c=a*b;
                break;
            }
            case 4:{
                System.out.println("division");
                c=a/b;
                break;
            }
            case 5:{
                System.out.println("modulus");
                c=a%b;
            }
            default:
                System.out.println("invalid choice please enter correct options");
        }
        System.out.println("RESULT IS:"+c);
        
    }
}


    

