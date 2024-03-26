
package calcubasica;
import java.util.Scanner;
public class Calcubasica {
    public static void calculadora (int dato){
        Scanner leer = new Scanner (System.in);
        int numero1, numero2;
        switch (dato){
            case 1:
                System.out.println("ingrese el numero 1: ");
                numero1=leer.nextInt();
                System.out.println("ingrese el numero 2: ");
                numero2=leer.nextInt();
                System.out.println("EL RESULTADO DE LA SUMA ES: " + (numero1+numero2));
                break;
            case 2:
                System.out.println("ingrese el numero 1: ");
                numero1=leer.nextInt();
                System.out.println("ingrese el numero 2: ");
                numero2=leer.nextInt();
                System.out.println("EL RESULTADO DE LA RESTA ES: " + (numero1-numero2));
                break;
            case 3:
                System.out.println("ingrese el numero 1: ");
                numero1=leer.nextInt();
                System.out.println("ingrese el numero 2: ");
                numero2=leer.nextInt();
                System.out.println("EL RESULTADO DE LA MULTIPLICACION ES: " + (numero1*numero2));
                break;
            case 4:
                System.out.println("ingrese el numero 1: ");
                numero1=leer.nextInt();
                System.out.println("ingrese el numero 2: ");
                numero2=leer.nextInt();
                if (numero2 < 1) {
                System.out.println ("El segundo valor debe ser mayor a 0");
                }else{
                System.out.println("EL RESULTADO DE LA DIVISION ES: " + (numero1/numero2));
                break;
                }
        }
    }
    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        System.out.println ("Ingrese 1 para la suma");
        System.out.println ("Ingrese 2 para la resta");
        System.out.println ("Ingrese 3 para la multiplicacion");
        System.out.println ("Ingrese 4 para la division");
        int ope= leer.nextInt();
        calculadora (ope);
        
    }
    
}
