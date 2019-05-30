package com.example.webspring.entity;

import javax.persistence.Entity;
import javax.validation.constraints.*;


//@Entity

public class AppUser {
 // @NotNull
//  @Min(45)
 // @Max(100)
  @Size(min=2,max = 10)
   private  String login;
  @Pattern(regexp = "(?=.*\\d)(?=.*[a-z])(?=.*[A-Z]).{8,}",message = "Пароль должен..")
   private String pwd;

   public String getLogin() {
      return login;
   }

   public void setLogin(String login) {
      this.login = login;
   }

   public String getPwd() {
      return pwd;
   }

   public void setPwd(String pwd) {
      this.pwd = pwd;
   }
}
