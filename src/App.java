import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        //noinspection resource
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n--- Bienvenido a Viewer ---");
        System.out.println("En esta plataforma podrás visualizar películas, series, libros y revistas.\n");

        boolean ejecutar = true;

        while (ejecutar) {
            System.out.println("Selecciona el tipo de contenido que deseas visualizar");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Books");
            System.out.println("4. Magazines");
            System.out.println("5. Reports");
            System.out.println("6. Reports Today");
            System.out.println("7. Exit");
            System.out.print("Opción: ");

            String opcion = scanner.nextLine(); // Capturar opción

            switch (opcion) {
                case "1":
                    System.out.println("\n--- Movies Disponibles ---\n");
                    break;

                case "2":
                    System.out.println("\n--- Series Disponibles ---\n");
                    break;

                case "3":
                    System.out.println("\n--- Books Disponibles ---\n");
                    break;

                case "4":
                    System.out.println("\n--- Magazines Disponibles ---\n");
                    break;

                case "5":
                    System.out.println("\n--- Reporte General ---\n");
                    break;

                case "6":
                    System.out.println("\n--- Reporte del Día ---\n");
                    break;

                case "7":
                    ejecutar = false;
                    System.out.println("\nSaliendo de Viewer... ¡Hasta luego!");
                    break;

                default:
                    System.out.println("\nOpción no válida. Intenta de nuevo.\n");
            }
        }
    }
}
