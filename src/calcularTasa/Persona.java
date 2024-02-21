package calcularTasa;
public class Persona{
	private int peso;
	private int altura;
	private int edad;	
	
	
	
	public class hombre extends Persona{
		private int peso;
		private int altura;
		private int edad;	
		
		int TMB = (int) (88.362 + (13.397 *peso ) + (4.799  *altura ) - (5.677 * edad));
	}

	public class mujer extends Persona{
		
		private int peso;
		private int altura;
		private int edad;	
		
		int TMB = (int) (447.593 + (9.247 *peso ) + (3.098 *altura ) - (4.33  * edad));
		
	}

	public void calcularTasaMetabolica(){
		
	}
	
	
	
	public int getPeso() {
		return this.peso;
	}



	public int getAltura() {
		return altura;
	}



	public void setAltura(int altura) {
		this.altura = altura;
	}



	public int getEdad() {
		return edad;
	}



	public void setEdad(int edad) {
		this.edad = edad;
	}
}