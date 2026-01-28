import java.util.Scanner;

public class Main {

    public static double FACTOR_ESCALA= 32;
    public static double PUNTO_CONGELACION= 1.8;
    public static double FACTOR_CONVERSION=0.555555;

    public static double FACTOR_CONVERSION_MILLAS=0.621371;
    public static double FACTOR_CONVERSION_KILOMETRO=1.609344;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int contadorConversiones=0;
        int contadorConversionesCelsius=0;
        int contadorConversionesFahrenheit=0;
        int contadorConversionesKilometros=0;
        int contadorConversionesMillas=0;

        int choice;
        do {

            System.out.println("Menu de Conversiones:");
            System.out.println("1. Calcular °C a °F ");
            System.out.println("2. Calcular °F a °C ");
            System.out.println("3. Convertir Km a millas");
            System.out.println("4. Convertir millas a Km");
            System.out.println("5. Salir");
            choice = obtenerOpcion(sc,"Ingrese una opcion");

            switch (choice) {
                case 1:
                    System.out.println("Selecciono Convertir °C a °F");
                    double gradosCelsius= obtenerDouble(sc, "Ingrese los grados Celcius que desee convertir: ");
                    contadorConversiones++;
                    contadorConversionesCelsius++;
                    double gradosFahrenheitTotales= conversionCelsiusFahrenheit(gradosCelsius);
                    System.out.println(gradosCelsius+ " °C son :" + gradosFahrenheitTotales + " °F");

                    break;

                case 2:
                    System.out.println("Selecciono Convertir °F a °C");
                    double gradosFahrenheit= obtenerDouble(sc,"ingrese los grados Fahrenheit que desee convertir");
                    contadorConversiones++;
                    contadorConversionesFahrenheit++;
                    double gradosCelsiusTotales=conversionFahrenheitCelsius(gradosFahrenheit);
                    System.out.println(gradosFahrenheit+" °F son : "+gradosCelsiusTotales+" °C");

                    break;


                case 3:
                    System.out.println("Selecciono convertir Km a millas");
                    double kilometros=obtenerDouble(sc,"Ingrese los Km a convertir: ");
                    contadorConversiones++;
                    contadorConversionesKilometros++;
                    double millasTotales=converisionKmMilla(kilometros);
                    System.out.println(kilometros+" kilometros son: "+millasTotales+" millas");

                    break;


                case 4:
                    System.out.println("Selecciono convertir millas a Km");
                    double millas=obtenerDouble(sc,"Ingrese las millas a convertir");
                    contadorConversiones++;
                    contadorConversionesMillas++;
                    double kilometrosTotales=conversionMillaKm(millas);
                    System.out.println(millas+" millas son : "+ kilometrosTotales+" kilometros");

                    break;

                case 5:
                    System.out.println("Final del programa");
                    System.out.println("Resumen: ");
                    System.out.println("Cantidad de converisones hechas: "+contadorConversiones);
                    System.out.println("Cantidad de converisones de °C hechas: "+contadorConversionesCelsius);
                    System.out.println("Cantidad de converisones de °F hechas: "+contadorConversionesFahrenheit);
                    System.out.println("Cantidad de converisones de Kilometros hechas: "+contadorConversionesKilometros);
                    System.out.println("Cantidad de converisones de Millas hechas: "+contadorConversionesMillas);

                    break;
                default:
                    System.out.println("Opcion Invalida intente de nuevo.");
            }
            System.out.println();

        } while (choice != 5);

    }

    /**
     * Metodo para recibir y validar dato para el menú
     * @param sc dato obtenido en consola
     * @param mensaje
     * @return validacion e int
     */
    public static int obtenerOpcion(Scanner sc, String mensaje){
        int opcion;

        while (true){
            System.out.println(mensaje);
            if (sc.hasNextInt()){
                opcion= sc.nextInt();
                return opcion;
            }else{
                System.out.println("El dato que ingresaste no es un numero, vuelve a intentarlo...");
                sc.next();
            }
        }
    }

    /**
     * Metodo para validar datos double obtenidos en consola para las conversiones
     * @param sc dato obtenido en consola
     * @param mensaje
     * @return double y validacion de dato
     */
    public static double obtenerDouble(Scanner sc, String mensaje){
        double valor;
        //ciclo indefinido
        while (true){
            System.out.println(mensaje);
            if (sc.hasNextDouble()){
                valor= sc.nextDouble();
                    return valor;
            }else {
                System.out.println("El dato que ingresaste no es un numero, vuelve a intentarlo...");
                sc.next();
            }
        }
    }

    /**
     * Metodo para conversion de °C a °F
     * @param gradosCelsius
     * @return double
     */
    public static double conversionCelsiusFahrenheit(double gradosCelsius){
        return (gradosCelsius*PUNTO_CONGELACION)+FACTOR_ESCALA;
    }

    /**
     * Metodo para conversion de °F a °C
     * @param gradosFahrenheit
     * @return double
     */
    public static double conversionFahrenheitCelsius(double gradosFahrenheit){
        return (gradosFahrenheit-FACTOR_ESCALA)*FACTOR_CONVERSION;
    }

    /**
     * Metodo para conversion de Km a millas
     * @param kilometros
     * @return double
     */
    public static double converisionKmMilla(double kilometros){
        return kilometros*FACTOR_CONVERSION_MILLAS;
    }

    /**
     * Metodo para conversion de millas a Km
     * @param millas
     * @return double
     */
    public static double conversionMillaKm(double millas){
        return millas*FACTOR_CONVERSION_KILOMETRO;
    }
}
