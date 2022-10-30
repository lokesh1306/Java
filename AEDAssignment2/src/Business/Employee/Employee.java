/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Business.Employee;

/**
 *
 * @author Raja Nikshith
 */
public class Employee {
    
    private String name;
    private final int id;
    private static int count = 1;

    public Employee() {
        id = count;
        count++;
    }

    public int getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    
    public String getName() {
        return name;
    }
    
    
    public static int getCount() {
        return count;
    }


    @Override
    public String toString() {
        return name;
    }
    
    
}
