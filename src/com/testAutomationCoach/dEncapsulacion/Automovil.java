package dEncapsulacion;

import libs.Input;

public class Automovil {
	//Atributos
	
	private String marca;
	private double velocidadActual;
	private double maximaVelocidad;
	private String tipoDeTransmision;
	private int numDePuertas;
	private int numDeLlantas;
	private int numRevoluciones;
	private double gasolina;
	private double temperatura; 
	private boolean encendido;
	
	Automovil() {
		this.marca = "Ford";
		this.velocidadActual = 0.0;
		this.maximaVelocidad = 200.0;
		this.tipoDeTransmision = "Manual";
		this.numDePuertas = 2;
		this.numDeLlantas = 4;
		this.numRevoluciones=0;
		this.gasolina=40.0;
		this.temperatura=18;
	}
	
	Automovil(String marca, double maximaVel, String tipoTransmision, int numPuertas, int numLlantas) {
		this.marca = marca;
		this.velocidadActual = 0.0;
		this.maximaVelocidad = maximaVel;
		this.tipoDeTransmision = tipoTransmision;
		this.numDePuertas = numPuertas;
		this.numDeLlantas = numLlantas;
		this.numRevoluciones=0;
		this.gasolina=40.0;
		this.temperatura=18;
	}
	//comportamiento
	
	public void encender(){
		this.encendido=true;
	}
	public void apagar(){
		this.encendido=false;
	}
	
	public void acelerar() {
		if(this.encendido){
			Input.print("run run\n");
			this.velocidadActual += 5.0;
			this.numRevoluciones = 1500;
			this.gasolina-=0.01;
			this.temperatura+=5.0;
		}else{
			Input.print("No se puede acelerar!\n");
		}
	}
	
	public void frenar() {
		if(this.encendido){
			Input.print("Screeeeech!\n");
			this.velocidadActual = 0;
			this.numRevoluciones -= 500;
			this.gasolina -= 0.001;
			this.temperatura +=0.1;
		}else{
			Input.print("No se puede frenar!\n");
		}
	}
	
	public void retroceder() {
		if(this.encendido){
			Input.print("piii piii piii piii\n");
			this.velocidadActual -= -5;
			this.numRevoluciones += 500;
			this.gasolina += 0.01;
			this.temperatura +=5.0;
		}else{
			
		}
	}
	
	public double getVelocidad() {
		return velocidadActual;
	}
}
