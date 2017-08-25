package com.friendsbook.data.spi;

import java.util.List;

public interface IUser extends IModel {

	void setUserName(String userName);
	void setFirstName(String firstName);
	void setLastName(String lastName);
	void setAge(int age);
	void setGender(String gender);
	void setEmail(String email);
	void setPhone(String phone);
	void setAddress(IAddress address);
	void setFriends(List<IUser> friends);
	void setBefriend(List<IUser> befriend);
	
	String getUserName();
	String getFirstName();
	String getLastName();
	int getAge();
	String getGender();
	String getEmail();
	String getPhone();
	IAddress getAddress();
	List<IUser> getFriends();
	List<IUser> getBefriend();
}