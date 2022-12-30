package com.accenture;

public class Address {
 private String location;

 public Address(String location) {
  super();
  this.location = location;
 }

 @Override
 public String toString() {
  return "Address :" + location + "\n";
 }
 
 public String getLocation() {
  return location;
 }
}

