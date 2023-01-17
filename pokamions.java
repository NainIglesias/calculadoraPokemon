package varios;

public class pokamions {
	
	public static void main(String[] args) {
		
		Pokemon primario = new Pokemon("Pikachu", "Veneno", 30.5,10.0);
		Pokemon secundario = new Pokemon("Squirtle", "Acero", 2.5, 3.5);
		
		DañoTipo.getDamage(primario,secundario);
		
	}

}
