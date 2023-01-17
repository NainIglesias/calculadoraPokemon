package varios;

public class Pokemon {
	
	String nombre;
	public String tipo1;
	public String tipo2;
	Double peso;
	Double altura;

	Pokemon(String nombre, String t1, String t2, Double peso, Double altura){
		this.nombre = nombre;
		this.tipo1 = t1;
		this.tipo2 = t2;
		this.peso = peso;
		this.altura = altura;
	}
	Pokemon(String nombre, String t1, Double peso, Double altura){
		this.nombre = nombre;
		this.tipo1 = t1;
		this.peso = peso;
		this.altura = altura;
	}
	
	
}
