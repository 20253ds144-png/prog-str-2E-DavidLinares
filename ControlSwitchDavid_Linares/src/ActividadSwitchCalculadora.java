import java.util.Scanner;

public class ActividadSwitchCalculadora {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int opc=0;
        double valor1=0.0;
        double valor2=0.0;
        double resultado=0.0;

        System.out.println("Menú calculadora:");
        System.out.println("1.Suma");
        System.out.println("2.Resta");
        System.out.println("3.Multiplicación");
        System.out.println("4.División");
        opc=sc.nextInt();



        switch (opc){
            case 1:
                System.out.println("Usted eligio suma");
                System.out.println("Ingrese el primer valor: ");
                valor1= sc.nextDouble();
                System.out.println("Ingrese el segundo valor: ");
                valor2= sc.nextDouble();
                resultado=resultadoSuma(valor1,valor2);
                System.out.println("La operación: "+valor1+" + "+valor2+" el resultado es: "+resultado);
                break;
            case 2:
                System.out.println("Usted eligio resta");
                System.out.println("Ingrese el primer valor: ");
                valor1= sc.nextDouble();
                System.out.println("Ingrese el segundo valor: ");
                valor2= sc.nextDouble();
                resultado=resultadoResta(valor1,valor2);
                System.out.println("La operación: "+valor1+" - "+valor2+" el resultado es: "+resultado);
                break;
            case 3:
                System.out.println("Usted eligio multiplicación");
                System.out.println("Ingrese el primer valor: ");
                valor1= sc.nextDouble();
                System.out.println("Ingrese el segundo valor: ");
                valor2= sc.nextDouble();
                resultado=resultadoMultiplicacion(valor1,valor2);
                System.out.println("La operación: "+valor1+" * "+valor2+" el resultado es: "+resultado);
                break;
            case 4:
                System.out.println("Usted eligio división");
                System.out.println("Ingrese el primer valor: ");
                valor1= sc.nextDouble();
                System.out.println("Ingrese el segundo valor: ");
                valor2= sc.nextDouble();
                if (valor2 == 0) {
                    System.out.println("No se puede dividir entre 0 ");
                } else {
                    resultado=resultadoDivision(valor1,valor2);
                    System.out.println("La operación: "+ valor1 +" entre "+ valor2 +" el resultado es: "+resultado);
                }
                break;
            default:
                System.out.println("Opción inválida");
                break;

        }

    }

    public static double resultadoSuma(double valor1, double valor2){
        return valor1+valor2;
    }

    public static double resultadoResta(double valor1, double valor2){
        return valor1-valor2;
    }

    public static double resultadoMultiplicacion(double valor1, double valor2){
        return valor1*valor2;
    }

    public static double resultadoDivision(double valor1,double valor2){
       return valor1/valor2;

    }
}
