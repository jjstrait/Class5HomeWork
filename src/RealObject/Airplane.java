/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package RealObject;

/**
 *
 * @author jstra
 */
public abstract class Airplane extends Vehicle {

    private String yearMade;

    public abstract void wingType();

    public abstract void takeOff();

    public abstract void land();

    public void setYearMade(String year) {
        this.yearMade = yearMade;
    }

    public String getYearMade() {
        return yearMade;
    }
}
