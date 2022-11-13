package ar.edu.unq.po2.tpStrategy;

public class EncriptadorVocal extends EncriptadorGeneral {

	@Override
	public String encriptar(String texto) {
		String textoEncriptado = "";
		for (int i = 0; i < texto.length(); i++) {
			textoEncriptado += this.encriptarLetra(texto.charAt(i));
		}

		return textoEncriptado;
	}

	private String encriptarLetra(char charAt) {
		switch (charAt) {
		case 'a':
			return "e";
		case 'e':
			return "i";
		case 'i':
			return "o";
		case 'o':
			return "u";
		case 'u':
			return "a";
		default:
			return ""+charAt;

		}
	}

	@Override
	public String desencriptar(String texto) {
		String textoDesencriptado = " ";
		for (int i = 0; i < texto.length(); i++) {
			textoDesencriptado += this.desencriptarLetra(texto.charAt(i));
		}

		return textoDesencriptado;
	}

	private String desencriptarLetra(char charAt) {
		switch (charAt) {
		case 'a':
			return "u";
		case 'e':
			return "a";
		case 'i':
			return "e";
		case 'o':
			return "i";
		case 'u':
			return "o";
		default:
			return "" + charAt;

		}
	}
}
