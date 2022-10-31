/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Role;

import Business.EcoSystem;
import Business.UserAccount.UserAccount;
import javax.swing.JPanel;

import userinterface.HospitalAdminRole.HospitalAdminWorkAreaNewJPanel;

/**
 *
 * @author admin
 */
public class HospitalAdminRole extends Role {
    
    @Override
    public JPanel createWorkArea(JPanel userProcessContainer, UserAccount account, EcoSystem business) {
        return new HospitalAdminWorkAreaNewJPanel(userProcessContainer,account,business);//To change body of generated methods, choose Tools | Templates.
    }
}
