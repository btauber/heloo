/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package bank;

/**
 *
 * @author benjamintauber
 */
public class Checking extends Account{
    
    protected Checking(String name, double balance){
        super(name,balance);
    }
    public void endOfMonth(){
        if(balance < 1500 ){
            double fee = 15;
            addTransaction(fee,"neg");
        }
    }
}
