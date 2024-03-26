
package calificaciones;
import java.util.Scanner;
public class Calificaciones {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de estudiantes: ");
        int numEstudiantes = leer.nextInt();
        int[] calificaciones = new int[numEstudiantes];
        for (int i = 0; i < numEstudiantes; i++) {
            System.out.println("Ingrese la calificacion del estudiante numero: " + (i + 1));
            calificaciones[i] = leer.nextInt();
        }

        int califialta = calialta(calificaciones);
        int califibaja = calcularCalificacionMasBaja(calificaciones);
        double prom = calprom(calificaciones);
        int[] orden = calorden(calificaciones);

        System.out.println("Estadísticas:");
        System.out.println("Calificación mas alta: " + califialta);
        System.out.println("Calificación mas baja: " + califibaja);
        System.out.println("Promedio de calificaciones: " + prom);
        System.out.println("Distribución de calificaciones:");
        System.out.println("90-100: " + orden[0] + " estudiantes");
        System.out.println("70-89: " + orden[1] + " estudiantes");
        System.out.println("50-69: " + orden[2] + " estudiantes");
        System.out.println("menos de 50: " + orden[3] + " estudiantes");
    }

    public static int calialta(int[] calificaciones) {
        int alta = calificaciones[0];
        for (int calificacion : calificaciones) {
            if (calificacion > alta) {
                alta = calificacion;
            }}
        return alta;
    }
    
    public static int calcularCalificacionMasBaja(int[] calificaciones) {
        int baja = calificaciones[0];
        for (int calificacion : calificaciones) {
            if (calificacion < baja) {
                baja = calificacion;
            }}
        return baja;
    }

    public static double calprom(int[] calificaciones) {
        double suma = 0;
        for (int calificacion : calificaciones) {
            suma += calificacion;
        }
        return suma;
    }

    public static int[] calorden(int[] calificaciones) {
        int[] prom = new int[4];
        for (int calificacion : calificaciones) {
            if (calificacion >= 90) {
                prom[0]++;
            } else if (calificacion >= 70) {
                prom[1]++;
            } else if (calificacion >= 50) {
                prom[2]++;
            } else {
                prom[3]++;
            }}
        return prom;
    }
}
 
    
