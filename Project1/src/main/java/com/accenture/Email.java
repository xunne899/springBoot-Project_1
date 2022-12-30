package com.accenture;

public class Email {
 private String email;

 public Email(String email) {
  super();
  this.email = email;
 }

 @Override
 public String toString() {
  return "Email :" + email + "\n";
 }
 
 public String getEmail() {
  return email;
 }
}

