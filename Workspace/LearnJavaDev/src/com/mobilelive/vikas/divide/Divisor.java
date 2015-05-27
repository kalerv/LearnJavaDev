/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mobilelive.vikas.divide;

/**
 *
 * @author natarajmehalingam
 */
public abstract class Divisor {
    
    
    public double divide(double value,double divisor){
	    //TODO
    	// return the value after devision
 double result = value/divisor;
        return result;
    }
    
    public double remainder(double value,double divisor){
        //TODO
    	//return the remainder after division
    	double remainder = value % divisor;
        return remainder;
    }
    
     abstract boolean isdivisible(double value, double divisor);


}
