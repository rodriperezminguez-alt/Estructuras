import java.util.HashMap;

public class Telefonos {
	public static void main(String[] args) {
		HashMap<String, String> guiaTelefonica = new HashMap<>() {{
			put("Juan", "123456789");
			put("María", "987654321");
			put("Pedro", "555555555");
			put("Ana", "111111111");
		}};
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Introduce un contacto: ");
		String contacto = sc.nextLine();
		String telefono = guiaTelefonica.get(contacto);
		if (telefono != null) {
			System.out.println("El número de teléfono de " + contacto + " es " + telefono);
		} else {
			System.out.println("No se encontró el número de teléfono de " + contacto);
		}
	}
}
