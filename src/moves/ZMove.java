package moves;

import types.Type;

public abstract interface ZMove {
	public abstract void setDamage();
	public abstract int getDamage();
	public abstract Type getZMoveType();
}