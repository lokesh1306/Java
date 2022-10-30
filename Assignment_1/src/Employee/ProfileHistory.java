/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Employee;

import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class ProfileHistory {
    
    private ArrayList<Profile> history;
    
    public ProfileHistory(){
        
        this.history = new ArrayList<Profile>();
    }

    public ArrayList<Profile> getHistory() {
        return history;
    }

    public void setHistory(ArrayList<Profile> history) {
        this.history = history;
    }
    public Profile addNewProfile(){
        
        Profile newProfile = new Profile();
        history.add(newProfile);
        return newProfile;
        
    }
    public void deleteProfile(Profile pro) {
        history.remove(pro);
    }
}
