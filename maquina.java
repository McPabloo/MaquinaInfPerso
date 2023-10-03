import java.util.Scanner;

public class EntradaDatos {
    public static void main(String[] args) {
        // Crear un objeto Scanner para leer desde la entrada estándar (consola)
        Scanner scanner = new Scanner(System.in);
        
        // Pedir al usuario que ingrese un número entero
        System.out.print("Ingresa t: ");
        int numero = scanner.nextInt();

        // Imprimir el número ingresado
        System.out.println("Número ingresado: " + numero);

        // Cerrar el objeto Scanner
        scanner.close();
    }
}
