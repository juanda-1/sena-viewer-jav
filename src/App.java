import senviewer.data.Data;
import senviewer.model.*;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Data.initializeData(); // Inicializa las listas con datos de ejemplo

        System.out.println("\n--- Bienvenido a Viewer ---");
        System.out.println("En esta plataforma podrás visualizar películas, series, libros y revistas.\n");

        boolean ejecutar = true;

        while (ejecutar) {
            System.out.println("\nSelecciona el tipo de contenido que deseas visualizar:");
            System.out.println("1. Movies");
            System.out.println("2. Series");
            System.out.println("3. Books");
            System.out.println("4. Magazines");
            System.out.println("5. Reports");
            System.out.println("6. Reports Today");
            System.out.println("0. Exit");
            System.out.print("Opción: ");

            String opcion = scanner.nextLine().trim();

            switch (opcion) {
                case "1":
                    System.out.println("\n--- Movies Disponibles ---");
                    int i = 1;
                    for (Movie movie : Data.movies) {
                        System.out.println(i + ". " + movie.getTitle() + " (" + movie.getYear() + ") - "
                                + movie.getGenre() + ", Dir: " + movie.getCreator());
                        i++;
                    }
                    break;

                case "2":
                    System.out.println("\n--- Series Disponibles ---");
                    i = 1;
                    for (Serie s : Data.series) {
                        System.out.println(i + ". " + s.getTitle() + " (" + s.getYear() + ") - "
                                + s.getGenre() + ", Sessions: " + s.getSessionQuantity());
                        i++;
                    }
                    break;

                case "3":
                    System.out.println("\n--- Books Disponibles ---");
                    i = 1;
                    for (Book b : Data.books) {
                        System.out.println(i + ". " + b.getTitle() + " (" + b.getEdititionDate() + ") - "
                                + b.getEditorial() + ", ISBN: " + b.getIsbn());
                        i++;
                    }
                    break;

                case "4":
                    System.out.println("\n--- Magazines Disponibles ---");
                    i = 1;
                    for (Magazine m : Data.magazines) {
                        System.out.println(i + ". " + m.getTitle() + " (" + m.getEdititionDate() + ") - "
                                + m.getEditorial());
                        i++;
                    }
                    break;

                case "5":
                    System.out.println("\n--- Reporte General ---");
                    System.out.println("Total Movies: " + Data.movies.size());
                    System.out.println("Total Series: " + Data.series.size());
                    System.out.println("Total Books: " + Data.books.size());
                    System.out.println("Total Magazines: " + Data.magazines.size());
                    break;

                case "6":
                    System.out.println("\n--- Reporte del Día ---");
                    System.out.println("Hoy se han revisado " + (int) (Math.random() * 10 + 1) + " contenidos.");
                    break;

                case "0":
                    ejecutar = false;
                    System.out.println("\nSaliendo de Viewer... ¡Hasta luego!");
                    break;

                default:
                    System.out.println("\nOpción no válida. Intenta de nuevo.");
            }
        }

        scanner.close();
    }
}
