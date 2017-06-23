package io.github.xinyangpan.spring.data.restdemo.persistent.po;

import javax.persistence.Embeddable;

import org.hibernate.validator.constraints.NotEmpty;

@Embeddable
public class Name {

	@NotEmpty
	private String firstName;
	@NotEmpty
	private String lastName;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Name [firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append("]");
		return builder.toString();
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

}
