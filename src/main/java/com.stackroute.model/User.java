package com.stackroute.model;

import org.springframework.stereotype.Component;

@Component
    public class User {
        private String firstName;
        private String lastName;
        private String userName;
        private String email;
        private String password;

        public void setFirstName(String firstName){
            this.firstName=firstName;
        }

        public void setLastName(String lastName){
            this.lastName=lastName;
        }

        public void setUserName(String userName){
            this.userName=userName;
        }

        public void setEmail(String email){
            this.email=email;
        }

        public void setPassword(String password){
            this.password=password;
        }





        public String getFirstName(){
            return firstName;
        }

        public String getLastName(){
            return lastName;
        }

        public String getUserName(){
            return userName;
        }

        public String getEmail(){
            return email;
        }

        public String getPassword(){
            return password;
        }

    }


