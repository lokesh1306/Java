/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Customer;

import Business.Doctor.Doctor;
import java.util.ArrayList;

/**
 *
 * @author harold
 */
public class HospitalDirectory {
    
    ArrayList<Hospital> cd;
    
    public HospitalDirectory(){
        cd = new ArrayList<Hospital>();
        
    }
    
    public void addHospital(Hospital c){
        cd.add(c);
    }
    
    public void setHospitalDirectory(ArrayList<Hospital> H){
        this.cd = H;
    }
    public void deleteHospital(Hospital c){
        cd.remove(c);
    }
    
    public ArrayList<Hospital> returnHospitalDetails(){
        return cd;
    }
    
        

    public Hospital getHospital(String name){
        for(Hospital hospital: cd){
            if(hospital.getName().equalsIgnoreCase(name)){
                return hospital;
            }
        }
        return null;
    }
    
}
