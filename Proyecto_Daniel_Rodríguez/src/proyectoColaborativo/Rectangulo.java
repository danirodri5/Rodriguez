package proyectoColaborativo;

public class Rectangulo {

	private int base;
	private int altura;
	private static int rectangulosCreados;
	
	public Rectangulo (int base, int altura) {
		this.base = base;
		this.altura = altura;
		rectangulosCreados++;
	}
	
	@Override
	public String toString () {
		int i, j;
		String rectangulo = "";
		
		for (i = 0; i < altura; i++) {
			for (j = 0; j < base; j++) {
				rectangulo += "*";
			}
			rectangulo += "\n";
		}
		
		return rectangulo;
	}
	
	public static int getRectangulosCreados () {
		return rectangulosCreados;
	}
	
}
