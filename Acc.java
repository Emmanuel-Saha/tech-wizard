/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package acc;

/**
 *
 * @author MANUEL
 */
public class Acc {

    private double bal;
    
    public Acc(double initialBal){
        if (initialBal>0.0)
            bal = initialBal;
    }
    
    public void credit (double Amount){
        bal = bal + Amount;
    }
    public double getBal(){
        return bal;
    }
}
