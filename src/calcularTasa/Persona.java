package calcularTasa;
public class Persona{
	private int peso;
	private int altura;
	private int edad;	

	
	 public int calcularTasaMetabolica() {
	        return 0; 
	    }
	class Hombre extends Persona {

	    public int calcularTasaMetabolica() {
	        return (int) (88.362 + (13.397 * peso) + (4.799 * altura) - (5.677 * edad));
	    }
	}

	class Mujer extends Persona {

	    public int calcularTasaMetabolica() {
	        return (int) (447.593 + (9.247 * peso) + (3.098 * altura) - (4.33 * edad));
	    }
	    
	    public int getPeso() {
	        return peso;
	    }
	
	    public void setPeso(int peso) {
	        this.peso = peso;
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

}