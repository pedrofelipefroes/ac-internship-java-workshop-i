package types.type;

import types.Type;

import java.util.Set;

public class Electric extends Type {

	public Electric(String name, Set<String> resistances, Set<String> weaknesses) {
		super(name, resistances, weaknesses);
	}

	@Override
	public void setResistances(Set<Type> resistances) {

	}

	@Override
	public void setWeaknesses(Set<Type> weaknesses) {

	}
}
