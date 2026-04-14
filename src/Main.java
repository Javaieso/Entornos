import java.util.ArrayList; // No olvides esta línea arriba del todo

public class Main {
    public static void main(String[] args) {
        System.out.println("MiniInventario iniciado correctamente.");
        System.out.println("Versión inicial con gestión básica de productos.");
        
        // Aquí puedes crear una lista de prueba si quieres probarlo
        ArrayList<String> inventario = new ArrayList<>();
        inventario.add("Teclado");
        
        // Llamada de prueba (opcional)
        buscarProducto(inventario, "Teclado");
    }

    // AÑADE ESTO AQUÍ DEBAJO (Copiado del PDF)
    public static void buscarProducto(ArrayList<String> productos, String nombreBuscado) {
        boolean encontrado = false;
        for (String producto : productos) {
            if (producto.equalsIgnoreCase(nombreBuscado)) {
                encontrado = true;
                break;
            }
        }
        if (encontrado) {
            System.out.println("Producto encontrado en el inventario.");
        } else {
            System.out.println("El producto no existe en el inventario.");
        }
    }
}
