/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.HospitalAdmin;

import Business.Hospital.Hospital;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class HospitalAdminDirectory {
    ArrayList<HospitalAdmin> Had;
    
    public HospitalAdminDirectory(){
        Had = new ArrayList<>();
    }
    public void addHospitalAdmin(HospitalAdmin h){
        Had.add(h);
    }
    public void deleteHospitalAdmin(HospitalAdmin h){
        Had.remove(h);
    }
    
    public ArrayList<HospitalAdmin> returnHospitalAdminDetails(){
        return Had;
    }
    
    public HospitalAdmin getHospitalAdmins(String username){
        for(HospitalAdmin hospitalAdmin: Had){
            if(hospitalAdmin.getUserName().equalsIgnoreCase(username)){
                return hospitalAdmin;
            }
        }
        return null;
    }

    public void setHospitalAdminDirectory(ArrayList<Hospital> HAdmList) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
