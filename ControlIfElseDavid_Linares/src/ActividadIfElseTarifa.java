import java.util.Scanner;

public class ActividadIfElseTarifa {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int edad=0;
        String respuesta=" ";
        boolean esEstudiante=false;

        edad=obtenerEdad(sc,"Ingrese la edad de la persona");
        if (edad>=18){
            System.out.println("¿Es estudiante?");
            sc.nextLine();
            respuesta=obtenerRespuesta(sc,"Si/No");
            if (respuesta.equals("Si")|| respuesta.equals("si")){
                esEstudiante=true;

                System.out.println("La edad ingresada es: "+edad);
                System.out.println("La persona es estudiante");
                System.out.println("La tarifa final es: $90 ");
            }else if(respuesta.equals("No")|| respuesta.equals("no")){
                esEstudiante=false;

                System.out.println("La edad ingresada es: "+edad);
                System.out.println("La persona no es estudiante");
                System.out.println("La tarifa final es: $120 ");
            }
        } else if (edad>12 && edad<=17){
            System.out.println("¿Es estudiante?");
            sc.nextLine();
            respuesta=obtenerRespuesta(sc,"Si/No");
            if (respuesta.equals("Si")|| respuesta.equals("si")){
                esEstudiante=true;

                System.out.println("La edad ingresada es: "+edad);
                System.out.println("La persona es estudiante");
                System.out.println("La tarifa final es: $60 ");
            }else if(respuesta.equals("No")|| respuesta.equals("no")){
                esEstudiante=false;

                System.out.println("La edad ingresada es: "+edad);
                System.out.println("La persona no es estudiante");
                System.out.println("La tarifa final es: $80 ");
            }
        } else if (edad<12) {
            System.out.println("La edad ingresada es: "+edad);
            System.out.println("La tarifa final es: $50 ");
        }
        if (edad<0 || edad>120) {
            System.out.println("Edad invalida");
        }


    }

    public static int obtenerEdad(Scanner sc, String mensaje){
        System.out.println(mensaje);
        return sc.nextInt();
    }

    public static String obtenerRespuesta(Scanner sc, String mensaje){
        System.out.println(mensaje);
        return sc.nextLine();
    }
}
