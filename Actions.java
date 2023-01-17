package varios;

public class Actions {

	public static int getPositionInTipo(String tipo1) {

		TablaTipos tabla = new TablaTipos();
		for (int i = 0; i < tabla.grupodetipos.length; i++) {
			if (tipo1 == tabla.grupodetipos[i]) {
				return i;
			}
		}
		System.out.println("Nombre del tipo incorrecto prueba la inicial en mayusculas");
		return 19;
	}

	public static void valorDaño(double valor) {

		if (valor == 1)
			System.out.println("Eficaz");
		if (valor == 0.5)
			System.out.println("Poco eficaz");
		if (valor == 2)
			System.out.println("Muy eficaz");
		if (valor == 0)
			System.out.println("No tiene efecto");
		

	}

}
