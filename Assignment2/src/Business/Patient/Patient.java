package Business.Patient;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Patient {
    private String name;
    private final int id;
    private static int count = 1;
    
    public Patient(String name) {
        this.name = name;
        id = count;
        count++;
    
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }



    public static int getCount() {
        return count;
    }


    
        @Override
    public String toString() {
        return name;
    }
}
