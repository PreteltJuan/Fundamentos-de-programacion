import java.util.ArrayList;

public class Servidor {



    private Persistencia persistencia;
    static ArrayList<String>  productos;

    Servidor(){
        persistencia = new Persistencia();
        productos = persistencia.getProductos();
    }

    public boolean verificarDatos(String user, String password){
        return persistencia.verificarDatos(user, password);
    }

    public boolean agregarUsuario(String user, String password){
        return persistencia.agregarUsuario(user, password);
    }

    public ArrayList<String> getProductos(){
        return productos;
    }

    public boolean ejecutarOrden(ArrayList<Producto> carrito){
        return verificarInventario();
    }

    private boolean verificarInventario(){
        return true;
    }
}
