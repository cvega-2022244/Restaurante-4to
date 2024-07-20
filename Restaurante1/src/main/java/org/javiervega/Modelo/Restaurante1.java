package org.javiervega.Modelo;
public class Restaurante1{
	private int idPlatillo;
	private String nombrePlatillo;
	private int precioPlatillo;
	public Restaurante1(){

	}
	public Restaurante1(int idPlatillo, String nombrePlatillo, int precioPlatillo){
		this.idPlatillo = idPlatillo;
		this.nombrePlatillo = nombrePlatillo;
		this.precioPlatillo = precioPlatillo;
	}
	public int getIdPlatillo(){
		return idPlatillo;
	}
	public void setIdPlatillo(int idPlatillo){
		this.idPlatillo = idPlatillo;
	}
	public String getNombrePlatillo(){
		return nombrePlatillo;
	}
	public void setNombrePlatillo(String nombrePlatillo){
		this.nombrePlatillo = nombrePlatillo;
	}
	public int getPrecioPlatillo(){
		return precioPlatillo;
	}
	public void setPrecioPlatillo(int precioPlatillo){
		this.precioPlatillo = precioPlatillo;
	}
}