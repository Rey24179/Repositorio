import java.util.ArrayList;

public class EjArregloDinamico {
    public static void main(String[] args) {
        ArrayList<String> bebidas = new ArrayList<>();

        // Agregar elementos
        bebidas.add("Agua");
        bebidas.add("Coca-Cola");
        bebidas.add("Cafe");
        bebidas.add("monster");
        bebidas.add("Té frio");
        bebidas.add("Red Bull");    

        // Mostrar elementos
        for (String i : bebidas) {
            System.out.println(i);
        }

        // Eliminar un elemento
        bebidas.remove("Python");

        // Mostrar tamano
        System.out.println("Tamano de la lista: " + bebidas.size());
    }
}
