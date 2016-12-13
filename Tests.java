/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

/**
 *
 * @author jeriabegglen
 */
public class Tests {

    public int add(String s1, String s2){
        int int1 = Integer.parseInt(s1);
        int int2 = Integer.parseInt(s2);
        int result = 0;    
        result = int1 + int2;
        return result;
    }
    
    public int subtract(String s1, String s2){
        int int1 = Integer.parseInt(s1);
        int int2 = Integer.parseInt(s2);
        int result = 0;    
        result = int1 - int2;
        return result;
    }
    
    public int multiply(String s1, String s2){
        int int1 = Integer.parseInt(s1);
        int int2 = Integer.parseInt(s2);
        int result = 0;    
        result = int1 * int2;
        return result;
    }
    
    public int divide(String s1, String s2){
        int int1 = Integer.parseInt(s1);
        int int2 = Integer.parseInt(s2);
        int result = 0;    
        result = int1 / int2;
        return result;
    }

}
