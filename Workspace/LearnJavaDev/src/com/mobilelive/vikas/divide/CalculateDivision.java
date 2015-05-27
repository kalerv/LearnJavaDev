/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mobilelive.vikas.divide;

import com.mobilelive.vikas.bean.Result;

/**
 *
 * @author natarajmehalingam
 */
public class CalculateDivision extends Divisor{
 
    private double value;
    private double divisor;
    
    public CalculateDivision(double value,double divisor){
        this.value=value;
        this.divisor=divisor;
    }
    
    public Result calculate(){
		//Creating Result object
		Result res = new Result();
		//Setting the values for setter divisionremainder
		res.setDivisionRemainder(new Double(super.remainder(value, divisor)).longValue());
		//Setting the values for setter divisionresult
		res.setDivisionResult(new Double(super.divide(value, divisor)).longValue());
		//Setting the values for setter divisor
		res.setDivisor(this.divisor);
		//Setting the values for setter dividend
		res.setValue(this.value);
		res.setDivisible(isdivisible(value, divisor));
		res.toString();
		return res;
		
	}

	@Override
	boolean isdivisible(double value, double divisor) {
		// TODO Auto-generated method stub
		if(value % divisor == 0){
			return true;
		}
		else{
		return false;
		}
	}
    
}
