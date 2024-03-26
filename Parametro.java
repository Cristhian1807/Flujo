
package parametro;

import java.util.Scanner;
public class Parametro {
public static int sumar (int numero1,int numero2){
int res = numero1 + numero2;
return res;
}
public static String sinparametro(){
  return "sinparametro";  
}
public static int retorno (int a, int b){
if (b == 0){
    return 0;
}    
int res = a / b;
return res;
}
public static void sinretorno(){
    System.out.println("Hola");
}
public static void recurvisa(){
    int numero1 = 0, numero2 = 0;
    Scanner leer = new Scanner (System.in);
    numero1 = leer.nextInt();
    numero2 = leer.nextInt();
    
}}
   