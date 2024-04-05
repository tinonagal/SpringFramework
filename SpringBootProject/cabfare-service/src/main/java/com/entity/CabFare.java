package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CabFare {
@Id
private int cfid;
@Column(unique = true)
private String tripid;
private String cabtype;
private float amount;
public int getCfid() {
	return cfid;
}
public void setCfid(int cfid) {
	this.cfid = cfid;
}
public String getTripid() {
	return tripid;
}
public void setTripid(String tripid) {
	this.tripid = tripid;
}
public String getCabtype() {
	return cabtype;
}
public void setCabtype(String cabtype) {
	this.cabtype = cabtype;
}
public float getAmount() {
	return amount;
}
public void setAmount(float amount) {
	this.amount = amount;
}

}
