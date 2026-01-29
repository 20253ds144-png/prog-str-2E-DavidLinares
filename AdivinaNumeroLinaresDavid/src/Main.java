import java.util.Random;
import java.util.Scanner;

public class Main {

    public static int VALORES_MAYORES=0;
    public static int VALORES_MENORES=0;
    public static int VALORES_INVALIDOS=0;
    public static void main(String[] args) throws Exception {

        Scanner scanner= new Scanner(System.in);
        Random random= new Random();
        int min=1;
        int max=100;
        int intentos=0;
        int limiteIntentos=7;
        int secreto = random.nextInt(max)+min;
        boolean gano=false;
        System.out.println("Adivina el numero entre (1-100) tienes: "+limiteIntentos);

        while(intentos<limiteIntentos && !gano){
            int valor=obtenerNumeroValido(min, max, scanner, "Intento: "+(intentos+1));
            intentos++;
            if(valor == secreto){
                System.out.println("Ganaste en el "+intentos+" intento");
                System.out.println("Te pasaste "+VALORES_MAYORES+" numeros mayores del rango al correcto ");
                System.out.println("Te pasaste "+VALORES_MENORES+" numeros menores del rango al correcto ");
                System.out.println("Te equivocaste "+VALORES_INVALIDOS+" ingresando valores invalidos ");
                gano=true;

            }else if(valor>secreto){
                System.out.println("El numero es menor");
            }else{
                System.out.println("El numero es mayor");
            }

        }
        if(!gano){
            System.out.println("Perdiste, el numero secreto era: "+secreto);
            System.out.println("Te pasaste "+VALORES_MAYORES+" numeros mayores del rango al correcto ");
            System.out.println("Te pasaste "+VALORES_MENORES+" numeros menores del rango al correcto ");
            System.out.println("Te equivocaste "+VALORES_INVALIDOS+" ingresando valores invalidos ");
        }
        scanner.close();

    }

    public static int obtenerNumeroValido(int min, int max, Scanner scanner, String mensaje){
        int valor;

        while(true){
            System.out.println(mensaje);
            if(scanner.hasNextInt()){
                valor = scanner.nextInt();
                if(valor>=min && valor<=max){
                    return valor;
                }if (valor<min){
                    VALORES_MENORES++;
                    System.out.println("El numero esta fuera de rango, tiene que ser mayor");
                }if (valor>max){
                    VALORES_MAYORES++;
                    System.out.println("El numero esta fuera de rango, es menor");
                }

            }else{
                System.out.println("El dato que ingresaste no es un numero");
                VALORES_INVALIDOS++;
                scanner.next();
            }


        }

    }
}