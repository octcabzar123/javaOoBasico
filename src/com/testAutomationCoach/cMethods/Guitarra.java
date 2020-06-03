package cMethods;

public class Guitarra {

	private Guitarrista[] guitarristas;
	private String tipoGuitarra;
	private String modeloGuitarra;
	private char lateralidad;

	public Guitarra(String tipoGuitarra, String modeloGuitarra, char lateralidad, int cantidadGuitarrista) {
		this.tipoGuitarra = tipoGuitarra;
		this.modeloGuitarra = modeloGuitarra;
		this.lateralidad = lateralidad;
		guitarristas = new Guitarrista[cantidadGuitarrista];
	}

	public Guitarrista[] getGuitarristas() {
		return guitarristas;
	}

	public void setGuitarristas(Guitarrista[] guitarristas) {
		this.guitarristas = guitarristas;
	}

	public String getTipoGuitarra() {
		return tipoGuitarra;
	}

	public void setTipoGuitarra(String tipoGuitarra) {
		this.tipoGuitarra = tipoGuitarra;
	}

	public String getModeloGuitarra() {
		return modeloGuitarra;
	}

	public void setModeloGuitarra(String modeloGuitarra) {
		this.modeloGuitarra = modeloGuitarra;
	}

	public char getLateralidad() {
		return lateralidad;
	}

	public void setLateralidad(char lateralidad) {
		this.lateralidad = lateralidad;
	}
}
