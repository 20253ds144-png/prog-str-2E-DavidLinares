import java.util.Scanner;

public class Main {
    //*Constantes para calcular IMC
    public static double CLASIFICACION_BAJA=18.5;
    public static double CLASIFICACION_MEDIA=25;
    public static double CLASIFICACION_ALTA=30;

    //*Constantes para calcular °C a °F
    public static double FACTOR_ESCALA= 32;
    public static double PUNTO_CONGELACION= 1.8;

    //*Constante para calcular el area de un circulo
    public static double PI= 3.1415;
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int choice;
        do {

            System.out.println("Menu:");
            System.out.println("1. Calcular IMC");
            System.out.println("2. Calcular área de un rectángulo");
            System.out.println("3. Convertir °C a °F");
            System.out.println("4. Calcular area de un circulo");
            System.out.println("5. Salir");
            System.out.print("Ingresa una opción: ");
            choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Selecciono Calculo de IMC.");
                    double pesoKg= obtenerDouble(sc,"Ingresa el peso en KG");
                    double alturaM= obtenerDouble(sc,"Ingrese la altura en M -> 1.80");
                    double IMC= calcularIMC(pesoKg, alturaM);
                    System.out.println("El IMC es de: "+ IMC);

                    String clasificacion= obtenerClasificacionIMC(IMC);
                    System.out.println("Clasificacion "+ clasificacion);

                    break;
                case 2:
                    System.out.println("Selecciono Calcular el área de un rectangulo.");
                    double baseRectangulo= obtenerDouble(sc,"Ingrese la base del rectangulo: ");
                    double alturaRectangulo= obtenerDouble(sc, "Ingrese la altura del rectangulo: ");
                    double areaRectangulo= calcularAreaRectangulo(baseRectangulo, alturaRectangulo);
                    System.out.println("El area del rectangulo es: " + areaRectangulo);
                    break;
                case 3:
                    System.out.println("Selecciono Convertir °C a °F");
                    double gradosCelsius= obtenerDouble(sc, "Ingrese los grados Celcius que desee convertir: ");
                    double gradosFahrenheit= conversionCelsiusFahrenheit(gradosCelsius);
                    System.out.println(gradosCelsius+ " grados Celsius son :" + gradosFahrenheit + " grados Fahrenheit");

                    break;
                case 4:
                    System.out.println("Selecciono Calcular el area de un circulo: ");
                    double radioCirculo= obtenerDouble(sc,"Ingrese el radio del Circulo: ");
                    double areaCirculo=calcularAreaCirculo(radioCirculo);
                    System.out.println("El area del Circulo es: "+ areaCirculo);

                    break;
                case 5:
                    System.out.println("Finalizando Programa ...");
                    break;
                default:
                    System.out.println("Opcion Invalida intente de nuevo.");
            }
            System.out.println();

        } while (choice != 5);


    }

    // Metodos para IMC

    /**
     *
     * Metodo que retorna un valor capturado en la terminal
     * @param sc previamente declarado en main
     * @param mensaje es un parametro
     * @return double
     */
    public static double obtenerDouble(Scanner sc, String mensaje){
        System.out.println(mensaje);
        return sc.nextDouble();
    }

    /**
     * Metodo que calcula el IMC de una persona
     * @param pesoKg previamente solicitado en obtenerDouble
     * @param alturaM previamente solicitado en obtenerDouble
     * @return calcula el IMC en base a al valor de las variables solicitadas
     */
    public static double calcularIMC(double pesoKg, double alturaM){
        return pesoKg/(alturaM*alturaM);
    }

    /**
     * Metodo que clasifica el IMC resultante entre Peso bajo, medio, sobre peso y obesidad
     * @param IMC calculado por el metodo calcularIMC
     * @return manda la clasificacion obtenida
     */
    public  static String obtenerClasificacionIMC(double IMC){
        if(IMC<CLASIFICACION_BAJA) return "Peso bajo";
        else if (IMC<CLASIFICACION_MEDIA) return "Medio";
        else if (IMC<CLASIFICACION_ALTA)return "Sobre peso";
        else return "Obesidad";
    }

    // Metodos para Calcular el área de un Rectangulo

    /**
     * Metodo que calcula el area de un rectangulo en base a las variables solicitadas
     * @param baseRectangulo previamente solicitado en obtenerDouble
     * @param alturaRectangulo previamente solicitado en obtenerDouble
     * @return resultado de la operacion de base por altura
     */
    public static double calcularAreaRectangulo(double baseRectangulo, double alturaRectangulo){
        return baseRectangulo*alturaRectangulo;
    }

    // Metodo para hacer la Conversion de °C a °F
    /**
     * Metodo para hacer la conversion de temperaturas
     * @param gradosCelsius dato solicitado anteriormente en obtenerDouble
     * @return resultado de operacion de conversion
     */
    public static double conversionCelsiusFahrenheit(double gradosCelsius){
        return (gradosCelsius*PUNTO_CONGELACION)+FACTOR_ESCALA;
    }

    // Metodo para calcular el area del circulo
    /**
     * Metodo que realiza los calculos para el area del circulo en base al radio solicitado
     * @param radioCirculo solicitado en obtenerDouble
     * @return resultado de la operacion PI*r^2
     */
    public static double calcularAreaCirculo(double radioCirculo){
        return PI*(radioCirculo*radioCirculo);
    }

}
