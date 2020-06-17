/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rms;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author ARYA
 */
public class SuperClass_Parent {
    
    public double FiletOFish;
    public double ChickenBurger;
    public double ChickenBurgerM;
    public double ChilliCheeseBurgerM;
    public double BaconAndCheeseBurger;
    
    public double MilkShake;
    public double VanillaCone;
    public double ClasVanilla;
    public double VanMilkShake;
    public double ChocMilkShake;
    
    public double Drinks;
    public double Meals;
    public double TotalOfMD;
    
    public double AllTotalMD;
    
    public double GetAmount(){
    Meals = FiletOFish + ChickenBurger + ChickenBurgerM + ChilliCheeseBurgerM + BaconAndCheeseBurger;
    Drinks = MilkShake + VanillaCone + ClasVanilla + VanMilkShake + ChocMilkShake;
    TotalOfMD = Meals + Drinks;
    AllTotalMD = TotalOfMD;
    return AllTotalMD;
    }
    
    private JFrame frame;
    
    // Create a Method for exit Button. the SubClass will extend this Method from superclass and will implement through a new object inside of the actionlistener of exit button.
    public void iExitSystem(){
        frame = new JFrame("Exit");
        
        if (JOptionPane.showConfirmDialog(frame,"Confirm if you want to exit", "Restaurant Management System",JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
    //==========================Price==========================
    public double pFiletOFish = 3.56;
    public double pChickenBurger = 2.50;
    public double pChickenBurgerM  = 5.50;
    public double pChilliCheeseBurgerM = 6.80;
    public double pBaconAndCheeseBurger = 4.50;
    
    public double pMilkShake = 1.50;
    public double pVanillaCone = 1.70;
    public double pClasVanilla = 2.00;
    public double pVanMilkShake = 2.50;
    public double pChocMilkShake = 2.35;
    //===========================================================
    
    //========================findTax==============================
    
    public double mcTax = 0.90;
    
    public Double cFindTax(double cAmount){
        double findTax = cAmount - (cAmount * mcTax);
        return findTax;
    }
    
    
}

