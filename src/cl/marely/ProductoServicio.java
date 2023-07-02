package cl.marely;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class ProductoServicio {

	Utilidad utilidad = new Utilidad();
	Producto producto = new Producto();

	List<Producto> listaProducto = new ArrayList<Producto>();

	public List<Producto> getListaProducto() {
		return listaProducto;
	}

	public void setListaProducto(List<Producto> listaProducto) {
		this.listaProducto = listaProducto;
	}

	@Override
	public String toString() {
		return "ProductoServicio [listaProducto=" + listaProducto + "]";
	}

	/*********************************************************
	 *
	 * .........L I S T A R
	 * 
	 * @param listaProducto
	 *
	 *********************************************************/
	public void listarDatos() {

		try {
			if (listaProducto.isEmpty()) {
				utilidad.mensaje("La lista se encuentra vacía!");

			} else {
				System.out.println("\n\n\n\n\t\t>-------<<<-- LISTA DE PRODUCTOS-->>>-------<\n");
				for (Producto p : listaProducto) {
					System.out.println("\t\tCodigo      : " + p.getCodigo().toString());
					System.out.println("\t\tArticulo    : " + p.getArticulo().toString());
					System.out.println("\t\tPrecio      : " + p.getPrecio().toString());
					System.out.println("\t\tDescripcion : " + p.getDescripcion().toString());
					System.out.println("\t\tTalla       : " + p.getTalla().toString());
					System.out.println("\t\tMarca       : " + p.getMarca().toString());
					System.out.println("\t\tColor       : " + p.getColor().toString());
					System.out.println("\n\t\t-----------------------------------------------\n");
				}

				utilidad.mensaje("La lista se generó exitosamente !!");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	/******************************************************************************
	 * 
	 * ........................A G R E G A R - D A T O S *
	 *******************************************************************************/
	public void agregarDatos() {
		Scanner sc = new Scanner(System.in);
		System.out.println("\n\n\n\n\t>------------ MENU AGREGAR ------------<");
		System.out.println("\tComplete los datos a continuación.");
		System.out.println();
		String dato;

		do {
			System.out.print("\n\tARTICULO    :");
			dato = sc.nextLine();
		} while (dato.isEmpty());
		producto.setArticulo(dato);
		
		do {
		System.out.print("\n\tPRECIO      :");
		dato = sc.nextLine();
		}while(dato.isEmpty());
		producto.setPrecio(dato);
		
		do {
		System.out.print("\n\tDESCRIPCION :");
		dato = sc.nextLine();
		}while(dato.isEmpty());
		producto.setDescripcion(dato);
		
		do {
		System.out.print("\n\tCODIGO      :");
		dato = sc.nextLine();
		}while(dato.isEmpty());
		producto.setCodigo(dato);
		
		do {
		System.out.print("\n\tTALLA       :");
		dato = sc.nextLine();
		}while(dato.isEmpty());
		producto.setTalla(dato);
		
		do {
		System.out.print("\n\tMARCA       :");
		dato = sc.nextLine();
		}while(dato.isEmpty());
		producto.setMarca(dato);
		
		do {
		System.out.print("\n\tCOLOR       :");
		dato = sc.nextLine();
		}while(dato.isEmpty());
		producto.setColor(dato);

		listaProducto.add(producto);

		utilidad.mensaje("El registro se guardó exitosamente!");

	}
}
