package org.javiervega.Controlador;
import  org.javiervega.Modelo.Restaurante1;
import java.util.ArrayList;
public class ControlDeRestaurante1{
	//fase de declaracion de variables
	private static ControlDeRestaurante1 instancia;
	private ArrayList<Restaurante1> menu;

	public ControlDeRestaurante1(){
		menu = new ArrayList<Restaurante1>();
	}
	public static ControlDeRestaurante1 getInstancia(){
		if(instancia==null){
			instancia = new ControlDeRestaurante1();
		}return instancia;
	}
	public int cantidadDePlatillos(){
		return menu.size();
	}
	public void agregarPlatillo(Restaurante1 Platillo){
		menu.add(Platillo);
	}
	public ArrayList<Restaurante1> listaDePlatillos(){
		return menu;
	}
	public void eliminarPlatillo(Restaurante1 Platillo){
		menu.remove(Platillo);
	}
	public void eliminarLibro(int indicePlatillo){
		menu.remove(indicePlatillo);
	}
	public Restaurante1 buscarPlatillo(int idPlatillo){
		Restaurante1 plato = new Restaurante1();
		for(Restaurante1 elemento : menu){
			if(plato.getIdPlatillo()==idPlatillo)
				plato = elemento;
			break;
		}return plato;
	}
	public void actualizarPlatillo(Restaurante1 antiguo, Restaurante1 actualizado){
		int indice = menu.indexOf(antiguo);
		if(indice >= 0 )
			menu.set(indice,actualizado);
	}
}
