/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vending.machine.application;

/**
 *
 * @author ATP
 */
public class VendingMachineApplication {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Dispenser test= new Dispenser(1);
        System.out.println(test.displayItems());
    }
    
}
