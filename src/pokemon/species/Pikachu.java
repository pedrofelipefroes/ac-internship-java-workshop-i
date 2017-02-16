package pokemon.species;

import moves.ZMove;
import pokemon.Pokemon;
import type.Type;
import type.types.Electric;

public class Pikachu extends Pokemon implements ZMove {
	private String name;
	private int ZMovePower;
	private Type electric = new Electric();

	public Pikachu(int level) {
		super(level);
		this.setPrimaryType("Electric");
	}

	public Pikachu(int level, String name) {
		super(level);
		this.name = name;
		this.setPrimaryType("Electric");
	}

	public String getName() {
		return this.name;
	}

	public void displayInfo() {
		System.out.println("Specie:      Pikachu");
		if(this.name != null) {
			System.out.println("Name:        " + this.getName());
		}
		System.out.println("Level:       " + this.getLevel());
		System.out.println("Type:        " + this.getType());
		System.out.println("Resistances: " + this.electric.getResistances());
		System.out.println("Weaknesses:  " + this.electric.getWeaknesses());
		System.out.println();
	}

	@Override
	public void setDamage() {
		this.ZMovePower = this.getLevel()*50;
	}

	@Override
	public int getDamage() {
		return this.ZMovePower;
	}

	@Override
	public String getZMoveType() {
		return this.getPrimaryType();
	}
}