package cMethods;

public class Guitarrista {
	private String nombre;
	private String banda;
	private char genero;
	private String estiloMusical;
	private Guitarra[] guitarras;

	public Guitarrista(String nombre, String banda, char genero, String estiloMusical, int numeroGuitarras) {
		this.nombre = nombre;
		this.banda = banda;
		this.genero = genero;
		this.estiloMusical = estiloMusical;
		this.guitarras = new Guitarra[numeroGuitarras];
	}

	public Guitarra[] getGuitarras() {
		return guitarras;
	}

	public void setGuitarras(Guitarra[] guitarras) {
		this.guitarras = guitarras;
	}

	public void tocar() {
		System.out.println("Guitar la tocarra.");
	}

	public void afinar() {
		System.out.println(
				"No, no, no, está desafinada. A ver, bájate. No, no, bájate más. Más. Bájate más. Bájate. ¡Bueno, no estás bajando!");
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getBanda() {
		return banda;
	}

	public void setBanda(String banda) {
		this.banda = banda;
	}

	public char getGenero() {
		return genero;
	}

	public void setGenero(char genero) {
		this.genero = genero;
	}

	public String getEstiloMusical() {
		return estiloMusical;
	}

	public void setEstiloMusical(String estiloMusical) {
		this.estiloMusical = estiloMusical;
	}

	@Override
	public boolean equals(Object obj) {
		Guitarrista guitarro2 = (Guitarrista) obj;
		return this.nombre == guitarro2.nombre;
	}
}
