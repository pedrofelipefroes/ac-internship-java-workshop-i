package types;

import java.util.Set;

public abstract class Type {
	private String name;
	private Set<String> resistances;
	private Set<String> weaknesses;

	public Type (String name, Set<String> resistances, Set<String> weaknesses) {
		this.name = name;
		this.resistances = resistances;
		this.weaknesses = weaknesses;
	}

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Set<String> getResistances() {
		return this.resistances;
	};

	public abstract void setResistances(Set<Type> resistances);

	public Set<String> getWeaknesses() {
		return this.weaknesses;
	};

	public abstract void setWeaknesses(Set<Type> weaknesses);

	@Override
	public String toString() {
		return this.name;
	}
}