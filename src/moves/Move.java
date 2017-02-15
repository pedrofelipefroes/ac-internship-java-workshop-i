package moves;

import types.Type;

public abstract class Move {
	private String name;
	private int power;
	private Type moveType;

	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPower() {
		return this.power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public Type getMoveType() {
		return this.moveType;
	}

	public void setMoveType(Type moveType) {
		this.moveType = moveType;
	}
}