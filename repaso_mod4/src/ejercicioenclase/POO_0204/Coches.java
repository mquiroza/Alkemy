package Ejemplos;

/* Crea una clase llamada Coche que contenga los siguientes atributos:
 *  matrícula (String), marca (String), año de matriculación (int), eléctrico (boolean).
 * */


public class Coches { // inicio clase 
//datos y tipos
	private String matricula;
	private String marca;
	private int anioMatricula;
	private boolean electrico;
	
	//constructor por defecto o vacio
	
	public Coches() {
		
	}
	
	
	/**constructor
	 * @param matricula
	 * @param marca
	 * @param anioMatricula
	 * @param electrico
	 */
	public Coches(String matricula, String marca, int anioMatricula, boolean electrico) {
		super();
		this.matricula = matricula;
		this.marca = marca;
		this.anioMatricula = anioMatricula;
		this.electrico = electrico;
	}


	/**
	 * @return the matricula
	 */
	public String getMatricula() {
		return matricula;
	}


	/**
	 * @param matricula the matricula to set
	 */
	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}


	/**
	 * @return the marca
	 */
	public String getMarca() {
		return marca;
	}


	/**
	 * @param marca the marca to set
	 */
	public void setMarca(String marca) {
		this.marca = marca;
	}


	/**
	 * @return the anioMatricula
	 */
	public int getAnioMatricula() {
		return anioMatricula;
	}


	/**
	 * @param anioMatricula the anioMatricula to set
	 */
	public void setAnioMatricula(int anioMatricula) {
		this.anioMatricula = anioMatricula;
	}


	/**
	 * @return the electrico
	 */
	public boolean isElectrico() {
		return electrico;
	}


	/**
	 * @param electrico the electrico to set
	 */
	public void setElectrico(boolean electrico) {
		this.electrico = electrico;
	}


	@Override
	public String toString() {
		return matricula + " " + " Año : " + anioMatricula + (this.isElectrico()? " electrico" : " No electrico");
	}
	
		
	
} // fin clase
