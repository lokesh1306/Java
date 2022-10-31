/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.UserAccount;


import Business.Patient.Patient;
import Business.Role.Role;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author admin
 */
public class UserAccountDirectory {
    
    private ArrayList<UserAccount> userAccountList;

    public UserAccountDirectory() {
        userAccountList = new ArrayList();
    }

    public ArrayList<UserAccount> getUserAccountList() {
        return userAccountList;
    }
    
    public UserAccount authenticateUser(String username, String password){
        for (UserAccount ua : userAccountList)
            if (ua.getUsername().equals(username) && ua.getPassword().equals(password)){
                return ua;
            }
        return null;
    }
    
    public UserAccount createUserAccount(String username, String password, Patient patient, Role role){
        UserAccount userAccount = new UserAccount();
        userAccount.setUsername(username);
        userAccount.setPassword(password);
        userAccount.setPatient(patient);
        userAccount.setRole(role);
        System.out.println(role);
         System.out.println("I am here");
        
        userAccountList.add(userAccount);
        return userAccount;
    }
    
    public boolean checkIfUsernameIsUnique(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return false;
        }
        return true;
    }
    
    public UserAccount getUserAccount(String username){
        for (UserAccount ua : userAccountList){
            if (ua.getUsername().equals(username))
                return ua;
        }
        return null;
    }
    
    public void deleteUserAccount(UserAccount inputUserAcc){
        Iterator<UserAccount> itr = userAccountList.iterator();
        while (itr.hasNext()) {
            UserAccount ua = itr.next();
            if (ua.getUsername().equals(inputUserAcc.getUsername())) {
                itr.remove();
            }
        }
    }
}
