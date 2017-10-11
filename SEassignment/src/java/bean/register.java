/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bean;


import javax.faces.bean.ManagedBean;  
import javax.faces.bean.RequestScoped; 
      

/**
 *
 * @author harshinijayakumar
 */
@ManagedBean (name="register",eager=true) 
@RequestScoped
public class register {
  private String firstname;
  private String lastname;
    private String address;
  private String phonenumber;
  private String email;
  private String username;
  private String password;
  private String message;
  public String getmessage() {
  return message;
  }
  public void setmessage(String message) {
  this.message = message;
  }
  public String getfirstname() {
  return firstname;
  }
  public void setfirstname(String firstname) {
  this.firstname = firstname;
  }
  public String getlastname() {
  return lastname;
  }
  public void setlastname(String lastname) {
  this.lastname = lastname;
  }
  public String getaddress() {
  return address;
  }
  public void setaddress(String address) {
  this.address = address;
  }
  public String getphonenumber() {
  return phonenumber;
  }
  public void setphonenumber(String phonenumber) {
  this.phonenumber = phonenumber;
  }
  public String getemail() {
  return email;
  }
  public void setemail(String email) {
  this.email = email;
  }
  public String getusername() {
  return username;
  }
  public void setusername(String username) {
  this.username = username;
  }
  public String getpassword() {
  return password;
  }
  public void setpassword(String password){
 this.password = password;
  }
  public String register(){
         message="Successfully logged-in";
          return "responsereg";
                }
      }
          

