package com.facebook.data.spi;

import java.io.Serializable;

public interface IModel extends Serializable {
	String creationDate();
	String modifiedDate();
	void setModifiedDate(String date);
}