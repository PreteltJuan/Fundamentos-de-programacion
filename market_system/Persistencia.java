import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Persistencia
 */
public class Persistencia {

    private ArrayList<String> users;
    private ArrayList<String> passwords;
    private ArrayList<String> productos;

    Persistencia(){
        users = new ArrayList<String>();
        passwords = new ArrayList<String>();
        productos = new ArrayList<String>();

        File file = new File("./datos.txt");
        try {
            Scanner read = new Scanner(file);
            while (read.hasNextLine()) {
                productos.add(read.nextLine());
            }
            read.close();
        } catch (Exception e) {
            System.err.println("Error");
        }
    }

    public boolean verificarDatos(String user, String password){
        for (int i = 0; i < users.size(); i++) {
            if (users.get(i).equalsIgnoreCase(user)) {
                if (passwords.get(i).equalsIgnoreCase(password)) {
                    return true;
                }
            }  
        }
        return false;
    }

    public boolean agregarUsuario(String user, String password){
        users.add(user);
        passwords.add(password);
        return true;
    }
    
    public ArrayList<String>  getProductos(){
        return productos;
    }
}