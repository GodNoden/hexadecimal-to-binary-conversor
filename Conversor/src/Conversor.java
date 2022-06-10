import java.util.Scanner;

public class Conversor {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int opc = 0;
		Bits bits = new Bits();
		Scanner scanner = new Scanner(System.in);
		// 3. Declarar en una l�nea independiente, una variable de un byte de capacidad
		byte mainByte = 0x0A; // 4. Asignarle a la variable del punto anterior una combinaci�n de bits, usando
								// un valor en notaci�n hexadecimal v�a c�digo fuente
		short mainShort = -0x001; // 12. El programa imprima correctamente los bits para n�meros negativos.
		int mainInt = 0x00000001; // 11. El programa imprima correctamente los bits para n�meros positivos.
		long mainLong = 0x0000D0000A000000L; // � Implementar conversiones en tipo de dato Long (8 bytes)

		while (opc != 5) {
			System.out.println("Elige una opci�n");
			System.out.println("1. Convertir 1 byte");
			System.out.println("2. Convertir 2 byte");
			System.out.println("3. Convertir 4 byte");
			System.out.println("4. Convertir 8 byte");
			System.out.println("5. Salir");
			opc = scanner.nextInt();

			switch (opc) { //
			case 1:
				bits.imprimirBits(mainByte);
				break;
			case 2:
				System.out.println(mainShort);
				bits.imprimirBits(mainShort);
				break;
			case 3:
				bits.imprimirBits(mainInt);
				break;
			case 4:
				bits.imprimirBits(mainLong);
				break;
			case 5:
				break;

			default:
				throw new IllegalArgumentException("Unexpected value: " + opc);
			}
		}

	}

}

class Bits {

	private int datoByte = 0x80;
	private int datoShort = 0x8000;
	private int datoInt = 0x80000000;
	private long datoLong = 0x8000000000000000L;

	public void imprimirBits(byte datoByte) { // 5. Implementar m�todo para imprimir en pantalla la serie de bits (0s y
												// 1s) para el tipo de dato de 1 byte

		for (int i = 0; i < 8; i++) {
			if (i % 8 == 0) {
				System.out.print(" | "); // 9. Antes de imprimir la secuencia de bits imprimir el caracter pipe y un
											// espacio.
			}
			if ((datoByte & this.datoByte) == 0) {
				System.out.print(0);
			} else {
				System.out.print(1);

			}
			this.datoByte = this.datoByte >>> 1; // 2. Utilizar operadores de corrimiento
		}
		System.out.println("");
	}

	public void imprimirBits(short datoShort) { // 6. Implementar m�todo para imprimir en pantalla la serie de bits (0s
												// y 1s) para el tipo de dato de 2 bytes

		for (int i = 0; i < 16; i++) {
			if (i % 8 == 0) {
				System.out.print(" | ");
			}
			if ((datoShort & this.datoShort) == 0) {
				System.out.print(0);
			} else {
				System.out.print(1);

			}
			this.datoShort = this.datoShort >>> 1;
		}
		System.out.println("");
	}

	public void imprimirBits(int datoInt) { // 7. Implementar m�todo para imprimir en pantalla la serie de bits (0s y
											// 1s) para el tipo de dato de 4 bytes

		for (int i = 0; i < 32; i++) {
			if (i % 8 == 0) {
				System.out.print(" | ");
			}
			if ((datoInt & this.datoInt) == 0) {
				System.out.print(0);
			} else {
				System.out.print(1);

			}
			this.datoInt = this.datoInt >>> 1;
		}
		System.out.println("");
	}

	public void imprimirBits(long datoLong) { // 14. Es optativo un m�todo para tipo de 8 bytes

		for (int i = 0; i < 64; i++) {
			if (i % 8 == 0) {
				System.out.print(" | ");
			}
			if ((datoLong & this.datoLong) == 0) {
				System.out.print(0);
			} else {
				System.out.print(1);

			}
			this.datoLong = this.datoLong >>> 1;
		}
		System.out.println("");
	}

}
