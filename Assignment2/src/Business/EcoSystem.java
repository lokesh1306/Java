/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

import Business.CommunityAdmin.CommunityAdminDirectory;

import Business.Hospital.PatientsDirectory;

import Business.Patient.PatientDirectory;


import Business.Role.CommunityAdminRole;
import Business.Role.PatientRole;
import Business.Role.DoctorRole;
import Business.Role.Role;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import Business.UserAccount.UserAccountDirectory;
import java.util.ArrayList;
import Business.ConfigureASystem;
import Business.Hospital.Hospital;
import Business.Hospital.HospitalDirectory;
import Business.Doctor.DoctorDirectory;
import Business.Encounter.EncounterHistory;
import Business.HospitalAdmin.HospitalAdminDirectory;
/**
 *
 * @author admin
 */
public class EcoSystem extends Organization{
    
    private static EcoSystem business;
    
    private PatientsDirectory patientsDirectory;
    private PatientDirectory patientDirectory;

    private UserAccountDirectory userAccountDirectory;
    private DoctorDirectory doctorDirectory;
    private CommunityAdminDirectory communityAdminDirectory;
    private HospitalDirectory hospitalDirectory;
    private HospitalAdminDirectory hospitalAdminDirectory;
    private EncounterHistory encounterHistory;
    private String loginUserName;

    public void setLoginUserName(String loginUserName) {
        this.loginUserName = loginUserName;
    }

    public EcoSystem( PatientsDirectory patientsDirectory, PatientDirectory patientDirectory) {
        System.out.println("Inside public constructuer");
       
        this.patientsDirectory = patientsDirectory;
       
        this.patientDirectory = patientDirectory;
    }
    
//    public EcoSystem(RestaurantDirectory restaurantDirectory, 
//            PatientsDirectory patientsDirectory, 
//            DeliveryManDirectory deliveryManDirectory, OrderDirectory orderDirectory,PatientDirectory patientDirectory) {
//        System.out.println("Inside public constructuer");
//        this.restaurantDirectory = restaurantDirectory;
//        this.patientsDirectory = patientsDirectory;
//        this.deliveryManDirectory = deliveryManDirectory;
//        this.orderDirectory = orderDirectory;
//        this.patientDirectory = patientDirectory;
//    }
    
    public EcoSystem(){
        super("Restaurant Delivery");
        this.patientsDirectory = new PatientsDirectory();
      
        
        this.userAccountDirectory = new UserAccountDirectory();
        this.patientDirectory = new PatientDirectory();
        this.doctorDirectory = new DoctorDirectory();
        this.communityAdminDirectory = new CommunityAdminDirectory();
        this.hospitalDirectory = new HospitalDirectory();
        this.hospitalAdminDirectory = new HospitalAdminDirectory();
        this.encounterHistory = new EncounterHistory();
        
       // networkList=new ArrayList<Network>();
    }
    
   
    
    public static EcoSystem getInstance(){
        if(business==null){
             System.out.println("hi raja in ecosystem");
            business= new EcoSystem();
            
            
        }
        return business;
    }
    
    @Override
    public ArrayList<Role> getSupportedRole() {
        ArrayList<Role> roleList=new ArrayList<Role>();
        roleList.add(new SystemAdminRole());
        roleList.add(new PatientRole());
        roleList.add(new CommunityAdminRole());
        roleList.add(new DoctorRole());
        return roleList;
    }
    

    
    public boolean checkIfUserIsUnique(String userName){
       UserAccountDirectory usersList = business.getUserAccountDirectory();
        ArrayList<UserAccount> userAccounts = usersList.getUserAccountList();
        
        for(UserAccount ua : userAccounts)
        {
            if(ua.getUsername().equals(userName))
                return false;
        }
        
       return true;
    }
    public String getLoginUserName(){
        return loginUserName;
    }
    
    public PatientsDirectory getPatientsDirectory() {
        return patientsDirectory;
    }
    public PatientDirectory getPatientDirectory() {
        return patientDirectory;
    }
    
    public HospitalDirectory getHospitalDirectory(){
        return hospitalDirectory;
    }
    public EncounterHistory getEncounterHistory(){
        return encounterHistory;
    }
    
    public void setHospitalDirectory(ArrayList<Hospital> HList){
        hospitalDirectory.setHospitalDirectory(HList);
    }
    
    public HospitalAdminDirectory getHospitalAdminDirectory(){
        return hospitalAdminDirectory;
    }
    
    public void setHospitalAdminDirectory(ArrayList<Hospital> HAdmList){
        hospitalAdminDirectory.setHospitalAdminDirectory(HAdmList);
    }
    
    public UserAccountDirectory getUserAccountDirectory() {
        return userAccountDirectory;
    }
    

    
    public DoctorDirectory getDoctorDirectory(){
        return doctorDirectory;
    }
    public CommunityAdminDirectory getCommunityAdminDirectory(){
        return communityAdminDirectory;
    }
    

    



    public boolean getCustomerDirectory() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}
