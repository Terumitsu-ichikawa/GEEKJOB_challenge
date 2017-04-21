/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.camp.servlet;

import java.io.PrintWriter;


/**
 *
 * @author ichikawaterumitsu
 */
public class Resulthensu {
    
    public String name="市川　輝充";
    public Integer age=25;
    
    public void setResulthensu(String n, Integer a){
         name = n;
         age = a;
        
    }
    
    public void showResulthensu(PrintWriter out){
    
        out.println(name+"<br>");
        out.println(age);
        
    }

}