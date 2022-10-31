/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Encounter;

import Business.Hospital.Patients;
import Business.UserAccount.UserAccount;

/**
 *
 * @author admin
 */
public class Encounter {
    Patients pt;
    Vitalsigns vs=new Vitalsigns();
    String VisitDate;
    UserAccount ua;

    public Patients getPt() {
        return pt;
    }

    public void setPt(Patients pt) {
        this.pt = pt;
    }

    public Vitalsigns getVs() {
        return vs;
    }

    public void setVs(Vitalsigns vs) {
        this.vs = vs;
    }

    public String getVisitDate() {
        return VisitDate;
    }

    public void setVisitDate(String VisitDate) {
        this.VisitDate = VisitDate;
    }

    public UserAccount getUa() {
        return ua;
    }

    public void setUa(UserAccount ua) {
        this.ua = ua;
    }
    
    public Encounter(){
      
        
    }
    
     @Override
    public String toString() {
        return pt.getName();
    }
}
