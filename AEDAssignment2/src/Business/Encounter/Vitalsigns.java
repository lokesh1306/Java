/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Business.Encounter;

/**
 *
 * @author vaishnavisai
 */
public class Vitalsigns {
    double temp;
    double weight;
    double BPsys;
    double BPdi;
    double Resprate;

    public double getBPsys() {
        return BPsys;
    }

    public void setBPsys(double BPsys) {
        this.BPsys = BPsys;
    }

    public double getBPdi() {
        return BPdi;
    }

    public void setBPdi(double BPdi) {
        this.BPdi = BPdi;
    }
    
    public double getTemp() {
        return temp;
    }

    public void setTemp(double temp) {
        this.temp = temp;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    

    public double getResprate() {
        return Resprate;
    }

    public void setResprate(double Resprate) {
        this.Resprate = Resprate;
    }
    
}
