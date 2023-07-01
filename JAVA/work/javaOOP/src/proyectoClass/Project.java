package proyectoClass;

//Clase Project
public class Project {
	private String name;
	private String description;
	private double initialCost;

	public Project() {
	}

	public Project(String name) {
		this.name = name;
	}

	public Project(String name, String description) {
		this.name = name;
		this.description = description;
	}

	public String elevatorPitch() {
		return name + " (" + initialCost + "): " + description;
	}

	// Getter y Setter para name
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// Getter y Setter para description
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	// Getter y Setter para initialCost
	public double getInitialCost() {
		return initialCost;
	}

	public void setInitialCost(double initialCost) {
		this.initialCost = initialCost;
	}
}
