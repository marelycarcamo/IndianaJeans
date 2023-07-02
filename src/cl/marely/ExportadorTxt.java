package cl.marely;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.util.List;
import java.io.IOException;

public class ExportadorTxt extends Exportador {

	private String productoTexto = "";
	Utilidad utilidad = new Utilidad();

	public void exportar(List<Producto> listaProducto) {
		if (listaProducto.isEmpty()) {
			utilidad.mensaje("La lista se encuentra vacía!");

		} else {
			File directorio = new File("src/directorio");
			File file = new File("src/directorio/productos.txt");

			listaProducto.forEach(p -> {
				productoTexto += p.getArticulo() + "," + p.getPrecio() + "," + p.getDescripcion() + "," + p.getCodigo()
						+ "," + p.getTalla() + "," + p.getMarca() + "," + p.getColor() + "\n";
			});

			try {
				if (file.exists()) {
					utilidad.mensaje("El archivo ya existe, se sobreescribirá.");
				} else {
					directorio.mkdir();
					file.createNewFile();
					FileWriter fw = new FileWriter(file);
					BufferedWriter bw = new BufferedWriter(fw);
					bw.write(productoTexto);
					bw.close();
				}

			} catch (IOException e) {
				e.printStackTrace();
			}
			utilidad.mensaje("El archivo se exportó correctamente !!");
		}
	}
}
