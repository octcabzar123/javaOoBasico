package dEncapsulacion;

public class EjemploDelTriangulo {

	public static void main(String[] args) {
		Triangulo t = new Triangulo(5,3);
		
		System.out.println("El area es " + t.sacarArea());
		System.out.println("El perimetro es " + t.sacarPerimetro());
		System.out.println(t);
		
	}
}
