/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Hospital;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class PatientsDirectory {
     ArrayList<Patients> cd;
    
    public PatientsDirectory(){
        cd = new ArrayList<Patients>();
        //cd.add("dftgy","rrr","y","y","y",9);
    }
    
    public void addPatients(Patients c){
        cd.add(c);
    }
    
    public void deletePatients(Patients c){
        cd.remove(c);
    }
    
    public ArrayList<Patients> returnPatientsDetails(){
        return cd;
    }
    
    public Patients getPatients(String name){
        for(Patients patients: cd){
            if(patients.getName().equalsIgnoreCase(name)){
                return patients;
            }
        }
        return null;
    }
}
