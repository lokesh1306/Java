/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Employee;


import java.util.ArrayList;
import java.util.Iterator;
/**
 *
 * @author rajanikshithkatta
 */
public class PatientDirectory {
     private ArrayList<Patient> patientList;

    public PatientDirectory() {
        patientList = new ArrayList();
    }
         public ArrayList<Patient> getPatientList() {
        return patientList;
    }
    
    public Patient createPatient(String name){
        Patient patient = new Patient(name);
        patient.setName(name);
        patientList.add(patient);
        return patient;
    }
    
    public void deleteEmployee(String name){
        Iterator< Patient> itr =  patientList.iterator();
        while (itr.hasNext()) {
          Patient ek = itr.next();
          if (ek.getName().equals(name)) {
            itr.remove();
          }
        }

    }
}
