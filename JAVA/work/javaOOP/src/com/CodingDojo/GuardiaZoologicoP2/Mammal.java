package com.CodingDojo.GuardiaZoologicoP2;

public class Mammal{
	private int energyLevel;

	public Mammal() {
		this.energyLevel=100;
	}

	public int getEnergyLevel() {
		return energyLevel;
	}

	public void setEnergyLevel(int energyLevel) {
		this.energyLevel = energyLevel;
	}
	public double displayEnergy() {
		System.out.println("La energia actual del Mammal es; "+this.energyLevel);
		return energyLevel;
	}
}
