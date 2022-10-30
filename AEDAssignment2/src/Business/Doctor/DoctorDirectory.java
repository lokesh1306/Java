/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Doctor;


import java.util.ArrayList;

/**
 *
 * @author rajanikshithkatta
 */
public class DoctorDirectory {
     ArrayList<Doctor> docD;
     public DoctorDirectory(){
         docD = new ArrayList();
     }
     public void addDoctor(Doctor D){
         docD.add(D);
     }
     public void deleteDoctor(Doctor D){
         docD.remove(D);
     }

     public ArrayList<Doctor> returnDoctorDetails(){
         return docD;
     }
}
