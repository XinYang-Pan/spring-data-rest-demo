package io.github.xinyangpan.spring.data.restdemo.persistent.po;

import javax.persistence.Convert;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonIgnore;

import io.github.xinyangpan.spring.data.restdemo.core.enums.Gender;
import io.github.xinyangpan.spring.data.restdemo.persistent.code.Sex;
import io.github.xinyangpan.spring.data.restdemo.persistent.converter.GenderConverter;
import io.github.xinyangpan.spring.data.restdemo.persistent.converter.SexConverter;

@Entity
public class UserPo {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	private String username;
	@JsonIgnore
	private String password;
    @Convert(converter = GenderConverter.class)
	private Gender gender;
    @Convert(converter = SexConverter.class)
	private Sex sex;

	@NotEmpty
	private String firstName;
	@NotEmpty
	private String lastName;

	private String phone;
	private String email;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("UserPo [id=");
		builder.append(id);
		builder.append(", username=");
		builder.append(username);
		builder.append(", password=");
		builder.append(password);
		builder.append(", gender=");
		builder.append(gender);
		builder.append(", sex=");
		builder.append(getSex());
		builder.append(", firstName=");
		builder.append(firstName);
		builder.append(", lastName=");
		builder.append(lastName);
		builder.append(", phone=");
		builder.append(phone);
		builder.append(", email=");
		builder.append(email);
		builder.append("]");
		return builder.toString();
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String userName) {
		this.username = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Gender getGender() {
		return gender;
	}

	public void setGender(Gender gender) {
		this.gender = gender;
	}

	public Sex getSex() {
		return sex;
	}

	public void setSex(Sex sex) {
		this.sex = sex;
	}

}
