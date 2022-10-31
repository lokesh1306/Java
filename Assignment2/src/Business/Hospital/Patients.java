/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Hospital;

import Business.UserAccount.UserAccount;

/**
 *
 * @author admin
 */
public class Patients {
    private String name;
    private String userName;
    private String userPassword;
    private String Community;
    private String City;
    private String phoneNumber;
    private String Gender;
    private int Age;

    public int getVisitCount() {
        return VisitCount;
    }

    public void setVisitCount(int VisitCount) {
        this.VisitCount = VisitCount;
    }

    public String getLastVisit() {
        return LastVisit;
    }

    public void setLastVisit(String LastVisit) {
        this.LastVisit = LastVisit;
    }

    public boolean isAbTemp() {
        return AbTemp;
    }

    public void setAbTemp(boolean AbTemp) {
        this.AbTemp = AbTemp;
    }

    public boolean isAbWt() {
        return AbWt;
    }

    public void setAbWt(boolean AbWt) {
        this.AbWt = AbWt;
    }

    public boolean isAbBP() {
        return AbBP;
    }

    public void setAbBP(boolean AbBP) {
        this.AbBP = AbBP;
    }

    public boolean isAbResp() {
        return AbResp;
    }

    public void setAbResp(boolean AbResp) {
        this.AbResp = AbResp;
    }
    
    int VisitCount;
    String LastVisit;
    boolean AbTemp;
    boolean AbWt;
    boolean AbBP;
    boolean AbResp;

    public String getCommunity() {
        return Community;
    }

    public void setCommunity(String Community) {
        this.Community = Community;
    }

    public String getCity() {
        return City;
    }

    public void setCity(String City) {
        this.City = City;
    }
    private String address;
    UserAccount ua;
    
    public Patients(UserAccount ua){
       this.ua = ua; 
       this.userName = ua.getUsername();
       this.userPassword = ua.getPassword();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserPassword() {
        return userPassword;
    }

    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public UserAccount getUa() {
        return ua;
    }

    public void setUa(UserAccount ua) {
        this.ua = ua;
    }
        public UserAccount returnUserAccount(){
        return this.ua;
    }

    public String getGender() {
        return Gender;
    }

    public void setGender(String Gender) {
        this.Gender = Gender;
    }

    public int getAge() {
        return Age;
    }

    public void setAge(int Age) {
        this.Age = Age;
    }
        
    
        @Override
    public String toString() {
        return name;
    }
    
}
