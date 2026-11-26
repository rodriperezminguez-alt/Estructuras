
import java.util.HashMap;
import java.util.ArrayList;
public class TelefonosII {
	public static void main(String[] args) {
		HashMap<String, ArrayList<String>> guiaTelefonica = new HashMap<>();
		ArrayList<String> telefonos = new ArrayList<>();
		telefonos.add("123456789");
		telefonos.add("123123123");
		guiaTelefonica.put("Juan", telefonos);
		telefonos = new ArrayList<>();
		telefonos.add("987654321");
		telefonos.add("987987987");
		guiaTelefonica.put("María", telefonos);
		telefonos = new ArrayList<>();
		telefonos.add("555555555");
		telefonos.add("555444333");
		guiaTelefonica.put("Pedro", telefonos);
		telefonos = new ArrayList<>();
		telefonos.add("111111111");
		telefonos.add("111222333");
		guiaTelefonica.put("Ana", telefonos);
		java.util.Scanner sc = new java.util.Scanner(System.in);
		System.out.print("Introduce un contacto: ");
		String contacto = sc.nextLine();
		ArrayList<String> telefono = guiaTelefonica.get(contacto);
		if (telefono != null) {
			System.out.println("Los números de teléfono de " + contacto + " son:");
			for (String numero : telefono) {
				System.out.println(numero);
			}
		} else {
			System.out.println("No se encontró el número de teléfono de " + contacto);
		}
	}
}
