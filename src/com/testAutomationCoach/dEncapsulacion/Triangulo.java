package dEncapsulacion;

public class Triangulo {
	
	//propiedades o campos
	private double base;
	private double altura;
	
	public Triangulo(int base, int altura) {
		this.base = base;
		this.altura = altura;
	}
	
	//metodos o comportamiento
	public double sacarArea() {
		double area= (this.base*this.altura)/2;
		return area;
	}
	public double sacarPerimetro() {
		double perimetro= this.base+this.altura+Math.sqrt(Math.pow(base, 2)+Math.pow(altura, 2));
	    return perimetro;	
	}

	public double getBase() {
		return base;
	}

	public void setBase(int base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(int altura) {
		this.altura = altura;
	}
	
	public String toString() {
		return "Base es " + this.base + " Altura es "+ this.altura;
	}

}
