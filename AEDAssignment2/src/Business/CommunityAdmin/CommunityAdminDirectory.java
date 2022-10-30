/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.CommunityAdmin;

import java.util.ArrayList;

/**
 *
 * @author rajanikshithkatta
 */
public class CommunityAdminDirectory {
    ArrayList<CommunityAdmin> Cad;
    
    public CommunityAdminDirectory(){
        Cad = new ArrayList<>();
    }
    public void addCommunityAdmin(CommunityAdmin c){
        Cad.add(c);
    }
    public void deleteCommunityAdmin(CommunityAdmin c){
        Cad.remove(c);
    }
    
    public ArrayList<CommunityAdmin> returnCommunityAdminDetails(){
        return Cad;
    }
    
    public CommunityAdmin getCommunityAdmins(String username){
        for(CommunityAdmin communityAdmin: Cad){
            if(communityAdmin.getUserName().equalsIgnoreCase(username)){
                return communityAdmin;
            }
        }
        return null;
    }
}
