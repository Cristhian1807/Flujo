
package calculadora;
import java.util.Scanner;

public class Calculadora {

    
    public static void main(String[] args) {
        int num1, num2 = 0;
        Scanner leer = new Scanner (System.in); {
        System.out.println ("digite numero 1: "); {
            num1=leer.nextInt();
            System.out.println ("digite numero 2: "); {
            num2=leer.nextInt();
            if (num1==0 && num2==0){
      System.out.println ("Los numeros digitados deben ser diferentes que 0");
        }else{
            int suma  = num1 + num2;
            int resta = num1 - num2;
            int multi = num1 * num2;
            int division = num1 / num2;
            System.out.println ("El resultado de la suma es: "+ suma);
            System.out.println ("El resultado de la resta es: "+ resta);
            System.out.println ("El resultado de la multiplicacion es: "+ multi);
            System.out.println ("El resultado de la division es: "+ division);
            
        }
    }
    }
    
}}}
