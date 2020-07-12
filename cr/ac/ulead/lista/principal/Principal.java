package cr.ac.ulead.lista.principal;

import cr.ac.ulead.presentacion.presentacion;
import cr.ac.ulead.logic.logic;

import java.io.FileNotFoundException;

public class Principal {

	public static void main(String[] args) throws FileNotFoundException {

	int opcion = 0;
	presentacion presentacion = new presentacion();
	logic logic = new logic();


	do {

		opcion = presentacion.mostrarMenu(opcion);
		logic.ejecutarPrograma(opcion);

	}while (opcion != 4);

	}
}
