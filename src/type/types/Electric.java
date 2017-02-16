package type.types;

import java.util.Set;
import java.util.HashSet;

import type.Type;

public class Electric extends Type {
	private Set<String> resistances = new HashSet<String>();
	private Set<String> weaknesses = new HashSet<String>();

	public Electric() {
		this.weaknesses.add("Ground");
		this.resistances.add("Electric");
		this.resistances.add("Flying");
	}

	public Set<String> getResistances() {
		return this.resistances;
	}

	public Set<String> getWeaknesses() {
		return this.weaknesses;
	}
}