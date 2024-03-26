
package fibonacci;
import java.util.Scanner;
public class Fibonacci {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int serie;
        System.out.println("Ingrese el numero de series que quiere realizar");
        serie = leer.nextInt();
        for (int i = 0; i < serie; i++){
            System.out.println (fibonacci(i));
        }}
public static int fibonacci (int n){
    if (n == 0) {
        return 0;
    }else{ if (n == 1) {
        return 1;
    }else{
        return fibonacci (n - 1) + fibonacci (n - 2);
    }    
    }
    }
    
}
