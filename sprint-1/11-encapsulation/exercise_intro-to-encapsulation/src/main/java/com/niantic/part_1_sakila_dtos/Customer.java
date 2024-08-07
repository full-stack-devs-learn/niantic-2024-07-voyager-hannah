package com.niantic.part_1_sakila_dtos;

public class Customer {
    private int customerId;
    private String FirstName;
    private String LastName;
    private String Email;
    private String Address;
    private String Zip;
    private String City;
    private String Country;
    private String Phone;
    private String State;


    public Customer() {

    }

    public Customer(int customerId, String FirstName, String LastName, String Email,
                    String Address, String Zip, String City, String Country, String Phone, String State) {

        this.customerId = customerId;
        this.FirstName = FirstName;
        this.LastName = LastName;
        this.Email = Email;
        this.Address = Address;
        this.Zip = Zip;
        this.City = City;
        this.Country = Country;
        this.Phone = Phone;
        this.State = State;
    }


    public int getCustomerId() {return customerId;}

    public void setCustomerId(int customerId) {this.customerId = customerId;}

    public String getFirstName() {return FirstName;}

    public void setFirstName(String FirstName) { this.FirstName = FirstName;}

    public String getLastName() {return LastName;}

    public void setLastName(String LastName) {this.LastName = LastName;}

    public String getEmail() {return Email;}

    public void setEmail(String Email) {this.Email = Email;}

    public String getAddress() {return Address;}

    public void setAddress(String Address) {this.Address = Address;}

    public String getZip() {return Zip;}

    public void setZip(String Zip) { this.Zip = Zip;}

    public String getCity() {return City;}

    public void setCity(String customerCity) {this.City = customerCity;}

    public String getCountry() {return Country;}

    public void setCountry(String Country) {this.Country = Country;}

    public String getPhone() {return Phone;}

    public void setPhone(String Phone) {this.Phone = Phone;}

    public String getState() {return State;}

    public void setState(String state) {this.State = State;}

    public String getFullName() {return FirstName + " " + LastName;}

}


