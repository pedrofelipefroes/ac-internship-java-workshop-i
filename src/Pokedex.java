import pokemon.*;
import pokemon.species.*;

public class Pokedex {
	public static void main(String[] args) {
		Pokemon pikachu1 = new Pikachu(13);
		pikachu1.displayInfo();

		Pikachu pikachu2 = new Pikachu(25, "Yellow");
		pikachu2.displayInfo();
	}
}