import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/sena_viewer";
        String user = "root";
        String pass = " ";

        try {
            Connection conn = DriverManager.getConnection(url, user, pass);
            System.out.println("¡Conexión exitosa a MySQL!");
            conn.close();
        } catch (Exception e) {
            System.out.println("Error de conexión: " + e.getMessage());
        }
    }
}
