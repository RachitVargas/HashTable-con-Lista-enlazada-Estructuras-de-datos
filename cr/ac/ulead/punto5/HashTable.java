package cr.ac.ulead.punto5;

import cr.ac.ulead.lista.entidades.Lista;
import cr.ac.ulead.logic.Producto;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class HashTable {

    private Lista[] listaColision;
    Lista lista;

    public HashTable(int tam) {
        this.lista = new Lista();
        listaColision = new Lista[tam];
    }


    public void cargarData() throws FileNotFoundException {

        Scanner fileReader = new Scanner(new File(
                "C:\\Users\\User\\IdeaProjects\\TareaProgramadaDos" +
                        "\\src\\cr\\ac\\ulead\\logic\\flipkart_com-ecommerce_sample.csv"));

        System.out.println("Cargando datos....");
        while (fileReader.hasNextLine()) {

            String currentLine = fileReader.nextLine();
            String datos[] = currentLine.split(",");
            Producto producto = new Producto();
            producto.setCodigoAlfaNumerico(datos[0]);
            producto.setNombre(datos[1]);
            producto.setCategoria(datos[2]);

            Lista.agregarPunto5(producto, this.listaColision);

        }
        fileReader.close();
        System.out.println("Datos cargados exitosamente");
    }

    public void imprimir(int indice) {
        lista.imprimirPunto5(listaColision[indice]);
    }
}
