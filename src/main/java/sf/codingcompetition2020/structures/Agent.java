package sf.codingcompetition2020.structures;

import java.lang.reflect.Field;

public class Agent {
	
	private int agentId;
	private String area;
	private String language;
	private String firstName;
	private String lastName;

	public Agent(int agentId, String area, String language, String firstName, String lastName) {
		this.agentId = agentId;
		this.area = area;
		this.language = language;
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public int getAgentId() {
		return agentId;
	}

	public String getArea() {
		return area;
	}

	public String getLanguage() {
		return language;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String toString() {
		return null;
	}

	public boolean compareFilledFields(String agentId, String area, String language, String firstName, String lastName) {

		if (	(agentId.isBlank() || this.agentId == (Integer.parseInt(agentId)))
				&& (area.isBlank() || this.area.equals(area))
				&& (language.isBlank() || this.language.equals(language))
				&& (firstName.isBlank() || this.firstName.equals(firstName))
				&& (lastName.isBlank() || this.lastName.equals(lastName)) ) {
		} else {
			return false;
		}

		return true;

	}
	
}
