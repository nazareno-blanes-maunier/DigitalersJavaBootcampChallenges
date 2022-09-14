import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /*
         * Crear un programa que pida las credenciales de un usuario que posee correo y
         * clave con las siguientes condiciones.
         * 1. El correo debe ser del dominio web “educacionit.com” 2. La clave debe
         * iniciar en mayúscula y contener un símbolo
         * válido (“*” “.” “-” “_”). 3. Debe pedir los datos hasta que estén correctos.
         */
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese su correo: ");
            String correo = teclado.nextLine();
            System.out.println("Ingrese su clave: ");
            String clave = teclado.nextLine();
            if (correo.endsWith("educacionit.com")) {
                if (clave.startsWith(" ")) {
                    System.out.println(
                            "La clave debe iniciar en mayúscula y contener un símbolo válido (“*” “.” “-” “_”)");
                } else {
                    System.out.println("Datos correctos");
                    break;
                }
            } else {
                System.out.println("El correo debe ser del dominio web educacionit.com");
            }

            teclado.close();
        }
    }

}
