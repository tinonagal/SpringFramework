package com.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CabBook {
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private int cbid;
private String cname;
private String tripid;
public int getCbid() {
	return cbid;
}
public void setCbid(int cbid) {
	this.cbid = cbid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getTripid() {
	return tripid;
}
public void setTripid(String tripid) {
	this.tripid = tripid;
}
@Override
public String toString() {
	return "CabBook [cbid=" + cbid + ", cname=" + cname + ", tripid=" + tripid + "]";
}

}
