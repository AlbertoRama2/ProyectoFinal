package Models;



import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;



@SuppressWarnings("serial")
public class ListaOrdenada<E> extends ArrayList<E> {

	//Dlecaracion de constantes y variables
	private final byte MAX_SIZE = 100;
	private Comparator<E> comp;

	public ListaOrdenada(Comparator<E> comp) {
		super();
		this.comp = comp;
	}

	//Sobreescribimos los metodos necesarios para nuestro comportamiento
	/**
	 * Añadimos un elemento y ordenamos despues.
	 */
	@Override
	public boolean add(E element) {
		if (element != null) {
			if (this.size() < MAX_SIZE) {
			 super.add(element);
				Collections.sort(this, comp);
				return true;
			} else {
				return false;}
		} else {
			return false;
		}
	}
/**
 * Añadimos una coleccion y ordenamos.
 */
	@Override
	public boolean addAll(Collection<? extends E> collection){

		if (collection.size() + this.size() < MAX_SIZE) {
		 super.addAll(collection);
		 Collections.sort(this, comp);
			return true;
		} else {
			return false;}
	}
/**
 * Añade un objeto en un indice concreto y ordena la lista despues
 */
	@Override
	public void add(int index, E element) {
		if (element != null) {
			if (this.size() != MAX_SIZE) {
				if (index < MAX_SIZE) {
					super.add(index, element);
					Collections.sort(this, comp);
				} else {
						}
			} else {
				}
		} else {
			}
	}
	
/**
 * Añade una coleccion a partir de un indice concreto y ordena despues
 */
	@Override
	public boolean addAll(int index, Collection<? extends E> c){
		if (index < MAX_SIZE) {
			if (c.size() + index < MAX_SIZE) {
			 super.addAll(index, c);
			 Collections.sort(this, comp);
			 return true;
			} else {
				return false;
					}
		} else {
			return false;
			}
	}
	/**
	 * Metodo que devuelve la lista a la inversa, pero sin cambiar el orden real de esta
	 * @return La lista invertida
	 */
	public ListaOrdenada<Integer> reverse(){
		ListaOrdenada <Integer> aux = new ListaOrdenada<Integer>((Integer a, Integer b) -> a - b);
		
		for (int i = this.size()-1;i>=0;i--){
			aux.add((Integer) this.get(i));
		}
		return aux;
	}
/**
 * Metodo para averiguar el elemento mas alto de la lista
 * @return el elemento de maximo valor de la lista
 */
	public  E max(){
		return this.get(0);
	}
	/**
	 * Metodo para averiguar el elemento mas bajo de la lista
	 * @return el elemento de menos valor de la lista
	 */
	public E min(){
		return this.get(this.size()-1);
	}
}