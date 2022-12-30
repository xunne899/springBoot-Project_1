package com.accenture;

public class Owner {
 private String name;
 private int contact;
 private Email email;
 private Address address;
 
 

 public String getName() {
  return name;
 }
 public void setName(String name) {
  this.name = name;
 }
 
 public int getContact() {
		return contact;
	}
	public void setContact(int contact) {
		this.contact = contact;
	}
 
 
 public Address getAddress() {
  return address;
 }
 
 public void setAddress(Address address) {
	  this.address = address;
	 }
	 
 
 public Email getEmail() {
	return email;
}
public void setEmail(Email email) {
	this.email = email;
}

 @Override
 public String toString() {
  return "Owner Name:" + name + ", Owner Contact: " + contact + ", " + address + ", " + email;
 }
 
 public void ownerInfo() {
  System.out.println("Owner Name: " + name);
  System.out.println("Contact Number: " + contact);
  System.out.println("Email: " + email.getEmail());
  System.out.println("Property For Sale: " + address.getLocation());

 }

 
 
}
