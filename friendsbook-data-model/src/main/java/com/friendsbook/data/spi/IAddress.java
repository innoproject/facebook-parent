package com.friendsbook.data.spi;

import java.io.Serializable;

public interface IAddress extends Serializable {

	void setFirstAddressLine(String firstAddressLine);
	void setSecondAddressLine(String secondAddressLine);
	void setThirdAddressLine(String thirdAddressLine);
	void setCity(String city);
	void setLandMark(String landMark);
	void setZipCode(String zipCode);
	void setState(String state);
	void setCountry(String country);
	
	String getFirstAddressLine();
	String getSecondAddressLine();
	String getThirdAddressLine();
	String getCity();
	String getLandMark();
	String getZipCode();
	String getState();
	String getCountry();
}