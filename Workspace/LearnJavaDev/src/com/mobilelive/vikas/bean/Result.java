/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mobilelive.vikas.bean;

/**
 *
 * @author natarajmehalingam
 */
public class Result {
    
    private double value;
    private double divisor;
    
    private long divisionResult;
    private long divisionRemainder;
    private boolean divisible;

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public double getDivisor() {
        return divisor;
    }

    public void setDivisor(double divisor) {
        this.divisor = divisor;
    }

    public long getDivisionResult() {
        return divisionResult;
    }

    public void setDivisionResult(long divisionResult) {
        this.divisionResult = divisionResult;
    }

    public long getDivisionRemainder() {
        return divisionRemainder;
    }

    public void setDivisionRemainder(long divisionRemainder) {
        this.divisionRemainder = divisionRemainder;
    }

    public boolean isDivisible() {
        return divisible;
    }

    public void setDivisible(boolean divisible) {
        this.divisible = divisible;
    }
 
    public String toString() {
		return "Result [value=" + value + ", divisor=" + divisor
				+ ", divisionResult=" + divisionResult + ", divisionRemainder="
				+ divisionRemainder + ", divisible=" + divisible + "]";
	}
    
}
