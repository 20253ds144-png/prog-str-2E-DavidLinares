import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        GradeService gradeService= new GradeService();

      String nombre= leerTextoNoVacio(sc,"Ingrese el nombre del alumno");
      double calificacion1= leerDoubleEnRango(sc,"Ingrese la calificacion 1: (min 0/max 100) ",0,100);
      double calificacion2= leerDoubleEnRango(sc,"Ingrese la calificacion 2: (min 0/max 100) ",0,100);
      double calificacion3= leerDoubleEnRango(sc,"Ingrese la calificacion 3: (min 0/max 100) ",0,100);
      int asistencia=leerIntEnRango(sc,"Ingrese el porcentaje de asistencia (min 0/max 100)",0,100);
      boolean proyecto=leerBoolean(sc,"El alumno entrego proyecto? (Si/No)" );

      double promedioParcial= gradeService.calcularPromedio(calificacion1,calificacion2,calificacion3);
      double promedioFinal= gradeService.calcularFinal(promedioParcial,asistencia);
      String estado= gradeService.determinarEstado(promedioFinal,asistencia,proyecto);

      reporteFinal(nombre,calificacion1,calificacion2,calificacion3,asistencia,proyecto,promedioFinal,estado);

    }

    public static String leerTextoNoVacio(Scanner sc, String msg){
        String texto;

        System.out.println(msg);
            texto = sc.nextLine();
            return texto;

    }

    public static double leerDoubleEnRango(Scanner sc, String mensaje, double min, double max) {
        double valor;
        while (true) {
            System.out.println(mensaje);
            if (sc.hasNextDouble()) {
                valor = sc.nextDouble();
                if (valor < min || valor > max) {
                    System.out.println("El numero ingresado esta fuera de rango...");
                } else {
                    return valor;
                }
                System.out.println("El numero ingresado no es valido (solo numeros de 0 a 100)");

            } else {
                System.out.println("El dato ingresado no es numerico (solo se aceptan numeros)");
                sc.nextLine();
            }
        }
    }

    public static int leerIntEnRango(Scanner sc, String mensaje, int min, int max) {
        int valor;
        while (true) {
            System.out.println(mensaje);
            if (sc.hasNextInt()) {
                valor = sc.nextInt();
                if (valor < min || valor > max) {
                    System.out.println("El numero ingresado esta fuera de rango...");
                } else {
                    return valor;
                }
                System.out.println("El numero ingresado no es valido (solo numeros de "+min+" a "+max +")");

            } else {
                System.out.println("El dato ingresado no es numerico (solo se aceptan numeros)");
                sc.nextLine();
            }
        }

    }

    public static boolean leerBoolean(Scanner sc, String mensaje) {
        while (true) {
            System.out.print(mensaje);
            String opcion = sc.next();
            if (opcion.equals("Si")) {
                return true;
            } else {
                if (opcion.equals("No")) return false;
            }
            System.out.println("Error: Responda 'Si' o 'No'.");
        }
    }

    public static void reporteFinal(String nombre,double calificacion1,double calificacion2, double calificacion3,int asistencia,boolean proyecto,double promedioFinal,String estado){

        System.out.println("======Reporte Final======");
        System.out.println("----------------------------------------");
        System.out.println("Nombre del Alumno: " + nombre);
        System.out.println("----------------------------------------");
        System.out.println("Parcial 1: "+calificacion1);
        System.out.println("----------------------------------------");
        System.out.println("Parcial 2: "+calificacion2);
        System.out.println("----------------------------------------");
        System.out.println("Parcial 3: "+calificacion3);
        System.out.println("----------------------------------------");
        System.out.println("Asistencia: " + asistencia + "%");
        System.out.println("----------------------------------------");
        System.out.println("Entrego Proyecto: "+proyecto);
        System.out.println("----------------------------------------");
        System.out.println("Promedio Final: "+promedioFinal);
        System.out.println("----------------------------------------");
        System.out.println("Estado Final: "+estado);
        System.out.println("----------------------------------------");
    }
}
