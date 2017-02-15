package pokemon;

import types.Type;

public class Pokemon {
	private int level;
	private Type primaryType;
	private Type secondaryType;

	public Pokemon(int level, Type primaryType) {
		this.level = level;
		this.primaryType = primaryType;
	}

	public Pokemon(int level, Type primaryType, Type secondaryType) {
		this.level = level;
		this.primaryType = primaryType;
		this.secondaryType = secondaryType;
	}

	public int getLevel() {
		return level;
	}

	public void setLevel(int level) {
		this.level = level;
	}

	public Type getPrimaryType() {
		return primaryType;
	}

	public Type getSecondaryType() {
		return secondaryType;
	}

	public String getType() {
		if(this.secondaryType == null) {
			return this.getPrimaryType().toString();
		} else {
			return this.getPrimaryType().toString() + "/" + this.getSecondaryType().toString();
		}
	}
}