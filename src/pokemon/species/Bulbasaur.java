package pokemon.species;

import pokemon.Pokemon;
import types.Type;
import types.type.Grass;
import types.type.Poison;

import java.util.Set;

public class Bulbasaur extends Pokemon {
	private String name = "Bulbasaur";
	private Type primaryType = new Grass();
	private Type secondaryType = new Poison();
	private Set<Type> resistances;
	private Set<Type> weaknesses;

	public Bulbasaur() {
		super();
	}

	public Bulbasaur(String name) {
		super();
		this.name = name;
	}
}