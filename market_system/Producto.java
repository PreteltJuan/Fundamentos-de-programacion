import java.util.Scanner;

/**
 * Producto
 */
public class Producto {

    private String nombre;
    private double valor;
    private int unidades;
    private int code;
    
    Producto(int code, int unidades){
        this.unidades = unidades;
        String datosProducto = Servidor.productos.get(code-1);
        Scanner read = new Scanner(datosProducto);
        while (read.hasNext()) {
            this.code = Integer.valueOf(read.next());
            this.nombre = read.next();
            this.valor = Double.valueOf(read.next());
        }
              
        read.close();
    }
    
    public int getCode() {
        return code;
    }
    public void setCode(int code) {
        this.code = code;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public double getValor() {
        return valor;
    }
    public void setValor(double valor) {
        this.valor = valor;
    }

    public int getUnidades() {
        return unidades;
    }

    public void setUnidades(int unidades) {
        this.unidades = unidades;
    }

    public String toString(){
        String a = "Código: " + code + "\n";
        a += "Nombre: " + nombre + "\n";
        a += "Precio: " + valor + "\n";
        a += "Unidades: " + unidades + "\n";

        return a;
    }
}