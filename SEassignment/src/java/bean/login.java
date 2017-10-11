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
@ManagedBean (name="login",eager=true) 
@RequestScoped
public class login {
  
  private String username;
  private String password;
    private String message;
  public String getmessage() {
  return message;
  }
  public void setmessage(String message) {
  this.message = message;
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
  public String login(){
      if(username.equals("admin") && password.equals("admin")){
         message="Successfully logged-in";
          return "response";
                }
      else 
      {
          message= "Unsuccessful login ";
          return "response";
      }
          
  }
  }

