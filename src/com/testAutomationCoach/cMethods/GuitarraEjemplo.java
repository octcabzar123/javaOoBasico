package cMethods;

public class GuitarraEjemplo {

	public static void main(String[] args) {
		Guitarra guitarra = new Guitarra("Acústica", "Madera vieja", 'D', 2);
		Guitarrista donRamon = new Guitarrista("Don Ramón", "Vecindad del Chavo", 'M', "Viejitas pero bonitas", 1);
		Guitarrista chavo = new Guitarrista("Chavo del 8", "Vecindad del Chavo", 'M', "Viejitas pero bonitas", 1);
		guitarra.getGuitarristas()[0] = donRamon;
		guitarra.getGuitarristas()[1] = chavo;

		donRamon.getGuitarras()[0] = guitarra;
		chavo.getGuitarras()[0] = guitarra;

		boolean presente = false;
		for (int i = 0; i < guitarra.getGuitarristas().length; i++) {
			Guitarrista guitarro = guitarra.getGuitarristas()[i];
			if (guitarro.equals(chavo)) {
				presente = true;
				System.out.println(chavo.getNombre() + " toca " + guitarra.getModeloGuitarra());
				break;
			}
		}
		if (!presente) {
			System.out.println(chavo.getNombre() + " no tiene la guitarra " + guitarra.getModeloGuitarra());
		}

		for (Guitarra tocarra : chavo.getGuitarras()) {
			System.out.println(chavo.getNombre() +" toca también "+tocarra.getModeloGuitarra());
		}

		for (Guitarra tocarra : donRamon.getGuitarras()) {
			System.out.println(donRamon.getNombre() +" toca también "+tocarra.getModeloGuitarra());
		}
	}
}
