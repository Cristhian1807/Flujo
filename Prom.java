
package prom;
import java.util.Scanner;
public class Prom {
    public static void main(String[] args) {
        double promedio,n,numero,res=0;
        Scanner leer = new Scanner (System.in);
        System.out.println ("digite la cantidad de numeros que debe promediar: ");
        n= leer.nextInt();
        for (int i=0; i<n; i++){
            System.out.println("ingrese el numero" + (i+1));
            numero= leer.nextInt();
            res += numero;
        }
        promedio = res / n;
        System.out.println("el promedio es: " + promedio);
      
    }
    
}
