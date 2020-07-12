package cr.ac.ulead.logic;

import cr.ac.ulead.lista.entidades.Lista;
import cr.ac.ulead.lista.entidades.Nodo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Data {

    public void cargarData(Lista lista) throws FileNotFoundException {

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

            lista.agregar(new Nodo(producto));
        }
        fileReader.close();
        System.out.println("Datos cargados exitosamente");

    }
}