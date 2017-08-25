package com.friendsbook.data.spi.model;

import javax.persistence.Column;
import javax.persistence.Embeddable;

import com.friendsbook.data.spi.IAddress;

@Embeddable
public class Address implements IAddress {

	/** Default serial version id */
	private static final long serialVersionUID = 1L;

	@Column(name="first_address_line")
	private String firstAddressLine;
	
	@Column(name="second_address_line")
	private String secondAddressLine;
	
	@Column(name="third_address_line")
	private String thirdAddressLine;
	
	@Column(name="city")
	private String city;
	
	@Column(name="landmark")
	private String landMark;
	
	@Column(name="zipCode")
	private String zipCode;
	
	@Column(name="state")
	private String state;
	
	@Column(name="country")
	private String country;

	@Override
	public void setFirstAddressLine(String firstAddressLine) {
		this.firstAddressLine = firstAddressLine;
	}

	@Override
	public void setSecondAddressLine(String secondAddressLine) {
		this.secondAddressLine = secondAddressLine;
	}

	@Override
	public void setThirdAddressLine(String thirdAddressLine) {
		this.thirdAddressLine = thirdAddressLine;
	}

	@Override
	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public void setLandMark(String landMark) {
		this.landMark = landMark;
	}

	@Override
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}

	@Override
	public void setState(String state) {
		this.state = state;
	}

	@Override
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String getFirstAddressLine() {
		return this.firstAddressLine;
	}

	@Override
	public String getSecondAddressLine() {
		return this.secondAddressLine;
	}

	@Override
	public String getThirdAddressLine() {
		return this.thirdAddressLine;
	}

	@Override
	public String getCity() {
		return this.city;
	}

	@Override
	public String getLandMark() {
		return this.landMark;
	}

	@Override
	public String getZipCode() {
		return this.zipCode;
	}

	@Override
	public String getState() {
		return this.state;
	}

	@Override
	public String getCountry() {
		return this.country;
	}
}