import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        ShippingCalculator shippingCalculator= new ShippingCalculator();

        double pesoKg= leerDoubleEnRango(sc,"ingrese el peso del paquete: (min 0.1/max 50.0)",0.1,50.0);
        int distanciaKm= leerIntEnRango(sc,"Ingrese la distancia a recorrer: (min 1/max 2000)",1,2000);
        int servicio=leerIntEnRango(sc,"ingrese el tipo de servicio 1.Estandar 2.Express",1,2);
        boolean zonaRemota=leerBoolean(sc,"Es zona remota? Si/No :");

       double subtotal= shippingCalculator.calcularSubtotal(pesoKg,distanciaKm,servicio,zonaRemota);
       double iva= shippingCalculator.calcularIVA(subtotal);
       double total= shippingCalculator.calcularTotal(subtotal,iva);

        imprimirTicket(servicio, pesoKg, distanciaKm, subtotal, iva, total);

        sc.close();

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
                System.out.println("El numero ingresado no es valido (solo numeros de 0.1 a 50.0)");

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

    public static void imprimirTicket(int serv, double p, int d, double sub, double iva, double total) {
        System.out.println("======= TICKET DE ENVÍO =======");
        System.out.println("Servicio: " + serv);
        System.out.println();
        System.out.printf("Peso: "+ p +" Kg");
        System.out.println();
        System.out.println("Distancia: " + d + " Km");
        System.out.println();
        System.out.println("-------------------------------");
        System.out.printf("Subtotal: $" + sub);
        System.out.println();
        System.out.printf("IVA (16%%): $" + iva);
        System.out.println();
        System.out.printf("TOTAL: $" + total);
        System.out.println();
        System.out.println("===============================");
    }
}
