package com.friendsbook.data.spi.model;
import java.util.List;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.facebook.data.spi.IAddress;
import com.facebook.data.spi.IUser;

@Entity
@Table(name="USERS")
public class User implements IUser {

	/** Default serial version id */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="user_id")
	private String id;
	
	@Column(name="user_name")
	private String userName;
	
	@Column(name="first_name")
	private String firstName;
	
	@Column(name="last_name")
	private String lastName;
	
	@Column(name="age")
	private int age;
	
	@Column(name="gender")
	private String gender;
	
	@Column(name="email")
	private String email;
	
	@Column(name="phone")
	private String phone;
	
	@Embedded
	private IAddress address;
	
	@ManyToMany(fetch=FetchType.LAZY)
	@JoinTable(name="USER_FRIENDS", joinColumns=@JoinColumn(name="user_id"), inverseJoinColumns=@JoinColumn(name="friend_id"))
	private List<IUser> friends;
	
	@ManyToMany(mappedBy="friends", fetch=FetchType.LAZY)
	private List<IUser> befriend;
	
	@Column(name="creation_date")
	private String creationDate;
	
	@Column(name="modified_date")
	private String modifiedDate;
	
	public User() { }

	@Override
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	@Override
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	@Override
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	@Override
	public void setAge(int age) {
		this.age = age;
	}

	@Override
	public void setGender(String gender) {
		this.gender = gender;
	}

	@Override
	public void setEmail(String email) {
		this.email = email;
	}

	@Override
	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Override
	public void setAddress(IAddress address) {
		this.address = address;
	}

	@Override
	public void setFriends(List<IUser> friends) {
		this.friends = friends;
	}

	@Override
	public void setBefriend(List<IUser> befriend) {
		this.befriend = befriend;
	}

	@Override
	public String creationDate() {
		return this.creationDate;
	}

	@Override
	public String modifiedDate() {
		return this.modifiedDate;
	}
	
	@Override
	public void setModifiedDate(String modifiedDate) {
		this.modifiedDate = modifiedDate;
	}
	
	@Override
	public String getUserName() {
		return this.userName;
	}

	@Override
	public String getFirstName() {
		return this.firstName;
	}

	@Override
	public String getLastName() {
		return this.lastName;
	}

	@Override
	public int getAge() {
		return this.age;
	}

	@Override
	public String getGender() {
		return this.gender;
	}

	@Override
	public String getEmail() {
		return this.email;
	}

	@Override
	public String getPhone() {
		return this.phone;
	}

	@Override
	public IAddress getAddress() {
		return this.address;
	}

	@Override
	public List<IUser> getFriends() {
		return this.friends;
	}

	@Override
	public List<IUser> getBefriend() {
		return this.befriend;
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(this.id, this.userName, this.firstName, this.lastName, this.address, this.email);
	}
	
	@Override
	public boolean equals(Object object) {
		return Objects.deepEquals(this, object);
	}
	
	@Override
	public String toString() {
		StringBuilder display = new StringBuilder();
		display.append("[").append("FirstName: " + firstName).append(", LastName: " + lastName);
		display.append("Email: " + email).append("]");
		return display.toString();
	}
}