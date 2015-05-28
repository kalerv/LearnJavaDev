/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mobilelive.vikas;

import com.mobilelive.vikas.divide.CalculateDivision;

/**
 *
 * @author natarajmehalingam
 */
public class Main {
    public static void main(String[] args) {
        new Main().execute();
    }
    
    public void execute(){
        CalculateDivision cd=new CalculateDivision(15,3);
        
        //TODO - sve the below output to object and print its values
       System.out.println(cd.calculate());
    }
}
