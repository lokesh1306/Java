package Business;


import Business.Doctor.Doctor;

import Business.Patient.Patient;

import Business.Role.CommunityAdminRole;
import Business.Role.PatientRole;
import Business.Role.DoctorRole;
import Business.Role.SystemAdminRole;
import Business.UserAccount.UserAccount;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        //Create a network
        //create an enterprise
        //initialize some organizations
        //have some employees 
        //create user account
        System.out.println("hi raja");
        
        Patient patient  = system.getPatientDirectory().createPatient("patient");   
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", patient, new SystemAdminRole());
        System.out.println(ua);
        
        Patient doctor = system.getPatientDirectory().createPatient("doctor");
        UserAccount ua2 = system.getUserAccountDirectory().createUserAccount("doctor", "doctor", doctor, new SystemAdminRole());
        System.out.println(ua2);
//        Employee customer = system.getP().createEmployee(patient.getName());
//        UserAccount customerAccount = system.getUserAccountDirectory().createUserAccount("customer", "customer", customer, new CustomerRole());
//        Customer cus = new Customer(customerAccount);
//        cus.setAddress("Bankadsda snjadksd adsnk");
//        cus.setPhoneNumber(232132123);
//        system.getCustomerDirectory().addCustomer(cus);
//        
//        Employee delivery = system.getEmployeeDirectory().createEmployee("Delivery");
//        UserAccount deliveryAccount = system.getUserAccountDirectory().createUserAccount("delivery", "delivery", delivery, new DeliverManRole());
//        DeliveryMan deliveryAgent = new DeliveryMan(deliveryAccount);
//        deliveryAgent.setAddress("asdasd aasd nasdnkj");
//        deliveryAgent.setPhoneNumber(232132213);
//        deliveryAgent.setStatus("Available");
//        system.getDeliveryManDirectory().addDeliveryAgent(deliveryAgent);
//        
//        Employee restaurant = system.getEmployeeDirectory().createEmployee("Restaurant");
//        UserAccount restaurantAccount = system.getUserAccountDirectory().createUserAccount("restaurant", "restaurant", restaurant, new AdminRole());
//        
//        Restaurant restaurantData = new Restaurant("Buakra", "Alpasdj St","Borak",
//                                  900099909, restaurantAccount);
//        ArrayList<Item> itemList = new ArrayList<Item>();
//        itemList.add(new Item("Burrito", 9.90, "Buakra"));
//        Menu menuItems = new Menu();
//        menuItems.setMenu(itemList);
//        restaurantData.setMenu(menuItems);
//        system.getRestaurantDirectory().addRestaurant(restaurantData);
        
        return system;
    }
    
}
