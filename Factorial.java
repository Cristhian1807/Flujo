
package factorial;
import java.util.Scanner;

public class Factorial {

    
    public static void main(String[] args) {
       Scanner leer = new Scanner (System.in);
       int num=0;
       System.out.println("ingrese el numero el cual desea sacar el factorial");
       num=leer.nextInt();
       double factorial=1;
       for (int i = 1; i <= num; i++){
           factorial *=1;
       }
       System.out.println ("el resultado es: "+ factorial);
    }
    
}
