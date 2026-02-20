import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {

        int opc;
        Scanner sc= new Scanner(System.in);
        PersonaService personaService= new PersonaService();
        Persona[] personas = new Persona[3];

        do{
            System.out.println("===Menu===");
            System.out.println("1) Alta");
            System.out.println("2) Buscar por ID ");
            System.out.println("3) Baja lógica por ID");
            System.out.println("4) Listar Activos");
            System.out.println("5) Actualizar nombre");
            opc=sc.nextInt();
            switch (opc) {
                case 1:
                    personaService.alta(personas, sc);
                    break;
                case 2:

                    break;
                case 3:

                    break;
                case 4:

                    break;
                case 5:
                    break;
                default:
                    System.out.println("Opcion invalida");
            }


        }while(opc!=0);


    }
}
