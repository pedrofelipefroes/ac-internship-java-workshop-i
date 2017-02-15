package types;

import java.util.Set;

public abstract class Type {
	private String name;
	private Set<Type> resistances;
	private Set<Type> weaknesses;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public abstract Set<Type> getResistances();

	public abstract void setResistances(Set<Type> resistances);

	public abstract Set<Type> getWeaknesses();

	public abstract void setWeaknesses(Set<Type> weaknesses);

	@Override
	public String toString() {
		return this.name;
	}
}