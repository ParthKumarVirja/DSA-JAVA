import java.util.*;


public class Switch {
   public static void main(String args[]) {

       Scanner sc = new Scanner(System.in);
       int a = sc.nextInt();
       int b = sc.nextInt();
       int operator = sc.nextInt();


       /*
        * 1 -> +
        * 2 -> -
        * 3 -> *
        * 4 -> /
        * 5 -> %
        */


       switch(operator) {
           case 1 : System.out.println(a+b);
           break;
           case 2 : System.out.println(a-b);
           break;
           case 3 : System.out.println(a*b);
           break;
           case 4 : if(b == 0) {
                       System.out.println("Invalid Division");
                   } else {
                       System.out.println(a/b);
                   }
	    break;
           case 5 : if(b == 0) {
                       System.out.println("Invalid Division");
                   } else {
                       System.out.println(a%b);
                   }
	    break; 
           default : System.out.println("Invalid Operator");
       }


        // Switch cases 2 
                                // int Button = sc.nextInt();
                                // switch(Button) {
                                //     case 1: System.out.println("Hello");
                                //     break;
                                //     case 2: System.out.println("Namaste");
                                //     break;
                                //     case 3: System.out.println("Bonjour");
                                //     break;
                                //     default: System.out.println("Invalid choice");
                                // }

   }
}
