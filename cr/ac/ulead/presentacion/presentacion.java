package cr.ac.ulead.presentacion;

import cr.ac.ulead.logic.Producto;

import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Scanner;

public class presentacion {

    private Scanner input;
    private PrintStream output;

    public presentacion() {

        this.input = new Scanner(System.in);
        this.output = new PrintStream(System.out);
    }


    public int mostrarMenu(int opcion) {

        output.println("Bienvenido al menú");
        output.println("1. Cargar data");
        output.println("2. Buscar datos por aproximación del nombre");
        output.println("3. Generar lista de código alfa númericos (últimos 3 dígitos)");
        output.println("4. Salir");
        output.println("Elija una opción");
        String eleccion = input.nextLine();
        opcion = Integer.parseInt(eleccion);

        return opcion;
    }

    public void mostrarMensaje(String mensaje) {

        output.println(mensaje);

    }

    public void error() {

        output.println("Lo sentimos, ha ocurrido un error.");

    }

    public String nombreProducto() {

        output.println("Ingrese el nombre del producto que desea buscar");
        return input.nextLine();
    }

    public int mostrarmenu2() {

        System.out.println("1. Cargar data");
        System.out.println("2. Obtener productos segun indice");
        System.out.println("3. Salir");
        return input.nextInt();
    }

    public int getIndex() {
        System.out.println("Ingrese la posicion que desea consultar");
        return input.nextInt();
    }
}
