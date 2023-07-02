/**
 * 
 */
package cl.marely;

import java.util.Scanner;
import java.lang.NumberFormatException;


/**
 * @author marely
 *
 */
public class Menu {


	public void menu() {
		
	
		ProductoServicio productoServicio = new ProductoServicio();
		Utilidad utilidad = new Utilidad();
		ExportadorTxt exportadorTxt = new ExportadorTxt();
		int opcion;
		try (Scanner sc = new Scanner(System.in)) {
			do {
				opcion = 0;
				try {
					System.out.println("\n\t>-------<<<-- MENU PRINCIPAL-->>>-------<\n");
					System.out.println("\t\t [1] Listar Producto");
					System.out.println("\t\t [2] Agregar Producto");
					System.out.println("\t\t [3] Exportar Datos");
					System.out.println("\t\t [4] Salir");

					System.out.print("\n\t\t Ingrese la opción: ");
					
					opcion = Integer.parseInt(sc.nextLine());
					
		
				switch (opcion) {
				case 1:
					productoServicio.listarDatos();
					break;
				case 2:
					productoServicio.agregarDatos();
					break;
				case 3:
					exportadorTxt.exportar(productoServicio.listaProducto);
					break;
				case 4:
					utilidad.tiempoEspera("Estas saliendo del programa", 300);
					System.out.print("\n\n\t\t< < < FIN DEL PROGRAMA > > >\n\n\n\n");
					System.exit(0);
					break;
				default:
					System.out.println("\n\tIngrese un valor numérico [1 - 4]\n");
					break;
				}
				}catch(NumberFormatException e) {
					System.out.println("\n\tIngrese un valor numérico [1 - 4]\n");
				
				}

			} while (opcion != 4);
		}
	
	}

}
