import java.util.ArrayList;
import java.util.Scanner;


public class App   {

    private String user;
    private String password;
    private Scanner in;
    private Servidor servidor;
    private ArrayList<Producto> carrito; 
    public static void main(String args[]){
        App app = new App();
        app.menuInicial();
    }

    App(){
        in = new Scanner(System.in);
        carrito = new ArrayList<Producto>();
        servidor = new Servidor();
    }
    
    private void menuInicial(){
        int opcion = 0;
        do{
            System.out.println("Escoja una opción:");
            System.out.println("1. Iniciar sesión.");
            System.out.println("2. Registrarse.");
            System.out.println("3. Salir.");
            opcion = in.nextInt();
            switch(opcion){
                case 1: 
                if(signIn()){
                    System.out.println("Acceso correcto");
                    menuSecundario();
                }else{
                    System.out.println("Acceso incorrecto");
                }
                break;
                case 2: 
                if(signUp()){
                    System.out.println("Registro correcto");
                }else{
                    System.out.println("Registro incorrecto");
                }
                break;
                case 3: 
                System.out.println("APP FINALIZADA");
                break;
                default:
                System.out.println("Opción incorrecta");
                break;
            }
        }while(opcion != 3);
    }
    
    private void menuSecundario(){
        int opcion = 0;
        do{
            System.out.println("Escoja una opción:");
            System.out.println("1. Mostrar Carrito.");
            System.out.println("2. Agregar producto a la lista.");
            System.out.println("3. Eliminar producto de la lista.");
            System.out.println("4. Ejecutar orden.");
            System.out.println("5. Salir.");
            opcion = in.nextInt();
            switch(opcion){
                case 1:     
                    if(carrito.size() == 0){
                        System.out.println("Lista vacía");   
                    }else{
                        mostrarCarrito();
                    }
                    break;
                case 2: 
                    mostrarProductos();
                    System.out.print("Ingrese código del producto: ");
                    int codigo = in.nextInt();
                    System.out.print("Ingrese el número de unidades que requiere: ");
                    int unidades = in.nextInt();
                    agregarProducto(codigo, unidades);
                    break;
                case 3: 
                    if(carrito.size() != 0){
                        mostrarCarrito();
                        System.out.print("Ingrese código del producto: ");
                        int codigo2 = in.nextInt();
                        
                        if (eliminarProducto(codigo2)) {
                            System.out.println("Producto eliminado");
                        }else{
                            System.out.println("El producto indicado no pudo ser eliminado");
                        }
                    }else{
                        System.out.println("Lista vacía");
                    }

                    break;
                case 4: 
                    if(servidor.ejecutarOrden(carrito)){
                        System.out.println("Compra realizada");
                    }else{
                        System.out.println("Error al realizar la compra");
                    }
                    break;
                case 5: 
                    System.out.println("Salida exitosa");
                    break;

                default:
                    System.out.println("Opción incorrecta");
                break;
            }
        }while(opcion != 5);
    }
    
    public boolean signIn() {
        System.out.print("Ingrese su usuario: ");
        user = in.next();
        System.out.print("Ingrese su contraseña: ");
        password = in.next();
        return servidor.verificarDatos(user, password);
    }

    public boolean signUp() {
        System.out.print("Ingrese un usuario: ");
        user = in.next();
        System.out.print("Ingrese una contraseña: ");
        password = in.next();
        return servidor.agregarUsuario(user, password);
    }
    private void mostrarCarrito(){
        
        System.out.println("\n");
        System.out.println("Cód.  Nombre   Valor   Unidades");
        for (Producto producto : carrito) {
            
            System.out.println( producto.getCode() + "    " + producto.getNombre() + "   " + producto.getValor()+ "  " + producto.getUnidades() );                              
        }
    }
    
    private void mostrarProductos(){
        ArrayList<String> productos = servidor.getProductos();
        for (String string : productos) {
            System.out.println(string);
        }
    }
    
    private void agregarProducto(int codigo, int unidades){
        if (carrito.size() != 0) {
            for (int i = 0; i < carrito.size(); i++) {
                if(carrito.get(i).getCode() == codigo){
                    carrito.get(i).setUnidades(carrito.get(i).getUnidades() + unidades);
                    return;
                }
            }
        }
        carrito.add(new Producto(codigo, unidades));
            
        
    }

    private boolean eliminarProducto(int code){
        for (int i = 0; i < carrito.size(); i++) {
            if(carrito.get(i).getCode() == code){
                ArrayList<Producto> carritoTemp = new ArrayList<Producto>();
                for (int j = 0; j < carrito.size(); j++) {
                     if(j!=i){
                         carritoTemp.add(carrito.get(j));

                     }
                }
                carrito = carritoTemp;
                
                return true;
            }
        }
        return false;
    }
}
