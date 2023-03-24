package proyectoColaborativo;

public class Piramide {
	
	private int altura;
	private static int piramidesCreadas;
	
	public Piramide (int altura) {
		this.altura = altura;
		piramidesCreadas++;
	}
	
	@Override
	public String toString () {
		int i, j;
		String piramide = "";
		
		for (i = 0; i < altura; i++) {
			 
            for (j = altura - i; j > 1; j--) {
                piramide += " ";
            }

            for (j = 0; j <= i; j++) {
                piramide += "*";
            }
  
            piramide += "\n";
		
		}
		
		return piramide;
	}
	
	public static int getPiramidesCreadas() {
		return piramidesCreadas;
	}

}
