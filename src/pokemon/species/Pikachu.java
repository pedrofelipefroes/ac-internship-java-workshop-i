package pokemon.species;

import moves.ZMove;
import pokemon.Pokemon;
import types.Type;

public class Pikachu extends Pokemon implements ZMove {
	private String name;
	private int ZMovePower;

	public Pikachu(int level, Type primaryType) {
		super(level, primaryType);
	}

	public Pikachu(int level, Type primaryType, String name) {
		super(level, primaryType);
		this.name = name;
	}

	@Override
	public void setDamage() {
		this.ZMovePower = this.getLevel()*100;
	}

	@Override
	public int getDamage() {
		return this.ZMovePower;
	}

	@Override
	public Type getZMoveType() {
		return this.getPrimaryType();
	}
}