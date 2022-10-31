/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Hospital;

import Business.Doctor.Doctor;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class Hospital {
   
    private String Name;
    private String ID;
    private String Address;
    private String PhoneNumber;
    private String Community;
    private String City;
    ArrayList<Doctor> dc;
    public Hospital(){
        dc = new ArrayList<Doctor>();
    }
    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getAddress() {
        return Address;
    }

    public void setAddress(String Address) {
        this.Address = Address;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String PhoneNumber) {
        this.PhoneNumber = PhoneNumber;
    }

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
     public ArrayList<Doctor> returnDoctorDetails(){
        return dc;
    }
         public void addDoctor(Doctor d){
        dc.add(d);
    }
   public void deleteHospital(Doctor d){
        dc.remove(d);
    }
    @Override
    public String toString(){
        return Name;
    }
}
