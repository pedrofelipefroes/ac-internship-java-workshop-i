package pokemon;

import moves.Move;
import types.Type;

import java.util.Set;

public abstract class Pokemon {
	private int level;
	private Type primaryType;
	private Type secondaryType;

	public Type getPrimaryType() {
		return this.primaryType;
	}

	public Type getSecondaryType() {
		return this.secondaryType;
	}

	public String getType() {
		if (secondaryType == null) return this.getPrimaryType().toString();
		else return this.getPrimaryType().toString() + "/" + this.secondaryType.toString();
	}
}