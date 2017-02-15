package pokemon;

public abstract class Pokemon {
	private int level;
	private String primaryType;
	private String secondaryType;

	public Pokemon(int level) {
		this.level = level;
	}

	public int getLevel() {
		return level;
	}

	public String getPrimaryType() {
		return primaryType;
	}

	protected void setPrimaryType(String primaryType) {
		this.primaryType = primaryType;
	}

	public String getSecondaryType() {
		return secondaryType;
	}

	protected void setSecondaryType(String secondaryType) {
		this.secondaryType = secondaryType;
	}

	public String getType() {
		if(this.secondaryType == null) {
			return this.getPrimaryType();
		} else {
			return this.getPrimaryType() + "/" + this.getSecondaryType();
		}
	}

	public abstract void displayInfo();
}