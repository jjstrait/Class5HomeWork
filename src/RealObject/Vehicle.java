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
public abstract class Vehicle {

    private String modelNumber;

    public String getModelNumnber() {
        return modelNumber;
    }

    public void setModelNumber(String modelNumber) {
        this.modelNumber = modelNumber;
    }

    public abstract void move();

}
