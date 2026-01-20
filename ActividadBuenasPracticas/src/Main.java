import java.util.Scanner;
public class Main{
    public static void main(String[]args){

        Scanner sc=new Scanner(System.in);
        System.out.println("Programa para calcular la suma acumulada del numero deseado");
        int numero=obtenerInt(sc,"Ingrese un numero entero");
        if (numero < 0) {
            System.out.println("Error: No se pueden procesar números negativos.");
        } else {
            int resultado = sumaInt(numero);
            System.out.println("Resultado: " + resultado);
        }
    }

    /**
     * Metodo que retorna un valor capturado en la terminal
     * @param sc previamente declarado en main
     * @param mensaje mensaje es un parametro
     * @return int
     */
    public static int obtenerInt(Scanner sc, String mensaje){
        System.out.println(mensaje);
        return sc.nextInt();
    }

    /**
     * Metodo que calcula la suma acumulativa
     * @param numero dato ingresado en obtenerInt
     * @return resultado de sumatoria
     */
    public static int sumaInt(int numero){
        int sumaNumeros=0;
        for(int i=1;i<=numero;i++){sumaNumeros+=i;}
        return sumaNumeros;
    }
}
