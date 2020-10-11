package sf.codingcompetition2020.structures;

import java.util.ArrayList;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Customer {
	private int customerId;
	private String firstName;
	private String lastName;
	private int age;
	private String area;
	private int agentId;
	private short agentRating;
	private String primaryLanguage;
	private List<Dependent> dependents;
	private boolean homePolicy;
	private boolean autoPolicy;
	private boolean rentersPolicy;
	private String totalMonthlyPremium;
	private short yearsOfService;
	private Integer vehiclesInsured;

	public Customer(int customerId,
					String firstName,
					String lastName,
					int age,
					String area,
					int agentId,
					short agentRating,
					String primaryLanguage,
					List<Dependent> dependents,
					boolean homePolicy,
					boolean autoPolicy,
					boolean rentersPolicy,
					String totalMonthlyPremium,
					short yearsOfService,
					Integer vehiclesInsured) {
		this.customerId = customerId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.area = area;
		this.agentId = agentId;
		this.agentRating = agentRating;
		this.primaryLanguage = primaryLanguage;
		this.dependents = dependents;
		this.homePolicy = homePolicy;
		this.autoPolicy = autoPolicy;
		this.rentersPolicy = rentersPolicy;
		this.totalMonthlyPremium = totalMonthlyPremium;
		this.yearsOfService = yearsOfService;
		this.vehiclesInsured = vehiclesInsured;
	}

	public int getCustomerId() {
		return customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getAge() {
		return age;
	}

	public String getArea() {
		return area;
	}

	public int getAgentId() {
		return agentId;
	}

	public short getAgentRating() {
		return agentRating;
	}

	public String getPrimaryLanguage() {
		return primaryLanguage;
	}

	public List<Dependent> getDependents() {
		return dependents;
	}

	public boolean isHomePolicy() {
		return homePolicy;
	}

	public boolean isAutoPolicy() {
		return autoPolicy;
	}

	public boolean isRentersPolicy() {
		return rentersPolicy;
	}

	public String getTotalMonthlyPremium() {
		return totalMonthlyPremium;
	}

	public short getYearsOfService() {
		return yearsOfService;
	}

	public Integer getVehiclesInsured() {
		return vehiclesInsured;
	}

	public boolean compareFilledFields(String customerId,
									   String firstName,
									   String lastName,
									   String age,
									   String area,
									   String agentId,
									   String agentRating,
									   String primaryLanguage,
									   String homePolicy,
									   String autoPolicy,
									   String rentersPolicy,
									   String totalMonthlyPremium,
									   String yearsOfService,
									   String vehiclesInsured) {

		if (	(customerId.isBlank() || this.customerId == (Integer.parseInt(customerId)))
				&& (firstName.isBlank() || this.firstName.equals(firstName))
				&& (lastName.isBlank() || this.lastName.equals(lastName))
				&& (age.isBlank() || this.age == (Integer.parseInt(age)))
				&& (area.isBlank() || this.area.equals(area))
				&& (agentId.isBlank() || this.agentId == (Integer.parseInt(agentId)))
				&& (agentRating.isBlank() || this.agentRating == (Short.parseShort(agentRating)))
				&& (homePolicy.isBlank() || this.homePolicy == (Boolean.parseBoolean(homePolicy)))
				&& (autoPolicy.isBlank() || this.autoPolicy == (Boolean.parseBoolean(autoPolicy)))
				&& (rentersPolicy.isBlank() || this.rentersPolicy == (Boolean.parseBoolean(rentersPolicy)))
				&& (totalMonthlyPremium.isBlank() || this.totalMonthlyPremium.equals(totalMonthlyPremium))
				&& (yearsOfService.isBlank() || this.yearsOfService == (Short.parseShort(yearsOfService)))
				&& (vehiclesInsured.isBlank() || this.vehiclesInsured == (Integer.parseInt(vehiclesInsured))) ) {
		} else {
			return false;
		}

		return true;

	}

}
