/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Encounter;


import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class EncounterHistory {
    private ArrayList<Encounter> EList;
     
    public EncounterHistory(){
        this.EList=new ArrayList<>();  
        
    }

    public ArrayList<Encounter> getEList() {
        return EList;
    }

    public void setEList(ArrayList<Encounter> EList) {
        this.EList = EList;
    }
    
    public void addNewEncounter(Encounter Enc) {
        
        EList.add(Enc);
      
    }
    public void deleteCab(Encounter selectedEnc) {
        EList.remove(selectedEnc);
    }
    
}
