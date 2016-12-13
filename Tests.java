/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tests;

import static java.sql.DriverManager.println;

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
    
    public String printSomething(){
        String phrase= "Who do we appreciate?";
        return phrase;
    }
    
    public static void main(String[] args) {
        Tests myTests = new Tests();
        System.out.println(myTests.add("1", "1"));
        System.out.println(myTests.subtract("10", "6"));
        System.out.println(myTests.multiply("2", "3"));
        System.out.println(myTests.divide("16", "2"));
        System.out.println(myTests.printSomething());
    }
}
