package com.app.core;

public class AdharCard {
private String cardNo, location;

public AdharCard(String cardNo, String location) {
	super();
	this.cardNo = cardNo;
	this.location = location;
}

@Override
public String toString() {
	return "AdharCard [cardNo=" + cardNo + ", location=" + location + "]";
}



}
