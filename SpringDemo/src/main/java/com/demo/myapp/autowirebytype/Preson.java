package com.demo.myapp.autowirebytype;

public class Preson {
	private Ability ability;

	public Ability getAbility() {
		return ability;
	}

	public void setAbility(Ability ability) {
		this.ability = ability;
	}

	@Override
	public String toString() {
		return "Preson [ability=" + ability + "]";
	}

}